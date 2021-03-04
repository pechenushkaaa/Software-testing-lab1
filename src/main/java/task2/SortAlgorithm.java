package task2;

public class SortAlgorithm {
    private int a[];
    private int b[];
    private int begin;
    private int end;

    public SortAlgorithm(int[] a, int startPosition, int endPosition){
        this.a = a;
        b = new int[a.length];
        begin = startPosition;
        end = endPosition - 1;
    }

    public SortAlgorithm(int[] a){
        this.a = a;
        b = new int[a.length];
        begin = 0;
        end = a.length - 1;
    }

    private void merge(int left, int mid, int right) {
        int pos1 = left, pos2 = mid + 1, pos3 = 0;

        while(pos1 <= mid && pos2 <= right)
        {
            if(a[pos1] <= a[pos2])
                b[pos3++] = a[pos1++];
            else
                b[pos3++] = a[pos2++];
        }

        while(pos1 <= mid)
            b[pos3++] = a[pos1++];

        while(pos2 <= right)
            b[pos3++] = a[pos2++];

        for(int i = 0; i < pos3; i++)
            a[left + i] = b[i];
    }


    public int[] msort() {
        mergeSort(begin, end);
        return a;
    }

    private void mergeSort(int begin, int end) {
        int mid = (begin + end) / 2;

        if (begin < end) {
            mergeSort(begin, mid);
            mergeSort(mid + 1, end);
            merge(begin, mid, end);
        }
    }
}

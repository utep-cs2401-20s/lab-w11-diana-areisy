public class newSorting {
    public void newSorting(int[] A, int size) {
        if (A.length <= size) {
            quickSort(A);
        }
        else {
            int middle = A.length/2;
            int[] left = new int[middle];
            for(int i = 0; i < left.length; i++){
                left[i] = A[i];
            }
            int[] right = new int[A.length - middle];
            for(int i = 0; i < right.length; i++ ){
                right[i] = A[i + middle];
            }

            newSorting(left, left.length);
            newSorting(right, right.length);

            mergeSorted(A, left, right);

        }
    }
    /*This method partitions and the pivot is the last digit*/
    public int partitioning(int[] A, int start, int end) {

        int pivot = A[end];
        int i = (start - 1);

        for (int j = start; j < end; j++){
            if(A[j] < pivot ){
                i++;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        int temp = A [i+1];
        A[i+1] = A[end];
        A[end] = temp;

        return i + 1;

    }
    public void quickSort(int[] A){
        quickSort(A, 0, A.length-1);
    }

    public void quickSort(int[] A, int start, int end) {
        if (start < end) {
            int partIndex = partitioning(A, start, end);

            quickSort(A, start, partIndex-1);
            quickSort(A, partIndex+1, end);
        }
    }
    public void mergeSorted(int[] A, int[] left, int[] right){
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                A[k] = left[i];
                i++;
            }
            else{
                A[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < left.length){
            A[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length){
            A[k] = right[j];
            j++;
            k++;
        }


    }
}

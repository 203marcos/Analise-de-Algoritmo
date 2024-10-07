public class MergeSort {
    public int [] arrayPrev;

    public void mergeSort (int[] arrayPrev,int tam){
        this.arrayPrev = arrayPrev;

        mergeSort2(arrayPrev,tam);
        print(arrayPrev);

    }

    public void mergeSort2 (int[] array,int n){
       /*
       q = metade
       p = começo
       r = final do vetor
       A = vetor...
        */

        if(n<2){
            return;
        }

        int mid = n/2;

        int[] left = new int[mid];
        int[] right = new int[n-mid];

        for(int i = 0;i<mid;i++){
            left[i] = array[i];
        }

        for(int i = mid;i<n;i++){
            right[i-mid] = array[i];
        }

        mergeSort2(left,mid);
        mergeSort2(right,n-mid);
        //merge(array,p,q,r)
        merge(array,left,right,mid,n-mid);
    }

    public void merge (int[] array, int[]left,int[]right,int l,int r){
        int i = 0, j = 0, k = 0;

        while (i<l && j<r){
            if(left[i]<=right[j]){
                array[k++] = left[i++];
            }else{
                array[k++] = right[j++];
            }
        }

        while (i < l){
            array[k++] = left[i++];
        }

        while (j < r){
            array[k++] = right[j++];
        }

    }

    public void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

}

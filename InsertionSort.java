public class InsertionSort {

    public void insertionSort(int[] array){
        /*
            3,2,1 i=1,key=2,j=i
            3,3,1 i=1,key=2,j=i-1
            2,3,1 i=1,key=2,j=i-1

            2,3,1 i=2,key=1,j=i (2)
            2,3,3 i=2,key=1,j=i-1 (1)
            2,2,3 i=2,key=1,j=i-2 (0)
            1,2,3 i=2,key=1,j=i-2 (0)


         */


        int j;
        int key;

        for(int i = 1; i < array.length; i++){
            key = array[i];
            j = i;

            while (j>0 && array[j-1]>key){
                array[j] = array[j-1];
                j--;
            }

            array[j] = key;
        }
        print(array);
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

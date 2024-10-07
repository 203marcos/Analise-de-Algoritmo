public class BubbleSort {

    public void bubbleSort(int[] array) {
        /*
            3,2,1 i=0
            2,3,1 i=0
            2,1,3 i=0 l=2

            2,1,3 i=1
            1,2,3 i=1 l=1

            1,2,3 i=2
         */
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
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

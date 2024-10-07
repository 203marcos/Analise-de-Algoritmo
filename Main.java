public class Main {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        InsertionSort insertionSort = new InsertionSort();
        MergeSort mergeSort = new MergeSort();

        int [] array = {10,9,8,7,6,5,4,3,2,1};

        //BUBBLE SORT
        bubbleSort.bubbleSort(array);
        //INSERTION SORT
        insertionSort.insertionSort(array);
        //MERGE SORT
        mergeSort.mergeSort(array,array.length);

    }
}

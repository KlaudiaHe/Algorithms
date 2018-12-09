import Algorithms.MergeSortAlgorithm;

public class MergeSortRunner extends MergeSortAlgorithm {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 5, 5, 1, 2, 0, 4, 7, 3};
        printAnyArray(array);
        MergeSortAlgorithm sorter = new MergeSortAlgorithm();
        sorter.sort(array, 0, array.length-1);
        printAnyArray(array);


    }
}

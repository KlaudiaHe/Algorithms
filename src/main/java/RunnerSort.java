import Algorithms.*;
import java.util.Date;
import java.util.Random;

public class RunnerSort {
    public static void main(String[] args) {
        for (int i = 10; i < 1000000; i += 1000) {
            System.out.println("Wielkość tabeli "+i);
            Time(i);
            System.out.println();
        }
    }
        public static void Time(int size){
            int[] tab = new int[size];
            Date date = new Date();
            Random random = new Random(date.getTime());
            random.nextInt();

            for (int i = 10; i <size; i+=1000) {
                tab[i] = random.nextInt();
            }
            long start = System.nanoTime();
            BubbleSortAlgorhytm.bubbleSorter(tab);
            long end = System.nanoTime();
            System.out.println("Czas dla Bubble Sort: ");
            System.out.println(nanoToSeconds(start, end)+" s");

            long startInsertion = System.nanoTime();
            InsertionSortAlgorithm.insertionSort(tab.clone());
            long endInsertion = System.nanoTime();
            System.out.println("Czas dla Insertion Sort");
            System.out.println(nanoToSeconds(startInsertion, endInsertion)+" s");

            long startSelection = System.nanoTime();
            SelectionSortAlgorhitm.sort(tab.clone());
            long endSelection = System.nanoTime();
            System.out.println("Czas dla Selection Sort");
            System.out.println(nanoToSeconds(startSelection, endSelection)+ " s");
        }

    public static double nanoToSeconds (long start, long end){

        double result= (double)(end-start)/ 1000000000;
        return result;
    }
}

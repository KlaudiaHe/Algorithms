package Algorithms;
/*
for each (unsorted) partition
set first element as pivot
storeIndex = pivotIndex + 1
for i = pivotIndex + 1 to rightmostIndex
if element[i] < element[pivot]
swap(i, storeIndex); storeIndex++
swap(pivot, storeIndex - 1)
*/

//tu z pivotem na środku;

public class QuicksortAlgorithm {
    int array[];
    int length;

    public void finalSort(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return;
        }
        this.array = inputArray;
        length = inputArray.length;
        quickSort(0, length - 1);
    }

    private void quickSort(int leftmostIndex, int rightmostIndex) {
        int i = leftmostIndex;
        int j = rightmostIndex;
        //obliczanie pivota, środkowy indeks;
        int pivot = array[leftmostIndex + (rightmostIndex - leftmostIndex) / 2];
        //podział na dwa subarraye;
        //każda iteracja identyfikuje liczbę z lewca większą od pivota, i z prawca mniejszą od pivota;
        //po skończeniu przeszukiwań swapujemy obie liczby miejscami;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swapNumbers(i, j);
                // przesuń index do następnej pozycji dla obu stron; i do pivota (rosnie) i j zarowno (malejac);
                i++;
                j--;
            }
        }
        //rekursywne zawołanie metody quicksort;
        if (leftmostIndex < j) {
            quickSort(leftmostIndex, j);
        }
        if (i < rightmostIndex) {
            quickSort(i, rightmostIndex);
        }
    }

    public void swapNumbers(int i, int j) {
        int tempArray = array[i];
        array[i] = array[j];
        array[j] = tempArray;
    }


    public static void main(String[] args) {
        QuicksortAlgorithm sorter = new QuicksortAlgorithm();
        int [] input = {4, 55, 2, 12, 33, 42, 66, 8, 9, 0};
        sorter.finalSort(input);
        for (int i: input){
            System.out.println(i);
            System.out.println(" ");
        }

    }
}

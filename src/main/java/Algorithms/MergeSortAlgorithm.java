package Algorithms;

public class MergeSortAlgorithm {
/*
split each element into partitions of size 1
recursively merge adjacent partitions
for i = leftPartIdx to rightPartIdx
if leftPartHeadValue <= rightPartHeadValue
copy leftPartHeadValue
else: copy rightPartHeadValue
copy elements back to original array

 1. Find the middle point to divide the array into two halves:
             middle m = (l+r)/2
     2. Call mergeSort for first half:
             Call mergeSort(arr, l, m)
     3. Call mergeSort for second half:
             Call mergeSort(arr, m+1, r)
     4. Merge the two halves sorted in step 2 and 3:
             Call merge(arr, l, m, r)
*/

    public static void mergeSort(int array[], int leftIndex, int middleIndex, int rightIndex) {
        int n1 = middleIndex - leftIndex + 1;
        int n2 = rightIndex - middleIndex; //znajdowanie rozmiaru mergowanych subarrayów;

        int LeftSubArray[] = new int[n1]; //tymczasowe tablice;
        int RightSubArray[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            LeftSubArray[i] = array[leftIndex + i];
        }
        for (int i = 0; i < n2; i++) { // kopiowanie danych do tymczasowych tablic;
            RightSubArray[i] = array[middleIndex + 1 + i]; //co bedzie po usunieciu jedynek;
        }

        int i = 0, j = 0; //poczátkowe indeksy obu subarrayów;
        int k = leftIndex;
        while (i < n1 && j < n2) {
            if (LeftSubArray[i] <= RightSubArray[j]) {
                array[k] = LeftSubArray[i];
                i++;
            } else {
                array[k] = RightSubArray[j];
                j++;
            }
            k++;
        }
        //Skopiuj pozostale elementy do L[] i R[], o ile;
        while (i < n1) {
            array[k] = LeftSubArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            array[k] = RightSubArray[j];
            j++;
            k++;
        }
     }

    //główna funkcja która sortuje array od lewego do prawego używając merge();
    public static void sort(int sortedArray[], int leftmostIndex, int rightmostIndex) {
        if (leftmostIndex < rightmostIndex) {
            int middleIndex = ((leftmostIndex + rightmostIndex) / 2); //szukanie punktu środkowego;
            sort(sortedArray, leftmostIndex, middleIndex);
            sort(sortedArray, (middleIndex + 1), rightmostIndex);
            mergeSort(sortedArray, leftmostIndex, middleIndex, rightmostIndex); //tu sobie zatrudnia metodę mergeSort;
    }
    }

    public static void printAnyArray(int printedArray[]) {
        int n = printedArray.length;
        for (int i = 0; i < n; i++) {
            System.out.println(printedArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int myArray[] = {4, 6, 7, 8, 9, 2, 3, 1, -44};
        System.out.println("My array as it was before sorting: ");
        printAnyArray(myArray);
        MergeSortAlgorithm object = new MergeSortAlgorithm(); //wywoøanie metody przez obiekt;
        object.sort(myArray, 0, (myArray.length - 1));
        System.out.println("My array after merge sort: ");
        printAnyArray(myArray);
    }

}
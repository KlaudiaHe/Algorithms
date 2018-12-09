package Algorithms;

public class InsertionSortAlgorithm {
    /*
    mark first element as sorted
    for each unsorted element X
    'extract' the element X
    for j = lastSortedIndex down to 0
    if current element j > X
    move sorted element to the right by 1
    break loop and insert X here
     */
    public static void main(String[] args) {
       int exemplaryArray [] = {5, 6, 12, 34, 8, 4, 37};
        System.out.println("Array before insertion sort");
       printArray(exemplaryArray);
        System.out.println("Array after the insertion sort");
       InsertionSortAlgorithm arrayObject = new InsertionSortAlgorithm();
       arrayObject.insertionSort(exemplaryArray);
       printArray(exemplaryArray);
//fajnie się drukuje obiektowo. Ale wymaga to stworzenia metody i utworzenia obiektu.
// a tak to trzeba utworzyć nową tablice, do ktorej przypisuje się wczesniej utworzona tablice potraktowaną metodą, i w forze druknac kazdy element.
//proby drukniecia tab[i] drukuja miejsce w pamieci;
    }
//mój ulubiony.


public static void insertionSort(int sortedArray[]){
    int n = sortedArray.length;
    for (int i = 0; i <n; i++) {
        int key = sortedArray[i];  //obecnie uznany za minimum porownywany do innych czy jest
        int j = i - 1; //indeks przed klawiszem;
        while (j >= 0 && sortedArray[j] > key) { //póki nie dojdziemy do początku,  tj. indeks = 0 i póki element wcześniejszy od klawisza będzie większy, póty
            sortedArray[j+1]= sortedArray[j]; // ten na prawo idzie o 1- przesuwanie, wstawia lewa na miejsca dotychczasowego key;
            j=j-1; //w lewo idziemy;
        }
        sortedArray[j+1]= key; // tu wstawi nowego keya, po wyjsciu z petli
    }
}

static void printArray(int printedArray[]){
    int n = printedArray.length;
    for (int i = 0; i < n; i++) {
        System.out.println(printedArray[i]+" ");
     }
}
}

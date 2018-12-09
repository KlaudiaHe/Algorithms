package Algorithms;

public class SelectionSortAlgorhitm {
  /*
  repeat (numOfElements - 1) times
  set the first unsorted element as the minimum
  for each of the unsorted elements
  if element < currentMinimum
  set element as new minimum
  swap minimum with first unsorted position
    */
  public static void main(String[] args) {


      SelectionSortAlgorhitm object = new SelectionSortAlgorhitm(); //inicjalizacja obiektu by druknąć obiekt arrray1;
      int array1[] =  {1, 34, 66, 7, 93, 26, 35, 35, 1, 0, -2};
      for (int i = 0; i < array1.length-1; i++) {
          System.out.println(array1[i]);
      }
      object.sort(array1);    //jak wydrukować obiekt, b. ciekawe; w innym razie- iteracja w forze; sout(array1[i]) druknie tylko miejsce w pamięci;
      System.out.println("Sorted:");
      object.printArray(array1);

  }

    public static void sort (int array []) {
        int n = array.length;
        for (int i = 0; i < n; i++) { // przesuwanie granicy między uporządkowanym a nieuporządkowanym arrayem za każdym razem o 1;
            int mini = i;  //szukanie najmniejszego elementu w nieposortowanym;
            for (int j = i + 1; j < n; j++) { //i+1 by porównać do nastepnego, nie zaczynać od samego siebie;
                if (array[j] < array[mini]) {
                    mini = j;
                    int temporary = array[mini];
                    array[mini] = array[i];
                    array[i] = temporary;  //podmianka nowego znalezionego minimum z obecnym pierwszym elementem;
                }
            }
        }
    }

    public static void printArray ( int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }






}

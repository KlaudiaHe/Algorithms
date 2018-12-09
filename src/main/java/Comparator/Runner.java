package Comparator;

import java.io.*;
import java.util.*;
import java.util.Collections;

public class Runner {
    public static void main(String[] args) throws IOException {
        List<String> people = new ArrayList<String>(); //liściec na ludzi;
        //tworzymy strumień danych typu java.io.FileReader;
       FileReader fileReader = new FileReader("C://Users//Klaudia//IdeaProjects//Algorhytms//src//main//java//Comparator//data_for_comparator_MOCK_DATA.csv");
       BufferedReader bufferedReader = new BufferedReader(fileReader); /*dla wygody opakowujemy
    FileReadera w BufferedReadera, pozwalającego na odczyt liniami- poprzez metodę readLine();
*/
        String textLine = bufferedReader.readLine(); //wywołujemy ww. metodę bufferedReadera readLine(), zwracającą obiekt typu String reprezentującą odczytaną linię tekstu lub wartość null (koniec pliku);
        do { //w tej pętli odczyt kolejnych linii i wyświetlanie na konsoli;
            System.out.println(textLine);
            textLine = bufferedReader.readLine(); //zapis?
            people.add(textLine);
        } while (textLine != null); // jak koniec pliku, skończ czytać;
        bufferedReader.close(); // na koniec pliku zamykamy strumień danych i zwalniamy zasoby systemu(jak z dispose?);

        List<Person> people1= new ArrayList<Person>(); //druga lista na przechowywanie posortów;
        for (int i = 0; i < 1000; i++) {
            String tab[] = people.get(i).split(","); //pofragmentuj od przecinka do przecinka;

            Person person = new Person();  // tworzenie obiektu person, i pobier do poszczególnych elementów tablicy właściwości;
            person.setId(tab[0]);
            person.setFirst_name(tab[1]);
            person.setLast_name(tab[2]);
            person.setEmail(tab[3]);
            person.setGender(tab[4]);
            person.setIp_address(tab[5]);
            person.setAge(Integer.parseInt(tab[6]));
            person.setInsurance_number(tab[7]);
            people1.add(person);  //dodej persona do drugiej arraylist;

          //  System.out.println(people.getItem(i));
        }

        AgeComparator comparator = new AgeComparator();   // instancja comparatora...
        Collections.sort(people1, comparator);  //zawołanie metody do chwile temu zaladowanej arraylist people1;
        for (int i = 0; i <people1.size(); i++) {
            System.out.println(people1.get(i)); //print po posortowaniu każdego persona;
        }
    }
}


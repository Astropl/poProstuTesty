package astro;

import java.util.Random;
import java.util.Scanner;

public class Eight {
    Scanner sc = new Scanner(System.in);
    Random rnd = new Random();
    long resultZad2 = 1;
    int resultZad3 = 0;

    public void init() {
//        zad1();
        //zad2();
        zad3();
    }

    public void zad3()
    {
        int tablica3 [][] = new int[3][3];
        for (int i=0;i<=tablica3.length-1;i++)
        {
            for(int j=0;j<=tablica3.length-1;j++)
            {
                tablica3[i][j]=rnd.nextInt(200);
            }
        }

        for ( int i =0;i<=tablica3.length-1;i++)
        {
            for (int j=0;j<=tablica3.length-1;j++)
            {
                System.out.print(tablica3[i][j]+" ");
                resultZad3 = resultZad3 + tablica3[i][j];
            }
            System.out.println("");
        }
        System.out.println(resultZad3);

    }

    public void zad2() {


        int numbers[] = new int[5];

        for (int i = 0; i <= numbers.length - 1; i++) {
            numbers[i] = rnd.nextInt(100);
            resultZad2 = resultZad2 * numbers[i];

        }

        for (int j = 0; j <= numbers.length - 1; j++) {
            System.out.println(numbers[j]);

        }System.out.println(resultZad2);

    }

    public void zad1() {

        String tablicaName[] = new String[3];
        for (int i = 0; i <= tablicaName.length - 1; i++) {
            System.out.println("Podaj imie nr :" + (i + 1));
            tablicaName[i] = sc.nextLine();

        }
        for (int i = 0; i <= tablicaName.length - 1; i++) {
            System.out.println(tablicaName[i]);
        }


    }
}
/*

    1. Stwórz tablicę na 3 imiona, którą wypełnisz imionami podanymi przez użytkownika. Na koniec wyświetl je wszystkie.
    2. Zainicjalizuj tablicę 5 liczb, następnie wymnóż wszystkie te liczby i wypisz na ekran konsoli.
    3. Zainicjalizuj tablicę dwuwymiarową 3×3, wypełnij ją całą liczbami i na koniec wyświetl sumę wszystkich liczb na ekran konsoli.

 */
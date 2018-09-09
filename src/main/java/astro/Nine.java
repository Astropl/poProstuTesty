package astro;

import java.util.Scanner;

public class Nine {
    int zad1Sum, zad2CountParzyste = 0, zad2CountNieParzyste = 0;
    int zad3Result = 1;

    public  void init() {
        //zad1();
        //zad2();
        //zad3();
        //zad4();
        zad5();


    }

    public void zad5()
    {
//        5. Stwórz tablicę dwuwymiarową o rozmiarze 3×3 pozwól użytkownikowi na wypełnienie jej każdej komórki.
//            Po wypełnieniu całej tablicy wypisz wszystkie elementy tablicy na ekran – wiersz pod wierszem.
        int tab [][] = new int[3][3];

        Scanner sc = new Scanner(System.in);
        System.out.println("Wyełnaimy tabele :");
        for (int i = 0;i<tab.length;i++)
        {
            for (int j = 0;j<tab.length;j++)
            {
                System.out.println("podaj liczbe dla pozycji ["+j+"]["+i+"]");
                tab[j][i]= sc.nextInt();
            }
        }
        System.out.println("\n\n\n");

        for (int i =0;i<tab.length;i++)
        {
            for (int j =0;j<tab.length;j++)
            System.out.println(tab[j][i]);
        }
return;
    }

    public void zad4() {//4. Mając tablicę 32, 21, 0, 1, 23, 12, 42, 55, 13, 5  znajdź jej największą i najmniejszą wartość i wypisz je na ekran konsoli.
        int tab[] = {32, 21, 0, 1,
                23, 12, 42,
                55, 13, 5};
        int min = tab[0], max = tab[0];

        for (int tabs : tab) {

            if (tabs < min) {
                min = tabs;
            }
            if (tabs > max) {
                max = tabs;
            }

            System.out.println("min = " + min);
            System.out.println("max = " + max);
        }
    }

    public void zad3() {

        int tab[] = {12, 2, 15, 9,
                11, 8, 15};
        for (int tabs : tab) {
            zad3Result = zad3Result * tabs;
        }
        System.out.println(zad3Result);

    }

    public void zad2() {
        int[] tab = {12, 67, 58, 49,
                44, 21, 23, 22,
                44, 59, 40};
        for (int tabs : tab) {
            if (tabs % 2 == 0) {
                zad2CountParzyste++;
                //System.out.println(tabs+"parzyte");
            } else {
                zad2CountNieParzyste++;
            }
        }
        System.out.println(zad2CountParzyste + " parzytysch");
        System.out.println(zad2CountNieParzyste + " nie parzystych");

    }


    public void zad1() {
        int[] tab = {12, 532, 43, 231, 6, 534, 329, 23};
        for (int tabs : tab) {
            zad1Sum += tabs;
        }
        System.out.println(zad1Sum);


    }

}
/*

    1. Oblicz sumę liczb: 12, 532, 43, 231, 6, 534, 329, 23 przy użyciu tablicy oraz pętli.
    2. Oblicz ile jest liczb w parzystych w zbiorze liczb: 12, 67, 58, 49, 44, 21, 23, 22, 44, 59, 40. Użyj tablicy oraz pętli.
    3. Oblicz wynik mnożenia wszystkich liczb: 12, 2, 15, 9, 11, 8, 15. Użyj pętli oraz tablicy.
    4. Mając tablicę 32, 21, 0, 1, 23, 12, 42, 55, 13, 5  znajdź jej największą i najmniejszą wartość i wypisz je na ekran konsoli.
    5. Stwórz tablicę dwuwymiarową o rozmiarze 3×3 pozwól użytkownikowi na wypełnienie jej każdej komórki.
        Po wypełnieniu całej tablicy wypisz wszystkie elementy tablicy na ekran – wiersz pod wierszem.
    6. Stwórz tablicę dwuwymiarową o rozmiarze 3×3 pozwól użytkownikowi na wypełnienie jej każdej komórki.
        Po wypełnieniu całej tablicy wylicz sumę wierszy – bez różnicy czy pierwszy index weźmiesz za kolumnę czy wiersz –
        chodzi o to, aby wynikiem działania programu były trzy sumy wierszy.
    7. Przy użyciu pętli nieskończonej stwórz menu dla kalkulatora, w którym  można wybrać opcję dodawania/odejmowania/mnożenia/dzielenia
        – po użyciu wybranej funkcji menu powinno na nowo się wyświetlić, a użytkownik powinien nadal móc używać kalkulatora.

 */
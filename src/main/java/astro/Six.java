package astro;

import java.util.Random;
import java.util.Scanner;

public class Six {

    Scanner sc = new Scanner(System.in);
    int numberZad1, numberZad2, numberZad3, numberZad4, numberZad41, numberZad42, resultZad4;
    int numberZad5, rndNumber, countZad5=0;


    public void zad5() {
        Random rnd = new Random();
        rndNumber = rnd.nextInt(200);
        do {
            countZad5++;

            System.out.println("Podaj swoją liczbę");
            numberZad5 = sc.nextInt();

            //System.out.println(rndNumber);
            if (numberZad5 < rndNumber) {
                System.out.println("Moja liczba jest wieksza");
            } else if (numberZad5 > rndNumber) {
                System.out.println("Moja iczba jest mniejsza");
            } else if (numberZad5 == rndNumber) {
                System.out.println("Hura liczba trafiona za " + countZad5+" razem.");

            }


        } while (numberZad5 != rndNumber);
    }


    public void zad4() {
        do {

            System.out.println("********************");
            System.out.println("* 1. Dodoawanie    *");
            System.out.println("* 2. Odejmowanie   *");
            System.out.println("* 3. Mnożenie      *");
            System.out.println("* 4. Dzielenie     *");
            System.out.println("* 0. Wyjście       *");
            System.out.println("********************\n\n\n");
            numberZad4 = sc.nextInt();
            System.out.println("Podaj pierwza liczbe");
            numberZad41 = sc.nextInt();
            System.out.println("Podaj drugą liczbe");
            numberZad42 = sc.nextInt();
            switch (numberZad4) {

                case 1:
                    System.out.println("Dodoawanie");
                    resultZad4 = numberZad41 + numberZad42;
                    break;
                case 2:
                    System.out.println("Odejmowanie");
                    resultZad4 = numberZad41 - numberZad42;
                    break;
                case 3:
                    System.out.println("Mnożenie");
                    resultZad4 = numberZad41 * numberZad42;
                    break;
                case 4:
                    System.out.println("Dzielenie");
                    try {
                        resultZad4 = numberZad41 / numberZad42;
                    } catch (ArithmeticException e) {
                        System.out.println("Mamy bład dzielenia. Bład  :" + e);
                        resultZad4 = 0;
                    }
                    break;
                case 0:
                    System.out.println("Koniec");
                    break;
                default:
                    System.out.println("Zła wybrana liczba");


            }
            System.out.println("Wynik = " + resultZad4);

        } while (numberZad4 != 0);


    }

    public void zad3() {
        System.out.println(" Podaj jakaś liczbę");
        numberZad3 = sc.nextInt();
        if (numberZad3 >= 0 && numberZad3 <= 10) {
            System.out.println("Liczba jest w przedziale 0 -10");
        } else if (numberZad3 > 10 && numberZad3 <= 20)
            System.out.println("Liczba jest w przedziale 11 -20");
        else if (numberZad3 > 20 && numberZad3 <= 30)
            System.out.println("Liczba jest w przedziale 21 -30");
        else if (numberZad3 > 30 && numberZad3 <= 40)
            System.out.println("Liczba jest w przedziale 31 -40");
        else {
            System.out.println("Liczba nie miescie sie w przedziale 0 - 40");
        }

    }

    public void zad2() {
        System.out.println(" Podaj jakaś liczbę");
        numberZad2 = sc.nextInt();
        if (numberZad2 < 0) {
            System.out.println("Liczba ujemna");
        } else if (numberZad2 > 0) {
            System.out.println("liczba dodatnia");
        } else {
            System.out.println("Liczba równa 0");
        }
    }

    public void zad1() {
        System.out.println(" Podaj jakaś liczbę");
        numberZad1 = sc.nextInt();
        if (numberZad1 % 2 == 0) {
            System.out.println("Liczba parzysta");
        } else {
            System.out.println("liczba nie parzysta");
        }
    }

    public void init() {
        //zad1();
        //zad2();
        //zad3();
        //zad4();
        zad5();

    }
}


/*
        1. Na podstawie liczby podanej przez użytkownika wypisz na ekran czy liczba jest parzysta, czy też nie.
        2. Wypisz na ekran czy liczba jest dodatnia, czy ujemna.
        3. Na podstawie liczby podanej od użytkownika sprawdź w jakim przedziale mieści się liczba: od 0 do 10, od 11 do 20, od 21 do 30, od 31 do 40 czy może 41 do 50.
            Wypisz na ekran informację o przedziale, jeżeli liczba nie mieści się w żadnym z nich to wyświetl informację: „Liczba nie należy do żadnego z przedziałów”.
        4. Przy użyciu instrukcji sterującej switch stwórz prosty kalkulator z funkcjami: dodawania, odejmowania, mnożenia, dzielenia i liczenia reszty z dzielenia.
            Dodaj do tego też menu, aby użytkownik wiedział jaką opcję może wybrać.
        5. Stwórz obiekt Random: Random generator = new Random() – i przy użyciu generator.nextInt(maksymalna_liczba) do wygenerowania liczby z przedziału od 0 do wskazanej jako
            parametr i sprawdź użytkownik odgadł liczbę.
*/
package astro;

import java.util.Scanner;

public class Five {
    Scanner sc = new Scanner(System.in);
    int liczba1, liczba2, result;

    public Five() {

    }

    public void Init() {
        zad1();
    }

    private void zad1() {
//prosty calk

        System.out.println("Podaj pierwsza liczbę");
        liczba1 = sc.nextInt();
        System.out.println("Podaj drugą liczbę");
        liczba2 = sc.nextInt();

        result = liczba1 + liczba2;
        System.out.println("wynik dodowania " + liczba1 + " + " + liczba2 + " = " + result);

        result = liczba1 - liczba2;
        System.out.println("wynik odejmowania " + liczba1 + " - " + liczba2 + " = " + result);
        result = liczba1 * liczba2;
        System.out.println("wynik mnozenia " + liczba1 + " * " + liczba2 + " = " + result);

        try {
            result = liczba1 / liczba2;
            System.out.println("wynik dzielena " + liczba1 + " / " + liczba2 + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Nie mozna dzielic przez zero. Błąd: " + e);

        }
        System.out.println("koniec programu");

    }
}
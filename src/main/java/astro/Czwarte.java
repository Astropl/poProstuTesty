package astro;

import java.util.Scanner;

public class Czwarte {

//    1.Wczytaj od użytkownika tekst, a następnie wyświetl go na ekran konsoli.
//    2.Wczytaj od użytkownika imię, nazwisko, wiek, wzrost oraz wagę, a następnie wyświetl na ekran konsoli napis: „Nazywasz się {imię} {nazwisko}, masz {wiek} lat, masz {wzrost} cm wzrostu oraz ważysz {waga} kg”.
//    3.Wczytaj dwie liczby całkowite od użytkownika, a następnie wyświetl wynik dodawania i odejmowania przy użyciu operatorów + i – np. wynik = liczbaA + liczbaB, wynik = liczbaA – liczbaB.

//private void initCzwarte ()

    public void zad3()
    {
        Scanner sc = new Scanner(System.in);
        int liczbaA,liczbaB,wynik;

        System.out.println (" Podaj pierwszą liczbe całkowitą :");
        liczbaA = sc.nextInt();
        System.out.println("Podaj drugą liczbe całkowitą :");
        liczbaB = sc.nextInt();

        System.out.println(" Wynik dodoawania: "+liczbaA+" + "+liczbaB +" = "+(wynik=liczbaA+liczbaB));
        System.out.println(" Wynik odejmowania: "+liczbaA+" - "+ liczbaB +" = "+(wynik=liczbaA-liczbaB));

    }


    public void zad2() {
        String name, lastName;
        short age;
        float height, weight;
        Scanner sc = new Scanner(System.in);


        System.out.println("Podaj swoje imie przyjacielu :");
        name = sc.nextLine();
        System.out.println("Podaj swoje naziwsko :");
        lastName = sc.nextLine();
        System.out.println("Podaj swój wiek :");
        age = sc.nextShort();
        System.out.println("Podaj swój wzrost :");
        height = sc.nextFloat();
        System.out.println("Podaj swoją wagę :");
        weight = sc.nextFloat();

        System.out.println(" Nazywasz się " + name + " " + lastName + ", masz " + age + " lat, masz " + height + " cm wzrostu oraz ważysz " + weight + " kg.");
        System.out.printf("  Nazywasz się %s %s , masz %d lat, masz %.1f cm wzrostu oraz ważysz %.1f kg. ", name, lastName, age, height, weight);
zad2Columny(name,lastName,age,height,weight);
    }


    public void initCzwarte() {
        //zad1();
        //zad2();

        zad3();


    }

    public void zad2Columny(String name, String lastName, short age,float height, float weight ) {
        System.out.printf("\n%-12s%-12s%-12s%-12s%-12s\n", "Imię", "Nazwisko", "Wiek","Wzrost","Waga");
        System.out.printf("%-12s%-12s%-12d%-12.1f%-12.1f\n", name, lastName, age,height,weight);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void zad1() {
        System.out.println(" Podaj jakis text");
        Scanner sc = new Scanner(System.in);
        String giveMeAnyText = sc.nextLine();
        System.out.println("Podano text " + giveMeAnyText);

    }

    public Czwarte() {

    }
}

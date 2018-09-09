package astro;

public class Ten {

    public void init() {
//        zadA("Paweł");
//        zadB("");
//        zadC("");
//        int values[] = {5, 0, 6, 12, 44, 101, 42, 12, 16, 120};
//        float average = calculateAverage(values);
//        System.out.println("Srednia to : " + average);
        //zadisMaleA();



    }

    public void zadisMaleA() {
        boolean isMale = zadisMale("Sylwia");
        //zadisMale("Sylwia", false);
        if (!isMale) {
            System.out.println("mamy kobiete");
        } else if (isMale) {
            System.out.println("mamy faceta");
        }

    }

    public boolean zadisMale(String name) {
        int allCharcters = name.length();
        System.out.println(" Pokaz ile jest liter :" + allCharcters);
        char lastCharacter = name.charAt(allCharcters - 1);
        System.out.println(" Pokaz ostani znak :" + lastCharacter);
        if (lastCharacter == 'a') {

            return false;
        } else {

            return true;
        }


    }

    public float calculateAverage(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number; //sum = sum + number;
        }

        float average = sum / (float) numbers.length;

        return average; // wrzucic rzutowanie na przecinki(float )
    }


    public void zadA(String name) {
        System.out.println("Siema a: " + name);
    }

    public void zadB(String name) {
        System.out.println("Siema b: " + name);
    }

    public String zadC(String name) {
        if (name.length() == 0) {
            return null;
        }
        System.out.println("siema c: " + name);
        return name;
    }
}

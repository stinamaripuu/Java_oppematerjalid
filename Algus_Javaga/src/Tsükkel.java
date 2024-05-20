import java.util.ArrayList;
import java.util.Scanner;

public class Tsükkel {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println("i = " + i);
            i++;
        }
        System.out.println("Lõpetatud!");


        // Ilmaandmed.java lahendus tsükliga
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nimekiri = new ArrayList<>();
        int k = 3;
        while (k > 0){
            System.out.println("Palun sisesta number 1-9");
            nimekiri.add(scanner.nextInt());
            k--;
        }
        System.out.println(nimekiri);
        
        /*
        while (true) {
            System.out.println("See on lõpmatu tsükkel!");
        }
         */
        for (int j = 0; j < 5; j++) {
            System.out.println("Tsau!" + ":"+")".repeat(j)); // igal korral prindime "Tsau!" ning :) kus ) arv tõuseb iga kord
        }
        for (int d = 0; d < 5; d+=2) {
            System.out.println("Head aega!" + ":"+")".repeat(d));
        }
        int summa = 0;
        for (Integer number : nimekiri) {
            System.out.println("Temperatuur oli: " + number);
            summa += number;
        }
        System.out.println("Temperatuuride keskmine oli: " + summa / nimekiri.size());

    }
}

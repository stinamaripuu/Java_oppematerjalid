package lahendused; // Ebaoluline, naitab, et see klass asub selles kasutas.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*********************************************************
 * Javaga alustamine
 * 10. klass, 23/24 kevad
 *
 * Teema: Andmetuubid -> Massiivid
 * Autor: Paasu Lind
 *
 * Lisainfo: Java oppimise kursus,
 * Sain motivatsiooni Stack Overflowst, postitus: wwww.blebleble.com
 ********************************************************/

public class IlmaandmedLahendus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loome listi temperatuurid, kuhu hakkame valistemperatuuri lisama, temperatuurid on taisarvud
        List<Integer> temperatuurid = new ArrayList<>();

        // Palume kasutajalt sisestada temperatuur ja salvestame esimesed kolm sisestust
        System.out.println("Sisestage temperatuur: ");
        int temp = scanner.nextInt();
        temperatuurid.add(temp);

        System.out.println("Sisestage temperatuur: ");
        temp = scanner.nextInt();
        temperatuurid.add(temp);

        System.out.println("Sisestage temperatuur: ");
        temp = scanner.nextInt();
        temperatuurid.add(temp);

        System.out.println("Sisestatud temperatuurid olid: ");
        // Valjastame saadud listi vaartused
        System.out.println(temperatuurid);
    }
}

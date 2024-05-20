package ülesanded;
/*********************************************************
 * Javaga alustamine
 * 10. klass, 23/24 kevad
 *
 * Teema: Tingimuslaused
 * Autor: Pääsu Lind
 *
 * Lisainfo: Java õppimise kursus,
 * Sain motivatsiooni Stack Overflowst, postitus: wwww.blebleble.com
 ********************************************************/

import java.util.Scanner;

/********************************************************
 * Ülesandeks on seada õpilased pingeritta nende punktide alusel
 * Tuleb luua kaks massiivi: üks õpilaste nimede ning teine nende punktide jaoks
 * Kasutaja sisestab punktid ja nimed
 * Lõpuks tagastatakse kõikide õpilaste keskmine punktisumma
 ********************************************************/
public class Tsüklisse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Küsime, mitu õpilast soovitakse lisada ja jätame selle meelde
        System.out.println("Mitu õpilast soovid lisada?");
        // Salvestame scanneri tulemuse muutujasse arv
        int arv = scanner.nextInt();

        String[] nimed = new String[arv]; // teeme vaid nii suured massiivid kui tarvis
        int[] punktid = new int[arv];

        // Küsime nii mitu korda õpilaste kohta infot kui palju õpilasi on. Võime kasutada for tsüklit

        // ---- lisa kood ----

        // Et väljastada kõikide õpilaste punktid, võime kasutada for each tsüklit
        System.out.println("Opilaste nimekiri ja nende punktid:");

        // ---- lisa kood ----


        // Väljastame õpilaste keskmise tulemuse
        int summa = 0;

        // ---- lisa oma koodi siia ka ---- kasuta näiteks for each

        double keskmine = (double) summa / arv;
        System.out.println("Keskmine punktisumma: " + keskmine);

        // Valjastame maksimaalse ja minimaalse tulemuse
        int max = punktid[0];
        int min = punktid[0];
        for (int punkt : punktid) {
            if (punkt > max) {
                max = punkt;
            }
            if (punkt < min) {
                min = punkt;
            }
        }
        System.out.println("Maksimaalne punktisumma: " + max);
        System.out.println("Minimaalne punktisumma: " + min);
    }

}

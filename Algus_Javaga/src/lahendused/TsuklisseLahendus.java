package lahendused;

import java.util.Scanner;

/********************************************************
 * Ulesandeks on seada opilased pingeritta nende punktide alusel
 * Tuleb luua kaks massiivi: uks opilaste nimede ning teine nende punktide jaoks
 * Kasutaja sisestab punktid ja nimed
 * Lopuks tagastatakse koikide opilaste keskmine punktisumma
 ********************************************************/
public class TsuklisseLahendus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kusime, mitu opilast soovitakse lisada ja jatame selle meelde
        System.out.println("Mitu opilast soovid lisada?");
        // Salvestame scanneri tulemuse muutujasse arv
        int arv = scanner.nextInt();

        String[] nimed = new String[arv];
        int[] punktid = new int[arv];

        // Kusime nii mitu korda opilaste kohta infot kui palju opilasi on. Voime kasutada for tsuklit
        for (int i = 0; i < arv; i++) {
            System.out.print("Sisesta opilase nimi: ");
            nimed[i] = scanner.nextLine();
            System.out.print("Sisesta opilase punktid: ");
            punktid[i] = scanner.nextInt();
        }

        // Et valjastada koikide opilaste punktid, voime kasutada for each tsuklit
        System.out.println("Opilaste nimekiri ja nende punktid:");
        for (int i = 0; i < arv; i++) {
            System.out.println(nimed[i] + ": " + punktid[i]);
        }

        // Valjastame opilaste keskmise tulemuse
        int summa = 0;
        for (int punkt : punktid) {
            summa += punkt;
        }
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

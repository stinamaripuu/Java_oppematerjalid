package lahendused;

/*********************************************************
 * Teema: + ja -, * ja /
 ********************************************************/

/**
 * Ulesandeks on leida Smart auto, tavalise auto ja mahtuniversaali puhul
 * palju kaalub auto koos ja ilma rehvide ja velgedeta.
 *
 * Smart autol on koige vaiksemad voimalikud rehvid, mahtuniversaalil koige suuremad
 * ja tavalisel autol on keskmised.
 */
public class AutoLahendus {

    public static void main(String[] args) {
        // Proovime arvutamist!!
        // Keskmised rehvide/velgede kaalud: https://www.byways.org/how-much-does-a-tire-weigh/#:~:text=How%20Much%20Does%20the%20Whole,around%2035%20to%2055%20pounds.
        // Kerskmised autode kaalud: https://www.insurancenavy.com/average-car-weight/
        // Votame kaalude vahemikud:
        int rehvMadal = 15;
        int rehvKorge = 25;
        int velgMadal = 20;
        int velgKorge = 30;

        int smartAutoKaal = 1500;
        int tavalineAutoKaalMadal = 2600;
        int tavalineAutoKaalKorge = 3000;
        int mahtuniversaalAutoKaalMadal = 3000;
        int mahtuniversaalAutoKaalKorge = 3500;

        // 1 kg on vordne 2.20462 poundiga

        /**
         * Ulesandeks on leida Smart auto, tavalise auto ja mahtuniversaali puhul
         * palju kaalub auto koos ja ilma rehvide ja velgedeta.
         *
         * Smart autol on koige vaiksemad voimalikud rehvid, mahtuniversaalil koige suuremad
         * ja tavalisel autol on keskmised.
         */

        // Lahendus
        // Loome muutujad vaikeRatas, keskRatas, suurRatas, et arvutada
        // Meil on vaja leida kolm erinevat rehv+velg kaalu: NB! Need on vaid uhe rehv+velg kaalud
        int vaikeRatas = rehvMadal + velgMadal; // Smart auto rehv+velg
        int keskRatas = (rehvMadal + rehvKorge) / 2 + (velgMadal + velgKorge) / 2; // Tavaline auto rehv+velg
        int suurRatas = rehvKorge + velgKorge; // Mahtuniversaal rehv+velg

        // Loome muutujad tavalise auto keskmiseks kaaluks ja mahtuniversaali keskmiseks kaaluks
        // Muutujateks paneme tavaKeskKaal ja mahtKeskKaal
        int tavaKeskKaal = (tavalineAutoKaalMadal + tavalineAutoKaalKorge) / 2;
        int mahtKeskKaal = (mahtuniversaalAutoKaalMadal + mahtuniversaalAutoKaalKorge) / 2;

        // Arvutame iga auto kohta kaalu koos rehvide ja velgedega
        // Muutujateks paneme smart, tavaline, mahtuniversaal
        int smart = smartAutoKaal + 4 * vaikeRatas;
        int tavaline = tavaKeskKaal + 4 * keskRatas;
        int mahtuniversaal = mahtKeskKaal + 4 * suurRatas;

        //System.out.println("Smart auto: rehvide ja velgede kaal: " + vaikeRatas + " kg, auto keskmine kaal ilma rehvide ja velgedeta: " + smartAutoKaal + " kg, auto kogukaal: " + smart + " kg");
        //System.out.println("Tavaline auto: rehvide ja velgede kaal: " + keskRatas + " kg, auto keskmine kaal ilma rehvide ja velgedeta: " + tavaKeskKaal + " kg, auto kogukaal: " + tavaline + " kg");
        //System.out.println("Mahtuniversaal: rehvide ja velgede kaal: " + suurRatas + " kg, auto keskmine kaal ilma rehvide ja velgedeta: " + mahtKeskKaal + " kg, auto kogukaal: " + mahtuniversaal + " kg");
    }
}

package lahendused;
/********************************************************
 * Ulesandeks on anda opilasele sobiv hinne, arvestades opilase hinnet ning kodutoodelopetamist
 * on olemas muutuja punktid, mis tohistab taisarvuna punktide arvu
 * on olemas muutuja kasTehtud, mis tahistab toevartusena, kas kodutoo on esitatud
 * Kui opilase punktide arv on vahemalt 90 ja kodutoo on lopetatud, prinditakse "Hinne: A".
 * Kui opilase punktide arv on vahemalt 80 ja vahemalt uks nendest tingimustest on toene: kodutoo on lopetatud voi punktide arv on vahemalt 85, prinditakse "Hinne: B".
 * Kui opilase punktide arv on vahemalt 70 ja kodutoo on lopetatud, prinditakse "Hinne: C".
 * Kui opilase punktide arv on vahemalt 60 voi kodutoo on lopetatud, prinditakse "Hinne: D".
 * Kui ukski eelmistest tingimustest pole taidetud, prinditakse "Hinne: F".
 ********************************************************/
public class HindamineLahendus {
    public static void main(String[] args) {
        int punktid = 75;
        boolean kasTehtud = true;

        if (punktid >= 90 && kasTehtud) {
            System.out.println("Hinne: A");
        } else if (punktid >= 80 && (kasTehtud || punktid >= 85)) {
            System.out.println("Hinne: B");
        } else if (punktid >= 70 && kasTehtud) {
            System.out.println("Hinne: C");
        } else if (punktid >= 60 || kasTehtud) {
            System.out.println("Hinne: D");
        } else {
            System.out.println("Hinne: F");
        }
    }
}
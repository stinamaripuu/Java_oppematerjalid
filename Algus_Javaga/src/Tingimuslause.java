public class Tingimuslause {
    public static void main(String[] args) {

        // if ja else
        int number = 10;
        if (number > 0) {
            System.out.println("Number on positiivne!");
        } else if (number == 0) {
            System.out.println("Number on 0");
        } else {
            System.out.println("Number ei ole positiivne!");
        }

        // if, if-else, else koos and - && ja or - ||

        int vanus = 20;
        boolean onJuhiluba = true;
        boolean onLiikluskindlustus = false;

        if (vanus >= 18 && onJuhiluba) {
            System.out.println("Vanus on vähemalt 18 ja juhiluba on olemas!");
        }
        if (!onJuhiluba && vanus >= 16) {
            System.out.println("Saad autokooli minna!");
        } else if ((onJuhiluba && vanus < 18) || !onLiikluskindlustus) {
            System.out.println("Ei saa autoga sõita");
        } else if ((onJuhiluba && vanus >= 18) && !onLiikluskindlustus) { // ei jõua siiani kuna eelmises lõppeb töö ära
            System.out.println("Ei saa autoga sõita");

        } else {
            System.out.println("Sa ei tohi autot juhtida");
        }
    }

}

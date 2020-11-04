package fr.kevindvz;

/**
 * Hello world!
 */
public final class App {
    // toujours mettre ses méthodes ici et pas dans le main
    public static boolean leapYearTest(int anneeTestee) {

        if (anneeTestee % 4 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static String fooBarQix(int chiffreTeste) {
        String resultat = "";
        switch (0) {
            case chiffreTeste % 3:
                resultat = "Foo";
            case chiffreTeste % 5:
                resultat += "Bar";
            case chiffreTeste % 7:
                resultat += "Qix";
            default:
                break;
        }

        int number = chiffreTeste;
        int puissance = (int) Math.pow(10, String.valueOf(chiffreTeste).length() - 1);

        if (chiffreTeste > 10) {
            number = chiffreTeste / puissance % 10;
        }

        while (puissance > 0) {

            if (number == 5) {
                resultat += "Bar";
            } else if (number == 7) {
                resultat += "Qix";
            } else if (number == 3) {
                resultat += "Foo";
            } else if (number == 0) {
                resultat += "*";
            }
            if (chiffreTeste > 10 && puissance >= 10) {
                puissance /= 10;
                number = chiffreTeste / puissance % 10;
            } else {
                break;
            }

        }

        if (resultat == "") {
            return Integer.toString(chiffreTeste);
        } else {
            return resultat;
        }
    }

    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

    }
}

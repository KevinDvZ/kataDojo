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
        if (chiffreTeste % 3 == 0) {
            resultat = "Foo";
        }
        if (chiffreTeste % 5 == 0) {
            resultat += "Bar";
        }
        if (chiffreTeste % 7 == 0) {
            resultat += "Qix";
        }

        int i = 10;
        int number = chiffreTeste;
        Math.pow(i, String.valueOf(chiffreTeste).length());
        if (chiffreTeste > 10) {
            System.out.println(i);
            number = chiffreTeste / i % 10;
        }

        while (number > 0) {
            if (number == 5) {
                resultat += "Bar";
            } else if (number == 7) {
                resultat += "Qix";
            } else if (number == 3) {
                resultat += "Foo";
            } else if (number == 0) {
                resultat += "*";
            }
            if (chiffreTeste > 10 && i >= 10) {
                i /= 10;

                number = chiffreTeste / i % 10;
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

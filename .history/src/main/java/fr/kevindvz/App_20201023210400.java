package fr.kevindvz;

import java.beans.Transient;

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
            resultat = resultat + "Foo";
        } else if (chiffreTeste % 5 == 0) {
            resultat = resultat + "Bar";
        } else if (chiffreTeste % 7 == 0) {
            resultat = resultat + "Qix";
            ;
        }

        while (chiffreTeste > 0) {
            int number = chiffreTeste % 10;
            if (number == 5) {
                resultat = resultat + "Bar";
            } else if (number == 7) {
                resultat = resultat + "Qix";
            } else if (number == 3) {
                resultat = resultat + "Foo";
            } else if (number == 0) {
                resultat = resultat + "*";
            }
            chiffreTeste = chiffreTeste / 10;
        }
        System.out.println(chiffreTeste);
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

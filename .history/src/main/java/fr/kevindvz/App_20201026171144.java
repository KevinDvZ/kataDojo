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
            resultat += "Foo";
        }
        if (chiffreTeste % 5 == 0) {
            resultat += "Bar";
        }
        if (chiffreTeste % 7 == 0) {
            resultat += "Qix";
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

    public static String numberToText(int number) {
        String resultat = "";
        String[] chiffresTexte = new String[] { "", "one", "two", "three", "four", "five", "six", "seven", "eight",
                "nine" };
        String[] chiffresPremiereDizaine = new String[] { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
                "sixteen", "seventeen", "eighteen", "nineteen" };
        String[] chiffresDizaineFrom20 = new String[] { "", "", "twenty", "thirty", "fourty", "fifty", "sixty",
                "seventy", "eighty", "ninety" };
        String[] grandsNombres = new String[] { "hundred", "thousand", "million", "billion", "trillion" };
        if (number == 0) {
            resultat = "zero";
        } else if (number < 10 && number >= 0) {
            resultat = chiffresTexte[number];
        } else if (number >= 10 && number < 20) {
            resultat = chiffresPremiereDizaine[number - 10];
        } else if (number >= 20) {

            int puissance = (int) Math.pow(10, String.valueOf(number).length() - 1); // permet de trouver la puissance
                                                                                     // de 10 max du nombre

            number = chiffreTeste / puissance % 10;
            System.out.println(puissance);

            // resultat2 = length + " " + resultat;
        }
        return resultat;

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

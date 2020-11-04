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

    public static boolean fooBarQix(int chiffreTeste) {
        if (chiffreTeste % 3 == 0) {
            return "Foo";
        }else if (chiffreTeste % 5 == 0) {
            return "Bar";
        }else if (chiffreTeste % 7 == 0) {
            return "Qix";
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

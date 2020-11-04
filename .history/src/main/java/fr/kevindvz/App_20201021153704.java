package fr.kevindvz;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");

    public boolean leapYearTest(int anneeTestee) {

        boolean resultat;
        if (anneeTestee % 4 == 0) {
            resultat = true;
        } else {
            resultat = false;
            return resultat;
        }

    }
}

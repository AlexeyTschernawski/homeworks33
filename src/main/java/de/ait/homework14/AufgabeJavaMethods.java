package de.ait.homework14;


public class AufgabeJavaMethods {

    static int jahresgehalt = 0;

    public static void main(String[] args) {

        gehaltRechner(500, 4500);
        gehaltRechner(2000);
        gehaltRechner(5000, 400);
        gehaltRechner(7000);
        gehaltRechner(4000, 500);
        gehaltRechner(2000);
        gehaltRechner(4000, 300);
        gehaltRechner(3000);
        gehaltRechner(4000, 100);
        gehaltRechner(1000);

        getJahresgehaltOhneSteuer();
    }


    static void gehaltRechner(int gehaltHauptjob, int gehaltMinijob) {
        if (gehaltHauptjob > 0 && gehaltMinijob > 0) {
            jahresgehalt = jahresgehalt + gehaltHauptjob + gehaltMinijob;
            System.out.println("jahresgehalt:" + jahresgehalt);
        } else {
            System.err.println("Variable oder beide kleiner als 0");
        }
    }

    static void gehaltRechner(int gehaltHauptjob) {
        jahresgehalt = jahresgehalt + gehaltHauptjob;
        System.out.println("jahresgehalt:" + jahresgehalt);
    }

    static int getJahresgehaltOhneSteuer() {
        System.out.println("Jahresgehalt - Steuer " + (jahresgehalt - 1500));
        return jahresgehalt - 1500;
    }
}

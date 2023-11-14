package de.ait.homework26;

public class AthleteTest {

    public static void main(String[] args) {

        Athlete athleteDEU = new Athlete();
        athleteDEU.setAge(30);
        athleteDEU.warmUp();
        athleteDEU.dive();
        athleteDEU.stretch();
        athleteDEU.run();
        athleteDEU.swim();
        athleteDEU.jump();
        System.out.println("------");

        Swimmer swimmer = new Athlete();
        swimmer.checkAge(23);
        swimmer.warmUp();
        swimmer.dive();
        swimmer.swim();
        System.out.println("------");

        Runner runner = new Athlete();
        runner.checkAge(26);
        runner.stretch();
        runner.jump();
        runner.run();
        System.out.println("------");

        Runner runnerJunior = new Athlete();
        System.out.println(Athlete.MIN_AGE);
        runnerJunior.checkAge(15);

    }




}

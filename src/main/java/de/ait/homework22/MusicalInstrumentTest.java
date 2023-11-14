package de.ait.homework22;

public class MusicalInstrumentTest {
    public static void main(String[] args) {

        SmallWindInstrument smallWindInstrument = new SmallWindInstrument("Flute" , "wind", 50, "wood", 350);
        smallWindInstrument.sell();
        System.out.println(smallWindInstrument.getMaterial());
        System.out.println(smallWindInstrument.getName());
        System.out.println(smallWindInstrument.getPrice());
        // smallWindInstrument.play();

    }
}

package de.ait.homework25;

public class Textdocument implements Saveable {

    private String text;

    public Textdocument(String text) {
        this.text = text;
    }

    @Override
    public void load(String filename) {
        System.out.println("text document loaded from file" + filename);
    }

    @Override
    public void save(String filename) {
        System.out.println("text document saved in file" + filename);
    }
}

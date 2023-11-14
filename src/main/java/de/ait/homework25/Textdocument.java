package de.ait.homework25;

public class Textdocument implements Saveable {

    private String text;

    public Textdocument(String text) {
        this.text = text;
    }

    @Override
    public void load(String filename) {
        System.out.println("текстовый документ загружен из файла" + filename);
    }

    @Override
    public void save(String filename) {
        System.out.println("текстовый документ созранен ы файле" + filename);
    }
}

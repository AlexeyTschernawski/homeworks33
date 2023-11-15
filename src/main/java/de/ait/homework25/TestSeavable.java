package de.ait.homework25;

public class TestSeavable {

    public static void main(String[] args) {
        Textdocument text = new Textdocument("Hello World");
        Image image = new Image("picture.png");
        text.save("textDocument.txt");
        text.load("textDocument.txt");
        image.save("picture.png");
        image.load("picture.png");

        System.out.println("------------");

        Saveable saveable = new Textdocument("Hello interface");
        saveable.load("textDocumantInterface.txt");

        saveable = new Image("pictureInterface.png");
        saveable.save("pictureInterface.png");
    }
}

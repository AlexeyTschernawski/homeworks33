package de.ait.homework25;

public class Image implements Saveable {
    private String imageFile;

    public Image(String imageFile) {
        this.imageFile = imageFile;
    }

    @Override
    public void save(String fileName) {
        System.out.println("The image was saved in file:" + fileName);
    }

    @Override
    public void load(String fileName) {
        System.out.println("The image is loaded from the file:" + fileName);
    }
}

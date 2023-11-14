package de.ait.homework29;

public interface Storage {

    void store(String item);

    String retrieve(int index);

    int count();

}

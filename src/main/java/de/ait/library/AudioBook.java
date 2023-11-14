package de.ait.library;

// Класс для аудиокниг, наследуется от Book
public class AudioBook extends Book {

    // длительность в минутах
    private int duration;

    public AudioBook(String id, String title, String author, String genre, int duration) {
        super(id, title, author, genre);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "duration=" + duration +
                "} " + super.toString();
    }
}

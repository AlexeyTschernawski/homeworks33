package de.ait.selbststaendigearbeit;

import java.util.UUID;

public  abstract class Film {

    private String id;

    private String title;


    private int duration;

    private int rating;

    private String genre;

    private int availableTickets;

    abstract void showTrailer();

    public Film(String title, int duration, int rating, String genre, int availableTickets) {
        this.title = title;
        this.duration = duration;
        this.rating = rating;
        this.genre = genre;
        this.id = generateId();
        this.availableTickets = availableTickets;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    private String generateId() {
        String uniqueID = UUID.randomUUID().toString();
        return uniqueID;
    }

    public String getId() {
        return id;
    }

    public int getAvailableTickets() {
        return availableTickets;
    }

    public void setAvailableTickets(int availableTickets) {
        this.availableTickets = availableTickets;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", rating=" + rating +
                ", genre='" + genre + '\'' +
                '}';
    }
}



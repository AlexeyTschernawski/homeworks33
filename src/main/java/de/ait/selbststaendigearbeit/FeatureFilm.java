package de.ait.selbststaendigearbeit;

import java.util.List;

public class FeatureFilm extends Film {

    private String director;

    private List<String> mainActors;

    public FeatureFilm(String title, int duration, int rating, String genre, int availableTickets, String director, List<String> mainActors) {
        super(title, duration, rating, genre,availableTickets);
        this.director = director;
        this.mainActors = mainActors;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<String> getMainActors() {
        return mainActors;
    }


    @Override
    void showTrailer() {
        System.out.println("FeatureFilm {" +
                "director='" + director + '\'' +
                ", mainActors=" + mainActors +
                "} " + super.toString());
    }

}

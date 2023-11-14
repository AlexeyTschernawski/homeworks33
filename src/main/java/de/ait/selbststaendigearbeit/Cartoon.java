package de.ait.selbststaendigearbeit;

public class Cartoon extends Film {

    private String animationType;



    public Cartoon(String title, int duration, int rating,
                   String genre, String animationType, int availableTickets) {
        super(title, duration, rating, genre,availableTickets);
        this.animationType = animationType;
    }


    public String getAnimationType() {
        return animationType;
    }


    @Override
    void showTrailer() {
        System.out.println("Cartoon{" +
                "animationType='" + animationType + '\'' +
                "} " + super.toString());
    }

}

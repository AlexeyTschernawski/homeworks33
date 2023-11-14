package de.ait.selbststaendigearbeit;

import java.util.ArrayList;
import java.util.List;

public class TestCinema {

    public static void main(String[] args) {
        List<String> actorsFilmTerminator = new ArrayList<>();
        actorsFilmTerminator.add("Арнольд Шварценегер");
        FeatureFilm featureFilmTerminator = new FeatureFilm
                ("Терминатор 2: Судный день",
                137, 10, "фантастический боевик",
                        1,
                        "Джеймс Кэмерон",
                actorsFilmTerminator);


        Cinema cinema = new Cinema();
        cinema.addFilm(featureFilmTerminator);
        System.out.println(cinema.filmsOnShow());
        System.out.println("---------");
        //System.out.println(UUID.randomUUID().toString());


        //System.out.println(cinema.filmsOnShow());

        //cinema.showFilmInfo(featureFilmTerminator);

       // cinema.removeFilm(featureFilmTerminator);

        System.out.println(cinema.filmsOnShow());
        String filmId = featureFilmTerminator.getId();
        //cinema.removeFilm(filmId);
        //cinema.removeFilm("7e6b02a6-2679-4e67-bc49-7c3014e95d93");
        System.out.println(cinema.filmsOnShow());
        cinema.buyTicket(featureFilmTerminator);
        cinema.buyTicket(featureFilmTerminator);

        cinema.returnTicket(featureFilmTerminator);
        cinema.buyTicket(featureFilmTerminator);


    }
}

package de.ait.selbststaendigearbeit;

import java.util.ArrayList;
import java.util.List;

public class Cinema implements TicketOperations{

    private List<Film> films = new ArrayList<>();


    public List<Film> filmsOnShow(){
        return films;
    }

    public void addFilm(Film film){
        films.add(film);
    }

    public void removeFilm(Film film){
        films.remove(film);
        System.out.println("Фильм" + film.getTitle() + " был удален");
    }

    public void removeFilm(String id){
        boolean filmFound = false;
        for (Film film: films){
            if(film.getId().equals(id)){
                filmFound = films.remove(film);
                System.out.println("Фильм с id " + id + " был удален");
                break;
            }
        }
        if (filmFound == false){
            System.out.println("Фильм с id " + id + " не был найден");
        }
    }

    public void showFilmInfo(Film film){
        System.out.println("Название" + film.getTitle()
                + " Длительность " + film.getDuration());
    }


    @Override
    public int buyTicket(Film film) {
        int tickets = film.getAvailableTickets();
        if(tickets > 0) {
            tickets--; //tickets = tickets -1;
            film.setAvailableTickets(tickets);
            System.out.println("Билет на фильм " + film.getTitle()
                    + " успешно куплен !!! Осталось билетов "
                    + film.getAvailableTickets() );
            return 12;
        }
        else {
            System.out.println("Билеты на фильм " + film.getTitle()
                    + " полностью проданы !!!");
            return 0;
        }
    }

    @Override
    public void returnTicket(Film film) {
        int tickets = film.getAvailableTickets();
        tickets++;
        film.setAvailableTickets(tickets);
        System.out.println("Билет на фильм " + film.getTitle()
                + " возвращен. Количество билетов "
                + film.getAvailableTickets());
    }

    @Override
    public int getAvailableTickets(Film film) {
        return 0;
    }
}

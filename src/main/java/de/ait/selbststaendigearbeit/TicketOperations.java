package de.ait.selbststaendigearbeit;

public interface TicketOperations {

    int buyTicket(Film film);

    void returnTicket(Film film);

    int getAvailableTickets(Film film);
}

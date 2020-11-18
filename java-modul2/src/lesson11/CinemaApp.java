package lesson11;

import java.time.LocalDate;

public class CinemaApp {
    public static void main(String[] args) {
        Address address1 = new Address("Lenina", 13);
        Address address2 = new Address("Potsdamer Platz", 54);
        Address address3 = new Address("Breidschadplatz", 3);
        Cinema cosmos = new Cinema("Cosmos", address1);
        Cinema zoo = new Cinema("ZooPalast", address2);
        Cinema uci = new Cinema("UCI", address3);
        Movie movie1 = new Movie("Full Moon", LocalDate.of(2019, 7,3), Genre.ROMANTIC, cosmos);
        Movie movie2 = new Movie("Minion", LocalDate.of(2019, 7,3), Genre.CARTOON, cosmos);
        Movie movie3 = new Movie("Dragon", LocalDate.of(2019, 7,3), Genre.HORROR_THRILLER, cosmos);
        Movie movie4 = new Movie("Street Art", LocalDate.of(2019, 7,3), Genre.DRAMA, cosmos);
        Movie movie6 = new Movie("Street Art 1", LocalDate.of(2019, 7,3), Genre.DRAMA, cosmos);
        Movie movie7 = new Movie("Street Art 2", LocalDate.of(2019, 7,3), Genre.DRAMA, cosmos);
        Movie movie5 = new Movie("Space", LocalDate.of(2019, 7,3), Genre.FANTASY_SCIFI, cosmos);
        Schedule plan = new Schedule(128);
        plan.addFilm(movie1);
        plan.addFilm(movie2);
        plan.addFilm(movie3);
        plan.addFilm(movie4);
        plan.addFilm(movie5);
        //plan.deleteFilm(movie3);
        plan.displayFilms();
        plan.displayFilmsByCinema(zoo);
        plan.displayFilmsByGenre(Genre.DRAMA);

        System.out.println(plan);
    }
}

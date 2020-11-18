package lesson11;

import java.util.Arrays;

public class Schedule {
    //add film, delete film, display film,
    // display films in cinema, display films by genres
    private Movie[] movies;
    int size;

    public Schedule(int capacity) {
        this.movies = new Movie[capacity];
        this.size = 0;
    }

    public boolean addFilm(Movie movie) {
        if (size < movies.length) {
            movies[size] = movie;
            size++;
            return true;
        }
        return false;
    }

    public boolean deleteFilm(Movie movie) {
        for (int i = 0; i < size; i++) {
            if (movies[i].equals(movie)) {
                movies[i] = movies[size - 1];
                movies[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    public void displayFilms() {
        for (int i = 0; i < size; i++) {
            System.out.println(movies[i]);
        }
    }

    public void displayFilmsByCinema(Cinema cinema) {
        for (int i = 0; i < size; i++) {
            Cinema[]temp = movies[i].getCinemas();
            for (int j = 0; j < temp.length; j++) {
                if(movies[i].equals(cinema)){
                    System.out.println("In this cinema this film: "+ movies[i]);
                }
            }
        }
    }
    public void displayFilmsByGenre(Genre genre) {
        for (int i = 0; i < size; i++) {
            Genre temp = movies[i].getGenre();
                if(temp.equals(genre)){
                    System.out.println("To this genre this film: "+ movies[i]);
                }
            }
        }

    @Override
    public String toString() {
        return "Schedule{" +
                "movies=" + Arrays.toString(movies) +
                '}';
    }
}

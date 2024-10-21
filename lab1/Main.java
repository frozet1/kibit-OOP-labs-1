package lab1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FilmDirector filmDirector = new FilmDirector("Quentin", "Tarantino", LocalDate.of(1963, 3, 27), 7, "Pulp Fiction");
        Movie filmMovie = new Movie("Pulp Fiction", MovieGenre.ACTION, filmDirector);
        filmMovie.addScreening(new Screening("First Screening", 50000, LocalDate.of(2023, 5, 10)));
        filmMovie.addScreening(new Screening("Second Screening", 60000, LocalDate.of(2023, 6, 15)));

        DocumentaryDirector docDirector = new DocumentaryDirector("David", "Attenborough", LocalDate.of(1926, 5, 8), 15, "Nature");
        Movie docMovie = new Movie("Planet Earth", MovieGenre.DRAMA, docDirector);
        docMovie.addScreening(new Screening("First Documentary Screening", 30000, LocalDate.of(2023, 5, 10)));
        docMovie.addScreening(new Screening("Second Documentary Screening", 45000, LocalDate.of(2023, 6, 15)));

        filmMovie.printFullInfo();
        docMovie.printFullInfo();

        filmMovie.printShortInfo();
        docMovie.printShortInfo();
        
        filmMovie.setTitle("Inglourious Basterds");
        System.out.println("Updated movie title: " + filmMovie.getTitle());
    }
}
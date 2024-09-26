package lab1;
import java.util.Date;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Director director = new Director("Quentin", "Tarantino", LocalDate.of(1963, 3, 27));
        Movie movie = new Movie("Pulp Fiction", MovieGenre.ACTION, director);
        movie.addScreening(new Screening("First Screening", 50000, LocalDate.of(2023, 5, 10)));
        movie.addScreening(new Screening("Second Screening", 60000, LocalDate.of(2023, 6, 15)));
        movie.addScreening(new Screening("Third Screening", 55000, LocalDate.of(2023, 7, 20)));

        movie.printFullInfo();

        movie.printShortInfo();

        movie.setTitle("Another Title");
        System.out.println("Updated movie title: " + movie.getTitle());
    }
}


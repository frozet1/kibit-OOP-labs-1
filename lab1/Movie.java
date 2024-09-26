package lab1;

import java.util.ArrayList;
import java.util.List;

class Movie {
    private String title;
    private MovieGenre genre;
    private Director director;
    private List<Screening> screenings;

    public Movie(String title, MovieGenre genre, Director director) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.screenings = new ArrayList<>();
    }


    public void addScreening(Screening screening) {
        screenings.add(screening);
    }


    public void printFullInfo() {
        System.out.println("Movie: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Director: " + director);
        System.out.println("Screenings:");
        for (Screening screening : screenings) {
            // Ensure correct output of each screening
            System.out.println(screening);  // or screening.toString()
        }
    }


    public void printShortInfo() {
        System.out.println("Movie title: " + title);
        System.out.println("Director: " + director.getName() + " " + director.getSurname());
        System.out.println("Average profit per screening: " + getAverageProfit());
    }


    public double getAverageProfit() {
        if (screenings.isEmpty()) return 0.0;
        double totalProfit = 0;
        for (Screening screening : screenings) {
            totalProfit += screening.getProfit();
        }
        return totalProfit / screenings.size();
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public void setGenre(MovieGenre genre) {
        this.genre = genre;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Screening> getScreenings() {
        return screenings;
    }

    public void setScreenings(List<Screening> screenings) {
        this.screenings = screenings;
    }
}

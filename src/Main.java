import calculation.TimeCalculator;
import models.Movie;
import models.Series;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("O Poderoso Chefão");
        myMovie.setYearOfRelease(1972);
        myMovie.setDurationInMinutes(175);
        myMovie.setDirector("Francis Ford Coppola");

        myMovie.exibitTitleInfo();
        myMovie.evaluateIt(8);
        myMovie.evaluateIt(10);
        myMovie.evaluateIt(5);
        System.out.println("Total de avaliações: " + myMovie.getTotalOfScores());
        System.out.println(myMovie.getAverageScore());

        Series sopranos = new Series();
        sopranos.setName("Sopranos");
        sopranos.setYearOfRelease(1999);
        sopranos.exibitTitleInfo();
        sopranos.setSeasons(6);
        sopranos.setEpisodesPerSeason(13);
        sopranos.setMinutesPerEpisode(50);
        System.out.println(sopranos.getDurationInMinutes());

        Movie anotherMovie = new Movie();
        anotherMovie.setName("Taxi Driver");
        anotherMovie.setYearOfRelease(1976);
        anotherMovie.setDurationInMinutes(113);



        TimeCalculator calculator = new TimeCalculator();
        calculator.include(myMovie);
        calculator.include(anotherMovie);
        calculator.include(sopranos);
        System.out.println(calculator.getTotalTime() + " minutes");
    }
}
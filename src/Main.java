import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;

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
    }
}
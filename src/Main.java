import br.com.alura.screenmatch.models.Movie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("O Poderoso Chefão");
        myMovie.setYearOfRelease(1972);
        myMovie.setDurationInMinutes(175);

        myMovie.exibitMovieInfo();
        myMovie.evaluateIt(8);
        myMovie.evaluateIt(10);
        myMovie.evaluateIt(5);
        System.out.println("Total de avaliações: " + myMovie.getTotalOfScores());
        System.out.println(myMovie.getAverageScore());
    }
}
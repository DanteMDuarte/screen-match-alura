public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.name = "O Poderoso Chefão";
        myMovie.yearOfRelease = 1972;
        myMovie.durationInMinutes = 175;

        myMovie.exibitMovieInfo();
        myMovie.evaluateIt(8);
        myMovie.evaluateIt(10);
        myMovie.evaluateIt(5);
        System.out.println(myMovie.sumOfScores);
        System.out.println(myMovie.totalOfScores);
        System.out.println(myMovie.getAverageScore());
    }
}
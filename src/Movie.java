public class Movie {
    String name;
    int yearOfRelease;
    int durationInMinutes;
    double sumOfScores;
    int totalOfScores;
    boolean includedInPlan;

    void exibitMovieInfo() {
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + yearOfRelease);
    }

    void evaluateIt(double score) {
        sumOfScores += score;
        totalOfScores++;
    }

    double getAverageScore() {
        return sumOfScores / totalOfScores;
    }
}

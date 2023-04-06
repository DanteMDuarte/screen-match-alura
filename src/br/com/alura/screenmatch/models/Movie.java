package br.com.alura.screenmatch.models;

public class Movie {
    public String name;
    public int yearOfRelease;
    public int durationInMinutes;
    private double sumOfScores;
    private int totalOfScores;
    boolean includedInPlan;

    int getTotalOfScores() {
        return totalOfScores;
    }

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

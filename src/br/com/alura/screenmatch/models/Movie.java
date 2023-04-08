package br.com.alura.screenmatch.models;

public class Movie {
    private String name;
    private int yearOfRelease;
    private int durationInMinutes;
    private private double sumOfScores;
    private private int totalOfScores;
    private boolean includedInPlan;

    int getTotalOfScores() {
        return totalOfScores;
    }

    public String getName() {
        return name;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public boolean isIncludedInPlan() {
        return includedInPlan;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
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

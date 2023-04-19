package br.com.alura.screenmatch.models;

public class Title {
    private String name;
    private int yearOfRelease;
    private int durationInMinutes;
    private double sumOfScores;
    private int totalOfScores;
    private boolean includedInPlan;


    public Title(String name, int yearOfRelease) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
    }

    public int getTotalOfScores() {
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

    public void exibitTitleInfo() {
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + yearOfRelease);
    }

    public void evaluateIt(double score) {
        sumOfScores += score;
        totalOfScores++;
    }

    public double getAverageScore() {
        return sumOfScores / totalOfScores;
    }
}

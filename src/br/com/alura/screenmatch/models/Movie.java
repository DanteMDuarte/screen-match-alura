package br.com.alura.screenmatch.models;

import be.com.alura.screenmatch.calculation.Classifiable;

public class Movie extends Title implements Classifiable {
    private String director;

    public Movie(String name, int yearOfRelease) {
        super(name, yearOfRelease);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) getAverageScore() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getName() + " (" + this.getYearOfRelease() + ")";
    }
}

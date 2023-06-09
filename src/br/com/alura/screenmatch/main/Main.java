package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.calculation.RecommendationFilter;
import br.com.alura.screenmatch.calculation.TimeCalculator;
import br.com.alura.screenmatch.models.Episodes;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie("O Poderoso Chefão", 1972);
        //myMovie.setYearOfRelease(1972);
        myMovie.setDurationInMinutes(175);
        myMovie.setDirector("Francis Ford Coppola");

        myMovie.exibitTitleInfo();
        myMovie.evaluateIt(8);
        myMovie.evaluateIt(10);
        myMovie.evaluateIt(5);
        System.out.println("Total de avaliações: " + myMovie.getTotalOfScores());
        System.out.println(myMovie.getAverageScore());

        Series sopranos = new Series("Sopranos", 1999);
        sopranos.exibitTitleInfo();
        sopranos.setSeasons(6);
        sopranos.setEpisodesPerSeason(13);
        sopranos.setMinutesPerEpisode(50);
        System.out.println(sopranos.getDurationInMinutes());

        Movie anotherMovie = new Movie("Taxi Driver", 1976);
        //anotherMovie.setName("Taxi Driver");
        //anotherMovie.setYearOfRelease(1976);
        anotherMovie.setDurationInMinutes(113);

        TimeCalculator calculator = new TimeCalculator();
        calculator.include(myMovie);
        calculator.include(anotherMovie);
        calculator.include(sopranos);
        System.out.println(calculator.getTotalTime() + " minutes");

        RecommendationFilter filter = new RecommendationFilter();
        filter.filterIt(myMovie);

        Episodes episode = new Episodes();
        episode.setNumber(1);
        episode.setSeries(sopranos);
        episode.setTotalOfViews(300);
        filter.filterIt(episode);

        var paulosMovie = new Movie("Dogville", 2003);
        //paulosMovie.setName("Dogville");
        //paulosMovie.setDurationInMinutes(200);
        paulosMovie.setYearOfRelease(2003);
        paulosMovie.evaluateIt(10);

        ArrayList<Movie> listOfMovies = new ArrayList<>();
        listOfMovies.add(myMovie);
        listOfMovies.add(anotherMovie);
        listOfMovies.add(paulosMovie);
        System.out.println("Tamnho da lista: " + listOfMovies.size());
        System.out.println("Primeiro filme: " + listOfMovies.get(0).getName());
        System.out.println(listOfMovies);
        System.out.println("toString do filme: " + listOfMovies.get(0).toString());
    }
}
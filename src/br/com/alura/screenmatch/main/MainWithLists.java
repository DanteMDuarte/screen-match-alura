package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;
import br.com.alura.screenmatch.models.Title;

import java.util.ArrayList;

public class MainWithLists {
    public static void main(String[] args) {
        Movie myMovie = new Movie("O Poderoso Chefão", 1972);
        myMovie.evaluateIt(9);
        Movie anotherMovie = new Movie("Taxi Driver", 1976);
        anotherMovie.evaluateIt(6);
        var paulosMovie = new Movie("Dogville", 2003);
        paulosMovie.evaluateIt(10);
        Series sopranos = new Series("Sopranos", 1999);

        ArrayList<Title> list = new ArrayList<>();
        list.add(myMovie);
        list.add(anotherMovie);
        list.add(paulosMovie);
        list.add(sopranos);
        for (Title item: list) {
            System.out.println(item.getName());
            if (item instanceof Movie movie) {
                System.out.println("Classsificação: " + movie.getClassification());
            }
        }
    }
}


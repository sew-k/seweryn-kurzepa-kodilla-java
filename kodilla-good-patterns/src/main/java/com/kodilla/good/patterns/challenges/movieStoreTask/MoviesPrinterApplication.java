package com.kodilla.good.patterns.challenges.movieStoreTask;

public class MoviesPrinterApplication {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        movieStore.getMovies().entrySet().stream()
                .flatMap(l -> l.getValue().stream())
                .map(s -> s + "!")
                .forEach(System.out::print);
    }
}

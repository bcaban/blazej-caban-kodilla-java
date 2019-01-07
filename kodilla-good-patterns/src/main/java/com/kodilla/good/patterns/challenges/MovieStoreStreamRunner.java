package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MovieStoreStreamRunner {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        String booksTitlesWithTranslations = movieStore.getMovies().entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(booksTitlesWithTranslations);


    }
}

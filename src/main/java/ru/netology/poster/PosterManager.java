package ru.netology.poster;

public class PosterManager {
    private String[] movies = new String[0];
    private final int defaultCountMovie;

    public PosterManager(int defaultCountMovie) {
        this.defaultCountMovie = defaultCountMovie;
    }

    public PosterManager() {
        this.defaultCountMovie = 10;
    }

    public void add(String movie) {
        String[] tmp = new String[movies.length + 1];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength = Math.min(movies.length, defaultCountMovie);
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }
}
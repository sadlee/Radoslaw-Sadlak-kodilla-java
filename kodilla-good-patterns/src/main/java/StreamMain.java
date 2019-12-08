import com.kodilla.good.patterns.challenges.MovieStore;

import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        String movies = movieStore.getMovies().values().stream()
                .flatMap(n -> n.stream())
                .collect(Collectors.joining("!","",""));
        System.out.println(movies);
    }
}
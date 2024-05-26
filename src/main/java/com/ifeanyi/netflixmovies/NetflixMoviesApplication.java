package com.ifeanyi.netflixmovies;

import com.ifeanyi.netflixmovies.movie.entity.Movie;
import com.ifeanyi.netflixmovies.movie.service.MovieService;
import com.opencsv.CSVReader;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class NetflixMoviesApplication {

    public static void main(String[] args) {
        SpringApplication.run(NetflixMoviesApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner commandLineRunner(MovieService booksService) {
//
//        return args -> {
//
//            List<String[]> p = new ArrayList<>();
//            List<Movie> books = new ArrayList<>();
//
//            try {
//                CSVReader csvReader = new CSVReader(new FileReader("C:\\Users\\E.F.Lhomes\\Downloads\\netflix_movies_and_tv_shows_sample_dataset_sample.csv"), ',');
//                for (int i = 0; i < 148; i++) {
//
//                    p.add(csvReader.readNext());
////                    if(i > 0) { // this is to resume where u stopped
//
//                    Movie movie = new Movie();
//
//                    for (int h = 0; h < 21; h++) {
//
//                        if (h == 0) {
//                            movie.setMovieUrl(p.get(i)[h] != null ? p.get(i)[h] : null);
//                        } else if (h == 1) {
//                            movie.setName(p.get(i)[h] != null ? p.get(i)[h] : null);
//                        } else if (h == 2) {
//                            movie.setContentType(p.get(i)[h] != null ? p.get(i)[h] : null);
//                        } else if (h == 3) {
//                            movie.setDescription(p.get(i)[h] != null ? p.get(i)[h] : null);
//                        } else if (h == 4) {
//                            movie.setContentRating(p.get(i)[h] != null ? p.get(i)[h] : null);
//                        } else if (h == 5) {
//                            movie.setGenre(p.get(i)[h] != null ? p.get(i)[h] : null);
//                        } else if (h == 6) {
//                            movie.setPoster(p.get(i)[h] != null ? p.get(i)[h] : null);
//                        } else if (h == 7) {
//                            movie.setFormattedDuration(p.get(i)[h] != null ? p.get(i)[h] : null);
//                        } else if (h == 8) {
//                            movie.setReleasedDate(p.get(i)[h] != null ? p.get(i)[h] : null);
//                        } else if (h == 9) {
//                            movie.setActors(p.get(i)[h] != null ? p.get(i)[h] : null);
//                        } else if (h == 10) {
//                            movie.setDirector(p.get(i)[h] != null ? p.get(i)[h] : null);
//                        } else if (h == 11) {
//                            movie.setCreator(p.get(i)[h] != null ? p.get(i)[h] : null);
//                        } else if (h == 12) {
//                            movie.setAudio(p.get(i)[h] != null ? p.get(i)[h] : null);
//                        } else if (h == 13) {
//                            movie.setSubtitle(p.get(i)[h] != null ? p.get(i)[h] : null);
//                        } else if (h == 14) {
//                            movie.setAvailableForOffline(p.get(i)[h] != null ? p.get(i)[h] : null);
//                        } else if (h == 15) {
//                            movie.setNumberOfSeasons(p.get(i)[h] != null ? p.get(i)[h] : null);
//                        } else if (h == 16) {
//                            movie.setSeasonStartDate(p.get(i)[h] != null ? p.get(i)[h] : null);
//                        } else if (h == 17) {
//                            movie.setSource(p.get(i)[h] != null ? p.get(i)[h] : null);
//                        } else if (h == 18) {
//                            movie.setSourceLink(p.get(i)[h] != null ? p.get(i)[h] : null);
//                        } else if (h == 19) {
//                            movie.setUniqId(p.get(i)[h] != null ? p.get(i)[h] : null);
//                        } else {
//                            movie.setScrapedAt(p.get(i)[h] != null ? p.get(i)[h] : null);
//                        }
//
//                    }
//
//                    books.add(movie);
//                    if (i == 147) {
//                        booksService.createList(books);
//                    }
////                    }
//                }
//
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        };
//    }
}

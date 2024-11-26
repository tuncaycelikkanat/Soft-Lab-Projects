package pkg08_labproject;

import java.util.*;

public class MovieCollection {
    
    private List<Movie> movies;
    
    public MovieCollection() {
            movies = new ArrayList<>();
    }
    
    public void addMovie(Movie movie){
        movies.add(movie);
        System.out.printf("%s is added collection.%n",movie.getTitle());
    }
    
    public void removeMovie(String title){
        boolean isRemoved = false;
        for (Movie m: movies) {
            if (m.getTitle().toLowerCase().equals(title.toLowerCase())) {
                movies.remove(m);
                isRemoved = true;
            }
        }
        
        if (isRemoved) {
            System.out.printf("%s is removed.%n",title);
        } else {
            System.out.printf("%s is not found.%n",title);            
        }
    }
    
    public String searchByTitle(String title){
        for (Movie m: movies) {
            if (m.getTitle().toLowerCase().contains(title.toLowerCase())) {
                return m.getMovieInfo();
            }
        }
        return "Movie not found.";
    }
    
    public void dislayAllMovies(){
        for (Movie m: movies) {
            System.out.println(m.getMovieInfo());      
        }
    }
    
    public void displayAvailableMovies(){
        for (Movie m: movies) {
            if (m.isAvailable) {
                System.out.println(m.getMovieInfo());
            }
        }
    }    
}

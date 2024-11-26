package pkg08_labproject;
public class Main {
    public static void main(String[] args) {
        
        /*
        abstract Movie -> title, director, releaseYear(int), genre ~category
        getMovie() abs
        
        IRentable -> rent
        
        MovieCollection add, remove, search, dislpayall, displayAvailable
        
        ----------
        
        */
        MovieCollection collection = new MovieCollection();
        
        FeatureFilm m1 = new FeatureFilm("X-Man", "Tuncay Çelikkanat", 2024, "Action", 100);           
        Documentary m2 = new Documentary("Y-Girl", "Zeynep Bayraktar", 2004, "Romantic", "Horror");

        collection.addMovie(m1);
        collection.addMovie(m2);
        
        m2.rentOut();               
//        m2.rentOut();
//        System.out.println("");

//        m2.returnMovie();
//        m2.returnMovie();
        
//        collection.removeMovie("X-Man");
        
        System.out.println();
        
        collection.dislayAllMovies();

        System.out.println("*-----------------------------*");
        
        collection.displayAvailableMovies();
        
        System.out.println("********************************");
        
        System.out.println(collection.searchByTitle("y-man"));
        
        
    }
    
}

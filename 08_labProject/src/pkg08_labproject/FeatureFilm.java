package pkg08_labproject;

public class FeatureFilm extends Movie implements IRentable{
    
    private int duration; //minute

    public FeatureFilm(String title, String director, int releaseYear, String genre, int duration) {
        super(title, director, releaseYear, genre);
        this.duration = duration;
    }

    @Override
    public String getMovieInfo() {
        return String.format(
                        "Feature Film: %s%n"
                        + "Director: %s%n"
                        + "Release Year: %d%n"
                        + "Genre: %s%n"
                        + "Duration: %d minutes%n"
                        + "Available: %b%n",super.getTitle(),super.getDirector(), super.getReleaseYear(),super.getGenre(),getDuration(),super.isAvailable);
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void rentOut() {
        if (isAvailable()) {
            this.isAvailable = false;
            System.out.printf("%s is rented out.%n", super.getTitle());
        } else {
            System.out.printf("%s has ALREADY rented.%n", super.getTitle());
        }           
    }

    @Override
    public void returnMovie() {
        if (!isAvailable()) {
            this.isAvailable = true;
            System.out.printf("%s is returned.%n", super.getTitle());
        } else {
            System.out.printf("%s did not rented out.%n", super.getTitle());
        }
            
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

}

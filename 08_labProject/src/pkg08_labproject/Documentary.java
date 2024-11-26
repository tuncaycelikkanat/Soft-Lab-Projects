package pkg08_labproject;

public class Documentary extends Movie implements IRentable{
    
    private String topic;
    
    public Documentary(String title, String director, int releaseYear, String genre, String topic) {
        super(title, director, releaseYear, genre);
        this.topic = topic;
    }

    @Override
    public String getMovieInfo() {
        return String.format(
                "Documentary Film: %s%n"
                + "Director: %s%n"
                + "Release Year: %d%n"
                + "Genre: %s%n"
                + "Topic: %s%n"
                + "Available: %b%n",super.getTitle(),super.getDirector(), super.getReleaseYear(),super.getGenre(),getTopic(),super.isAvailable);
    }

    public String getTopic() {
        return topic;
    }

    @Override
    public void rentOut() {
        if (isAvailable()) {
            this.isAvailable = false;
            System.out.printf("%s is rented.%n", super.getTitle());
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

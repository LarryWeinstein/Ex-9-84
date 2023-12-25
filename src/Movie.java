import java.util.ArrayList;
import java.util.Random;

public class Movie {
    private final String[] actors;
    private final String title;

    private final String director;

    private final ArrayList<String> reviews;

    public Movie(String title, String director, String[] actors) {
        this.actors = actors;
        this.title = title;
        this.director = director;
        reviews = new ArrayList<>();
    }

    public String getTitle(){
        return title;
    }

    public String getDirector(){
        return director;
    }

    public String[] getActors(){
        return actors;
    }

    public void addReview(String review){
        reviews.add(review);
    }

    //No indication of need to remove reviews
    //retrieve random review

    //Print out reviews


    public void printReviews(){
        for(String review : reviews){
            System.out.println(review);
        }
    }

    public String randomReview(){
        Random random = new Random();
        int index = random.nextInt(reviews.size());
        return reviews.get(index);
    }

}

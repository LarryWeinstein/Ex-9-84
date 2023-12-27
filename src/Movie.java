import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Movie {
    private final Person[] actors;
    private final String title;

    private final Person director;

    private final List<Review> reviews;

    //Leave as default constructor
    public Movie(String title, Person director, Person[] actors) {
        this.actors = actors;
        this.title = title;
        this.director = director;
        reviews = new ArrayList<>();
    }

    public Movie(String title, Person director, Person[] actors, Review[] reviews){
        this.title = title;
        this.actors = actors;
        this.director = director;
        this.reviews = List.of(reviews);
    }

    public String getTitle() {
        return title;
    }

    public Person getDirector() {
        return director;
    }

    public Person[] getActors() {
        return actors;
    }

    public void addReview(Review review) {
        reviews.add(review);
    }

    //No indication of need to remove reviews
    //retrieve random review


    public Review randomReview() {
        Random random = new Random();
        int index = random.nextInt(reviews.size());
        return reviews.get(index);
    }

    public float getAvgStarRating() {
        float sum = 0.0f;
        for (Review review : reviews) {
            sum += (float) review.getNumStars();
        }
        return sum / (float) reviews.size();
    }

}

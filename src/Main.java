public class Main {
    public static void main(String[] args) {
        //create first person
        Person georgeLucas = new Person("George Lucas", "Lucas", "05/14/1944");
        System.out.println(georgeLucas.getName());
        System.out.println(georgeLucas.getLastName());
        System.out.println(georgeLucas.getDateOfBirth());

        Person markHamill = new Person("Mark Hamill", "Hamill", "09/25/1951");
        Person harrisonFord = new Person("Harrison Ford", "Ford", "07/13/1942");
        Person carrieFisher = new Person("Carrie Fisher", "Fisher", "10/21/1956");

        Person[] actors = {markHamill, harrisonFord, carrieFisher};

        //Create reviews
        Person geneSiskel = new Person("Gene Siskel", "Siskel", "01/26/1946");
        Person rogerEbert = new Person("Roger Ebert", "Ebert", "06/18/1942");

        Review review1 = new Review(rogerEbert, "02/02/1973", "Good show", 5);
        Review review2 = new Review(geneSiskel, "02/03/1973", "OK", 4);

        Review[] reviews = {review1, review2};
        Movie movie = new Movie("Star Wars", georgeLucas, actors, reviews);

        //Review review3 = new Review(markHamill, "04/12/1975", "Best movie ever", 5);

        //movie.addReview(review3);
        //check getter methods
        System.out.println(movie.getTitle());
        System.out.println(movie.getDirector().getName());
        System.out.println(movie.getActors()[1].getDateOfBirth());

        /*
        movie.addReview(review1);
        movie.addReview(review2);
        */

        //get average stars
        System.out.println(movie.getAvgStarRating());

        //Get random reviews
        for(int i = 0; i < 3; i++){
            Review reviewFound = movie.randomReview();
            System.out.println(reviewFound.getAuthor().getName());
            System.out.println(reviewFound.getReviewDate());
            System.out.println(reviewFound.getText());
        }
        }
}
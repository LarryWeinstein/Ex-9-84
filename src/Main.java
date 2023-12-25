public class Main {
    public static void main(String[] args) {
        String[] actors = {"Mark Hammill", "Carrie Fisher", "Harrison Ford"};
        Movie movie = new Movie("Star Wars", "George Lucas", actors);

        System.out.println("Title: " + movie.getTitle());
        System.out.println("Director: " + movie.getDirector());
        String[] actors_list = movie.getActors();
        System.out.println("Actors:");
        for(String actor: actors_list){
            System.out.println(actor);
        }

        movie.addReview("Greatest movie ever");
        movie.addReview("I just don't get it");
        movie.addReview("Could be better");

        movie.printReviews();

        System.out.println("Random reviews");
        for(int i = 0; i < 5; i++){
            System.out.println(movie.randomReview());
        }
    }
}
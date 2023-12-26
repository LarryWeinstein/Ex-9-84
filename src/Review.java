import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Review {
    private final Person author;
    private final LocalDate date;
    private final String text;
    private final int numStars;

    public Review(Person author, String date, String text, int numStars){
        this.author = author;
        this.text = text;
        this.numStars = numStars;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        this.date = LocalDate.parse(date, formatter);

    }

    public String getReviewDate(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return date.format(formatter);
    }
    public Person getAuthor(){
        return author;
    }
    public String getText(){
        return text;
    }

    public int getNumStars(){
        return numStars;
    }
}

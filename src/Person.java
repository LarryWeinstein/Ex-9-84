import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    private final String name;
    private final LocalDate dateOfBirth;

    private final String lastName;

    public Person(String name, String lastName, String dateOfBirth){
        this.name = name;
        this.lastName = lastName;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        this.dateOfBirth = LocalDate.parse(dateOfBirth, formatter);
    }

    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;
    }

    public String getDateOfBirth(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return dateOfBirth.format(formatter);
    }
}

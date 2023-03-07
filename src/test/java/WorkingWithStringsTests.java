import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import polezhaiev.hillel.WorkingWithStrings;

public class WorkingWithStringsTests {
    private WorkingWithStrings worker;

    @BeforeEach
    public void initialize(){
        worker = new WorkingWithStrings();
    }

    @Test
    public void reverseStringTest(){
        String string = "done";
        String expected = "enod";
        String actual = worker.reverseString(string);

        assert expected.equals(actual);
    }

    @Test
    public void getFirstLetterTest(){
        String string = "hello";
        char expected = 'h';
        char actual = worker.getFirstLetter(string);

        assert expected == actual;
    }

    @Test
    public void getLastLetterTest(){
        String string = "hello";
        char expected = 'o';
        char actual = worker.getLastLetter(string);

        assert expected == actual;
    }
}

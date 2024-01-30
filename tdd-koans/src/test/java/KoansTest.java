import org.example.Koans;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class KoansTest {

    @Test
    void testGreetingWithName(){

        //Arrange
        String inputName = "Bob";
        String expected = "Hello, Bob";

        //Act
        String actual = Koans.greet(inputName);

        //Assert
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testGreetingWhenNameEqualsNull(){
        String inputName = "";
        String expected = "Hello, my friend";

        String actual = Koans.greet(inputName);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void testGreetingWithShouting(){
        String inputName = "JERRY";
        String expected = "HELLO JERRY!";

        String actual = Koans.greet(inputName);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGreetingWithMultipleNames(){
        String[] names = {"Jill", "Jane"};
        String expected = "Hello, Jill and Jane";

        String actual = Koans.greet(names);

        Assertions.assertEquals(expected, actual);
    }
}

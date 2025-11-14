package ru.mentee.power;

import org.junit.jupiter.api.Test;
import ru.mentee.power.Greeting;
import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    @Test
    void shouldGreeting() {
        Greeting greeting = new Greeting();
        String result = greeting.greeting();
        assertEquals(result, "Hello MP-11 done");
    }


}
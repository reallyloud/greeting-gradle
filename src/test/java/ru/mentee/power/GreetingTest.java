package ru.mentee.power;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {
    @Test
    void shouldGreeting() {
        Greeting greeting = new Greeting();
        String result = greeting.greeting();
        assertEquals("Hello MP-10 done", result);
    }
}
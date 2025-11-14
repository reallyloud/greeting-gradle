package ru.mentee.power;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {

    @Test
    void checkPalindromeChecker() {
        boolean result = PalindromeChecker.isPalindrome("bob");
        assertEquals(result,true);

        result = PalindromeChecker.isPalindrome("boby");
        assertEquals(result,false);

        result = PalindromeChecker.isPalindrome("анна");
        assertEquals(result,true);
    }
}
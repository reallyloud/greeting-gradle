package ru.mentee.power;

import java.util.Scanner;

public class PalindromeChecker {

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
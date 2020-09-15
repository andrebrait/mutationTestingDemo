package com.mutation.testing.demo;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MissingTestCaseTest {

    @Test
    public void whenPalindrome_thenAccept() {
        assertTrue(MissingTestCase.isPalindrome("noon"));
    }

    @Test
    public void whenPalindromeOfOddLength_thenAccept() {
        assertTrue(MissingTestCase.isPalindrome("oco"));
    }

    @Test
    public void whenPalindromeOfOddLength_long_thenAccept() {
        assertTrue(MissingTestCase.isPalindrome("mococom"));
    }

    @Test
    public void whenPalindromeOfEvenLength_long_thenAccept() {
        assertTrue(MissingTestCase.isPalindrome("yabaabay"));
    }

}
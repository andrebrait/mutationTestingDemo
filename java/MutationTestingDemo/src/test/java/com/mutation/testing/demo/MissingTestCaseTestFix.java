package com.mutation.testing.demo;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Contains missing test cases which will bring the mutation test coverage to 100%.
 */
public class MissingTestCaseTestFix {

    //@Test
    public void whenEmpty_thenAccept() {
        assertTrue(MissingTestCase.isPalindrome(""));
    }

    //@Test
    public void whenPalindromeOfOddLength_long_thenAccept() {
        assertTrue(MissingTestCase.isPalindrome("ococo"));
    }

    //@Test
    public void whenPalindromeOfEvenLength_long_thenAccept() {
        assertTrue(MissingTestCase.isPalindrome("abaaba"));
    }

    //@Test
    public void whenNotPalindromeAtFirstChar_thenReject() {
        assertFalse(MissingTestCase.isPalindrome("avocado"));
    }

    //@Test
    public void whenNotPalindrome_thenReject() {
        assertFalse(MissingTestCase.isPalindrome("aabcaa"));
    }

}

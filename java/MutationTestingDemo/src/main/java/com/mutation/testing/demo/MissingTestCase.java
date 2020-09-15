package com.mutation.testing.demo;

/**
 * When "inputString.length() == 0" is mutated to "inputString.length() != 0",
 * or "isPalindrome(mid)" is mutated to "true" the return value will still be the same for the test
 * we have.
 *
 * Since this is a recursive method, branch coverage will be 100% for the first branch,
 * leading us to think we have fully covered this class.
 *
 * When mutating "isPalindrome(mid)" to "!isPalindrome(mid)", the recursion masks the fact that this
 * inversion will have different effects on strings depending on their length.
 *
 * When mutating "(firstChar == lastChar) && isPalindrome(mid)" to
 * "!((firstChar == lastChar) && isPalindrome(mid))", a similar effects happens.
 *
 * To solve these, we should add tests that break when such mutations occur.
 */
public final class MissingTestCase {

    private MissingTestCase() {
    }

    public static boolean isPalindrome(String inputString) {
        if (inputString.length() == 0) {
            return true;
        } else {
            int lastIndex = inputString.length() - 1;
            char firstChar = inputString.charAt(0);
            char lastChar = inputString.charAt(lastIndex);
            String mid = inputString.substring(Math.min(lastIndex, 1), lastIndex);
            return (firstChar == lastChar) && isPalindrome(mid);
        }
    }

}

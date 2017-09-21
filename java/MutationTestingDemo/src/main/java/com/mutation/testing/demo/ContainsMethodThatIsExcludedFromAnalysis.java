package com.mutation.testing.demo;

/**
 * The method unusedMethod has been configured in the pom to be excluded by PIT so no mutations will be generated.
 */
class ContainsMethodThatIsExcludedFromAnalysis {

    boolean isEven(int input) {
        return input % 2 == 0;
    }

    boolean unusedMethod(int input) {
        return !isEven(input);
    }
}

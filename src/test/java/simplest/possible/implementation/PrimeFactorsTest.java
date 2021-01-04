package simplest.possible.implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.sun.tools.javac.util.List.of;
import static java.util.Collections.emptyList;

public class PrimeFactorsTest {
    @Test
    void thereAreNoPrimeFactorsFor1() {

        Assertions.assertEquals(emptyList(), new Library().someLibraryMethod(1));
    }

    @Test
    void primeFactorOf2Is2Itself() {
        Assertions.assertEquals(of(2), new Library().someLibraryMethod(2));
    }
}
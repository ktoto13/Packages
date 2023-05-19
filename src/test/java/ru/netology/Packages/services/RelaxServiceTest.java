package ru.netology.Packages.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RelaxServiceTest {
    @ParameterizedTest
//    @CsvSource({
//            "10000,3000,20000,3",
//            "100000,60000,150000,2"
//    })
    @CsvFileSource(files = "src/test/resources/relax.csv")
    public void NumberMonthRest1(int income, int expenses, int threshold, int expectation) {
        RelaxService service = new RelaxService();
//        int income = 10_000;
//        int expenses = 3_000;
//        int threshold = 20_000;
//        int expectation = 3;

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expectation, actual);
    }

//    @Test
//    public void NumberMonthRest2() {
//        RelaxService service = new RelaxService();
//        int income = 100_000;
//        int expenses = 60_000;
//        int threshold = 150_000;
//        int expectation = 2;
//
//        int actual = service.calculate(income, expenses, threshold);
//
//        Assertions.assertEquals(expectation, actual);
//    }

}

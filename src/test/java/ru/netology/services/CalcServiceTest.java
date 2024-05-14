package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CalcServiceTest {

    @ParameterizedTest
   // @CsvSource({
    //        "10000,3000,20000,3",
    //        "100000,60000,150000,2"
   // })
    @CsvFileSource(files="src/test/resources/calc.csv")
    void shouldCalcThree(int income, int expenses, int threshold, int expected) {
        CalcService service = new CalcService();

        //int income = 10000;     // доход от работы
        // int expenses = 3000;    // обязательные месячные траты
        //int threshold = 20000;  // траты на отдых
        //int expected = 3;        // ожидаемое количество месяцев отдыха

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }


    //  @Test
    // void shouldCalculateTwo() {
    //  CalcService service = new CalcService();

    //  int income = 100000;    // доход от работы
    //  int expenses = 60000;   // обязательные месячные траты
    // int threshold = 150000; // траты на отдых
    //int expected = 2;        // ожидаемое количество месяцев отдыха

    //int actual = service.calculate(income, expenses, threshold);


    //Assertions.assertEquals(expected, actual);
}





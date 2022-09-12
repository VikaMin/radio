package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {

   @ParameterizedTest
   @CsvFileSource(files = "src/test/resources/diapason.csv")

    @Test
    public void nextTest(int value, int result) {
        Radio radio = new Radio();
        radio.setCorrentStation(value);
        radio.next();

        int expected = result;
        int actual = radio.getCorrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/diapasonPrev.csv")

    @Test
    public void prevTest(int value, int result) {
        Radio radio = new Radio();
        radio.setCorrentStation(value);
        radio.prev();

        int expected = result;
        int actual = radio.getCorrentStation();

        Assertions.assertEquals(expected, actual);
    }


}
package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void testRadio() {

        Assertions.assertEquals(10, radio.getAmountStation());
    }

    @Test
    public void setRadio() {

        Radio radio30 = new Radio(30);

        Assertions.assertEquals(30, radio30.getAmountStation());

    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/RadioStation.csv")
    public void shouldSetRadioStation(int currentRadioStation, int expected) {

        radio.setCurrentStation(currentRadioStation);

        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Volume.csv")
    public void shouldSetVolume(int currentVolume, int expected) {

        radio.setCurrentVolume(currentVolume);

        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource({
            "0,1",
            "4,5",
            "9,0"
    })
    public void shouldNextStation(int currentRadioStation, int expected) {

        radio.setCurrentStation(currentRadioStation);

        radio.nextStation();

        Assertions.assertEquals(expected, radio.getCurrentStation());

    }

    @ParameterizedTest
    @CsvSource({
            "9,8",
            "5,4",
            "0,9"
    })
    public void shouldPrevStation(int currentRadioStation, int expected) {

        radio.setCurrentStation(currentRadioStation);

        radio.prevStation();

        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @ParameterizedTest
    @CsvSource({
            "0,1",
            "99,100",
            "100,100"

    })
    public void shouldIncreaseVolume(int currentVolume, int expected) {

        radio.setCurrentVolume(currentVolume);

        radio.increaseVolume();

        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource({
            "100,99",
            "1,0",
            "0,0"

    })
    public void shouldReduceVolume(int currentVolume, int expected) {

        radio.setCurrentVolume(currentVolume);

        radio.reduceVolume();

        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

}

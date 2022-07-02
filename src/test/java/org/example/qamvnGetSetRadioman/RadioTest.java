package org.example.qamvnGetSetRadioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void shouldSetCurrentRadioStationNumber() {
        Radio radio = new Radio();
        radio.setStationNumber(12);
        int expected = 12;
        int actual = radio.getStationNumber();
    }
    @Test
    public void shouldSetCurrentRadioStationNumber10() {
        Radio radio = new Radio();
        radio.setStationNumber(10);
        int expected = 0;
        int actual = radio.getStationNumber();
    }
    @Test
    public void shouldSetCurrentRadioStationNumber0() {
        Radio radio = new Radio();
        radio.setStationNumber(0);
        int expected = 0;
        int actual = radio.getStationNumber();
    }
    @Test
    public void shouldSetCurrentRadioStationNumberOtr() {
        Radio radio = new Radio();
        radio.setStationNumber(-1);
        int expected = 0;
        int actual = radio.getStationNumber();
    }

    @Test
    public void shouldSetMaxRadioStation() {
        Radio radio = new Radio();
        radio.setMaxRadioStation();
        int expected = 9;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinRadioStation() {
        Radio radio = new Radio();
        radio.setMinRadioStation();
        int expected = 0;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio radio = new Radio();
        radio.next();
        int expected = 1;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextStation5() {
        Radio radio = new Radio();
        radio.setStationNumber(5);
        radio.next();
        int expected = 6;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextStation9() {
        Radio radio = new Radio();
        radio.setStationNumber(9);
        radio.next();
        int expected = 0;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextStation0() {
        Radio radio = new Radio();
        radio.setStationNumber(0);
        radio.next();
        int expected = 1;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void prevStation() {
        Radio radio = new Radio();
        radio.prev();
        int expected = 9;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevStation4() {
        Radio radio = new Radio();
        radio.setStationNumber(4);
        radio.prev();
        int expected = 3;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    //    тесты на громкость
    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.getVolume();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldSetVolume5() {
        Radio radio = new Radio();
        radio.setVolume(5);
        radio.getVolume();
        int expected = 5;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolumeOtr() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        radio.getVolume();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolume11() {
        Radio radio = new Radio();
        radio.setVolume(11);
        radio.getVolume();
        int expected = 11;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolume10() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.getVolume();
        int expected = 10;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolume0() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.getVolume();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume();
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetMinVolume() {
        Radio radio = new Radio();
        radio.setMinVolume();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextVolume9() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.increaseVolume();
        int expected = 11;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevVolume() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevVolume5() {
        Radio radio = new Radio();
        radio.setVolume(5);
        radio.decreaseVolume();
        int expected = 4;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevVolume10() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.decreaseVolume();
        int expected = 9;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevVolume0() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }


}
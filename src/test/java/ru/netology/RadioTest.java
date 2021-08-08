package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldsetNextStationIfStationIs9() {
        Radio radio = new Radio();
        radio.getMaxStation();
        radio.setNextStation(radio.getMaxStation());
        int expected = radio.getMinStation();
        int actual = radio.getCurrantRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldsetNextStationIfStationLess9() {
        Radio radio = new Radio();
        radio.setNextStation(8);
        int expected = 9;
        int actual = radio.getCurrantRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldsetPrevStationIfStationIs0() {
        Radio radio = new Radio();
        radio.setPrevStation(radio.getMinStation());
        int expected = radio.getMaxStation();
        int actual = radio.getCurrantRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldsetPrevStationIfStationOver0() {
        Radio radio = new Radio();
        radio.setPrevStation(2);
        int expected = 1;
        int actual = radio.getCurrantRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldsetincreaseSoundVolume1pIfCurrentIs10() {
        Radio radio = new Radio();
        radio.setincreaseSoundVolume1p(radio.getMaxSoundVolume());
        int expected = radio.getMaxSoundVolume();
        int actual = radio.getCurrantSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldsetincreaseSoundVolume1pIfCurrentIsLess10() {
        Radio radio = new Radio();
        radio.setincreaseSoundVolume1p(7);
        int expected = 8;
        int actual = radio.getCurrantSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldsetdecreaseSoundVolume1pIfCurrentIs0() {
        Radio radio = new Radio();
        radio.setdecreaseSoundVolume1p(radio.getMinSoundVolume());
        int expected = radio.getMinSoundVolume();
        int actual = radio.getCurrantSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldsetdecreaseSoundVolume1pIfCurrentIsOver0() {
        Radio radio = new Radio();
        radio.setdecreaseSoundVolume1p(2);
        int expected = 1;
        int actual = radio.getCurrantSoundVolume();
        assertEquals(expected, actual);
    }
}
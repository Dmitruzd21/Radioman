package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    //Тестирование радиостанций
    @Test
    public void shouldSetNumberOfStations() {
        Radio radio = new Radio();
        int expected = 15;
        radio.setNumberOfStations(15);
        int actual = radio.getNumberOfStations();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationOverMax() {
        Radio radio = new Radio(150);
        int expected = radio.getCurrantRadioStation();
        radio.setCurrantRadioStation(radio.getMaxStation() + 1);
        int actual = radio.getCurrantRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationUnderMax() {
        Radio radio = new Radio(150);
        int expected = radio.getCurrantRadioStation();
        radio.setCurrantRadioStation(-1);
        int actual = radio.getCurrantRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldsetNextStationIfStationIsMax() {
        Radio radio = new Radio(150);
        radio.setCurrantRadioStation(radio.getMaxStation());
        radio.setNextStation();
        int expected = radio.getMinStation();
        int actual = radio.getCurrantRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldsetNextStationIfStationLessMax() {
        Radio radio = new Radio(150);
        radio.setCurrantRadioStation(8);
        radio.setNextStation();
        int expected = 9;
        int actual = radio.getCurrantRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldsetPrevStationIfStationIs0() {
        Radio radio = new Radio(150);
        radio.setCurrantRadioStation(radio.getMinStation());
        radio.setPrevStation();
        int expected = radio.getMaxStation();
        int actual = radio.getCurrantRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldsetPrevStationIfStationOver0() {
        Radio radio = new Radio(150);
        radio.setCurrantRadioStation(2);
        radio.setPrevStation();
        int expected = 1;
        int actual = radio.getCurrantRadioStation();
        assertEquals(expected, actual);
    }

// Тестирование уровня громкости

    @Test
    public void shouldNotSetSoundVolumeOverMax() {
        Radio radio = new Radio();
        int expected = radio.getCurrantSoundVolume();
        radio.setCurrantSoundVolume(101);
        int actual = radio.getCurrantSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundVolumeUnderMin() {
        Radio radio = new Radio();
        int expected = radio.getCurrantSoundVolume();
        radio.setCurrantSoundVolume(-1);
        int actual = radio.getCurrantSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldsetincreaseSoundVolume1pIfCurrentIsMax() {
        Radio radio = new Radio();
        radio.setCurrantSoundVolume(radio.getMaxSoundVolume());
        radio.setincreaseSoundVolume1p();
        int expected = radio.getMaxSoundVolume();
        int actual = radio.getCurrantSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldsetincreaseSoundVolume1pIfCurrentIsLessMax() {
        Radio radio = new Radio();
        radio.setCurrantSoundVolume(99);
        radio.setincreaseSoundVolume1p();
        int expected = 100;
        int actual = radio.getCurrantSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldsetdecreaseSoundVolume1pIfCurrentIs0() {
        Radio radio = new Radio();
        radio.setCurrantSoundVolume(radio.getMinSoundVolume());
        radio.setdecreaseSoundVolume1p();
        int expected = radio.getMinSoundVolume();
        int actual = radio.getCurrantSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldsetdecreaseSoundVolume1pIfCurrentIsOver0() {
        Radio radio = new Radio();
        radio.setCurrantSoundVolume(1);
        radio.setdecreaseSoundVolume1p();
        int expected = 0;
        int actual = radio.getCurrantSoundVolume();
        assertEquals(expected, actual);
    }
}
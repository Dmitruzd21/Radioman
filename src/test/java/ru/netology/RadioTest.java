package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    //Тестирование радиостанций

    @Test
    public void shouldNotSetSrationOverMax() {
        Radio radio = new Radio();
        int expected = radio.getCurrantRadioStation();
        radio.setCurrantRadioStation(10);
        int actual = radio.getCurrantRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationUnderMax() {
        Radio radio = new Radio();
        int expected = radio.getCurrantRadioStation();
        radio.setCurrantRadioStation(-1);
        int actual = radio.getCurrantRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldsetNextStationIfStationIs9() {
        Radio radio = new Radio();
        radio.setCurrantRadioStation(radio.getMaxStation());
        radio.setNextStation();
        int expected = radio.getMinStation();
        int actual = radio.getCurrantRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldsetNextStationIfStationLess9() {
        Radio radio = new Radio();
        radio.setCurrantRadioStation(8);
        radio.setNextStation();
        int expected = 9;
        int actual = radio.getCurrantRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldsetPrevStationIfStationIs0() {
        Radio radio = new Radio();
        radio.setCurrantRadioStation(radio.getMinStation());
        radio.setPrevStation();
        int expected = radio.getMaxStation();
        int actual = radio.getCurrantRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldsetPrevStationIfStationOver0() {
        Radio radio = new Radio();
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
        radio.setCurrantSoundVolume(11);
        int actual = radio.getCurrantSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundVolumeUnderMax() {
        Radio radio = new Radio();
        int expected = radio.getCurrantSoundVolume();
        radio.setCurrantSoundVolume(-1);
        int actual = radio.getCurrantSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldsetincreaseSoundVolume1pIfCurrentIs10() {
        Radio radio = new Radio();
        radio.setCurrantSoundVolume(radio.getMaxSoundVolume());
        radio.setincreaseSoundVolume1p();
        int expected = radio.getMaxSoundVolume();
        int actual = radio.getCurrantSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldsetincreaseSoundVolume1pIfCurrentIsLess10() {
        Radio radio = new Radio();
        radio.setCurrantSoundVolume(7);
        radio.setincreaseSoundVolume1p();
        int expected = 8;
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
        radio.setCurrantSoundVolume(2);
        radio.setdecreaseSoundVolume1p();
        int expected = 1;
        int actual = radio.getCurrantSoundVolume();
        assertEquals(expected, actual);
    }
}
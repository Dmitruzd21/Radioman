package ru.netology;

public class Radio {

    private int minStation = 0;
    private int maxStation = 9;
    private int currantRadioStation;


    private int minSoundVolume = 0;
    private int maxSoundVolume = 10;
    private int currantSoundVolume;

    public int getCurrantRadioStation() {
        return currantRadioStation;
    }

    public int getCurrantSoundVolume() {
        return currantSoundVolume;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinSoundVolume() {
        return minSoundVolume;
    }

    public int getMaxSoundVolume() {
        return maxSoundVolume;
    }

    // Работа с радиостанциями

    public void setZeroStation() {
        currantRadioStation = 0;
    }

    public void setFirstStation() {
        currantRadioStation = 1;
    }

    public void setSecondStation() {
        currantRadioStation = 2;
    }

    public void setThirdStation() {
        currantRadioStation = 3;
    }

    public void setFourthStation() {
        currantRadioStation = 4;
    }

    public void setFifthStation() {
        currantRadioStation = 5;
    }

    public void setSixthStation() {
        currantRadioStation = 6;
    }

    public void setSeventhStation() {
        currantRadioStation = 7;
    }

    public void setEighthStation() {
        currantRadioStation = 8;
    }

    public void setNinthStation() {
        currantRadioStation = 9;
    }


    public void setNextStation(int currantRadioStation) {
        if (currantRadioStation < 9) {
            this.currantRadioStation = currantRadioStation + 1;
        }
        if (currantRadioStation == maxStation) {
            this.currantRadioStation = minStation;
        }

    }


    public void setPrevStation(int currantRadioStation) {
        if (currantRadioStation > 0) {
            this.currantRadioStation = currantRadioStation - 1;
        }
        if (currantRadioStation == minStation) {
            this.currantRadioStation = maxStation;
        }
    }


    //Работа с уровнем громкости звука
    public void setincreaseSoundVolume1p(int currantSoundVolume) {
        if (currantSoundVolume < 10) {
            this.currantSoundVolume = currantSoundVolume + 1;
        }
        if (currantSoundVolume == maxSoundVolume) {
            return;
        }
    }

    public void setdecreaseSoundVolume1p(int currantSoundVolume) {
        if (currantSoundVolume > 0) {
            this.currantSoundVolume = currantSoundVolume - 1;
        }
        if (currantSoundVolume == minSoundVolume) {
            return;
        }
    }
}
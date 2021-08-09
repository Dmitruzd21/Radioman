package ru.netology;

public class Radio {

    private int minStation = 0;
    private int maxStation = 9;
    private int currantRadioStation;


    private int minSoundVolume = 0;
    private int maxSoundVolume = 10;
    private int currantSoundVolume = 3;

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


    public void setCurrantRadioStation(int currantRadioStation) {
        if (currantRadioStation < minStation){
            return;
        }
        if (currantRadioStation > maxStation){
            return;
        }
        this.currantRadioStation = currantRadioStation;
    }


    public void setNextStation() {
        if (currantRadioStation < maxStation) {
            this.currantRadioStation = currantRadioStation + 1;
        } else if (currantRadioStation == maxStation) {
            this.currantRadioStation = minStation;
        }

    }


    public void setPrevStation() {
        if (currantRadioStation > minStation) {
            this.currantRadioStation = currantRadioStation - 1;
        } else if (currantRadioStation == minStation) {
            this.currantRadioStation = maxStation;
        }
    }


    //Работа с уровнем громкости звука

    public void setCurrantSoundVolume(int currantSoundVolume) {
        if (currantSoundVolume < minSoundVolume){
            return;
        }
        if (currantSoundVolume > maxSoundVolume){
            return;
        }
        this.currantSoundVolume = currantSoundVolume;
    }


    public void setincreaseSoundVolume1p() {
        if (currantSoundVolume < maxSoundVolume) {
            this.currantSoundVolume = currantSoundVolume + 1;
        } else if (currantSoundVolume == maxSoundVolume) {
            this.currantSoundVolume = currantSoundVolume;
        }
    }

    public void setdecreaseSoundVolume1p() {
        if (currantSoundVolume > minSoundVolume) {
            this.currantSoundVolume = currantSoundVolume - 1;
        } else if (currantSoundVolume == minSoundVolume) {
            this.currantSoundVolume = currantSoundVolume;
        }

    }
}
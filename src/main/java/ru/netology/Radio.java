package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Radio {
    private int numberOfStations = 10;
    private int minStation = 0;
    private int maxStation = numberOfStations - 1;
    private int currantRadioStation;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 100;
    private int currantSoundVolume = 3;

    // Работа с радиостанциями.



    public void setCurrantRadioStation(int currantRadioStation) {
        if (currantRadioStation < minStation) {
            return;
        }
        if (currantRadioStation > maxStation) {
            return;
        }
        this.currantRadioStation = currantRadioStation;
    }


    public void setNextStation() {
        if (currantRadioStation < maxStation) {
            this.currantRadioStation = currantRadioStation + 1;
        } else {
            this.currantRadioStation = minStation;
        }
    }


    public void setPrevStation() {
        if (currantRadioStation > minStation) {
            this.currantRadioStation = currantRadioStation - 1;
        } else {
            this.currantRadioStation = maxStation;
        }
    }


    //Работа с уровнем громкости звука.

    public void setCurrantSoundVolume(int currantSoundVolume) {
        if (currantSoundVolume < minSoundVolume) {
            return;
        }
        if (currantSoundVolume > maxSoundVolume) {
            return;
        }
        this.currantSoundVolume = currantSoundVolume;
    }


    public void setincreaseSoundVolume1p() {
        if (currantSoundVolume < maxSoundVolume) {
            this.currantSoundVolume = currantSoundVolume + 1;
        } else {
            this.currantSoundVolume = currantSoundVolume;
        }
    }


    public void setdecreaseSoundVolume1p() {
        if (currantSoundVolume > minSoundVolume) {
            this.currantSoundVolume = currantSoundVolume - 1;


        } else {
            this.currantSoundVolume = currantSoundVolume;
        }
    }

}
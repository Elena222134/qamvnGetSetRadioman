package org.example.qamvnGetSetRadioman;

public class Radio {
    private int currentRadioStationNumber;
    private int currentVolume;
    private int maxStation;
    private int maxVol;


    public Radio(){
        maxStation = 9;
        maxVol = 100;
    }
    public Radio(int stationCount){
        maxStation = stationCount - 1;
    }



    public int getStationNumber() {
        return currentRadioStationNumber;
    }

    public int getVolume() {
        return currentVolume;
    }

    public void setStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < 0) {
            return;
        }
        if (newCurrentRadioStationNumber > maxStation) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public void setVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > maxVol) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setMaxRadioStation() {
        currentRadioStationNumber = maxStation ;
    }

    public void setMinRadioStation() {
        currentRadioStationNumber = 0;
    }

    public void setMaxVolume() {
        currentVolume = maxVol;
    }

    public void setMinVolume() {
        currentVolume = 0;
    }


    public void next() {

        if (getStationNumber() < maxStation) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        } else {
            currentRadioStationNumber = 0;
        }
    }

    public void prev() {
//
        if (getStationNumber() > 0) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        } else {
            currentRadioStationNumber = maxStation;
        }
    }

    public void increaseVolume() {

        if (currentVolume < maxVol) {
            currentVolume = currentVolume + 1;

        }return;

    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }

    }
}

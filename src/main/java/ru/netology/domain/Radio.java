package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int stationsCount = 10;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = (maxVolume + minVolume) / 2;

    //default c-tor
    public Radio() {
    }

    //initializing c-tor
    public Radio(int numberOfStations) {
        stationsCount = numberOfStations;
    }

    //no setters for this fellow
    public int getStationsCount() {
        return stationsCount;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume || currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0 || currentStation > getLastStationIndex()) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void volumeUp() {
        if (currentVolume == maxVolume) {
            return;
        }
        currentVolume++;
    }

    public void volumeDown() {
        if (currentVolume == minVolume) {
            return;
        }
        currentVolume--;
    }

    public void stationNext() {
        if (currentStation == getLastStationIndex()) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void stationPrev() {
        if (currentStation == 0) {
            currentStation = getLastStationIndex();
        } else {
            currentStation--;
        }
    }

    private int getLastStationIndex() {
        return stationsCount - 1; // zero-based!
    }
}

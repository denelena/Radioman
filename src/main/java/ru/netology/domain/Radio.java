package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int stationsCount = 10;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = (maxVolume + minVolume)/2;

    //default c-tor
    public Radio(){
    }

    //initializing c-tor
    public Radio(int numberOfStations){
        stationsCount = numberOfStations;
    }

    //no setters for this fellow
    public int getStationsCount(){return stationsCount; }

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
        if (currentStation < 0 || currentStation > GetLastStationIndex() ) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void VolumeUp() {
        if (currentVolume == maxVolume) {
            return;
        }
        currentVolume++;
    }

    public void VolumeDown() {
        if (currentVolume == minVolume) {
            return;
        }
        currentVolume--;
    }

    public void StationNext() {
        if (currentStation == GetLastStationIndex()) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void StationPrev() {
        if (currentStation == 0) {
            currentStation = GetLastStationIndex();
        } else {
            currentStation--;
        }
    }
    private int GetLastStationIndex() {
        return stationsCount - 1; // zero-based!
    }
}

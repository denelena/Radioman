package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0 || currentVolume > 9) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0 || currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void VolumeUp() {
        if (currentVolume == 9) {
            return;
        }
        currentVolume++;
    }

    public void VolumeDown() {
        if (currentVolume == 0) {
            return;
        }
        currentVolume--;
    }

    public void StationNext() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void StationPrev() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }
}

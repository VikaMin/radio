package ru.netology.radio;

public class Radio {

    private int currentStation;
    private int amountStation = 10;
    private int currentVolume;

    public Radio() {
    }

    public Radio(int amountStation) {
        this.amountStation = amountStation;
    }
    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getAmountStation() {
        return amountStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= 0 & currentVolume <= 100) {
            this.currentVolume = currentVolume;
        }
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation >= 0 & currentStation < amountStation) {
            this.currentStation = currentStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume += 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume -= 1;
        }
    }

    public void nextStation() {
        if (currentStation == amountStation - 1) {
            currentStation = 0;
        } else currentStation += 1;
    }


    public void prevStation() {
        if (currentStation == 0) {
            currentStation = amountStation - 1;
        } else currentStation -= 1;
    }

}

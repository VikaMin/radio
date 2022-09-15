package ru.netology.radio;

public class Radio {

    private int correntStation;
    private int correntVolume;

    public int getCorrentStation() {
        return correntStation;
    }

    public void setCorrentStation(int correntStation) {
        if (correntStation < 0) {
            return;
        }

        if (correntStation > 9) {
            return;
        }

        this.correntStation = correntStation;
    }

    public void next() {
        if (correntStation == 9) {
            correntStation = 0;
        } else {
            correntStation++;
        }
    }

    public void prev() {
        if (correntStation == 0) {
            correntStation = 9;
        } else {
            correntStation--;
        }
    }

    public int getCorrentVolume() {
        return correntVolume;
    }

    public void setCorrentVolume(int correntVolume) {
        if (correntVolume < 0) {
            return;
        }

        if (correntVolume > 10) {
            return;
        }

        this.correntVolume = correntVolume;
    }

    public void increaseVolume() {
        if (correntVolume < 10) {
            correntVolume++;
        }
    }

    public void decreaseVolume() {
        if (correntVolume > 0) {
            correntVolume--;
        }
    }

}

package ru.netology.hw9exercise1.hw9exercise1.services;

public class Radio {
    private int currentRadioStation;
    private int soundVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setSoundVolume(int soundVolume) {
        this.soundVolume = soundVolume;
    }

    public void next() {
        if (getCurrentRadioStation() == 9) {
            setCurrentRadioStation(0);
        } else {
            setCurrentRadioStation(currentRadioStation + 1);
        }

    }

    public void prev() {
        if (getCurrentRadioStation() == 0) {
            setCurrentRadioStation(9);
        } else {
            setCurrentRadioStation(currentRadioStation - 1);
        }
    }

    public void increase() {
        if (getSoundVolume() == 100) {
            setSoundVolume(100);
        } else {
            setSoundVolume(soundVolume + 1);
        }
    }

    public void decrease() {
        if (getSoundVolume() == 0) {
            setSoundVolume(0);
        } else {
            setSoundVolume(soundVolume - 1);
        }
    }
}
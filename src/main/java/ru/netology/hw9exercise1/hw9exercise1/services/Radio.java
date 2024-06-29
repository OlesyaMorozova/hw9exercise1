package ru.netology.hw9exercise1.hw9exercise1.services;

public class Radio {
    public int currentRadioStation;

    public int getCurrentRadioStation() {
        return currentRadioStation;
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

    public void next() {
        int result = currentRadioStation + 1;
        if (getCurrentRadioStation() < 9) {
            setCurrentRadioStation(result);
        }
        if (getCurrentRadioStation() == 9) {
            setCurrentRadioStation(0);
        }
    }

    public void prev() {
        int result = currentRadioStation - 1;
        if (getCurrentRadioStation() > 0) {
            setCurrentRadioStation(result);
        }
        if (getCurrentRadioStation() == 0) {
            setCurrentRadioStation(9);
        }
    }

    public int soundVolume;

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int newSoundVolume) {
//        if (newSoundVolume < 0) {
//            return;
//        }
//        if (newSoundVolume > 100) {
//            return;
//        }
        soundVolume = newSoundVolume;
    }

    public void increase() {
        int result = soundVolume + 1;
        if (getSoundVolume() < 100) {
            setSoundVolume(result);
        }
        if (getSoundVolume() == 100) {
            setSoundVolume(100);
        }
    }

    public void decrease() {
        int result = soundVolume - 1;
        if (getSoundVolume() > 0) {
            setSoundVolume(result);
        }
        if (getSoundVolume() == 0) {
            setSoundVolume(0);
        }
    }
}
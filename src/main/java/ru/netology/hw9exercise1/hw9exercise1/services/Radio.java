package ru.netology.hw9exercise1.hw9exercise1.services;

public class Radio {
    public int radioStationMin = 0;
    public int radioStationMax = 9;
    public int currentRadioStation;

    public Radio() {
    }

    public Radio (int size) {
        radioStationMax = radioStationMin + size-1;
    }

    public int getRadioStationMin() {
        return radioStationMin;
    }

    public int getRadioStationMax() {
        return radioStationMax;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < radioStationMin) {
            return;
        }
        if (newCurrentRadioStation > radioStationMax) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void next() {
        int result = currentRadioStation + 1;
        if (getCurrentRadioStation() < radioStationMax) {
            setCurrentRadioStation(result);
        }
        if (getCurrentRadioStation() == radioStationMax) {
            setCurrentRadioStation(radioStationMin);
        }
    }

    public void prev() {
        int result = currentRadioStation - 1;
        if (getCurrentRadioStation() > radioStationMin) {
            setCurrentRadioStation(result);
        }
        if (getCurrentRadioStation() == radioStationMin) {
            setCurrentRadioStation(radioStationMax);
        }
    }

    public int soundVolume;
    public int volumeMax = 100;
    public int volumeMin = 0;

    public int getSoundVolume() {
        return soundVolume;
    }

    public int getVolumeMax() {
        return volumeMax;
    }

    public int getVolumeMin() {
        return volumeMin;
    }

    public void setSoundVolume(int soundVolume) {
        this.soundVolume = soundVolume;
    }

    public void increase() {
        int result = soundVolume + 1;
        if (getSoundVolume() < volumeMax) {
            setSoundVolume(result);
        }
        if (getSoundVolume() == volumeMax) {
            setSoundVolume(volumeMax);
        }
    }

    public void decrease() {
        int result = soundVolume - 1;
        if (getSoundVolume() > volumeMin) {
            setSoundVolume(result);
        }
        if (getSoundVolume() == volumeMin) {
            setSoundVolume(volumeMin);
        }
    }
}
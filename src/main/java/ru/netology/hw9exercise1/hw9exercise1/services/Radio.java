package ru.netology.hw9exercise1.hw9exercise1.services;

public class Radio {
    private int radioStationMin = 0;
    private int radioStationMax = 9;
    private int currentRadioStation;
    private int soundVolume;
    private int volumeMax = 100;
    private int volumeMin = 0;

    public Radio() {
    }

    public Radio(int size) {
        radioStationMax = radioStationMin + size - 1;
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

    public int getSoundVolume() {
        return soundVolume;
    }

    public int getVolumeMax() {
        return volumeMax;
    }

    public int getVolumeMin() {
        return volumeMin;
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

    public void setSoundVolume(int soundVolume) {
        this.soundVolume = soundVolume;
    }

    public void next() {
        if (getCurrentRadioStation() == radioStationMax) {
            setCurrentRadioStation(radioStationMin);
        } else {
            setCurrentRadioStation(currentRadioStation + 1);
        }
    }

    public void prev() {
        if (getCurrentRadioStation() == radioStationMin) {
            setCurrentRadioStation(radioStationMax);
        } else {
            setCurrentRadioStation(currentRadioStation - 1);
        }
    }

    public void increase() {
        if (getSoundVolume() == volumeMax) {
            setSoundVolume(volumeMax);
        } else {
            setSoundVolume(soundVolume + 1);
        }
    }

    public void decrease() {
        if (getSoundVolume() == volumeMin) {
            setSoundVolume(volumeMin);
        } else {
            setSoundVolume(soundVolume - 1);
        }
    }
}
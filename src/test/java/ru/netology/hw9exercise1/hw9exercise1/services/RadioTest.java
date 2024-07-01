package ru.netology.hw9exercise1.hw9exercise1.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetRadioStation() {
        Radio service = new Radio();

        service.setCurrentRadioStation(5);

        int expected = 5;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationAboveMax() {
        Radio service = new Radio();

        service.setCurrentRadioStation(10);

        int expected = 0;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationBelowMin() {
        Radio service = new Radio();

        service.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getTheNextRadioStation() {
        Radio service = new Radio();

        service.setCurrentRadioStation(8);
        service.next();

        int expected = 9;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getTheNextRadioStation0After9() {
        Radio service = new Radio();

        service.setCurrentRadioStation(9);
        service.next();

        int expected = 0;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getThePrevRadioStation() {
        Radio service = new Radio();

        service.setCurrentRadioStation(1);
        service.prev();

        int expected = 0;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getThePrevRadioStation9After0() {
        Radio service = new Radio();

        service.setCurrentRadioStation(0);
        service.prev();

        int expected = 9;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeByOne() {
        Radio service = new Radio();

        service.setSoundVolume(99);
        service.increase();

        int expected = 100;
        int actual = service.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void doNotIncreaseBeyondTheMax() {
        Radio service = new Radio();

        service.setSoundVolume(100);
        service.increase();

        int expected = 100;
        int actual = service.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeByOne() {
        Radio service = new Radio();

        service.setSoundVolume(1);
        service.decrease();

        int expected = 0;
        int actual = service.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void doNotDecreaseBeyondTheMin() {
        Radio service = new Radio();

        service.setSoundVolume(0);
        service.decrease();

        int expected = 0;
        int actual = service.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void defaultNumberOfRadioStation() {
        Radio service = new Radio();

        Assertions.assertEquals(0, service.getRadioStationMin());
        Assertions.assertEquals(9, service.getRadioStationMax());
    }

    @Test
    public void setTheNumberOfRadioStation() {
        Radio service = new Radio(50);

        Assertions.assertEquals(0, service.getRadioStationMin());
        Assertions.assertEquals(49, service.getRadioStationMax());
    }

    @Test
    public void getTheNextRadioStation50() {
        Radio service = new Radio(50);

        service.setCurrentRadioStation(48);
        service.next();

        int expected = 49;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getTheNextRadioStation0After49() {
        Radio service = new Radio(50);

        service.setCurrentRadioStation(49);
        service.next();

        Assertions.assertEquals(0, service.getCurrentRadioStation());
    }

    @Test
    public void getThePrevRadioStation50() {
        Radio service = new Radio(50);

        service.setCurrentRadioStation(1);
        service.prev();

        Assertions.assertEquals(0, service.getCurrentRadioStation());
    }

    @Test
    public void getThePrevRadioStation49After0() {
        Radio service = new Radio(50);

        service.setCurrentRadioStation(0);
        service.prev();

        Assertions.assertEquals(49, service.getCurrentRadioStation());
    }
}

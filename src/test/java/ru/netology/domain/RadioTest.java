package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    public void shouldSetAndGetStation() {
        Radio myRadio = new Radio();
        int expectedStation = 0;
        assertEquals(expectedStation, myRadio.getCurrentStation());

        myRadio.setCurrentStation(7);
        expectedStation = 7;
        assertEquals(expectedStation, myRadio.getCurrentStation());

        myRadio.setCurrentStation(100);
        assertEquals(expectedStation, myRadio.getCurrentStation());

        myRadio.setCurrentStation(-50);
        assertEquals(expectedStation, myRadio.getCurrentStation());
    }

    @Test
    public void shouldInitAndGetStationsCount() {
        Radio myRadio = new Radio(25);
        assertEquals(25, myRadio.getStationsCount());

        Radio myRadio2 = new Radio();
        assertEquals(10, myRadio2.getStationsCount());
    }

    @Test
    public void shouldSetAndGetVolume() {
        Radio myRadio = new Radio();
        int expectedVolume = 50;
        assertEquals(expectedVolume, myRadio.getCurrentVolume());

        myRadio.setCurrentVolume(20);
        expectedVolume = 20;
        assertEquals(expectedVolume, myRadio.getCurrentVolume());

        myRadio.setCurrentVolume(1000);
        assertEquals(expectedVolume, myRadio.getCurrentVolume());

        myRadio.setCurrentVolume(-50);
        assertEquals(expectedVolume, myRadio.getCurrentVolume());
    }

    @Test
    public void shouldStationNext() {
        Radio myRadio = new Radio();
        myRadio.setCurrentStation(8);
        myRadio.stationNext();

        int expectedStation = 9;
        assertEquals(expectedStation, myRadio.getCurrentStation());

        myRadio.stationNext();
        expectedStation = 0;
        assertEquals(expectedStation, myRadio.getCurrentStation());
    }

    @Test
    public void shouldStationPrev() {
        Radio myRadio = new Radio();
        myRadio.setCurrentStation(1);
        myRadio.stationPrev();

        int expectedStation = 0;
        assertEquals(expectedStation, myRadio.getCurrentStation());

        myRadio.stationPrev();
        expectedStation = 9;
        assertEquals(expectedStation, myRadio.getCurrentStation());
    }

    @Test
    public void shouldVolumeUp() {
        Radio myRadio = new Radio();
        myRadio.setCurrentVolume(99);
        myRadio.volumeUp();

        int expectedVolume = 100;
        assertEquals(expectedVolume, myRadio.getCurrentVolume());

        myRadio.volumeUp();
        assertEquals(expectedVolume, myRadio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeDown() {
        Radio myRadio = new Radio();
        myRadio.setCurrentVolume(2);
        myRadio.volumeDown();

        assertEquals(1, myRadio.getCurrentVolume());

        myRadio.volumeDown();
        assertEquals(0, myRadio.getCurrentVolume());

        myRadio.volumeDown();
        assertEquals(0, myRadio.getCurrentVolume());
    }


}

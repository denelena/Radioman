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

        myRadio.setCurrentStation(-50);
        assertEquals(expectedVolume, myRadio.getCurrentVolume());
    }

    @Test
    public void shouldStationNext() {
        Radio myRadio = new Radio();
        myRadio.setCurrentStation(8);
        myRadio.StationNext();

        int expectedStation = 9;
        assertEquals(expectedStation, myRadio.getCurrentStation());

        myRadio.StationNext();
        expectedStation = 0;
        assertEquals(expectedStation, myRadio.getCurrentStation());
    }

    @Test
    public void shouldStationPrev() {
        Radio myRadio = new Radio();
        myRadio.setCurrentStation(1);
        myRadio.StationPrev();

        int expectedStation = 0;
        assertEquals(expectedStation, myRadio.getCurrentStation());

        myRadio.StationPrev();
        expectedStation = 9;
        assertEquals(expectedStation, myRadio.getCurrentStation());
    }

    @Test
    public void shouldVolumeUp() {
        Radio myRadio = new Radio();
        myRadio.setCurrentVolume(99);
        myRadio.VolumeUp();

        int expectedVolume = 100;
        assertEquals(expectedVolume, myRadio.getCurrentVolume());

        myRadio.VolumeUp();
        assertEquals(expectedVolume, myRadio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeDown() {
        Radio myRadio = new Radio();
        myRadio.setCurrentVolume(2);
        myRadio.VolumeDown();

        assertEquals(1, myRadio.getCurrentVolume());

        myRadio.VolumeDown();
        assertEquals(0, myRadio.getCurrentVolume());

        myRadio.VolumeDown();
        assertEquals(0, myRadio.getCurrentVolume());
    }


}

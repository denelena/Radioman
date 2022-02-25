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
    public void shouldSetAndGetVolume() {
        Radio myRadio = new Radio();
        int expectedVolume = 0;
        assertEquals(expectedVolume, myRadio.getCurrentVolume());

        myRadio.setCurrentVolume(5);
        expectedVolume = 5;
        assertEquals(expectedVolume, myRadio.getCurrentVolume());

        myRadio.setCurrentVolume(10);
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
        myRadio.setCurrentVolume(8);
        myRadio.VolumeUp();

        int expectedVolume = 9;
        assertEquals(expectedVolume, myRadio.getCurrentVolume());

        myRadio.VolumeUp();
        assertEquals(expectedVolume, myRadio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeDown() {
        Radio myRadio = new Radio();
        myRadio.setCurrentVolume(1);
        myRadio.VolumeDown();

        int expectedVolume = 0;
        assertEquals(expectedVolume, myRadio.getCurrentVolume());

        myRadio.VolumeDown();
        assertEquals(expectedVolume, myRadio.getCurrentVolume());
    }


}

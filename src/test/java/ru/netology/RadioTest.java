package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void setCurrentStation() {

        Radio station = new Radio();

        station.setCurrentRadiostation(-9);

        int expected = 0;
        int actual = station.getCurrentRadiostation();
        assertEquals(expected, actual);
    }
    @Test
    public void setCurrentStation2() {

        Radio station = new Radio();

        station.setCurrentRadiostation(12);

        int expected = 0;
        int actual = station.getCurrentRadiostation();
        assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio station = new Radio();
        station.setCurrentRadiostation(8);
        station.next();
        int expected = 9;
        int actual = 9;
        assertEquals(expected, actual);

    }

    @Test
    public void nextStation2() {
        Radio station = new Radio();
        station.setCurrentRadiostation(9);
        station.next();
        int expected = 0;
        int actual = 0;
        assertEquals(expected, actual);

    }

    @Test
    public void prevStation() {
        Radio station = new Radio();
        station.setCurrentRadiostation(8);
        station.prev();
        int expected = 7;
        int actual = 7;
        assertEquals(expected, actual);
    }
    @Test
    public void prevStation2() {
        Radio station = new Radio();
        station.setCurrentRadiostation(0);
        station.prev();
        int expected = 9;
        int actual = 9;
        assertEquals(expected, actual);
    }
    @Test
    public void increaseVolume() {
        Radio volume = new Radio();
        volume.currentVolume = 10;
        volume.louder();
        int expected = 10;
        int actual = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume2() {
        Radio volume = new Radio();
        volume.currentVolume = 9;
        volume.louder();
        int expected = 10;
        int actual = 10;
        assertEquals(expected, actual);
    }


    @Test
    public void degreaseVolume() {
        Radio volume = new Radio();
        volume.currentVolume = 0;
        volume.quieter();
        int expected = 0;
        int actual = 0;
        assertEquals(expected, actual);

    }
    @Test
    public void degreaseVolume2() {
        Radio volume = new Radio();
        volume.currentVolume = 1;
        volume.quieter();
        int expected = 0;
        int actual = 0;
        assertEquals(expected, actual);

    }
}



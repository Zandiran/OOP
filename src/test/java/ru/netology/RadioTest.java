package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    Radio station = new Radio();



    @Test
    public void setMaxStation () {
        station.setMaxStation();
        station.setCurrentRadiostation(-9);
        int expected = 0;
        int actual = station.getCurrentRadiostation();
        assertEquals(expected, actual);
    }

        @Test
        public void setCurrentStation () {
           station.getMaxStation(9);
            station.setCurrentRadiostation(-9);
            int expected = 0;
            int actual = station.getCurrentRadiostation();
            assertEquals(expected, actual);
        }
        @Test
        public void setCurrentStation2 () {
            station.getMaxStation(9);
            station.setCurrentRadiostation(12);
            int expected = 0;
            int actual = station.getCurrentRadiostation();
            assertEquals(expected, actual);
        }
        @Test
        public void nextStation () {
            station.getMaxStation(9);
            station.setCurrentRadiostation(8);
            station.next();
            int expected = 9;
            int actual = 9;
            assertEquals(expected, actual);

        }

        @Test
        public void nextStation2 () {
            station.getMaxStation(9);
            station.setCurrentRadiostation(9);
            station.next();
            int expected = 0;
            int actual = 0;
            assertEquals(expected, actual);

        }

        @Test
        public void prevStation () {
            station.getMaxStation(9);
            station.setCurrentRadiostation(8);
            station.prev();
            int expected = 7;
            int actual = 7;
            assertEquals(expected, actual);
        }
        @Test
        public void prevStation2 () {
            station.getMaxStation(9);
            station.setCurrentRadiostation(0);
            station.prev();
            int expected = 9;
            int actual = 9;
            assertEquals(expected, actual);
        }

         Radio volume = new Radio();
        @Test

        public void increaseVolume () {

            volume.currentVolume = 10;
            volume.louder();
            int expected = 10;
            int actual = 10;
            assertEquals(expected, actual);
        }

        @Test
        public void increaseVolume2 () {
            volume.currentVolume = 9;
            volume.louder();
            int expected = 10;
            int actual = 10;
            assertEquals(expected, actual);
        }


        @Test
        public void degreaseVolume () {
            Radio volume = new Radio();
            volume.currentVolume = 0;
            volume.quieter();
            int expected = 0;
            int actual = 0;
            assertEquals(expected, actual);

        }
        @Test
        public void degreaseVolume2 () {
            Radio volume = new Radio();
            volume.currentVolume = 1;
            volume.quieter();
            int expected = 0;
            int actual = 0;
            assertEquals(expected, actual);

        }
    }



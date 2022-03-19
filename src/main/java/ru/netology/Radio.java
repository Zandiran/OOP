package ru.netology;

public class Radio {
    private int currentRadiostation;

    public int getCurrentRadiostation() {
        return currentRadiostation;
    }

    public void setCurrentRadiostation(int currentRadiostation) {
        if (currentRadiostation < 0) {
            return;
        }
        if (currentRadiostation > 9) {
            return;
        }
        this.currentRadiostation = currentRadiostation;
    }

    public void next() {

        if (currentRadiostation + 1 > 9) {
            this.currentRadiostation = 0;
        } else currentRadiostation = currentRadiostation + 1;
    }

    public void prev() {

        if (currentRadiostation - 1 == 0) {
            this.currentRadiostation = 9;
        } else currentRadiostation = currentRadiostation - 1;
    }

    public int currentVolume;
    public void louder() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void quieter() {
        if (currentVolume > 1) {
            currentVolume = currentVolume - 1;
        }
    }


}


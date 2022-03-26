package ru.netology;

public class Radio {
    private String name = "Poland";
    private int currentRadiostation;
    private int maxStation;



    public void getMaxStation(int maxStation) {
        this.maxStation = maxStation;
        return;

    }

    public void setMaxStation() {
        this.maxStation = 9;
        return;

    }

    public int getCurrentRadiostation() {
        return currentRadiostation;
    }

    public void setCurrentRadiostation(int currentRadiostation) {

        if (currentRadiostation < 0) {
            return;
        }
        if (currentRadiostation > maxStation) {
            return;
        }
        this.currentRadiostation = currentRadiostation;
    }

    public void next() {

        if (currentRadiostation + 1 > maxStation) {
            this.currentRadiostation = 0;
        } else currentRadiostation = currentRadiostation + 1;
    }

    public void prev() {

        if (currentRadiostation - 1 < 0) {
            this.currentRadiostation = maxStation;
        } else currentRadiostation = currentRadiostation - 1;
    }

    public int currentVolume;
    public void louder() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void quieter() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }


}


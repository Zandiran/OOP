package constructor;

public class Radio {
    private int currentRadiostation;
    private int maxStation = 9;
    private int minStation = 0;

    public Radio(int currentRadiostation, int maxStation) {
        this.currentRadiostation = currentRadiostation;
        this.maxStation = maxStation;
    }

    public Radio(int currentRadiostation) {
        this.currentRadiostation = currentRadiostation;
    }

    private int getCurrentRadiostation() {
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

        if (currentRadiostation - 1 < 0) {
            this.currentRadiostation = 9;
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


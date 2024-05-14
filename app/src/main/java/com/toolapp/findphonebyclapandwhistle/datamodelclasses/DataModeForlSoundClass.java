package com.toolapp.findphonebyclapandwhistle.datamodelclasses;

public class DataModeForlSoundClass {
    private int imageBackgroundCard;
    private int imageSound;

    public DataModeForlSoundClass(int imageBackgroundCard, int imageSound) {
        this.imageBackgroundCard = imageBackgroundCard;
        this.imageSound = imageSound;
    }

    public int getImageBackgroundCard() {
        return imageBackgroundCard;
    }

    public void setImageBackgroundCard(int imageBackgroundCard) {
        this.imageBackgroundCard = imageBackgroundCard;
    }

    public int getImageSound() {
        return imageSound;
    }

    public void setImageSound(int imageSound) {
        this.imageSound = imageSound;
    }
}

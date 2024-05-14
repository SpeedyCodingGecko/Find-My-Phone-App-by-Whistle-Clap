package com.toolapp.findphonebyclapandwhistle.functions;

import android.content.Context;
import android.media.AudioManager;


/* loaded from: classes.dex */
public class ControlForSounds {
    private AudioManager audioManager;
    private int maxMusic;
    private int maxRing;

    public ControlForSounds(Context context) {
        this.maxMusic = 0;
        this.maxRing = 0;
        AudioManager audioManager = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);
        this.audioManager = audioManager;
        this.maxMusic = audioManager.getStreamMaxVolume(3);
        this.maxRing = this.audioManager.getStreamMaxVolume(2);
    }

    public void changeSoundMode() {
        if (this.audioManager.getRingerMode() == 0) {
            this.audioManager.setRingerMode(2);
            return;
        }
        AudioManager audioManager = this.audioManager;
        audioManager.setRingerMode(audioManager.getRingerMode() - 1);
    }

    public void decreaseVolume(int i, int i2) {
        int streamVolume = this.audioManager.getStreamVolume(i);
        int streamVolume2 = this.audioManager.getStreamVolume(i2);
        this.audioManager.adjustStreamVolume(i, -1, 23);
        if (streamVolume != 0) {
            this.audioManager.setStreamVolume(i2, streamVolume2 - (streamVolume2 / streamVolume), 0);
        } else {
            this.audioManager.setStreamVolume(i2, 0, 0);
        }
    }

    public int getRingerMode() {
        return this.audioManager.getRingerMode();
    }

    public void increaseVolume(int i, int i2) {
        int streamVolume = this.audioManager.getStreamVolume(i);
        int streamMaxVolume = this.audioManager.getStreamMaxVolume(i);
        int streamVolume2 = this.audioManager.getStreamVolume(i2);
        int streamMaxVolume2 = this.audioManager.getStreamMaxVolume(i2);
        this.audioManager.adjustStreamVolume(i, 1, 7);
        int i3 = streamMaxVolume - streamVolume;
        if (i3 != 0) {
            this.audioManager.setStreamVolume(i2, ((streamMaxVolume2 - streamVolume2) / i3) + streamVolume2, 0);
        } else {
            this.audioManager.setStreamVolume(i2, streamMaxVolume2, 0);
        }
    }

    public void volumeDown() {
        if (this.maxRing < this.maxMusic) {
            decreaseVolume(2, 3);
        } else {
            decreaseVolume(3, 2);
        }
    }

    public void volumeMax() {
        AudioManager audioManager = this.audioManager;
        audioManager.setStreamVolume(3, audioManager.getStreamMaxVolume(3), 0);
        AudioManager audioManager2 = this.audioManager;
        audioManager2.setStreamVolume(2, audioManager2.getStreamMaxVolume(2), 1);
    }

    public void volumeMute() {
        this.audioManager.setStreamVolume(3, 0, 0);
        this.audioManager.setStreamVolume(2, 0, 17);
    }

    public void volumeUp() {
        if (this.maxRing < this.maxMusic) {
            increaseVolume(2, 3);
        } else {
            increaseVolume(3, 2);
        }
    }
}

package com.toolapp.findphonebyclapandwhistle.MyTools;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Handler;

public class SOSFlasher {
    private static final long DOT_DURATION = 100; // Duration of a dot in milliseconds
    private static final long DASH_DURATION = 3 * DOT_DURATION; // Duration of a dash (3 times a dot)
    private static final long PAUSE_DURATION = DOT_DURATION; // Pause between dots and dashes

    private final Context context;
    private final Handler sosHandler;
    private final CameraManager cameraManager;
    private final String cameraId;

    private boolean isFlashing;
    private String sosMessage; // Morse code representation of SOS

    public SOSFlasher(Context context) {
        this.context = context;
        this.sosHandler = new Handler();
        this.cameraManager = (CameraManager) context.getSystemService(Context.CAMERA_SERVICE);

        try {
            this.cameraId = cameraManager.getCameraIdList()[0]; // Use the first camera
        } catch (CameraAccessException e) {
            throw new RuntimeException("Failed to access the camera.", e);
        }

        // Define SOS in Morse code (S = dot-dot-dot, O = dash-dash-dash)
        sosMessage = "... --- ...";
    }

    public void startFlashingSOS() {
        if (!isFlashing) {
            isFlashing = true;
            flashSOS();
        }
    }

    public void stopFlashingSOS() {

        isFlashing = false;
        sosHandler.removeCallbacksAndMessages(null);
        turnOffFlashlight();

    }

    private void flashSOS() {
        if (!isFlashing) {
            return;
        }

        for (int i = 0; i < sosMessage.length(); i++) {
            char c = sosMessage.charAt(i);
            if (c == '.') {
                turnOnFlashlight();
                sosHandler.postDelayed(this::turnOffFlashlight, DOT_DURATION);
            } else if (c == '-') {
                turnOnFlashlight();
                sosHandler.postDelayed(this::turnOffFlashlight, DASH_DURATION);
            } else if (c == ' ') {
                sosHandler.postDelayed(this::turnOffFlashlight, PAUSE_DURATION);
            }
        }

        // Repeat the SOS loop
        sosHandler.postDelayed(this::flashSOS, PAUSE_DURATION);
    }

    public void turnOnFlashlight() {
        try {
            cameraManager.setTorchMode(cameraId, true);
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }
    }

    public void turnOffFlashlight() {
        try {

            cameraManager.setTorchMode(cameraId, false);
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }
    }
}

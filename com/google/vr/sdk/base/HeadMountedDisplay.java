package com.google.vr.sdk.base;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class HeadMountedDisplay {
    private GvrViewerParams cardboardDevice;
    private ScreenParams screen;

    public HeadMountedDisplay(ScreenParams screenParams, GvrViewerParams gvrViewerParams) {
        this.screen = screenParams;
        this.cardboardDevice = gvrViewerParams;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HeadMountedDisplay)) {
            return false;
        }
        HeadMountedDisplay headMountedDisplay = (HeadMountedDisplay) obj;
        return this.screen.equals(headMountedDisplay.screen) && this.cardboardDevice.equals(headMountedDisplay.cardboardDevice);
    }

    public GvrViewerParams getGvrViewerParams() {
        return this.cardboardDevice;
    }

    public ScreenParams getScreenParams() {
        return this.screen;
    }

    public void setGvrViewerParams(GvrViewerParams gvrViewerParams) {
        this.cardboardDevice = new GvrViewerParams(gvrViewerParams);
    }

    public void setScreenParams(ScreenParams screenParams) {
        this.screen = new ScreenParams(screenParams);
    }
}

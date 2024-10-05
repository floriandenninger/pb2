package com.google.cardboard.sdk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class QrCode {
    private QrCode() {
    }

    public static byte[] getCardboardV1DeviceParams() {
        return nativeQrCodeGetCardboardV1DeviceParams();
    }

    public static byte[] getSavedDeviceParams() {
        return nativeQrCodeGetSavedDeviceParams();
    }

    private static native byte[] nativeQrCodeGetCardboardV1DeviceParams();

    private static native byte[] nativeQrCodeGetSavedDeviceParams();

    private static native void nativeQrCodeScanQrCodeAndSaveDeviceParams();

    public static void scanQrCodeAndSaveDeviceParams() {
        nativeQrCodeScanQrCodeAndSaveDeviceParams();
    }
}

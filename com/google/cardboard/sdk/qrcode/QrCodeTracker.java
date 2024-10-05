package com.google.cardboard.sdk.qrcode;

import com.google.android.gms.vision.barcode.Barcode;
import defpackage.rqr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class QrCodeTracker extends rqr {
    private final Listener listener;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface Listener {
        void onQrCodeDetected(Barcode barcode);
    }

    public QrCodeTracker(Listener listener) {
        this.listener = listener;
    }

    @Override // defpackage.rqr
    public void onNewItem(int i, Barcode barcode) {
        if (barcode.c != null) {
            this.listener.onQrCodeDetected(barcode);
        }
    }
}

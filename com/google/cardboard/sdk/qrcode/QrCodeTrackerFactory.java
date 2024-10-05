package com.google.cardboard.sdk.qrcode;

import com.google.android.gms.vision.barcode.Barcode;
import com.google.cardboard.sdk.qrcode.QrCodeTracker;
import defpackage.rqr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class QrCodeTrackerFactory {
    private final QrCodeTracker.Listener listener;

    public QrCodeTrackerFactory(QrCodeTracker.Listener listener) {
        this.listener = listener;
    }

    public rqr create(Barcode barcode) {
        return new QrCodeTracker(this.listener);
    }
}

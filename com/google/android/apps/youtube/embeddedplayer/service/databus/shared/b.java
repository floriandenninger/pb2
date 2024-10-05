package com.google.android.apps.youtube.embeddedplayer.service.databus.shared;

import android.os.Looper;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.d;
import com.google.android.apps.youtube.embeddedplayer.service.model.BusSupported$Data;
import com.google.android.apps.youtube.embeddedplayer.service.model.BusSupportedDataWrapper;
import defpackage.ecq;
import defpackage.ecr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b extends ecq implements c {
    private final d a;

    public b(d dVar) {
        super("com.google.android.apps.youtube.embeddedplayer.service.databus.shared.IDataBusClient");
        this.a = dVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.databus.shared.c
    public final void a(BusSupportedDataWrapper busSupportedDataWrapper) {
        final d dVar = this.a;
        final BusSupported$Data busSupported$Data = busSupportedDataWrapper.a;
        if (busSupported$Data == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            dVar.a(busSupported$Data);
        } else {
            dVar.a.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.a
                @Override // java.lang.Runnable
                public final void run() {
                    d.this.a(busSupported$Data);
                }
            });
        }
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            BusSupportedDataWrapper[] busSupportedDataWrapperArr = (BusSupportedDataWrapper[]) parcel.createTypedArray(BusSupportedDataWrapper.CREATOR);
            int length = busSupportedDataWrapperArr.length;
            final BusSupported$Data[] busSupported$DataArr = new BusSupported$Data[length];
            for (int i3 = 0; i3 < busSupportedDataWrapperArr.length; i3++) {
                busSupported$DataArr[i3] = busSupportedDataWrapperArr[i3].a;
            }
            final d dVar = this.a;
            if (length != 0) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    dVar.b(busSupported$DataArr);
                } else {
                    dVar.a.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            d.this.b(busSupported$DataArr);
                        }
                    });
                }
            }
        } else {
            a((BusSupportedDataWrapper) ecr.a(parcel, BusSupportedDataWrapper.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }

    public b() {
        super("com.google.android.apps.youtube.embeddedplayer.service.databus.shared.IDataBusClient");
    }
}

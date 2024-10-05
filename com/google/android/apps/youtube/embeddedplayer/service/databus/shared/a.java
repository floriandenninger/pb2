package com.google.android.apps.youtube.embeddedplayer.service.databus.shared;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.model.BusSupportedDataWrapper;
import defpackage.ecp;
import defpackage.ecr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a extends ecp implements c {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.databus.shared.IDataBusClient");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.databus.shared.c
    public final void a(BusSupportedDataWrapper busSupportedDataWrapper) {
        Parcel pn = pn();
        ecr.g(pn, busSupportedDataWrapper);
        pp(1, pn);
    }
}

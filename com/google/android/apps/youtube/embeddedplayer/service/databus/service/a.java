package com.google.android.apps.youtube.embeddedplayer.service.databus.service;

import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.databus.shared.c;
import com.google.android.apps.youtube.embeddedplayer.service.model.BusSupported$Data;
import com.google.android.apps.youtube.embeddedplayer.service.model.BusSupportedDataWrapper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a {
    private c a;

    public a(c cVar) {
        this.a = cVar;
    }

    public final synchronized void a(BusSupported$Data busSupported$Data) {
        c cVar = this.a;
        if (cVar == null || busSupported$Data == null) {
            return;
        }
        try {
            cVar.a(new BusSupportedDataWrapper(busSupported$Data));
        } catch (RemoteException unused) {
        }
    }

    public final synchronized void b() {
        this.a = null;
    }
}

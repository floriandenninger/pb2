package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service;

import android.os.Handler;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.l;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.n;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d {
    public final n a;

    public d(Handler handler, l lVar) {
        n nVar = new n(handler);
        this.a = nVar;
        try {
            lVar.a(nVar);
        } catch (RemoteException unused) {
        }
    }
}

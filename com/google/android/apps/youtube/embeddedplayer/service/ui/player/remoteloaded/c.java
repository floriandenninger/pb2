package com.google.android.apps.youtube.embeddedplayer.service.ui.player.remoteloaded;

import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.f;
import defpackage.oba;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class c implements Runnable {
    public f a;

    public c(f fVar) {
        fVar.getClass();
        this.a = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.a();
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }
}

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.remoteloaded;

import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.i;
import defpackage.oba;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d implements com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.b {
    public i a;

    public d(i iVar) {
        this.a = iVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.b
    public final void a() {
        i iVar = this.a;
        if (iVar != null) {
            try {
                iVar.a();
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }
}

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.remoteloaded;

import android.os.RemoteException;
import defpackage.ahvx;
import defpackage.oba;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class f implements ahvx {
    public com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.f a;

    public f(com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.f fVar) {
        fVar.getClass();
        this.a = fVar;
    }

    @Override // defpackage.ahvx
    public final void rM() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.rN();
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }

    @Override // defpackage.ahvx
    public final void rN() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.rN();
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }
}

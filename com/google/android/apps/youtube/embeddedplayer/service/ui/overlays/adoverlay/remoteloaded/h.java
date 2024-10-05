package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.remoteloaded;

import android.os.Bundle;
import android.os.RemoteException;
import defpackage.oba;
import defpackage.xla;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class h implements xla {
    public com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.f a;

    public h(com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.f fVar) {
        fVar.getClass();
        this.a = fVar;
    }

    @Override // defpackage.xla
    public final void a(Bundle bundle) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.a(null);
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }

    @Override // defpackage.xla
    public final void b() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.b();
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }

    @Override // defpackage.xla
    public final void c(boolean z) {
    }

    @Override // defpackage.xla
    public final void d() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.d();
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }

    @Override // defpackage.xla
    public final void e(int i, int i2) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.e(i, i2);
            } catch (RemoteException e) {
                oba.B(e);
            }
        }
    }
}

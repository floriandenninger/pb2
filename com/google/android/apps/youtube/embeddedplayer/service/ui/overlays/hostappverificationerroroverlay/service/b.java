package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.service;

import android.os.Handler;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.c;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.f;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.h;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b implements c {
    public f a;
    private final h b;

    public b(Handler handler, f fVar) {
        this.a = fVar;
        h hVar = new h(handler);
        this.b = hVar;
        try {
            fVar.f(hVar);
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.c
    public final void k() {
        f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.a();
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.c
    public final void m(com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.b bVar) {
        this.b.a = bVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.c
    public final void n(boolean z) {
        f fVar = this.a;
        if (fVar != null) {
            try {
                fVar.g(z);
            } catch (RemoteException unused) {
            }
        }
    }
}

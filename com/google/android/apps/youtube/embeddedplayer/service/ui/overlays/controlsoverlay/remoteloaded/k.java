package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b a;
    private final /* synthetic */ int b;

    public /* synthetic */ k(com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b bVar, int i) {
        this.b = i;
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.a.ng();
            return;
        }
        if (i == 1) {
            this.a.a.nf();
            return;
        }
        if (i == 2) {
            this.a.a.ns();
        } else if (i != 3) {
            this.a.a.pB();
        } else {
            this.a.a.pA();
        }
    }
}

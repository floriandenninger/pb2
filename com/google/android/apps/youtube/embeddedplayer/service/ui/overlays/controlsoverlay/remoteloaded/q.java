package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent b;
    public final /* synthetic */ com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b c;
    private final /* synthetic */ int d;

    public /* synthetic */ q(com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b bVar, int i, KeyEvent keyEvent, int i2) {
        this.d = i2;
        this.c = bVar;
        this.a = i;
        this.b = keyEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d != 0) {
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b bVar = this.c;
            bVar.a.onKeyDown(this.a, this.b);
            return;
        }
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.b bVar2 = this.c;
        bVar2.a.onKeyUp(this.a, this.b);
    }
}

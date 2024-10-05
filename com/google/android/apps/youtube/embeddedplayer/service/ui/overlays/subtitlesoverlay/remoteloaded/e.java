package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.remoteloaded;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class e implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.b c;

    public e(com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.b bVar, int i, int i2) {
        this.c = bVar;
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a.h(this.a, this.b);
    }
}

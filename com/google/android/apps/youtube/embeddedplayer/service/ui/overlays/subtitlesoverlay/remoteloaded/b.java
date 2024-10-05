package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.remoteloaded;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b implements Runnable {
    final /* synthetic */ com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.b a;
    private final /* synthetic */ int b;

    public b(com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.b bVar, int i) {
        this.b = i;
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            this.a.a.a();
        } else {
            this.a.a.f();
        }
    }
}

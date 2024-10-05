package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.remoteloaded;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class c implements Runnable {
    final /* synthetic */ float a;
    final /* synthetic */ com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.b b;

    public c(com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.b bVar, float f) {
        this.b = bVar;
        this.a = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.g(this.a);
    }
}

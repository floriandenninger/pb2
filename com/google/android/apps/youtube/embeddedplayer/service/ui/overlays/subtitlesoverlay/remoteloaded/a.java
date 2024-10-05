package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.remoteloaded;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.b b;

    public a(com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.b bVar, List list) {
        this.b = bVar;
        this.a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.j(this.a);
    }
}

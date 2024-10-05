package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.remoteloaded;

import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d implements Runnable {
    final /* synthetic */ SubtitlesStyle a;
    final /* synthetic */ com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.b b;

    public d(com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.b bVar, SubtitlesStyle subtitlesStyle) {
        this.b = bVar;
        this.a = subtitlesStyle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.i(this.a);
    }
}

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
import defpackage.ecp;
import defpackage.ecr;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a extends ecp implements c {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.ISubtitlesOverlayClient");
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c
    public final void a() {
        pp(2, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c
    public final void f() {
        pp(3, pn());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c
    public final void g(float f) {
        Parcel pn = pn();
        pn.writeFloat(f);
        pp(4, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c
    public final void h(int i, int i2) {
        Parcel pn = pn();
        pn.writeInt(i);
        pn.writeInt(0);
        pp(6, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c
    public final void i(SubtitlesStyle subtitlesStyle) {
        Parcel pn = pn();
        ecr.g(pn, subtitlesStyle);
        pp(5, pn);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c
    public final void j(List list) {
        Parcel pn = pn();
        pn.writeTypedList(list);
        pp(1, pn);
    }
}

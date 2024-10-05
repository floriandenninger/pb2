package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared;

import android.os.Handler;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.remoteloaded.d;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.remoteloaded.e;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSnapshot;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
import defpackage.ahxi;
import defpackage.ecq;
import defpackage.ecr;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b extends ecq implements c {
    public final ahxi a;
    private final Handler b;

    public b(ahxi ahxiVar, Handler handler) {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.ISubtitlesOverlayClient");
        ahxiVar.getClass();
        this.a = ahxiVar;
        handler.getClass();
        this.b = handler;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c
    public final void a() {
        this.b.post(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.remoteloaded.b(this, 1));
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                j(parcel.createTypedArrayList(SubtitleWindowSnapshot.CREATOR));
                break;
            case 2:
                a();
                break;
            case 3:
                f();
                break;
            case 4:
                g(parcel.readFloat());
                break;
            case 5:
                i((SubtitlesStyle) ecr.a(parcel, SubtitlesStyle.CREATOR));
                break;
            case 6:
                h(parcel.readInt(), parcel.readInt());
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c
    public final void f() {
        this.b.post(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.remoteloaded.b(this, 0));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c
    public final void g(float f) {
        this.b.post(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.remoteloaded.c(this, f));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c
    public final void h(int i, int i2) {
        this.b.post(new e(this, i, i2));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c
    public final void i(SubtitlesStyle subtitlesStyle) {
        this.b.post(new d(this, subtitlesStyle));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c
    public final void j(List list) {
        this.b.post(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.remoteloaded.a(this, list));
    }

    public b() {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.ISubtitlesOverlayClient");
    }
}

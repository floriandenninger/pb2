package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.service;

import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
import defpackage.ahxi;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a implements ahxi {
    public c a;

    public a(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.ahxi
    public final void a() {
        c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.a();
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahxi
    public final void f() {
        c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.f();
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahxi
    public final void g(float f) {
        c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.g(f);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahxi
    public final void h(int i, int i2) {
        c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.h(i, 0);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahxi
    public final void i(SubtitlesStyle subtitlesStyle) {
        c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.i(subtitlesStyle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahxi
    public final void j(List list) {
        c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.j(list);
            } catch (RemoteException unused) {
            }
        }
    }
}

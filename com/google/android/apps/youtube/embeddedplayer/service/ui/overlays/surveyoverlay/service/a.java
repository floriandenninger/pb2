package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.service;

import android.os.Handler;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.e;
import defpackage.xiy;
import defpackage.xiz;
import defpackage.xja;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a implements xja {
    public com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c a;
    private final e b;

    public a(Handler handler, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c cVar) {
        this.a = cVar;
        e eVar = new e(handler);
        this.b = eVar;
        try {
            cVar.g(eVar);
        } catch (RemoteException unused) {
        }
    }

    @Override // defpackage.xja
    public final xiy d() {
        return null;
    }

    @Override // defpackage.xja
    public final void e() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.a();
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.xja
    public final void h() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.f();
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.xja
    public final void i(xiz xizVar) {
        this.b.a = xizVar;
    }

    @Override // defpackage.xja
    public final void k(boolean z) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.h(z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.xja
    public final void l() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.i();
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.xja
    public final void m(int i) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.k(i);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.xja
    public final void p(String str, List list, boolean z, int i) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.j(str, list, z);
            } catch (RemoteException unused) {
            }
        }
    }
}

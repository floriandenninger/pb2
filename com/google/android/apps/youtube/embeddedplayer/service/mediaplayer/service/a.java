package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.service;

import android.graphics.Bitmap;
import android.os.RemoteException;
import android.view.SurfaceControl;
import android.view.View;
import defpackage.afkx;
import defpackage.afky;
import defpackage.aflb;
import defpackage.afld;
import defpackage.bgv;
import defpackage.pkd;
import defpackage.ykl;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class a implements afky {
    public com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c a;
    protected afkx b;

    public a(com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.afkl
    public final /* synthetic */ int c() {
        return 0;
    }

    @Override // defpackage.afkl
    public final /* synthetic */ int e() {
        return 0;
    }

    @Override // defpackage.afky
    public final /* synthetic */ SurfaceControl f() {
        return null;
    }

    @Override // defpackage.afky
    public final void g(int i) {
        com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.l(i);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.afky
    public final View h() {
        return null;
    }

    @Override // defpackage.afky
    public final /* synthetic */ bgv i() {
        return null;
    }

    @Override // defpackage.afky
    public final /* synthetic */ pkd j() {
        return null;
    }

    @Override // defpackage.afky
    public final void k() {
        com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.h();
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.afkl
    public final void l(Bitmap bitmap, ykl yklVar) {
        yklVar.a(bitmap, new Exception());
    }

    @Override // defpackage.afky
    public final /* synthetic */ void m(Object obj) {
    }

    @Override // defpackage.afky
    public final void n(int i) {
        com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.i(i);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.afky
    public final void o() {
        if (this.a != null) {
            afkx afkxVar = this.b;
            if (afkxVar != null) {
                afkxVar.d();
            }
            try {
                com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c cVar = this.a;
                if (cVar != null) {
                    cVar.j();
                }
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.afky
    public final void p() {
    }

    @Override // defpackage.afky
    public final /* synthetic */ void q() {
    }

    @Override // defpackage.afky
    public final /* synthetic */ void r(boolean z, byte[] bArr, long j, long j2) {
    }

    @Override // defpackage.afky
    public final void rE(int i) {
        com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.g(i);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.afkl
    public final int rF() {
        com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c cVar = this.a;
        if (cVar == null) {
            return 0;
        }
        try {
            return cVar.a();
        } catch (RemoteException unused) {
            return 0;
        }
    }

    @Override // defpackage.afkl
    public final int rG() {
        com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c cVar = this.a;
        if (cVar == null) {
            return 0;
        }
        try {
            return cVar.f();
        } catch (RemoteException unused) {
            return 0;
        }
    }

    @Override // defpackage.afky
    public final void s(afkx afkxVar) {
        this.b = afkxVar;
    }

    @Override // defpackage.afky
    public final void t(aflb aflbVar) {
    }

    @Override // defpackage.afky
    public final /* synthetic */ void u(afld afldVar) {
    }

    @Override // defpackage.afkl
    public final void v(int i, int i2) {
        com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.k(i, i2);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.afky
    public final /* synthetic */ void w(boolean z) {
    }

    @Override // defpackage.afkl
    public final /* synthetic */ boolean x() {
        return false;
    }

    @Override // defpackage.afky
    public final /* synthetic */ void y(boolean z, float f, float f2, int i) {
    }

    @Override // defpackage.afky
    public final /* synthetic */ void z() {
    }
}

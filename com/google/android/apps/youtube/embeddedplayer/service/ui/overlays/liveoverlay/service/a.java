package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.service;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.e;
import defpackage.ahvx;
import defpackage.ahvy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a implements ahvy {
    public c a;
    private final e b;

    public a(c cVar) {
        this.a = cVar;
        e eVar = new e();
        this.b = eVar;
        try {
            cVar.i(eVar);
        } catch (RemoteException unused) {
        }
    }

    @Override // defpackage.ahvy
    public final int getHeight() {
        c cVar = this.a;
        if (cVar != null) {
            try {
                return cVar.a();
            } catch (RemoteException unused) {
            }
        }
        return 0;
    }

    @Override // defpackage.ahvy
    public final int getWidth() {
        c cVar = this.a;
        if (cVar != null) {
            try {
                return cVar.f();
            } catch (RemoteException unused) {
            }
        }
        return 0;
    }

    @Override // defpackage.ahvy
    public final /* synthetic */ void k(boolean z) {
    }

    @Override // defpackage.ahvy
    public final void kV() {
        c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.g();
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahvy
    public final /* synthetic */ void m() {
    }

    @Override // defpackage.ahvy
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.ahvy
    public final void o(long j) {
    }

    @Override // defpackage.ahvy
    public final void p(Bitmap bitmap) {
        c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.h(bitmap);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahvy
    public final void q(ahvx ahvxVar) {
        this.b.a = ahvxVar;
    }

    @Override // defpackage.ahvy
    public final /* synthetic */ void r(boolean z) {
    }

    @Override // defpackage.ahvy
    public final void t(CharSequence charSequence, CharSequence charSequence2, boolean z, CharSequence charSequence3, int i, CharSequence charSequence4, int i2) {
        c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.j(charSequence, charSequence2, z, charSequence3, i, charSequence4, i2);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahvy
    public final /* synthetic */ void u(boolean z) {
    }

    @Override // defpackage.ahvy
    public final void v(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.k(charSequence, charSequence2, charSequence3);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahvy
    public final /* synthetic */ void w(boolean z) {
    }
}

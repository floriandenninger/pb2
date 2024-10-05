package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.service;

import android.os.RemoteException;
import android.view.View;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c;
import defpackage.ahza;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a implements ahza {
    public c a;

    public a(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.ahza
    public final void a(boolean z) {
        c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.a(false);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahza
    public final void b(boolean z) {
        c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.f(z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahza
    public final void d(boolean z) {
        c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.h(z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahza
    public final /* synthetic */ void e(int i) {
    }

    @Override // defpackage.ahza
    public final /* synthetic */ void f(View.OnClickListener onClickListener) {
    }

    @Override // defpackage.ahza
    public final void g(CharSequence charSequence) {
        c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.i(charSequence);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahza
    public final void h() {
        c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.j();
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.ahza
    public final void rQ(long j) {
        c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.g(j);
            } catch (RemoteException unused) {
            }
        }
    }
}

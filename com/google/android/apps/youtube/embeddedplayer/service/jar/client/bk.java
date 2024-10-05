package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.Toast;
import defpackage.acrb;
import defpackage.alta;
import defpackage.oba;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bk extends p {
    final /* synthetic */ bn a;

    public bk(bn bnVar) {
        this.a = bnVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final String a(String str) {
        return this.a.h.a(str);
    }

    public final void b() {
        if (this.a.f()) {
            this.a.B.h();
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void f() {
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void g(boolean z, long j) {
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void h() {
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void i() {
        try {
            this.a.e.h(acrb.PLAYER_YOU_TUBE_BUTTON.Jk);
        } catch (RemoteException e) {
            oba.B(e);
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void j(String str) {
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void k(final boolean z) {
        this.a.m.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.bj
            @Override // java.lang.Runnable
            public final void run() {
                boolean z2;
                final av avVar;
                av avVar2;
                bk bkVar = bk.this;
                boolean z3 = z;
                if (bkVar.a.f()) {
                    com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded.c cVar = bkVar.a.A;
                    cVar.g = z3;
                    if (!cVar.e.b) {
                        if ((Build.VERSION.SDK_INT < 24 || !cVar.a.f()) && z3) {
                            cVar.b.o(1);
                        } else {
                            cVar.b.g();
                        }
                        bl blVar = cVar.h;
                        if (blVar.a.f()) {
                            bn bnVar = blVar.a;
                            try {
                                z2 = bnVar.c.O();
                            } catch (RemoteException e) {
                                oba.B(e);
                                z2 = false;
                            }
                            bnVar.F = z2;
                            com.google.android.apps.youtube.embeddedplayer.service.jar.l lVar = blVar.a.G;
                            if (!z3) {
                                av avVar3 = lVar.a.c;
                                if (avVar3 != null) {
                                    avVar3.d.post(new ap(avVar3, 1));
                                    return;
                                }
                                return;
                            }
                            com.google.android.apps.youtube.embeddedplayer.service.jar.m mVar = lVar.a;
                            if (mVar.c != null || (avVar = mVar.b) == null) {
                                return;
                            }
                            mVar.d = avVar;
                            final Bundle b = avVar.b();
                            avVar.d.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.ag
                                @Override // java.lang.Runnable
                                public final void run() {
                                    av avVar4 = av.this;
                                    try {
                                        avVar4.k.f(b);
                                    } catch (RemoteException unused) {
                                        alta.B("Problem showing fullscreen view.", new Object[0]);
                                    }
                                }
                            });
                            return;
                        }
                        return;
                    }
                    bl blVar2 = cVar.h;
                    if (blVar2.a.f() && (avVar2 = blVar2.a.G.a.b) != null) {
                        avVar2.d.post(new am(avVar2, z3, 1));
                    }
                }
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void l(String str, final String str2, long j, long j2, boolean z, boolean z2, final int i) {
        this.a.m.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.bi
            @Override // java.lang.Runnable
            public final void run() {
                bk bkVar = bk.this;
                String str3 = str2;
                int i2 = i;
                com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.m mVar = bkVar.a.x;
                if (mVar.np()) {
                    mVar.a.setVisibility(8);
                    mVar.b.setVisibility(8);
                    com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.l lVar = mVar.c;
                    if (lVar.a.getAnimation() == null) {
                        lVar.a.startAnimation(lVar.b);
                    }
                }
                bkVar.a.p.N(str3);
                bkVar.a.p.M(i2);
                com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.d dVar = bkVar.a.w;
                dVar.k = i2;
                dVar.Y();
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void m() {
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void n() {
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void o(long j) {
        this.a.m.post(new bg(this, 1));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void p(long j, long j2) {
        this.a.m.post(new bg(this, 0));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void q() {
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void r() {
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void s() {
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void t(long j, long j2) {
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void u(long j) {
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void v() {
        this.a.m.post(new bg(this, 2));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void w() {
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void x() {
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void y(final String str) {
        this.a.m.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.bh
            @Override // java.lang.Runnable
            public final void run() {
                bk bkVar = bk.this;
                Toast.makeText(bkVar.a.a, str, 0).show();
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.q
    public final void z(Intent intent) {
        this.a.a.startActivity(intent);
    }
}

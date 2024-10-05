package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared;

import android.net.Uri;
import android.os.Handler;
import defpackage.ahbw;
import defpackage.ajjz;
import defpackage.avgg;
import defpackage.xcf;
import defpackage.xhx;
import defpackage.xjo;
import defpackage.xjq;
import defpackage.xjs;
import defpackage.xjw;
import defpackage.xka;
import defpackage.xkd;
import defpackage.xla;
import defpackage.ykn;
import defpackage.ykt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class i implements xhx {
    public final g a;
    private final ajjz b;
    private final Handler c;
    private ykn d;
    private xjq e;

    public i(g gVar, Handler handler, ajjz ajjzVar) {
        gVar.getClass();
        this.a = gVar;
        handler.getClass();
        this.c = handler;
        ajjzVar.getClass();
        this.b = ajjzVar;
        this.e = xjq.a().a();
    }

    @Override // defpackage.xhx
    public final void nM(xla xlaVar) {
        this.a.t(xlaVar);
    }

    @Override // defpackage.xhx
    public final void qH(xjq xjqVar) {
        boolean z = xjqVar.a;
        if (z != this.e.a) {
            this.a.x(z);
        }
        xjw xjwVar = xjqVar.g;
        if (!xjwVar.a.equals(this.e.g.a)) {
            xjo xjoVar = xjwVar.a;
            avgg avggVar = xjoVar.d;
            this.a.o(xjoVar.b);
            if (avggVar == null) {
                ykn yknVar = this.d;
                if (yknVar != null) {
                    yknVar.d();
                    this.d = null;
                }
                this.a.p(null);
            } else {
                Uri B = ahbw.B(avggVar);
                if (B != null) {
                    ykn c = ykn.c(new h(this));
                    this.d = c;
                    this.b.l(B, ykt.c(this.c, c));
                }
            }
        }
        xjs xjsVar = xjqVar.e;
        int i = xjsVar.a;
        xjs xjsVar2 = this.e.e;
        int i2 = xjsVar2.a;
        boolean z2 = !xjsVar.c.equals(xjsVar2.c);
        if (i != i2 || z2) {
            g gVar = this.a;
            int i3 = xjsVar.a;
            xcf xcfVar = xjsVar.c;
            gVar.m(i3, xcfVar.b, xcfVar.c);
        }
        boolean z3 = xjsVar.b;
        if (z3 != this.e.e.b) {
            this.a.u(z3);
        }
        xka xkaVar = xjqVar.f;
        if (!xkaVar.c.toString().contentEquals(this.e.f.c) && !xkaVar.c.toString().contentEquals("<NONE>")) {
            this.a.z(xkaVar.c);
        }
        xkd xkdVar = xjqVar.c;
        int i4 = xkdVar.d;
        if (i4 != this.e.c.d) {
            if (i4 == 0) {
                this.a.w(true);
                this.a.v(false);
            } else if (i4 == 1) {
                this.a.w(true);
                this.a.v(true);
            } else if (i4 == 2 || i4 == 3) {
                this.a.w(false);
                this.a.v(false);
            }
        }
        boolean z4 = xkdVar.e;
        if (z4 != this.e.c.e) {
            this.a.r(z4);
        }
        int i5 = xkdVar.g;
        if (i5 != this.e.c.g && xkdVar.d == 0) {
            this.a.n(i5);
        }
        this.e = xjqVar;
    }
}

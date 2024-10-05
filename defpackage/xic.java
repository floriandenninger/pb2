package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xic implements xhw, aioa {
    public final ahxw a;
    public Bitmap b;
    public boolean c;
    public boolean d;
    public boolean e;
    private final ajjz f;
    private final ykl g;
    private ykn h;
    private Uri i;

    public xic(ahxw ahxwVar, ajjz ajjzVar) {
        ahxwVar.getClass();
        this.a = ahxwVar;
        ajjzVar.getClass();
        this.f = ajjzVar;
        this.g = ykt.c(new Handler(), new xib(this));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [aivf, ahxw] */
    @Override // defpackage.xhw
    public final void a(aoxt aoxtVar) {
        avgg avggVar;
        if (aoxtVar == null) {
            return;
        }
        aoxu aoxuVar = aoxtVar.h;
        if (aoxuVar == null) {
            aoxuVar = aoxu.a;
        }
        if ((aoxuVar.b & 1) != 0) {
            aoxu aoxuVar2 = aoxtVar.h;
            if (aoxuVar2 == null) {
                aoxuVar2 = aoxu.a;
            }
            avgb avgbVar = aoxuVar2.c;
            if (avgbVar == null) {
                avgbVar = avgb.a;
            }
            avggVar = avgbVar.b;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
        } else {
            avggVar = null;
        }
        if (avggVar != null) {
            View ld = this.a.ld();
            Uri C = ahbw.C(avggVar, ld != null ? ld.getWidth() : 480, ld != null ? ld.getHeight() : 320);
            if (C == null || !C.equals(this.i)) {
                b();
            }
            this.i = C;
        }
        c();
    }

    public final void b() {
        this.i = null;
        this.b = null;
        ykn yknVar = this.h;
        if (yknVar != null) {
            yknVar.d();
            this.h = null;
        }
        this.a.nw();
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        final int i = 2;
        ayqx X = aiocVar.G().a.X(new ayrs(this) { // from class: xia
            public final /* synthetic */ xic a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i2 = i;
                if (i2 == 0) {
                    xic xicVar = this.a;
                    xicVar.d = ((ahed) obj).b();
                    xicVar.c();
                    return;
                }
                if (i2 == 1) {
                    xic xicVar2 = this.a;
                    xicVar2.e = ((ahcx) obj).d() == aigf.REMOTE;
                    xicVar2.c();
                } else {
                    xic xicVar3 = this.a;
                    ahef ahefVar = (ahef) obj;
                    if (ahefVar.c() == aign.NEW) {
                        xicVar3.b();
                    }
                    xicVar3.c = ahefVar.c().h();
                    xicVar3.c();
                }
            }
        });
        final int i2 = 0;
        ayqx X2 = aiocVar.t().a.X(new ayrs(this) { // from class: xia
            public final /* synthetic */ xic a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i22 = i2;
                if (i22 == 0) {
                    xic xicVar = this.a;
                    xicVar.d = ((ahed) obj).b();
                    xicVar.c();
                    return;
                }
                if (i22 == 1) {
                    xic xicVar2 = this.a;
                    xicVar2.e = ((ahcx) obj).d() == aigf.REMOTE;
                    xicVar2.c();
                } else {
                    xic xicVar3 = this.a;
                    ahef ahefVar = (ahef) obj;
                    if (ahefVar.c() == aign.NEW) {
                        xicVar3.b();
                    }
                    xicVar3.c = ahefVar.c().h();
                    xicVar3.c();
                }
            }
        });
        final int i3 = 1;
        return new ayqx[]{X, X2, aiocVar.t().b.X(new ayrs(this) { // from class: xia
            public final /* synthetic */ xic a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i22 = i3;
                if (i22 == 0) {
                    xic xicVar = this.a;
                    xicVar.d = ((ahed) obj).b();
                    xicVar.c();
                    return;
                }
                if (i22 == 1) {
                    xic xicVar2 = this.a;
                    xicVar2.e = ((ahcx) obj).d() == aigf.REMOTE;
                    xicVar2.c();
                } else {
                    xic xicVar3 = this.a;
                    ahef ahefVar = (ahef) obj;
                    if (ahefVar.c() == aign.NEW) {
                        xicVar3.b();
                    }
                    xicVar3.c = ahefVar.c().h();
                    xicVar3.c();
                }
            }
        })};
    }

    public final void c() {
        if (!this.c || (!this.d && !this.e)) {
            this.a.kV();
            return;
        }
        Bitmap bitmap = this.b;
        if (bitmap != null || this.i == null || this.h != null) {
            this.a.b(bitmap);
        } else {
            ykn c = ykn.c(this.g);
            this.h = c;
            this.f.l(this.i, c);
        }
        this.a.kX();
    }
}

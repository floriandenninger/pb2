package com.google.android.apps.youtube.app.common.tvfilm;

import android.content.Context;
import android.util.DisplayMetrics;
import com.google.android.apps.youtube.app.common.tvfilm.TrailerOverlayPresenter;
import defpackage.adlu;
import defpackage.ahee;
import defpackage.aioc;
import defpackage.any;
import defpackage.aoae;
import defpackage.aok;
import defpackage.asfw;
import defpackage.ayqi;
import defpackage.ayqw;
import defpackage.ayrs;
import defpackage.eoo;
import defpackage.fwu;
import defpackage.yfi;
import defpackage.yjk;
import defpackage.ypa;
import defpackage.ypd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TrailerOverlayPresenter implements yfi, any, ypd {
    public final int a;
    public final int b;
    public boolean c;
    public final fwu d;
    private final aioc e;
    private final ayqi f;
    private final ypa g;
    private final ayqw h = new ayqw();
    private final aoae i;

    public TrailerOverlayPresenter(Context context, fwu fwuVar, aoae aoaeVar, aioc aiocVar, ayqi ayqiVar, ypa ypaVar, byte[] bArr, byte[] bArr2) {
        this.d = fwuVar;
        this.i = aoaeVar;
        this.e = aiocVar;
        this.f = ayqiVar;
        this.g = ypaVar;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.a = yjk.K(displayMetrics, 30);
        this.b = yjk.K(displayMetrics, 12);
    }

    @Override // defpackage.yfi
    public final void g() {
    }

    @Override // defpackage.yfi
    public final void h() {
        this.d.e();
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{adlu.class, ahee.class};
        }
        if (i == 0) {
            this.c = ((adlu) obj).a() != null;
            return null;
        }
        if (i == 1) {
            ahee aheeVar = (ahee) obj;
            if (this.c) {
                this.d.f(true);
                fwu fwuVar = this.d;
                boolean z = aheeVar.a;
                fwuVar.i(z ? this.b : 0, z ? this.a : 0);
                return null;
            }
            this.d.f(!aheeVar.a);
            this.d.i(0, 0);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    @Override // defpackage.yfi
    public final void mJ(asfw asfwVar) {
        this.d.e();
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        this.h.c();
        this.g.m(this);
        this.i.p(this);
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        ayqw ayqwVar = this.h;
        aioc aiocVar = this.e;
        final int i = 1;
        final int i2 = 0;
        final int i3 = 2;
        ayqwVar.g(aiocVar.al().Y(new ayrs(this) { // from class: fxg
            public final /* synthetic */ TrailerOverlayPresenter a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i4 = i;
                if (i4 == 0) {
                    fwu fwuVar = this.a.d;
                    fwuVar.b = ((aheb) obj).a();
                    fwuVar.a = true;
                    fwuVar.g();
                    fwuVar.Z(1);
                    return;
                }
                if (i4 == 1) {
                    this.a.d.f(false);
                } else {
                    TrailerOverlayPresenter trailerOverlayPresenter = this.a;
                    if (((ahef) obj).c() == aign.NEW) {
                        trailerOverlayPresenter.d.e();
                    }
                }
            }
        }, eoo.q), aiocVar.ap().G().E(this.f).Y(new ayrs(this) { // from class: fxg
            public final /* synthetic */ TrailerOverlayPresenter a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i4 = i2;
                if (i4 == 0) {
                    fwu fwuVar = this.a.d;
                    fwuVar.b = ((aheb) obj).a();
                    fwuVar.a = true;
                    fwuVar.g();
                    fwuVar.Z(1);
                    return;
                }
                if (i4 == 1) {
                    this.a.d.f(false);
                } else {
                    TrailerOverlayPresenter trailerOverlayPresenter = this.a;
                    if (((ahef) obj).c() == aign.NEW) {
                        trailerOverlayPresenter.d.e();
                    }
                }
            }
        }, eoo.q), aiocVar.G().b.Y(new ayrs(this) { // from class: fxg
            public final /* synthetic */ TrailerOverlayPresenter a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i4 = i3;
                if (i4 == 0) {
                    fwu fwuVar = this.a.d;
                    fwuVar.b = ((aheb) obj).a();
                    fwuVar.a = true;
                    fwuVar.g();
                    fwuVar.Z(1);
                    return;
                }
                if (i4 == 1) {
                    this.a.d.f(false);
                } else {
                    TrailerOverlayPresenter trailerOverlayPresenter = this.a;
                    if (((ahef) obj).c() == aign.NEW) {
                        trailerOverlayPresenter.d.e();
                    }
                }
            }
        }, eoo.q));
        this.g.g(this);
        this.i.o(this);
    }
}

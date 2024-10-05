package com.google.android.apps.youtube.app.common.ui.tooltip;

import com.google.android.apps.youtube.app.common.ui.tooltip.TooltipPlayerResponseMonitor;
import defpackage.aadw;
import defpackage.ahef;
import defpackage.aign;
import defpackage.aioc;
import defpackage.akcp;
import defpackage.ammy;
import defpackage.any;
import defpackage.aok;
import defpackage.aryn;
import defpackage.aryr;
import defpackage.avhy;
import defpackage.ayqw;
import defpackage.ayrs;
import defpackage.evr;
import defpackage.fav;
import defpackage.fgp;
import defpackage.fhg;
import defpackage.ggk;
import defpackage.ypa;
import defpackage.ypd;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TooltipPlayerResponseMonitor implements any, fgp, ypd {
    public String a;
    public String b;
    private final akcp c;
    private final ypa d;
    private final aioc e;
    private final ayqw f = new ayqw();
    private final aadw g;

    public TooltipPlayerResponseMonitor(akcp akcpVar, ypa ypaVar, aioc aiocVar, aadw aadwVar) {
        this.c = akcpVar;
        this.d = ypaVar;
        this.e = aiocVar;
        this.g = aadwVar;
    }

    private final void h() {
        this.c.g(this.b);
        this.b = null;
    }

    public final void g(ahef ahefVar) {
        avhy avhyVar;
        aryr aryrVar = ahefVar.b() != null ? ahefVar.b().a : null;
        if (ahefVar.c() != aign.NEW || aryrVar == null) {
            return;
        }
        final String e = ahefVar.e();
        if (e == null || e.equals(this.a)) {
            h();
        }
        this.a = e;
        Iterator it = aryrVar.u.iterator();
        while (true) {
            if (!it.hasNext()) {
                avhyVar = null;
                break;
            }
            aryn arynVar = (aryn) it.next();
            if ((arynVar.b & 4) != 0) {
                avhyVar = arynVar.e;
                if (avhyVar == null) {
                    avhyVar = avhy.a;
                }
            }
        }
        if (avhyVar == null) {
            this.b = null;
        } else {
            this.c.e(avhyVar, new ammy() { // from class: gnp
                @Override // defpackage.ammy
                public final boolean a(Object obj) {
                    TooltipPlayerResponseMonitor tooltipPlayerResponseMonitor = TooltipPlayerResponseMonitor.this;
                    String str = e;
                    avhy avhyVar2 = (avhy) obj;
                    return (avhyVar2.b & 2) != 0 && avhyVar2.d.equals(tooltipPlayerResponseMonitor.b) && str != null && str.equals(tooltipPlayerResponseMonitor.a);
                }
            });
            this.b = avhyVar.d;
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahef.class};
        }
        if (i == 0) {
            g((ahef) obj);
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

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        if (evr.au(this.g)) {
            this.f.c();
        } else {
            this.d.m(this);
        }
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        if (fhgVar != fhg.NONE || this.b == null) {
            return;
        }
        h();
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        if (evr.au(this.g)) {
            this.f.c();
            this.f.g(this.e.G().b.Y(new ayrs() { // from class: gnq
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    TooltipPlayerResponseMonitor.this.g((ahef) obj);
                }
            }, ggk.f));
        } else {
            this.d.g(this);
        }
    }
}

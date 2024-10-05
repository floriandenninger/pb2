package com.google.android.libraries.youtube.mdx;

import com.google.android.libraries.youtube.mdx.FeatureFlagsImpl;
import defpackage.aarh;
import defpackage.abbr;
import defpackage.acue;
import defpackage.acuf;
import defpackage.acug;
import defpackage.acuk;
import defpackage.acul;
import defpackage.acun;
import defpackage.afsy;
import defpackage.aftm;
import defpackage.akuo;
import defpackage.anaf;
import defpackage.anhy;
import defpackage.aok;
import defpackage.axzf;
import defpackage.axzg;
import defpackage.aypn;
import defpackage.aypy;
import defpackage.ayqb;
import defpackage.ayqx;
import defpackage.ayro;
import defpackage.ayrs;
import defpackage.ayrz;
import defpackage.aysu;
import defpackage.azrh;
import defpackage.nxd;
import defpackage.wkk;
import defpackage.ynm;
import defpackage.ypa;
import defpackage.ypd;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FeatureFlagsImpl implements acue, ypd {
    private ayqx A;
    private ayqx B;
    private anhy C;
    private anhy D;
    private final axzg E;
    public final afsy a;
    public final acun b;
    public final wkk c;
    public final axzf n;
    private final ypa o;
    private final Executor p;
    private final Executor q;
    private final aarh r;
    private ayqx w;
    private ayqx x;
    private ayqx y;
    private aypy z;
    public final azrh d = azrh.e();
    public final azrh e = azrh.e();
    public final azrh f = azrh.e();
    public final azrh g = azrh.e();
    public final azrh h = azrh.e();
    public final azrh i = azrh.e();
    private final azrh s = azrh.e();
    private final azrh t = azrh.e();
    public final azrh l = azrh.e();
    public final azrh m = azrh.e();
    public final azrh j = azrh.e();
    private final azrh u = azrh.e();
    public final azrh k = azrh.e();
    private final azrh v = azrh.e();

    public FeatureFlagsImpl(ypa ypaVar, Executor executor, Executor executor2, afsy afsyVar, aarh aarhVar, acun acunVar, axzg axzgVar, wkk wkkVar, axzf axzfVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.o = ypaVar;
        this.p = executor;
        this.q = executor2;
        this.a = afsyVar;
        this.r = aarhVar;
        this.b = acunVar;
        this.E = axzgVar;
        this.c = wkkVar;
        this.n = axzfVar;
    }

    @Override // defpackage.acue
    public final aypy g() {
        return this.e;
    }

    @Override // defpackage.acue
    public final aypy h() {
        return this.i;
    }

    @Override // defpackage.acue
    public final aypy i() {
        return this.d;
    }

    @Override // defpackage.acue
    public final aypy j() {
        return this.g;
    }

    @Override // defpackage.acue
    public final aypy k() {
        return this.f;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aftm.class};
        }
        if (i == 0) {
            p();
            o();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.acue
    public final aypy l() {
        return this.h;
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

    @Override // defpackage.acue
    public final aypy m() {
        return this.t;
    }

    @Override // defpackage.acue
    public final aypy n() {
        return this.s;
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        this.o.m(this);
        anhy anhyVar = this.C;
        if (anhyVar != null && !anhyVar.isDone()) {
            this.C.cancel(true);
        }
        anhy anhyVar2 = this.D;
        if (anhyVar2 != null && !anhyVar2.isDone()) {
            this.D.cancel(true);
        }
        Object obj = this.w;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
        }
        Object obj2 = this.x;
        if (obj2 != null) {
            ayrz.c((AtomicReference) obj2);
        }
        Object obj3 = this.y;
        if (obj3 != null) {
            ayrz.c((AtomicReference) obj3);
        }
        Object obj4 = this.A;
        if (obj4 != null) {
            ayrz.c((AtomicReference) obj4);
        }
        Object obj5 = this.B;
        if (obj5 != null) {
            ayrz.c((AtomicReference) obj5);
        }
    }

    public final void o() {
        anhy S = anaf.S(new acuf(this, 0), this.p);
        this.D = S;
        ynm.k(S, this.q, abbr.h, new acug(this.v));
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        this.o.g(this);
        p();
        o();
        ayqx ayqxVar = this.w;
        final int i = 1;
        if (ayqxVar == null || ayqxVar.e()) {
            azrh azrhVar = this.r.a;
            this.w = azrhVar == null ? null : azrhVar.ax(new ayrs(this) { // from class: acui
                public final /* synthetic */ FeatureFlagsImpl a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    if (i == 0) {
                        FeatureFlagsImpl featureFlagsImpl = this.a;
                        Boolean bool = (Boolean) obj;
                        String.format("[mdxEnableEduChildGating=%b]", bool);
                        featureFlagsImpl.k.c(bool);
                        return;
                    }
                    FeatureFlagsImpl featureFlagsImpl2 = this.a;
                    arfd arfdVar = (arfd) obj;
                    Object[] objArr = new Object[2];
                    objArr[0] = Boolean.valueOf((arfdVar.b & 131072) != 0);
                    atcb atcbVar = arfdVar.l;
                    if (atcbVar == null) {
                        atcbVar = atcb.a;
                    }
                    objArr[1] = Boolean.valueOf((atcbVar.b & 2048) != 0);
                    String.format("[hasHotConfig=%b] [hasEnableSupexGuard=%b]", objArr);
                    azrh azrhVar2 = featureFlagsImpl2.j;
                    atcb atcbVar2 = arfdVar.l;
                    if (atcbVar2 == null) {
                        atcbVar2 = atcb.a;
                    }
                    azrhVar2.c(Boolean.valueOf(atcbVar2.f));
                    azrh azrhVar3 = featureFlagsImpl2.l;
                    atcb atcbVar3 = arfdVar.l;
                    if (atcbVar3 == null) {
                        atcbVar3 = atcb.a;
                    }
                    azrhVar3.c(Boolean.valueOf(atcbVar3.d));
                    azrh azrhVar4 = featureFlagsImpl2.m;
                    atcb atcbVar4 = arfdVar.l;
                    if (atcbVar4 == null) {
                        atcbVar4 = atcb.a;
                    }
                    azrhVar4.c(Boolean.valueOf(atcbVar4.e));
                }
            });
        }
        ayqx ayqxVar2 = this.x;
        final int i2 = 0;
        if (ayqxVar2 == null || ayqxVar2.e()) {
            axzg axzgVar = this.E;
            this.x = axzgVar != null ? axzgVar.a.a.Y(akuo.m).B().ax(new ayrs(this) { // from class: acui
                public final /* synthetic */ FeatureFlagsImpl a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    if (i2 == 0) {
                        FeatureFlagsImpl featureFlagsImpl = this.a;
                        Boolean bool = (Boolean) obj;
                        String.format("[mdxEnableEduChildGating=%b]", bool);
                        featureFlagsImpl.k.c(bool);
                        return;
                    }
                    FeatureFlagsImpl featureFlagsImpl2 = this.a;
                    arfd arfdVar = (arfd) obj;
                    Object[] objArr = new Object[2];
                    objArr[0] = Boolean.valueOf((arfdVar.b & 131072) != 0);
                    atcb atcbVar = arfdVar.l;
                    if (atcbVar == null) {
                        atcbVar = atcb.a;
                    }
                    objArr[1] = Boolean.valueOf((atcbVar.b & 2048) != 0);
                    String.format("[hasHotConfig=%b] [hasEnableSupexGuard=%b]", objArr);
                    azrh azrhVar2 = featureFlagsImpl2.j;
                    atcb atcbVar2 = arfdVar.l;
                    if (atcbVar2 == null) {
                        atcbVar2 = atcb.a;
                    }
                    azrhVar2.c(Boolean.valueOf(atcbVar2.f));
                    azrh azrhVar3 = featureFlagsImpl2.l;
                    atcb atcbVar3 = arfdVar.l;
                    if (atcbVar3 == null) {
                        atcbVar3 = atcb.a;
                    }
                    azrhVar3.c(Boolean.valueOf(atcbVar3.d));
                    azrh azrhVar4 = featureFlagsImpl2.m;
                    atcb atcbVar4 = arfdVar.l;
                    if (atcbVar4 == null) {
                        atcbVar4 = atcb.a;
                    }
                    azrhVar4.c(Boolean.valueOf(atcbVar4.e));
                }
            }) : null;
        }
        ayqx ayqxVar3 = this.y;
        if (ayqxVar3 == null || ayqxVar3.e()) {
            aypy n = aypy.n(new ayqb[]{this.u, this.j, this.v, this.k}, aysu.e(acul.a), aypn.a);
            this.z = n;
            this.y = n.ax(new ayrs() { // from class: acuj
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:65:0x0162  */
                @Override // defpackage.ayrs
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void a(java.lang.Object r10) {
                    /*
                        Method dump skipped, instructions count: 493
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.acuj.a(java.lang.Object):void");
                }
            });
        }
        this.A = aypy.m(this.z, this.l, nxd.s).ax(new acuk(this.s, 0));
        this.B = aypy.m(this.z, this.m, new ayro() { // from class: acuh
            @Override // defpackage.ayro
            public final Object a(Object obj, Object obj2) {
                FeatureFlagsImpl featureFlagsImpl = FeatureFlagsImpl.this;
                Boolean bool = (Boolean) obj2;
                boolean z = false;
                if ((((Boolean) obj).booleanValue() || bool.booleanValue()) && featureFlagsImpl.b.y) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }).ax(new acuk(this.t, 0));
    }

    public final void p() {
        anhy S = anaf.S(new acuf(this, 1), this.p);
        this.C = S;
        ynm.k(S, this.q, abbr.i, new acug(this.u));
    }
}

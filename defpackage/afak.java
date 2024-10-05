package defpackage;

import android.util.Pair;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class afak implements bbp, bcz {
    public final VideoStreamingData a;
    public List b;
    private final String c;
    private final ayr d;
    private final afaf e;
    private final bbx f;
    private final amnv g;
    private final afjf h;
    private final long i;
    private final asj j;
    private final aezm k;
    private final aezx[] l;
    private final att m;
    private bbo n;
    private bda o;
    private boolean p;
    private final bfg t;
    private final bbx u;
    private int r = 1;
    private int s = 1;
    private long q = 0;

    public afak(bfg bfgVar, aezf aezfVar, ayr ayrVar, bbx bbxVar, afaf afafVar, bbx bbxVar2, afjf afjfVar, att attVar, aezm aezmVar, byte[] bArr) {
        this.t = bfgVar;
        this.c = aezfVar.a;
        this.d = ayrVar;
        this.u = bbxVar;
        this.e = afafVar;
        this.f = bbxVar2;
        this.g = new aeuw(aezfVar, 5);
        VideoStreamingData b = aezfVar.b();
        this.a = b;
        this.h = afjfVar;
        this.i = pts.r(aezfVar.a().t());
        this.m = attVar;
        this.k = aezmVar;
        this.b = amru.q();
        this.o = ayt.c(n());
        afjfVar.aC();
        Pair r = aear.r(ayrVar, b.p, false);
        afjfVar.aB();
        this.j = (asj) r.first;
        this.l = (aezx[]) r.second;
    }

    private final bda[] n() {
        List list = this.b;
        return (bda[]) list.toArray(new bda[list.size()]);
    }

    @Override // defpackage.bbp
    public final long a(long j, poi poiVar) {
        for (bdq bdqVar : this.b) {
            if (bdqVar.a == 2) {
                return bdqVar.b.b(j, poiVar);
            }
        }
        return j;
    }

    @Override // defpackage.bbp, defpackage.bda
    public final long c() {
        return this.o.c();
    }

    @Override // defpackage.bbp
    public final long d() {
        return -9223372036854775807L;
    }

    @Override // defpackage.bbp
    public final long e(long j) {
        this.q = j;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((bdq) it.next()).f(j);
        }
        return j;
    }

    @Override // defpackage.bbp
    public final long f(bel[] belVarArr, boolean[] zArr, bcy[] bcyVarArr, boolean[] zArr2, long j) {
        int i;
        bel belVar;
        this.h.aI();
        this.q = j;
        int i2 = 0;
        while (i2 < belVarArr.length) {
            if (belVarArr[i2] == null || !zArr[i2]) {
                bcy bcyVar = bcyVarArr[i2];
                if (bcyVar instanceof bdq) {
                    ((bdq) bcyVar).h();
                }
                bcyVarArr[i2] = null;
            }
            if (bcyVarArr[i2] != null || (belVar = belVarArr[i2]) == null) {
                i = i2;
            } else {
                aezx aezxVar = this.l[this.j.a(belVar.e())];
                zArr2[i2] = true;
                this.h.aE();
                axj f = this.a.f(this.c);
                this.h.aD();
                i = i2;
                bcyVarArr[i] = new bdq(aezxVar.a, this.e.d(f, aezxVar.b, aear.v(f, aezxVar), belVarArr[i2], aezxVar.a, this.m, (PlayerConfigModel) this.g.get()), this, this.t, j, this.d, this.u, this.k.a(this.g, new amnv() { // from class: afaj
                    @Override // defpackage.amnv
                    public final Object get() {
                        return afak.this.a;
                    }
                }), this.f, null);
            }
            i2 = i + 1;
        }
        this.b = new ArrayList();
        for (bcy bcyVar2 : bcyVarArr) {
            if (bcyVar2 instanceof bdq) {
                this.b.add((bdq) bcyVar2);
            }
        }
        this.o = ayt.c(n());
        this.h.aH();
        return j;
    }

    @Override // defpackage.bbp
    public final asj g() {
        return this.j;
    }

    @Override // defpackage.bbp
    public final void h(long j, boolean z) {
        if (!this.p) {
            this.h.aG();
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((bdq) it.next()).e(j, z);
        }
        if (!this.p) {
            this.h.aF();
        }
        this.p = true;
    }

    @Override // defpackage.bbp
    public final void i() {
    }

    @Override // defpackage.bcz
    public final /* bridge */ /* synthetic */ void j(bda bdaVar) {
        k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004e, code lost:
    
        if (r0 == 2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x007d, code lost:
    
        if (r0 == 2) goto L38;
     */
    @Override // defpackage.bbp, defpackage.bda
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long jJ() {
        /*
            r14 = this;
            int r0 = r14.r
            r1 = 3
            if (r0 != r1) goto L9
            int r0 = r14.s
            if (r0 == r1) goto L8c
        L9:
            java.util.List r0 = r14.b
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = r2
        L11:
            boolean r4 = r0.hasNext()
            r5 = 1
            if (r4 == 0) goto L27
            java.lang.Object r4 = r0.next()
            bdq r4 = (defpackage.bdq) r4
            int r6 = r4.a
            if (r6 == r5) goto L23
            r3 = r4
        L23:
            if (r6 != r5) goto L11
            r2 = r4
            goto L11
        L27:
            int r0 = r14.r
            r6 = 2
            r8 = 0
            r4 = 2
            if (r0 == r1) goto L5d
            if (r2 == 0) goto L37
            long r10 = r2.jJ()
            goto L38
        L37:
            r10 = r8
        L38:
            long r12 = r14.q
            long r10 = r10 - r12
            int r0 = r14.r
            if (r0 != r5) goto L4e
            long r12 = r14.i
            long r12 = r12 / r6
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 < 0) goto L5d
            afjf r0 = r14.h
            r0.d()
            r14.r = r4
            goto L50
        L4e:
            if (r0 != r4) goto L5d
        L50:
            long r12 = r14.i
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 < 0) goto L5d
            afjf r0 = r14.h
            r0.c()
            r14.r = r1
        L5d:
            int r0 = r14.s
            if (r0 == r1) goto L8c
            if (r3 == 0) goto L67
            long r8 = r3.jJ()
        L67:
            long r2 = r14.q
            long r8 = r8 - r2
            int r0 = r14.s
            if (r0 != r5) goto L7d
            long r2 = r14.i
            long r2 = r2 / r6
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 < 0) goto L8c
            afjf r0 = r14.h
            r0.au()
            r14.s = r4
            goto L7f
        L7d:
            if (r0 != r4) goto L8c
        L7f:
            long r2 = r14.i
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 < 0) goto L8c
            afjf r0 = r14.h
            r0.at()
            r14.s = r1
        L8c:
            bda r0 = r14.o
            long r0 = r0.jJ()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afak.jJ():long");
    }

    public final void k() {
        this.n.j(this);
    }

    @Override // defpackage.bbp
    public final synchronized void l(bbo bboVar, long j) {
        this.n = bboVar;
        bboVar.k(this);
    }

    @Override // defpackage.bbp, defpackage.bda
    public final void m(long j) {
        this.o.m(j);
    }

    @Override // defpackage.bbp, defpackage.bda
    public final boolean o(long j) {
        return this.o.o(j);
    }

    @Override // defpackage.bbp, defpackage.bda
    public final boolean p() {
        return this.o.p();
    }
}

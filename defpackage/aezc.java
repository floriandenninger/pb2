package defpackage;

import android.net.Uri;
import android.os.Handler;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aezc extends bar implements bbp {
    public final aeyh d;
    public final aeza e;
    public volatile long f;
    private final Handler i;
    private volatile bbo l;
    private final Map j = new EnumMap(ovw.class);
    public volatile pou g = null;
    private boolean m = false;
    private volatile pnd k = pnd.a(Uri.EMPTY);
    public aeya h = aeya.a;

    public aezc(aeza aezaVar, aeyh aeyhVar, Handler handler, long j) {
        this.e = aezaVar;
        this.d = aeyhVar;
        this.i = handler;
        this.f = j;
    }

    private final void x() {
        if (this.m || this.l == null || this.h == null) {
            return;
        }
        this.l.k(this);
        this.m = true;
    }

    @Override // defpackage.bbp
    public final long a(long j, poi poiVar) {
        return j;
    }

    @Override // defpackage.bbp, defpackage.bda
    public final long c() {
        return Long.MIN_VALUE;
    }

    @Override // defpackage.bbp
    public final long d() {
        return -9223372036854775807L;
    }

    @Override // defpackage.bbp
    public final synchronized long e(long j) {
        affg affgVar;
        long j2;
        this.f = j;
        aeza aezaVar = this.e;
        aeyj aeyjVar = ((aeyk) aezaVar).e;
        synchronized (((aeyr) aeyjVar).e) {
            if (((aeyr) aeyjVar).q(((aeyk) aezaVar).c)) {
                try {
                    affgVar = ((aeyr) aeyjVar).f;
                    j2 = ((aeyk) aezaVar).c.f;
                    afki.d(affgVar.d == 3);
                } catch (afet e) {
                    ((aeyr) aeyjVar).g(e, ((aeyk) aezaVar).c);
                }
                try {
                    affj affjVar = affgVar.e;
                    aone createBuilder = adwx.a.createBuilder();
                    double a = aeyc.a(j2);
                    createBuilder.copyOnWrite();
                    adwx adwxVar = (adwx) createBuilder.instance;
                    adwxVar.b = 1 | adwxVar.b;
                    adwxVar.c = a;
                    try {
                    } catch (aoob e2) {
                        throw new RuntimeException("Unexpected protobuf error", e2);
                    }
                } catch (RuntimeException e3) {
                    throw new afet(5, "Unexpected error calling into JS.", e3);
                }
            }
        }
        return j;
    }

    @Override // defpackage.bbp
    public final synchronized long f(bel[] belVarArr, boolean[] zArr, bcy[] bcyVarArr, boolean[] zArr2, long j) {
        ovw d;
        for (int i = 0; i < belVarArr.length; i++) {
            bel belVar = belVarArr[i];
            if (belVar == null || !zArr[i]) {
                bcyVarArr[i] = null;
            }
            if (bcyVarArr[i] == null && belVar != null && (d = aeyc.d(i)) != null) {
                aezb aezbVar = new aezb(this, d, belVar);
                this.j.put(d, aezbVar);
                bcyVarArr[i] = aezbVar;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // defpackage.bbp
    public final synchronized asj g() {
        ArrayList arrayList;
        aeya aeyaVar = this.h;
        afki.a(aeyaVar);
        arrayList = new ArrayList();
        aexz aexzVar = aeyaVar.b;
        if (aexzVar != null) {
            arrayList.add(aexzVar.e());
        }
        aexz aexzVar2 = aeyaVar.c;
        if (aexzVar2 != null) {
            arrayList.add(aexzVar2.e());
        }
        return new asj((asi[]) arrayList.toArray(new asi[0]));
    }

    @Override // defpackage.bbp
    public final synchronized void h(long j, boolean z) {
        this.f = j;
        aeyh aeyhVar = this.d;
        aeyhVar.a.d(j);
        aeyhVar.b.d(j);
    }

    @Override // defpackage.bbp
    public final void i() {
    }

    @Override // defpackage.bbp, defpackage.bda
    public final synchronized long jJ() {
        aeya aeyaVar = this.h;
        if (aeyaVar == null) {
            return 0L;
        }
        return this.d.a(aeyaVar.d);
    }

    @Override // defpackage.bar
    protected final void k() {
    }

    @Override // defpackage.bbp
    public final synchronized void l(bbo bboVar, long j) {
        this.m = false;
        this.l = bboVar;
        x();
    }

    @Override // defpackage.bbp, defpackage.bda
    public final void m(long j) {
    }

    @Override // defpackage.bbp, defpackage.bda
    public final boolean o(long j) {
        return false;
    }

    @Override // defpackage.bbp, defpackage.bda
    public final synchronized boolean p() {
        boolean z;
        aeya aeyaVar = this.h;
        if (aeyaVar != null) {
            z = this.d.a(aeyaVar.d) != Long.MIN_VALUE;
        }
        return z;
    }

    @Override // defpackage.bbr
    public final pnd r() {
        return this.k;
    }

    @Override // defpackage.bar
    protected final void rq(att attVar) {
        if (this.g != null) {
            rw(this.g);
        }
    }

    @Override // defpackage.bbr
    public final void s() {
    }

    public final synchronized void t(aeya aeyaVar) {
        if (aeyaVar != this.h) {
            amru amruVar = aeyc.a;
            int i = ((amvj) amruVar).c;
            for (int i2 = 0; i2 < i; i2++) {
                ovw ovwVar = (ovw) amruVar.get(i2);
                aezb aezbVar = (aezb) this.j.get(ovwVar);
                if (aezbVar != null) {
                    aezbVar.a = aeyaVar.a(ovwVar);
                }
            }
            this.h = aeyaVar;
            x();
        }
    }

    @Override // defpackage.bbr
    public final void u(bbp bbpVar) {
    }

    @Override // defpackage.bbr
    public final bbp v(ash ashVar, bfg bfgVar, long j) {
        return this;
    }

    public final synchronized void w(long j, aezf aezfVar) {
        pmx pmxVar = new pmx(this.k);
        afki.a(aezfVar);
        pmxVar.c = aezfVar;
        this.k = pmxVar.a();
        this.g = new bdf(j, true, false, this.k);
        this.i.post(new Runnable() { // from class: aeyz
            @Override // java.lang.Runnable
            public final void run() {
                aezc aezcVar = aezc.this;
                pou pouVar = aezcVar.g;
                afki.a(pouVar);
                aezcVar.rw(pouVar);
            }
        });
        x();
    }
}

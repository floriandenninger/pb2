package defpackage;

import com.facebook.yoga.YogaEdge;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajzv extends js {
    public final dpj a;
    public final acra b;
    public final boolean c;
    public final boolean d;
    public final syp e;
    public final syu f;
    public final sxw g;
    public ayqw h;
    public final boolean i;
    public final float j;
    public final wh k;
    public final Object l;
    public final ajzj m;
    public final sqq n;
    private final dsx o;
    private final ajox p;
    private final boolean q;
    private final ajzh r;
    private final boolean s;

    public ajzv(dpj dpjVar, dsx dsxVar, ajox ajoxVar, sqq sqqVar, acra acraVar, boolean z, boolean z2, boolean z3, syp sypVar, boolean z4, sxw sxwVar, boolean z5, float f, ajzj ajzjVar, wh whVar, syu syuVar, Object obj) {
        this.a = dpjVar;
        this.o = dsxVar;
        this.p = ajoxVar;
        this.n = sqqVar;
        this.b = acraVar;
        this.c = z;
        this.q = z2;
        this.d = z3;
        this.e = sypVar;
        this.f = syuVar;
        this.r = new ajzh(sqqVar, z2);
        this.s = z4;
        this.g = sxwVar;
        this.i = z5;
        this.j = f;
        this.m = ajzjVar;
        this.k = whVar;
        this.l = obj;
    }

    private final dte l(Object obj) {
        final acsd acsdVar;
        dha a;
        if (!(obj instanceof ajds)) {
            boolean z = obj instanceof ajni;
            if (z) {
                ajni ajniVar = (ajni) obj;
                for (Object obj2 : new ArrayList(ajniVar.b)) {
                    if (obj2 == null || (obj2 instanceof ajds)) {
                    }
                }
                final ajzh ajzhVar = this.r;
                dpj dpjVar = this.a;
                final acra acraVar = this.b;
                ayqw ayqwVar = this.h;
                if (!z) {
                    return null;
                }
                final ayqw ayqwVar2 = new ayqw();
                dlk a2 = dll.a(dpjVar);
                a2.E(YogaEdge.LEFT, ajniVar.e);
                a2.E(YogaEdge.RIGHT, ajniVar.f);
                a2.E(YogaEdge.TOP, ajniVar.c);
                a2.E(YogaEdge.BOTTOM, ajniVar.d);
                int i = ajniVar.a;
                int i2 = 0;
                while (i2 < i) {
                    final ajds ajdsVar = (ajds) ajniVar.b(i2);
                    int i3 = i2 < i + (-1) ? ajniVar.g : 0;
                    if (ajdsVar != null) {
                        szo szoVar = new szo() { // from class: ajzg
                            @Override // defpackage.szo
                            public final dha a(dhe dheVar, sxc sxcVar) {
                                acsd acsdVar2;
                                ajzh ajzhVar2 = ajzh.this;
                                ajds ajdsVar2 = ajdsVar;
                                acra acraVar2 = acraVar;
                                ayqw ayqwVar3 = ayqwVar2;
                                sqq sqqVar = ajzhVar2.b;
                                sxb a3 = sxc.a();
                                a3.l = amru.r(ahbl.i(ajdsVar2));
                                if (ajzhVar2.a) {
                                    dheVar.a();
                                    acsdVar2 = new acsd(acraVar2, ajdsVar2.a);
                                } else {
                                    acsdVar2 = null;
                                }
                                a3.b(true);
                                a3.k = acsdVar2;
                                return sqqVar.b(dheVar, a3.a(), ajdsVar2, ajgg.w(acraVar2), ayqwVar3);
                            }
                        };
                        tac a3 = tae.a(dpjVar);
                        a3.e(szoVar);
                        a3.S(100.0f / i);
                        a3.L(YogaEdge.END, i3);
                        a2.g(a3.a().j());
                    } else {
                        dgt a4 = dgu.a(dpjVar);
                        a4.S(100.0f / i);
                        a4.L(YogaEdge.END, i3);
                        a2.g(a4.a);
                    }
                    i2++;
                }
                if (ayqwVar != null) {
                    ayqwVar.d(ayqwVar2);
                }
                return new szt().a(a2.a, ayqwVar2);
            }
            return dsj.a;
        }
        final ajds ajdsVar2 = (ajds) obj;
        final ayqw ayqwVar3 = new ayqw();
        final int a5 = this.g.a();
        sxv sxvVar = new sxv(String.valueOf(a5));
        if (this.q) {
            acra acraVar2 = this.b;
            this.a.a();
            acsdVar = new acsd(acraVar2, ajdsVar2.a);
        } else {
            acsdVar = null;
        }
        szo szoVar2 = new szo() { // from class: ajzu
            @Override // defpackage.szo
            public final dha a(dhe dheVar, sxc sxcVar) {
                ajzv ajzvVar = ajzv.this;
                int i4 = a5;
                ajds ajdsVar3 = ajdsVar2;
                syg sygVar = acsdVar;
                ayqw ayqwVar4 = ayqwVar3;
                sqq sqqVar = ajzvVar.n;
                dpj dpjVar2 = ajzvVar.a;
                sxb e = sxcVar.e();
                e.d = ajzvVar.g.c(i4);
                e.c(ajzvVar.j);
                e.r = ajzvVar.m;
                e.g = ajzvVar.k;
                boolean z2 = ajzvVar.i;
                e.e(z2);
                if (z2) {
                    e.f = new ConcurrentHashMap();
                }
                e.q = new AtomicReference(ajzvVar.f);
                e.l = amru.r(ahbl.i(ajdsVar3));
                sya a6 = syb.a(ajzvVar.n.a);
                a6.e = ajzvVar.l;
                a6.b(ajzvVar.c);
                a6.d = sygVar;
                syo syoVar = new syo(ajzvVar.e);
                boolean z3 = true;
                if (!ajzvVar.d && !ajdsVar3.b().g) {
                    z3 = false;
                }
                syoVar.c(z3);
                a6.f = syoVar.a();
                e.p = a6.a();
                return sqqVar.b(dpjVar2, e.a(), ajdsVar3, ajgg.w(ajzvVar.b), ayqwVar4);
            }
        };
        if (this.s) {
            dpj dpjVar2 = this.a;
            ajzl ajzlVar = new ajzl();
            ajzl.d(ajzlVar, dpjVar2, new ajzn());
            ajzlVar.a.a = szoVar2;
            ajzlVar.d.set(0);
            a = ajzlVar.a();
        } else {
            tac a6 = tae.a(this.a);
            a6.e(szoVar2);
            a = a6.a();
        }
        ayqw ayqwVar4 = this.h;
        if (ayqwVar4 != null) {
            ayqwVar4.d(ayqwVar3);
        }
        amsj amsjVar = new amsj((char[]) null, (char[]) null);
        amsjVar.w(sxv.class, sxvVar);
        szt sztVar = new szt();
        sztVar.a = amsjVar;
        return sztVar.a(a, ayqwVar3);
    }

    @Override // defpackage.js
    public final void c() {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList(this.p.b());
        int b = this.p.b();
        for (int i = 0; i < b; i++) {
            arrayList2.add(l(this.p.getItem(i)));
        }
        dsx dsxVar = this.o;
        synchronized (dsxVar) {
            if (dsxVar.z) {
                throw new RuntimeException("Trying to do a sync replaceAll when using asynchronous mutations!");
            }
            arrayList = new ArrayList();
            int size = dsxVar.b.size();
            int size2 = arrayList2.size();
            if (size > size2) {
                while (true) {
                    size--;
                    if (size < size2) {
                        break;
                    } else {
                        arrayList.add((dqx) dsxVar.b.remove(size));
                    }
                }
            }
            for (int i2 = 0; i2 < size2; i2++) {
                dte dteVar = (dte) arrayList2.get(i2);
                if (i2 >= dsxVar.b.size()) {
                    dsxVar.b.add(i2, dsxVar.p(dteVar));
                } else {
                    dqx dqxVar = (dqx) dsxVar.b.get(i2);
                    if (!dqxVar.d().k() || !dteVar.k()) {
                        arrayList.add(dqxVar);
                        dsxVar.b.set(i2, dsxVar.p(dteVar));
                    } else {
                        dqxVar.n(dteVar);
                    }
                }
                dsxVar.F.a(dteVar);
            }
        }
        dsxVar.e.mw();
        dsxVar.D.c(true);
        dsxVar.E(arrayList);
        this.o.P(true, null);
    }

    @Override // defpackage.js
    public final void d(int i, int i2) {
        ArrayList arrayList = new ArrayList(i2);
        int i3 = i2 + i;
        for (int i4 = i; i4 < i3; i4++) {
            arrayList.add(l(this.p.getItem(i4)));
        }
        this.o.M(i, arrayList);
        this.o.P(true, null);
    }

    @Override // defpackage.js
    public final void f(int i, int i2) {
        ArrayList arrayList = new ArrayList(i2);
        int i3 = i2 + i;
        for (int i4 = i; i4 < i3; i4++) {
            arrayList.add(l(this.p.getItem(i4)));
        }
        this.o.w(i, arrayList);
        this.o.P(true, null);
    }

    @Override // defpackage.js
    public final void g(int i, int i2) {
        this.o.I(i, i2);
        this.o.P(true, null);
    }

    @Override // defpackage.js
    public final void h(int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i >= i2) {
            this.o.D(i, i2);
        } else {
            this.o.D(i, i2);
        }
        this.o.P(true, null);
    }
}

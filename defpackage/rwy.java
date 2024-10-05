package defpackage;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class rwy implements rwz {
    private int a;
    private List b;
    private List c;
    private float[] d;
    private rze e;
    private List f;
    private float[] g;
    private List h;
    private float[] i;
    private rze j;
    private int[] k;
    private final Map l = rwh.t();

    @Override // defpackage.rwz
    public final void B() {
    }

    @Override // defpackage.rwz
    public final void C() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final rxa f() {
        if (this.e == null) {
            return null;
        }
        List list = this.b;
        int i = this.a;
        return new rxa(list, i, new rxi(this.c, this.d, i), this.e.h(), new rxi(this.f, this.g, this.a), new rxi(this.h, this.i, this.a), this.j.h());
    }

    @Override // defpackage.rwz
    public final void g(float f) {
    }

    @Override // defpackage.rwz
    public final float h(int i) {
        sbt.f(i, this.a);
        return this.d[i];
    }

    @Override // defpackage.rwz
    public final float i(int i) {
        sbt.f(i, this.a);
        return this.i[i];
    }

    @Override // defpackage.rwz
    public final float j(int i) {
        sbt.f(i, this.a);
        return this.g[i];
    }

    @Override // defpackage.rwz
    public final int k(int i) {
        sbt.f(i, this.a);
        return this.k[i];
    }

    @Override // defpackage.rwz
    public final int l() {
        return this.a;
    }

    @Override // defpackage.rwz
    public final int m(Object obj) {
        return ((Integer) this.l.get(obj)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final rxc n() {
        return new rxc(this.k, this.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void o(rxc rxcVar) {
        this.k = rxcVar.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void p(rxa rxaVar) {
        this.a = rxaVar.b;
        this.b = rxaVar.a;
        rxi rxiVar = rxaVar.c;
        this.c = rxiVar.a;
        this.d = rxiVar.b;
        this.e = rxaVar.d;
        rxi rxiVar2 = rxaVar.e;
        this.f = rxiVar2.a;
        this.g = rxiVar2.b;
        rxi rxiVar3 = rxaVar.f;
        this.h = rxiVar3.a;
        this.i = rxiVar3.b;
        this.j = rxaVar.g;
    }

    @Override // defpackage.rwz
    public final Double r(int i) {
        sbt.f(i, this.a);
        return (Double) this.f.get(i);
    }

    @Override // defpackage.rwz
    public final Object s(int i) {
        sbt.f(i, this.a);
        return this.b.get(i);
    }

    @Override // defpackage.rwz
    public final Object t(int i) {
        sbt.f(i, this.a);
        return this.c.get(i);
    }

    @Override // defpackage.rwz
    public final Set u(ryv ryvVar) {
        HashSet q = rwh.q(this.a);
        for (int i = 0; i < this.a; i++) {
            if (((Float) ryvVar.a).floatValue() <= this.d[i] && ((Float) ryvVar.b).floatValue() >= this.d[i]) {
                q.add(this.c.get(i));
            }
        }
        return q;
    }

    @Override // defpackage.rwz
    public final void x(rze rzeVar, rze rzeVar2, saw sawVar, sba sbaVar) {
        int a = sbaVar.a();
        float[] fArr = this.d;
        if (fArr == null || a > fArr.length) {
            this.b = rwh.z(a);
            this.c = rwh.z(a);
            this.d = new float[a];
            this.f = rwh.z(a);
            this.g = new float[a];
            this.h = rwh.z(a);
            this.i = new float[a];
            this.k = new int[a];
        } else {
            this.b.clear();
            this.c.clear();
            this.f.clear();
            this.h.clear();
            this.l.clear();
        }
        this.e = rzeVar;
        this.j = rzeVar2;
        saw c = sbaVar.c(sax.a);
        saw d = sbaVar.d(sax.b, Double.valueOf(0.0d));
        saw d2 = sbaVar.d(sax.e, -16777216);
        this.a = 0;
        for (Object obj : sbaVar.a) {
            this.b.add(obj);
            Object a2 = sawVar.a(obj, this.a, sbaVar);
            this.c.add(a2);
            this.d[this.a] = rzeVar.a(a2);
            this.l.put(a2, Integer.valueOf(this.a));
            Double d3 = (Double) c.a(obj, this.a, sbaVar);
            Double d4 = (Double) d.a(obj, this.a, sbaVar);
            this.f.add(d3);
            this.g[this.a] = rzeVar2.b(d3, d4);
            this.h.add(d4);
            this.i[this.a] = rzeVar2.a(d4);
            int[] iArr = this.k;
            int i = this.a;
            iArr[i] = ((Integer) d2.a(obj, i, sbaVar)).intValue();
            this.a++;
        }
    }
}

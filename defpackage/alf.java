package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class alf implements akq {
    public static final ale a = new akw();
    public static final ale b = new akx();
    public static final ale c = new aky();
    public static final ale d = new akz();
    public static final ale e = new ala();
    public static final ale f = new aku();
    public float g;
    float h;
    boolean i;
    final Object j;
    final alg k;
    public boolean l;
    public final float m;
    private long n;
    private final ArrayList o;
    private final ArrayList p;
    private akt q;

    public alf(hiq hiqVar, byte[] bArr) {
        this.g = 0.0f;
        this.h = Float.MAX_VALUE;
        this.i = false;
        this.l = false;
        this.n = 0L;
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.j = null;
        this.k = new akv(hiqVar, null);
        this.m = 1.0f;
    }

    private static void i(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    @Override // defpackage.akq
    public final void a(long j) {
        long j2 = this.n;
        this.n = j;
        if (j2 == 0) {
            d(this.h);
            return;
        }
        boolean e2 = e(j - j2);
        float min = Math.min(this.h, Float.MAX_VALUE);
        this.h = min;
        float max = Math.max(min, -3.4028235E38f);
        this.h = max;
        d(max);
        if (e2) {
            c(false);
        }
    }

    public final akt b() {
        if (this.q == null) {
            if (akt.a.get() == null) {
                akt.a.set(new akt(new aks()));
            }
            this.q = (akt) akt.a.get();
        }
        return this.q;
    }

    public final void c(boolean z) {
        this.l = false;
        akt b2 = b();
        b2.b.remove(this);
        int indexOf = b2.c.indexOf(this);
        if (indexOf >= 0) {
            b2.c.set(indexOf, null);
            b2.g = true;
        }
        this.n = 0L;
        this.i = false;
        for (int i = 0; i < this.o.size(); i++) {
            if (this.o.get(i) != null) {
                ((alc) this.o.get(i)).a(z);
            }
        }
        i(this.o);
    }

    final void d(float f2) {
        this.k.b(this.j, f2);
        for (int i = 0; i < this.p.size(); i++) {
            if (this.p.get(i) != null) {
                ((ald) this.p.get(i)).a(this.h);
            }
        }
        i(this.p);
    }

    public abstract boolean e(long j);

    public final void f(alc alcVar) {
        if (this.o.contains(alcVar)) {
            return;
        }
        this.o.add(alcVar);
    }

    public final void g(ald aldVar) {
        if (this.l) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (this.p.contains(aldVar)) {
            return;
        }
        this.p.add(aldVar);
    }

    public final void h(float f2) {
        this.h = f2;
        this.i = true;
    }

    public alf(Object obj, alg algVar) {
        this.g = 0.0f;
        this.h = Float.MAX_VALUE;
        this.i = false;
        this.l = false;
        this.n = 0L;
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.j = obj;
        this.k = algVar;
        this.m = (algVar == c || algVar == d || algVar == e) ? 0.1f : algVar == f ? 0.00390625f : (algVar == a || algVar == b) ? 0.002f : 1.0f;
    }
}

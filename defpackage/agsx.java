package defpackage;

import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agsx {
    private final agng a;
    private final HashSet b;
    private volatile agnh c;
    private volatile int d;
    private volatile int e;
    private volatile int f;
    private volatile int g;
    private volatile int h;
    private volatile int i;
    private volatile boolean j;
    private final akgl k;

    public agsx(akgl akglVar, agng agngVar, byte[] bArr) {
        this.k = akglVar;
        this.a = agngVar;
        this.b = new HashSet(agngVar.f);
    }

    public final synchronized int a() {
        return this.b.size();
    }

    public final synchronized int b() {
        return this.g;
    }

    public final agnh c() {
        if (this.c == null) {
            this.c = new agnh(this.a, a(), b(), this.i, this.d, this.e, this.f, this.j);
        }
        return this.c;
    }

    public final synchronized HashSet d() {
        return this.b;
    }

    public final synchronized void e(String str) {
        zhq.m(str);
        this.b.add(str);
        this.k.n(str, this.a.a);
    }

    public final synchronized void f() {
        this.d = 0;
        this.e = 0;
        this.f = 0;
    }

    public final synchronized void g() {
        this.j = false;
        this.i = 0;
    }

    public final synchronized void h(int i) {
        this.g = i;
    }

    public final synchronized boolean i(String str) {
        boolean z;
        if (this.b.remove(str)) {
            this.k.p(str, this.a.a);
            int i = this.a.f;
            if (i > 0) {
                this.h = i - this.b.size();
                this.d = this.e;
                this.e = (this.h * 100) / this.a.f;
            }
            this.c = null;
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final synchronized boolean j(agnz agnzVar) {
        String t = agtw.t(agnzVar.f);
        int i = 0;
        if (!this.b.contains(t)) {
            return false;
        }
        if (!agnzVar.c()) {
            this.b.remove(t);
            this.k.p(t, this.a.a);
            if (agnzVar.b == avjo.TRANSFER_STATE_FAILED) {
                this.j = true;
                this.i++;
            }
        }
        int i2 = this.a.f;
        if (i2 > 0) {
            int size = i2 - this.b.size();
            int i3 = this.a.f;
            if (size == i3) {
                this.d = this.e;
                this.e = 100;
            } else {
                int i4 = (size * 100) / i3;
                if (agnzVar.c()) {
                    i4 += agnzVar.a() / this.a.f;
                }
                if (i4 == 0) {
                    i4 = agnzVar.d > 0 ? 1 : 0;
                }
                int min = Math.min(99, i4);
                if (min > this.e) {
                    this.d = this.e;
                    this.e = min;
                }
            }
            this.h = size;
        }
        int i5 = this.a.f - this.g;
        if (i5 > 0) {
            int size2 = i5 - this.b.size();
            if (size2 == i5) {
                this.f = 100;
            } else {
                int i6 = (size2 * 100) / i5;
                if (agnzVar.c()) {
                    i6 += agnzVar.a() / i5;
                }
                if (i6 != 0) {
                    i = i6;
                } else if (agnzVar.d > 0) {
                    i = 1;
                }
                int min2 = Math.min(99, i);
                if (min2 > this.f) {
                    this.f = min2;
                }
            }
            this.h = size2 + this.g;
        }
        this.c = null;
        return true;
    }
}

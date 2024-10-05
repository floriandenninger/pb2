package defpackage;

import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aghm {
    private final HashSet a;
    private volatile agnr b;
    private volatile int c;
    private volatile int d = 0;
    private volatile int e;
    private volatile int f;
    private final bagd g;
    private final akgl h;

    public aghm(akgl akglVar, bagd bagdVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.h = akglVar;
        this.g = bagdVar;
        this.a = new HashSet(bagdVar.c);
    }

    final synchronized int a() {
        return this.a.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final agnr b() {
        if (this.b == null) {
            this.b = new agnr(a(), this.c);
        }
        return this.b;
    }

    public final synchronized void c(String str) {
        zhq.m(str);
        this.a.add(str);
        this.h.s(str, this.g.a);
        this.d++;
    }

    public final synchronized void d() {
        this.c = 0;
    }

    public final synchronized void e() {
        this.f = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f(agnz agnzVar) {
        String t = agtw.t(agnzVar.f);
        if (this.a.remove(t)) {
            this.h.t(t, this.g.a);
            if (this.d > 0) {
                this.e = this.d - this.a.size();
                this.c = (this.e * 100) / this.d;
            }
            this.d--;
            this.b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void g(agnz agnzVar) {
        String t = agtw.t(agnzVar.f);
        if (this.a.contains(t)) {
            int i = 1;
            if (!agnzVar.c()) {
                this.a.remove(t);
                this.h.t(t, this.g.a);
                if (agnzVar.b == avjo.TRANSFER_STATE_FAILED) {
                    this.f++;
                }
            }
            if (this.d > 0) {
                int size = this.d - this.a.size();
                if (size == this.d) {
                    this.c = 100;
                } else {
                    int i2 = (size * 100) / this.d;
                    if (agnzVar.c()) {
                        i2 += agnzVar.a() / this.d;
                    }
                    if (i2 != 0) {
                        i = i2;
                    } else if (agnzVar.d <= 0) {
                        i = 0;
                    }
                    int min = Math.min(99, i);
                    if (min > this.c) {
                        this.c = min;
                    }
                }
                this.e = size;
            }
            this.b = null;
        }
    }
}

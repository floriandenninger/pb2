package defpackage;

import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akej {
    public String a;
    public String b;
    public Integer c;
    public Integer d;
    public List e;
    public Integer f;
    public Integer g;
    public Integer h;
    public Integer i;
    public Boolean j;
    public Integer k;
    public Set l;
    public Integer m;
    public Integer n;
    public String o;
    public String p;
    public int q;

    public final void a(int i) {
        this.c = Integer.valueOf(i);
    }

    public final void b(int i) {
        this.f = Integer.valueOf(i);
    }

    public final void c(int i) {
        this.g = Integer.valueOf(i);
    }

    public final void d(Set set) {
        if (set == null) {
            throw new NullPointerException("Null inputMethods");
        }
        this.l = set;
    }

    public final void e(int i) {
        this.h = Integer.valueOf(i);
    }

    public final void f(int i) {
        this.d = Integer.valueOf(i);
    }

    public final void g(int i) {
        this.m = Integer.valueOf(i);
    }

    public final void h(int i) {
        this.k = Integer.valueOf(i);
    }

    public final void i(int i) {
        this.i = Integer.valueOf(i);
    }

    public final void j(int i) {
        this.n = Integer.valueOf(i);
    }

    public final void k(boolean z) {
        this.j = Boolean.valueOf(z);
    }

    public final void l(int i) {
        if (i == 0) {
            throw new NullPointerException("Null searchMethod");
        }
        this.q = i;
    }
}

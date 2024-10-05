package defpackage;

import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class balg extends balk {
    final bajh a;
    final bajn b;
    final bajp c;
    final boolean d;
    final bajp e;
    final bajp f;

    public balg(bajh bajhVar, bajn bajnVar, bajp bajpVar, bajp bajpVar2, bajp bajpVar3) {
        super(bajhVar.o());
        if (bajhVar.t()) {
            this.a = bajhVar;
            this.b = bajnVar;
            this.c = bajpVar;
            this.d = bali.P(bajpVar);
            this.e = bajpVar2;
            this.f = bajpVar3;
            return;
        }
        throw new IllegalArgumentException();
    }

    private final int v(long j) {
        int a = this.b.a(j);
        long j2 = a;
        if (((j + j2) ^ j) >= 0 || (j ^ j2) < 0) {
            return a;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    @Override // defpackage.balk, defpackage.bajh
    public final int a(long j) {
        return this.a.a(this.b.d(j));
    }

    @Override // defpackage.balk, defpackage.bajh
    public final int b(Locale locale) {
        return this.a.b(locale);
    }

    @Override // defpackage.balk, defpackage.bajh
    public final int c() {
        return this.a.c();
    }

    @Override // defpackage.bajh
    public final int d() {
        return this.a.d();
    }

    @Override // defpackage.balk, defpackage.bajh
    public final long e(long j, int i) {
        if (this.d) {
            long v = v(j);
            return this.a.e(j + v, i) - v;
        }
        return this.b.n(this.a.e(this.b.d(j), i), j);
    }

    @Override // defpackage.balk, defpackage.bajh
    public final long f(long j) {
        return this.a.f(this.b.d(j));
    }

    @Override // defpackage.balk, defpackage.bajh
    public final long g(long j) {
        if (this.d) {
            long v = v(j);
            return this.a.g(j + v) - v;
        }
        return this.b.n(this.a.g(this.b.d(j)), j);
    }

    @Override // defpackage.balk, defpackage.bajh
    public final long h(long j, int i) {
        long h = this.a.h(this.b.d(j), i);
        long n = this.b.n(h, j);
        if (a(n) == i) {
            return n;
        }
        bajt bajtVar = new bajt(h, this.b.c);
        bajs bajsVar = new bajs(this.a.o(), Integer.valueOf(i), bajtVar.getMessage());
        bajsVar.initCause(bajtVar);
        throw bajsVar;
    }

    @Override // defpackage.balk, defpackage.bajh
    public final long i(long j, String str, Locale locale) {
        return this.b.n(this.a.i(this.b.d(j), str, locale), j);
    }

    @Override // defpackage.balk, defpackage.bajh
    public final String j(int i, Locale locale) {
        return this.a.j(i, locale);
    }

    @Override // defpackage.balk, defpackage.bajh
    public final String k(long j, Locale locale) {
        return this.a.k(this.b.d(j), locale);
    }

    @Override // defpackage.balk, defpackage.bajh
    public final String l(int i, Locale locale) {
        return this.a.l(i, locale);
    }

    @Override // defpackage.balk, defpackage.bajh
    public final String m(long j, Locale locale) {
        return this.a.m(this.b.d(j), locale);
    }

    @Override // defpackage.balk, defpackage.bajh
    public final bajp p() {
        return this.c;
    }

    @Override // defpackage.balk, defpackage.bajh
    public final bajp q() {
        return this.f;
    }

    @Override // defpackage.bajh
    public final bajp r() {
        return this.e;
    }

    @Override // defpackage.balk, defpackage.bajh
    public final boolean s(long j) {
        return this.a.s(this.b.d(j));
    }
}

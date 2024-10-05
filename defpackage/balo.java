package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class balo extends balm {
    final int a;
    final bajp c;
    private final int d;
    private final int e;

    public balo(bajh bajhVar, bajj bajjVar) {
        super(bajhVar, bajjVar);
        bajp p = bajhVar.p();
        if (p == null) {
            this.c = null;
        } else {
            this.c = new balx(p, ((baji) bajjVar).a);
        }
        this.a = 100;
        int d = bajhVar.d();
        int i = d >= 0 ? d / 100 : ((d + 1) / 100) - 1;
        int c = bajhVar.c();
        int i2 = c >= 0 ? c / 100 : ((c + 1) / 100) - 1;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.balm, defpackage.balk, defpackage.bajh
    public final int a(long j) {
        int a = this.b.a(j);
        return a >= 0 ? a / 100 : ((a + 1) / 100) - 1;
    }

    @Override // defpackage.balm, defpackage.balk, defpackage.bajh
    public final int c() {
        return this.e;
    }

    @Override // defpackage.balm, defpackage.bajh
    public final int d() {
        return this.d;
    }

    @Override // defpackage.balk, defpackage.bajh
    public final long e(long j, int i) {
        return this.b.e(j, i * 100);
    }

    @Override // defpackage.balk, defpackage.bajh
    public final long f(long j) {
        return h(j, a(this.b.f(j)));
    }

    @Override // defpackage.balm, defpackage.balk, defpackage.bajh
    public final long g(long j) {
        bajh bajhVar = this.b;
        return bajhVar.g(bajhVar.h(j, a(j) * 100));
    }

    @Override // defpackage.balm, defpackage.balk, defpackage.bajh
    public final long h(long j, int i) {
        aynu.A(this, i, this.d, this.e);
        int a = this.b.a(j);
        return this.b.h(j, (i * 100) + (a >= 0 ? a % 100 : ((a + 1) % 100) + 99));
    }

    @Override // defpackage.balm, defpackage.balk, defpackage.bajh
    public final bajp p() {
        return this.c;
    }
}

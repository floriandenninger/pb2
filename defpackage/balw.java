package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class balw extends balm {
    final bajp a;

    public balw(bajh bajhVar, bajj bajjVar) {
        super(bajhVar, bajjVar);
        bajp p = bajhVar.p();
        if (p == null) {
            this.a = null;
        } else {
            this.a = new balx(p, ((baji) bajjVar).b);
        }
    }

    @Override // defpackage.balm, defpackage.balk, defpackage.bajh
    public final int a(long j) {
        int a = this.b.a(j);
        return a >= 0 ? a % 100 : ((a + 1) % 100) + 99;
    }

    @Override // defpackage.balm, defpackage.balk, defpackage.bajh
    public final int c() {
        return 99;
    }

    @Override // defpackage.balm, defpackage.bajh
    public final int d() {
        return 0;
    }

    @Override // defpackage.balk, defpackage.bajh
    public final long f(long j) {
        return this.b.f(j);
    }

    @Override // defpackage.balm, defpackage.balk, defpackage.bajh
    public final long g(long j) {
        return this.b.g(j);
    }

    @Override // defpackage.balm, defpackage.balk, defpackage.bajh
    public final long h(long j, int i) {
        aynu.A(this, i, 0, 99);
        int a = this.b.a(j);
        return this.b.h(j, ((a >= 0 ? a / 100 : ((a + 1) / 100) - 1) * 100) + i);
    }

    @Override // defpackage.balm, defpackage.bajh
    public final bajp r() {
        return this.a;
    }

    public balw(balo baloVar, bajj bajjVar) {
        super(baloVar.b, bajjVar);
        int i = baloVar.a;
        this.a = baloVar.c;
    }
}

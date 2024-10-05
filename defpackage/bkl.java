package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bkl {
    public final int a;
    public int b;
    public int c;
    public long d;
    private final boolean e;
    private final pth f;
    private final pth g;
    private int h;
    private int i;

    public bkl(pth pthVar, pth pthVar2, boolean z) {
        this.g = pthVar;
        this.f = pthVar2;
        this.e = z;
        pthVar2.G(12);
        this.a = pthVar2.l();
        pthVar.G(12);
        this.i = pthVar.l();
        bfa.c(pthVar.d() == 1, "first_chunk must be 1");
        this.b = -1;
    }

    public final boolean a() {
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        this.d = this.e ? this.f.q() : this.f.p();
        if (this.b == this.h) {
            this.c = this.g.l();
            this.g.H(4);
            int i2 = this.i - 1;
            this.i = i2;
            this.h = i2 > 0 ? (-1) + this.g.l() : -1;
        }
        return true;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bju implements bik {
    public final long a;
    private final bik b;

    public bju(long j, bik bikVar) {
        this.a = j;
        this.b = bikVar;
    }

    @Override // defpackage.bik
    public final bjc n(int i, int i2) {
        return this.b.n(i, i2);
    }

    @Override // defpackage.bik
    public final void q() {
        this.b.q();
    }

    @Override // defpackage.bik
    public final void w(biz bizVar) {
        this.b.w(new bjt(this, bizVar));
    }
}

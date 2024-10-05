package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajwg implements ajnf {
    public int a;
    private final ajng b;

    public ajwg(ajng ajngVar) {
        this.b = ajngVar;
    }

    private final void g(int i) {
        if (i < this.a) {
            this.a = i;
        }
    }

    @Override // defpackage.yoq
    public final void d(int i, int i2) {
        g(i);
    }

    @Override // defpackage.yoq
    public final void e(int i, int i2) {
        g(Math.min(i, i2));
    }

    public final void f() {
        this.a = this.b.a();
    }

    @Override // defpackage.ajnf
    public final void pc() {
        f();
    }

    @Override // defpackage.yoq
    public final void pd(int i, int i2) {
        g(i);
    }

    @Override // defpackage.yoq
    public final void pe(int i, int i2) {
        g(i);
    }
}

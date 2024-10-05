package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ogp extends ajmx implements ajnf {
    final /* synthetic */ ogq a;
    private final ajoc b;

    public ogp(ogq ogqVar, ajoc ajocVar) {
        this.a = ogqVar;
        this.b = ajocVar;
        ajocVar.lX(this);
    }

    private final void h(int i, int i2) {
        int j = this.b.j(this.a.a.lC());
        int i3 = (i + i2) - 1;
        for (int max = j == -1 ? Integer.MAX_VALUE : Math.max(i, j + this.a.a.lC().a()); max <= i3; max++) {
            this.a.b.add(this.b.c(max));
        }
    }

    @Override // defpackage.ajng
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.ajng
    public final long b(int i) {
        return this.b.b(i);
    }

    @Override // defpackage.ajng
    public final Object c(int i) {
        return this.b.c(i);
    }

    @Override // defpackage.ajng
    public final boolean contains(Object obj) {
        throw null;
    }

    @Override // defpackage.yoq
    public final void d(int i, int i2) {
        z(i, i2);
    }

    @Override // defpackage.yoq
    public final void e(int i, int i2) {
        A(i, i2);
    }

    @Override // defpackage.ajng
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // defpackage.ajmx, defpackage.ajng
    public final void mK(ajol ajolVar) {
        this.b.mK(ajolVar);
    }

    @Override // defpackage.ajmx, defpackage.ajng
    public final void mL(ajok ajokVar, int i) {
        this.b.mL(ajokVar, i);
    }

    @Override // defpackage.ajnf
    public final void pc() {
        h(0, this.b.a());
        v();
    }

    @Override // defpackage.yoq
    public final void pd(int i, int i2) {
        h(i, i2);
        x(i, i2);
    }

    @Override // defpackage.yoq
    public final void pe(int i, int i2) {
        h(i, i2);
        y(i, i2);
    }
}

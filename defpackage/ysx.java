package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ysx implements ysw {
    private final shf b;
    private int c = 0;
    private long d = 0;

    public ysx(shf shfVar) {
        this.b = shfVar;
    }

    @Override // defpackage.ysw
    public final synchronized long a() {
        return this.c > 0 ? -1L : this.b.d() - this.d;
    }

    @Override // defpackage.ysw
    public final synchronized void b() {
        this.c--;
        this.d = this.b.d();
    }

    @Override // defpackage.ysw
    public final synchronized void c() {
        this.c++;
    }
}

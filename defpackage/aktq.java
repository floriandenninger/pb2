package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aktq implements azrw {
    private final ynx a;
    private volatile avdy b;

    public aktq(ynx ynxVar) {
        this.a = ynxVar;
    }

    private final synchronized avdy b() {
        if (this.b == null) {
            this.b = this.a.e();
        }
        return this.b;
    }

    @Override // defpackage.azrw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final avdy get() {
        return this.b != null ? this.b : b();
    }
}

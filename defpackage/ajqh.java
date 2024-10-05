package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ajqh extends ajqf implements ajpy {
    public ajpx a;

    protected abstract boolean c();

    protected abstract boolean d(ajpv ajpvVar);

    @Override // defpackage.ajpy
    public final boolean e(ajpx ajpxVar) {
        this.a = ajpxVar;
        return c();
    }

    @Override // defpackage.ajpy
    public final boolean f(ajpv ajpvVar) {
        boolean d = d(ajpvVar);
        if (d) {
            this.a = this.a.b(ajpvVar);
        }
        return d;
    }
}

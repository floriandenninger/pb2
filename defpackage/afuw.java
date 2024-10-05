package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afuw implements afvq {
    public final amtt a = new amwp(ampf.u());
    private final afvq b;

    public afuw(afvq afvqVar) {
        this.b = afvqVar;
    }

    @Override // defpackage.afvq
    public final void c(Object obj, ykl yklVar) {
        synchronized (this.a) {
            if (this.a.o(obj)) {
                this.a.p(obj, yklVar);
            } else {
                this.a.p(obj, yklVar);
                this.b.c(obj, new afuv(this));
            }
        }
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class aywk extends aywe {
    private static final long serialVersionUID = 4127754106204442833L;

    public aywk(banw banwVar) {
        super(banwVar);
    }

    @Override // defpackage.aypm
    public final void d(Object obj) {
        if (j()) {
            return;
        }
        if (obj == null) {
            c(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        } else if (get() != 0) {
            this.a.c(obj);
            ayeq.n(this, 1L);
        } else {
            l();
        }
    }

    public abstract void l();
}

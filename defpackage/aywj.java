package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aywj extends aywe {
    private static final long serialVersionUID = 3776720187248809713L;

    public aywj(banw banwVar) {
        super(banwVar);
    }

    @Override // defpackage.aypm
    public final void d(Object obj) {
        long j;
        if (j()) {
            return;
        }
        if (obj != null) {
            this.a.c(obj);
            do {
                j = get();
                if (j == 0) {
                    return;
                }
            } while (!compareAndSet(j, (-1) + j));
            return;
        }
        c(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
    }
}

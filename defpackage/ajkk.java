package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajkk implements axqr {
    private final azrw a;

    public ajkk(azrw azrwVar) {
        this.a = azrwVar;
    }

    public static ajkk a(azrw azrwVar) {
        return new ajkk(azrwVar);
    }

    public static apdb c(ynx ynxVar) {
        apdb c = ynxVar.c();
        ayaw.k(c);
        return c;
    }

    @Override // defpackage.azrw
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final apdb get() {
        return c((ynx) this.a.get());
    }
}

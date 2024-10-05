package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aekw implements axqr {
    private final azrw a;

    public aekw(azrw azrwVar) {
        this.a = azrwVar;
    }

    public static aekw a(azrw azrwVar) {
        return new aekw(azrwVar);
    }

    public static aekv c(ammv ammvVar) {
        return (aekv) ammvVar.e(aekv.a);
    }

    @Override // defpackage.azrw
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final aekv get() {
        return c((ammv) ((axqs) this.a).a);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class airj implements axqr {
    private final azrw a;

    public airj(azrw azrwVar) {
        this.a = azrwVar;
    }

    public static airj b(azrw azrwVar) {
        return new airj(azrwVar);
    }

    public static airi c(tcu tcuVar) {
        return new airi(tcuVar);
    }

    @Override // defpackage.azrw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final airi get() {
        return c((tcu) this.a.get());
    }
}

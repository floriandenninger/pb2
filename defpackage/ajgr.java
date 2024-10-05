package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajgr implements axqr {
    private final azrw a;
    private final azrw b;

    public ajgr(azrw azrwVar, azrw azrwVar2) {
        this.a = azrwVar;
        this.b = azrwVar2;
    }

    public static ajgr b(azrw azrwVar, azrw azrwVar2) {
        return new ajgr(azrwVar, azrwVar2);
    }

    public static ajgp c(aadw aadwVar) {
        return new ajgp(aadwVar);
    }

    @Override // defpackage.azrw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ajgp get() {
        aadw aadwVar = (aadw) this.a.get();
        return c(aadwVar);
    }
}

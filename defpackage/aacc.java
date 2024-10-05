package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aacc implements axqr {
    private final azrw a;
    private final azrw b;

    public aacc(azrw azrwVar, azrw azrwVar2) {
        this.a = azrwVar;
        this.b = azrwVar2;
    }

    public static aacc b(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new aacc(azrwVar, azrwVar3);
    }

    public static ysl c(aabx aabxVar, azrw azrwVar) {
        boolean z = aabxVar.f;
        ysl yslVar = (ysl) azrwVar.get();
        ayaw.k(yslVar);
        return yslVar;
    }

    @Override // defpackage.azrw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ysl get() {
        return c((aabx) ((axqs) this.a).a, this.b);
    }
}

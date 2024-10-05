package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiok implements axqr {
    private final azrw a;

    public aiok(azrw azrwVar) {
        this.a = azrwVar;
    }

    public static aiok a(azrw azrwVar) {
        return new aiok(azrwVar);
    }

    public static ahbg c(ahbh ahbhVar) {
        ahbg ahbgVar = ahbhVar.i;
        ayaw.k(ahbgVar);
        return ahbgVar;
    }

    @Override // defpackage.azrw
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ahbg get() {
        return c((ahbh) this.a.get());
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahzl implements axqr {
    private final azrw a;
    private final azrw b;

    public ahzl(azrw azrwVar, azrw azrwVar2) {
        this.a = azrwVar;
        this.b = azrwVar2;
    }

    public static ahzl a(azrw azrwVar, azrw azrwVar2) {
        return new ahzl(azrwVar, azrwVar2);
    }

    @Override // defpackage.azrw
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final akpq get() {
        return new akpq(this.a, this.b, (char[]) null, (byte[]) null);
    }
}

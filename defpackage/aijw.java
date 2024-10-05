package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aijw implements axqr {
    private final azrw a;
    private final azrw b;

    public aijw(azrw azrwVar, azrw azrwVar2) {
        this.a = azrwVar;
        this.b = azrwVar2;
    }

    public static aijw a(azrw azrwVar, azrw azrwVar2) {
        return new aijw(azrwVar, azrwVar2);
    }

    @Override // defpackage.azrw
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final akpq get() {
        return new akpq(this.a, this.b, (short[]) null);
    }
}

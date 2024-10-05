package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aidp implements axqr {
    private final azrw a;
    private final azrw b;

    public aidp(azrw azrwVar, azrw azrwVar2) {
        this.a = azrwVar;
        this.b = azrwVar2;
    }

    public static aidp a(azrw azrwVar, azrw azrwVar2) {
        return new aidp(azrwVar, azrwVar2);
    }

    @Override // defpackage.azrw
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final akpq get() {
        return new akpq(this.a, this.b, (byte[]) null, (char[]) null);
    }
}

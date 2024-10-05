package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aacb implements axqr {
    private final azrw a;
    private final azrw b;

    public aacb(azrw azrwVar, azrw azrwVar2) {
        this.a = azrwVar;
        this.b = azrwVar2;
    }

    public static aacb a(azrw azrwVar, azrw azrwVar2) {
        return new aacb(azrwVar, azrwVar2);
    }

    public static aapw c(azrw azrwVar, ynn ynnVar) {
        return new aapw(new aaeh(0), azrwVar, ynnVar, 4);
    }

    @Override // defpackage.azrw
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final aapw get() {
        return c(this.a, (ynn) this.b.get());
    }
}

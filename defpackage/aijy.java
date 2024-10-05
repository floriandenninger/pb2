package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aijy implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;

    public aijy(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
    }

    public static aijy a(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new aijy(azrwVar, azrwVar2, azrwVar3);
    }

    @Override // defpackage.azrw
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ajyw get() {
        return new ajyw(this.a, this.b, this.c, (char[]) null, (byte[]) null);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wpa implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final azrw e;

    public wpa(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
        this.e = azrwVar5;
    }

    public static woz b(azrw azrwVar, aifw aifwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new woz(azrwVar, aifwVar, azrwVar2, azrwVar3, azrwVar4);
    }

    public static wpa c(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        return new wpa(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5);
    }

    @Override // defpackage.azrw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final woz get() {
        return b(this.a, (aifw) this.b.get(), this.c, this.d, this.e);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajep implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;

    public ajep(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
    }

    public static ajep b(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new ajep(azrwVar, azrwVar2, azrwVar3);
    }

    @Override // defpackage.azrw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ajeo get() {
        return new ajeo((acpl) this.a.get(), (aoae) this.b.get(), (ammv) this.c.get(), null, null);
    }
}

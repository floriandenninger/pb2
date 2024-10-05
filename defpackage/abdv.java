package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abdv implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;

    public abdv(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
    }

    public static abdv b(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new abdv(azrwVar, azrwVar2, azrwVar3, azrwVar4);
    }

    @Override // defpackage.azrw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final abdq get() {
        return new abdq((aarm) this.a.get(), (ammv) ((axqs) this.b).a, this.c, ((aacb) this.d).get());
    }
}

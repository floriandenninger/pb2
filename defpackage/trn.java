package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class trn implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;

    public trn(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
    }

    @Override // defpackage.azrw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final trm get() {
        return new trm(((trq) this.a).get(), (tme) this.b.get(), (ammv) this.c.get(), (tko) this.d.get());
    }
}

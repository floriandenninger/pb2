package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afev implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;

    public afev(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
    }

    public static afev b(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new afev(azrwVar, azrwVar2, azrwVar3);
    }

    public static afeu c(afhs afhsVar, ysy ysyVar, shf shfVar) {
        return new afeu(afhsVar, ysyVar, shfVar);
    }

    @Override // defpackage.azrw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final afeu get() {
        return c((afhs) this.a.get(), (ysy) this.b.get(), (shf) this.c.get());
    }
}

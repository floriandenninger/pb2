package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adwk implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;

    public adwk(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
    }

    public static aapf b(aaoz aaozVar, afjo afjoVar, afhf afhfVar) {
        aape[] aapeVarArr = {new aeeb(afhfVar, aaozVar, afjoVar)};
        System.arraycopy(new aape[0], 0, aapeVarArr, 1, 0);
        return new aapf(aapeVarArr);
    }

    public static adwk c(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new adwk(azrwVar, azrwVar2, azrwVar3);
    }

    @Override // defpackage.azrw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aapf get() {
        return b((aaoz) this.a.get(), (afjo) this.b.get(), (afhf) this.c.get());
    }
}

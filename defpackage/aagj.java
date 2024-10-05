package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aagj implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;

    public aagj(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
    }

    public static aagj a(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new aagj(azrwVar, azrwVar2, azrwVar3);
    }

    @Override // defpackage.azrw
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Boolean get() {
        axzf axzfVar = (axzf) this.a.get();
        axzg axzgVar = (axzg) this.b.get();
        return Boolean.valueOf(whl.O(axzfVar, axzgVar));
    }
}

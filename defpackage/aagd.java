package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aagd implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;

    public aagd(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
    }

    public static aagd b(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new aagd(azrwVar, azrwVar2, azrwVar3);
    }

    public static aagc c(azrw azrwVar, vgz vgzVar, azrw azrwVar2) {
        return new aagc(azrwVar, vgzVar, azrwVar2);
    }

    @Override // defpackage.azrw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aagc get() {
        return c(this.a, (vgz) this.b.get(), this.c);
    }
}

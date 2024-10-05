package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ywy implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;

    public ywy(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
    }

    public static ywy a(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new ywy(azrwVar, azrwVar2, azrwVar3, azrwVar4);
    }

    @Override // defpackage.azrw
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final zzw get() {
        return new zzw(this.a, this.b, this.c, this.d, (byte[]) null);
    }
}

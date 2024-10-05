package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yto implements axqr {
    private final azrw a;
    private final azrw b;

    public yto(azrw azrwVar, azrw azrwVar2) {
        this.a = azrwVar;
        this.b = azrwVar2;
    }

    public static ysw b(apdq apdqVar, azrw azrwVar) {
        ysw yswVar = apdqVar.k ? (ysw) azrwVar.get() : ysw.a;
        ayaw.k(yswVar);
        return yswVar;
    }

    public static yto c(azrw azrwVar, azrw azrwVar2) {
        return new yto(azrwVar, azrwVar2);
    }

    @Override // defpackage.azrw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ysw get() {
        return b(((ytn) this.a).get(), this.b);
    }
}

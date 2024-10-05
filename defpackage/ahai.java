package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahai implements axqr {
    private final azrw a;

    public ahai(azrw azrwVar) {
        this.a = azrwVar;
    }

    public static afkn b(aifs aifsVar) {
        afkn afknVar = aifsVar.c;
        ayaw.k(afknVar);
        return afknVar;
    }

    public static ahai c(azrw azrwVar) {
        return new ahai(azrwVar);
    }

    @Override // defpackage.azrw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final afkn get() {
        return b((aifs) this.a.get());
    }
}

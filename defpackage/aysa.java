package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum aysa implements ayta {
    INSTANCE,
    NEVER;

    public static void f(ayqd ayqdVar) {
        ayqdVar.se(INSTANCE);
        ayqdVar.sh();
    }

    public static void g(Throwable th, aypi aypiVar) {
        aypiVar.se(INSTANCE);
        aypiVar.b(th);
    }

    public static void h(Throwable th, ayqd ayqdVar) {
        ayqdVar.se(INSTANCE);
        ayqdVar.b(th);
    }

    public static void i(Throwable th, ayqk ayqkVar) {
        ayqkVar.se(INSTANCE);
        ayqkVar.b(th);
    }

    @Override // defpackage.aytf
    public final void d() {
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this == INSTANCE;
    }

    @Override // defpackage.aytf
    public final boolean j() {
        return true;
    }

    @Override // defpackage.aytf
    public final boolean k(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.ayqx
    public final void qc() {
    }

    @Override // defpackage.aytb
    public final int sf(int i) {
        return i & 2;
    }

    @Override // defpackage.aytf
    public final Object sg() {
        return null;
    }
}

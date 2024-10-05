package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azpy implements aytc {
    public static final azpy a;
    private static final /* synthetic */ azpy[] b;

    static {
        azpy azpyVar = new azpy();
        a = azpyVar;
        b = new azpy[]{azpyVar};
    }

    private azpy() {
    }

    public static void b(banw banwVar) {
        banwVar.f(a);
        banwVar.sh();
    }

    public static void f(Throwable th, banw banwVar) {
        banwVar.f(a);
        banwVar.b(th);
    }

    public static azpy[] values() {
        return (azpy[]) b.clone();
    }

    @Override // defpackage.aytf
    public final void d() {
    }

    @Override // defpackage.aytf
    public final boolean j() {
        return true;
    }

    @Override // defpackage.aytf
    public final boolean k(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.banx
    public final void sd() {
    }

    @Override // defpackage.aytb
    public final int sf(int i) {
        return i & 2;
    }

    @Override // defpackage.aytf
    public final Object sg() {
        return null;
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        azqb.h(j);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "EmptySubscription";
    }
}

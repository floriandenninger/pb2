package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class uug extends uuj {
    private final boolean a;

    public uug(bacs bacsVar, boolean z) {
        super(bacsVar);
        this.a = z;
    }

    private final bacs f(Long l) {
        return this.a ? e(l) : d();
    }

    @Override // defpackage.uuj
    public final long a(String str) {
        bacs f = f(null);
        if (f.equals(bacs.a)) {
            return 1000L;
        }
        return f.c;
    }

    @Override // defpackage.uuj
    public final bacs b(Long l) {
        return f(l);
    }

    @Override // defpackage.uuj
    public final boolean c() {
        return this.a;
    }
}

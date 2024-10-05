package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class flz {
    private final fma a;
    private String b = null;

    public flz(fma fmaVar) {
        this.a = fmaVar;
    }

    public final void a() {
        if (this.b != null) {
            return;
        }
        this.b = this.a.a();
    }

    public final void b() {
        String str = this.b;
        if (str == null) {
            return;
        }
        this.a.b(str);
        this.b = null;
    }
}

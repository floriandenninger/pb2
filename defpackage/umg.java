package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class umg {
    public final ujn a;
    public final String b;
    public final int c;
    private final ukk d;

    public umg(ukk ukkVar, int i, ujn ujnVar, String str) {
        this.d = ukkVar;
        this.a = ujnVar;
        this.c = i;
        this.b = str;
    }

    public final anhy a(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        anhy a = z ? this.d.a() : this.d.b();
        amkq.o(a, new umf(this, z, currentTimeMillis), angq.a);
        return a;
    }

    public final anhy b(boolean z, String str, int i) {
        anhy f;
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            f = this.d.e(str, i);
        } else {
            f = this.d.f(str, i);
        }
        amkq.o(f, new ume(this, i, z, currentTimeMillis, null), angq.a);
        return f;
    }
}

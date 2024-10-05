package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class umd implements ukk {
    private final ukk a;
    private final umg b;
    private final umg c;

    public umd(ukk ukkVar, int i, ujn ujnVar, String str) {
        this.a = ukkVar;
        this.b = new umg(ukkVar, i, ujnVar, str);
        this.c = new umg(ukkVar, i, ujnVar, str);
    }

    @Override // defpackage.ukk
    public final anhy a() {
        return this.b.a(true);
    }

    @Override // defpackage.ukk
    public final anhy b() {
        return this.b.a(false);
    }

    @Override // defpackage.ukk
    public final void c(ufi ufiVar) {
        this.a.c(ufiVar);
    }

    @Override // defpackage.ukk
    public final void d(ufi ufiVar) {
        this.a.d(ufiVar);
    }

    @Override // defpackage.ukk
    public final anhy e(String str, int i) {
        return this.c.b(true, str, i);
    }

    @Override // defpackage.ukk
    public final anhy f(String str, int i) {
        return this.c.b(false, str, i);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class agxw implements aftl {
    final /* synthetic */ String a;
    final /* synthetic */ atsb b;
    final /* synthetic */ agzi c;
    final /* synthetic */ acra d;
    final /* synthetic */ atom e;
    final /* synthetic */ int f;
    final /* synthetic */ agxz h;

    public agxw(agxz agxzVar, String str, atsb atsbVar, agzi agziVar, acra acraVar, atom atomVar, int i) {
        this.h = agxzVar;
        this.a = str;
        this.b = atsbVar;
        this.c = agziVar;
        this.d = acraVar;
        this.e = atomVar;
        this.f = i;
    }

    @Override // defpackage.aftl
    public final void a() {
        agzi agziVar = this.c;
        if (agziVar != null) {
            agziVar.a(this.a, 2);
        }
        this.h.w(2);
    }

    @Override // defpackage.aftl
    public final void b() {
        this.h.b(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    @Override // defpackage.aftl
    public final void c(Exception exc) {
        this.h.c.e(exc);
    }
}

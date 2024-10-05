package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class agxk implements aftl {
    final /* synthetic */ String a;
    final /* synthetic */ atsb b;
    final /* synthetic */ acra c;
    final /* synthetic */ atom d;
    final /* synthetic */ agxo e;

    public agxk(agxo agxoVar, String str, atsb atsbVar, acra acraVar, atom atomVar) {
        this.e = agxoVar;
        this.a = str;
        this.b = atsbVar;
        this.c = acraVar;
        this.d = atomVar;
    }

    @Override // defpackage.aftl
    public final void a() {
        this.e.l(2);
    }

    @Override // defpackage.aftl
    public final void b() {
        this.e.b(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.aftl
    public final void c(Exception exc) {
        this.e.a.e(exc);
    }
}

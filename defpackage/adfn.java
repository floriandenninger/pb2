package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adfn implements adls {
    final /* synthetic */ adfp a;

    public adfn(adfp adfpVar) {
        this.a = adfpVar;
    }

    @Override // defpackage.adls
    public final void a() {
        adfp adfpVar = this.a;
        adfpVar.a = false;
        adfpVar.b();
    }

    @Override // defpackage.adls
    public final void b() {
        adfp adfpVar = this.a;
        adfpVar.a = false;
        adfpVar.b();
    }

    @Override // defpackage.adls
    public final void c() {
        adfp adfpVar = this.a;
        adfpVar.a = false;
        adfpVar.c(5000L);
    }

    @Override // defpackage.adls
    public final void d() {
        adfp adfpVar = this.a;
        adfpVar.a = true;
        adfpVar.b();
    }
}

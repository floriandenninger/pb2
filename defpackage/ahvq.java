package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class ahvq implements ahvb {
    public final ahvc a;
    public final ahxt b;
    private final ainy c;
    private final ypa d;
    private final aivo e;

    public ahvq(ainy ainyVar, ypa ypaVar, aivo aivoVar, ahvc ahvcVar, ahxt ahxtVar) {
        this.c = ainyVar;
        this.d = ypaVar;
        this.e = aivoVar;
        this.a = ahvcVar;
        this.b = ahxtVar;
    }

    @Override // defpackage.ahvb
    public final void c() {
        this.c.C(new ahvp(this));
    }

    @Override // defpackage.ahvb
    public final void d() {
        this.d.f(new ahee(false));
    }

    @Override // defpackage.ahvb
    public final void e() {
        this.e.c();
    }

    @Override // defpackage.ahvb
    public final void f() {
        this.e.d();
    }

    @Override // defpackage.ahvb
    public final void k() {
    }

    @Override // defpackage.ahvb
    public final void l() {
        this.e.g(-10000L);
    }

    @Override // defpackage.ahvb
    public final void m() {
        this.e.g(10000L);
    }

    @Override // defpackage.ahvb
    public final void n() {
        this.a.ns();
        this.e.e();
    }

    @Override // defpackage.ahvb
    public final void o() {
        this.e.f();
    }

    @Override // defpackage.ahvb
    public final void p(long j) {
    }

    @Override // defpackage.ahvb
    public final void q() {
    }

    @Override // defpackage.ahvb
    public final void r(long j) {
        this.e.i(j);
    }

    @Override // defpackage.ahvb
    public final void s(long j, aupb aupbVar) {
        this.e.j(j, aupbVar);
    }

    @Override // defpackage.ahvb
    public final void v() {
        this.d.f(new ahee(true));
    }

    @Override // defpackage.ahvb
    public final void w(boolean z) {
        aivo aivoVar = this.e;
        aivoVar.b.b();
        ((aivl) aivoVar.a.get()).E(z);
    }
}

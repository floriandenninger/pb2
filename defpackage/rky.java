package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rky extends aone implements aooz {
    public rky() {
        super(rkz.f());
    }

    public final rlb a(int i) {
        return ((rkz) this.instance).g(i);
    }

    public final void b(rlb rlbVar) {
        copyOnWrite();
        rkz.k((rkz) this.instance, rlbVar);
    }

    public final void c(int i) {
        copyOnWrite();
        rkz.n((rkz) this.instance, i);
    }

    public final void d(int i, rlb rlbVar) {
        copyOnWrite();
        rkz.j((rkz) this.instance, i, rlbVar);
    }

    public final void e(aone aoneVar) {
        copyOnWrite();
        rkz.k((rkz) this.instance, (rlb) aoneVar.build());
    }
}

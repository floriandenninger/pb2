package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afbc implements Runnable {
    final /* synthetic */ afbd a;

    public afbc(afbd afbdVar) {
        this.a = afbdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afky afkyVar;
        afbs afbsVar = this.a.b;
        afbm afbmVar = afbsVar.u;
        afbsVar.u = null;
        if (afbmVar == null && this.a.b.t == null) {
            return;
        }
        afbs afbsVar2 = this.a.b;
        if (afbsVar2.y || (afkyVar = afbsVar2.p) == null || afkyVar.E()) {
            return;
        }
        this.a.b.F(true);
        afbs afbsVar3 = this.a.b;
        afbsVar3.V(new afih("surfaceunavailable", afbsVar3.g(), this.a.a));
    }
}

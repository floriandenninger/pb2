package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acvr implements Runnable {
    final /* synthetic */ acvs a;

    public acvr(acvs acvsVar) {
        this.a = acvsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        acvs acvsVar = this.a;
        acvsVar.a.B(acvsVar);
        if (acvsVar.d.N) {
            ynm.k(acvsVar.b.b(), acvsVar.e, abbr.k, new acvo(acvsVar, 2));
        } else {
            acvsVar.b(acvsVar.b.a());
        }
    }
}

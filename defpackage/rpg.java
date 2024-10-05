package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rpg implements Runnable {
    final /* synthetic */ rpt a;
    final /* synthetic */ rph b;

    public rpg(rph rphVar, rpt rptVar) {
        this.b = rphVar;
        this.a = rptVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.a) {
            rpi rpiVar = this.b.b;
            if (rpiVar != null) {
                rpiVar.a(this.a);
            }
        }
    }
}

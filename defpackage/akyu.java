package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class akyu implements Runnable {
    public final /* synthetic */ akze a;
    public final /* synthetic */ alcb b;
    private final /* synthetic */ int c;

    public /* synthetic */ akyu(akze akzeVar, alcb alcbVar, int i) {
        this.c = i;
        this.a = akzeVar;
        this.b = alcbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            akze akzeVar = this.a;
            alcb alcbVar = this.b;
            synchronized (akzeVar.l) {
                if (!akzeVar.n.containsKey(alcbVar.b)) {
                    zga.m("ForegroundUploadController", "Skipped notification update for missing upload.");
                    return;
                }
                akzeVar.C();
                akzeVar.f.j(alcbVar);
                akzeVar.G();
                return;
            }
        }
        akze akzeVar2 = this.a;
        alcb alcbVar2 = this.b;
        synchronized (akzeVar2.l) {
            akzeVar2.w();
            akzh a = akzi.a(alcbVar2.b);
            a.b = alcbVar2.i;
            a.d = alcbVar2.a;
            akzeVar2.u(a.a());
            akzeVar2.x(alcbVar2);
        }
    }
}

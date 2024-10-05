package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class agum implements Runnable {
    public final /* synthetic */ agur a;
    private final /* synthetic */ int b;

    public /* synthetic */ agum(agur agurVar, int i) {
        this.b = i;
        this.a = agurVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.q();
            return;
        }
        if (i == 1) {
            do {
            } while (this.a.s());
            return;
        }
        agur agurVar = this.a;
        synchronized (agurVar.k) {
            anhy anhyVar = agurVar.l;
            if ((anhyVar == null || anhyVar.isDone()) && agurVar.e() <= 0 && !agurVar.i) {
                agurVar.e.c(!agurVar.j);
            }
        }
    }
}

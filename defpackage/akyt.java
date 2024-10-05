package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class akyt implements Runnable {
    public final /* synthetic */ akze a;
    public final /* synthetic */ akzi b;
    private final /* synthetic */ int c;

    public /* synthetic */ akyt(akze akzeVar, akzi akziVar, int i) {
        this.c = i;
        this.a = akzeVar;
        this.b = akziVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            akze akzeVar = this.a;
            akzi akziVar = this.b;
            synchronized (akzeVar.l) {
                akzeVar.w();
                akzeVar.u(akziVar);
            }
            return;
        }
        if (i == 1) {
            akze akzeVar2 = this.a;
            akzi akziVar2 = this.b;
            synchronized (akzeVar2.l) {
                akzeVar2.w();
                akzeVar2.u(akziVar2);
                akzeVar2.d.execute(new akyt(akzeVar2, akziVar2, 3));
            }
            return;
        }
        if (i == 2) {
            akze akzeVar3 = this.a;
            akzi akziVar3 = this.b;
            synchronized (akzeVar3.l) {
                akzeVar3.u(akziVar3);
                akzeVar3.C();
            }
            akzeVar3.G();
            return;
        }
        akze akzeVar4 = this.a;
        String str = this.b.a;
        synchronized (akzeVar4.l) {
            if (!akzeVar4.n.containsKey(str)) {
                zga.m("ForegroundUploadController", "Skipped notification update for missing upload.");
                return;
            }
            akzeVar4.C();
            akzeVar4.f.e(str);
            akzeVar4.G();
        }
    }
}

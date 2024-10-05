package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class bhg implements Runnable {
    public final /* synthetic */ bhm a;
    public final /* synthetic */ auj b;
    private final /* synthetic */ int c;

    public /* synthetic */ bhg(bhm bhmVar, auj aujVar, int i) {
        this.c = i;
        this.a = bhmVar;
        this.b = aujVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            bhm bhmVar = this.a;
            auj aujVar = this.b;
            bhn bhnVar = bhmVar.b;
            int i = pts.a;
            bhnVar.C(aujVar);
            return;
        }
        bhm bhmVar2 = this.a;
        auj aujVar2 = this.b;
        aujVar2.a();
        bhn bhnVar2 = bhmVar2.b;
        int i2 = pts.a;
        bhnVar2.B(aujVar2);
    }
}

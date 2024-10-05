package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class avu implements Runnable {
    public final /* synthetic */ awa a;
    public final /* synthetic */ auj b;
    private final /* synthetic */ int c;

    public /* synthetic */ avu(awa awaVar, auj aujVar, int i) {
        this.c = i;
        this.a = awaVar;
        this.b = aujVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            awa awaVar = this.a;
            auj aujVar = this.b;
            awb awbVar = awaVar.a;
            int i = pts.a;
            awbVar.g(aujVar);
            return;
        }
        awa awaVar2 = this.a;
        auj aujVar2 = this.b;
        aujVar2.a();
        awb awbVar2 = awaVar2.a;
        int i2 = pts.a;
        awbVar2.f(aujVar2);
    }
}

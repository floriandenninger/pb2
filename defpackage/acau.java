package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acau implements Runnable {
    final /* synthetic */ acay a;
    private final /* synthetic */ int b;

    public acau(acay acayVar, int i) {
        this.b = i;
        this.a = acayVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            acay acayVar = this.a;
            acao acaoVar = acayVar.e;
            if (acaoVar != null) {
                acaoVar.f(acayVar);
                return;
            }
            return;
        }
        acay acayVar2 = this.a;
        acayVar2.onFrameAvailable(acayVar2.a);
    }
}

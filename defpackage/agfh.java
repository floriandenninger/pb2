package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class agfh implements Runnable {
    public final /* synthetic */ agfp a;
    public final /* synthetic */ Runnable b;
    private final /* synthetic */ int c;

    public /* synthetic */ agfh(agfp agfpVar, Runnable runnable, int i) {
        this.c = i;
        this.a = agfpVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            agfp agfpVar = this.a;
            Runnable runnable = this.b;
            if (agfpVar.y()) {
                runnable.run();
                return;
            }
            return;
        }
        agfp agfpVar2 = this.a;
        Runnable runnable2 = this.b;
        if (agfpVar2.y()) {
            runnable2.run();
        }
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class acia implements Runnable {
    public final /* synthetic */ acif a;
    private final /* synthetic */ int b;

    public /* synthetic */ acia(acif acifVar, int i) {
        this.b = i;
        this.a = acifVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            acif acifVar = this.a;
            acifVar.ap.setVisibility(8);
            acifVar.aG = true;
            Runnable runnable = acifVar.aH;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        acif acifVar2 = this.a;
        acifVar2.ar.setMaxLines(acifVar2.ar.getLineCount());
    }
}

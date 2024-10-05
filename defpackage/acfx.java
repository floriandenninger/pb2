package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class acfx implements Runnable {
    public final /* synthetic */ acgf a;
    private final /* synthetic */ int b;

    public /* synthetic */ acfx(acgf acgfVar, int i) {
        this.b = i;
        this.a = acgfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            acgf acgfVar = this.a;
            if (acgfVar.an.getWidth() == 0) {
                acfm.a(acgfVar.C());
                acge acgeVar = acgfVar.af;
                if (acgeVar != null) {
                    acgeVar.az(acgfVar.an);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 1) {
            acgf acgfVar2 = this.a;
            acgfVar2.at = false;
            acgfVar2.aO();
            if (acgfVar2.au == 2) {
                acgfVar2.aQ(4);
                return;
            }
            return;
        }
        this.a.aP();
    }
}

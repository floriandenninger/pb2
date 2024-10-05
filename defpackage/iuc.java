package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class iuc implements Runnable {
    public final /* synthetic */ ivj a;
    private final /* synthetic */ int b;

    public /* synthetic */ iuc(ivj ivjVar, int i) {
        this.b = i;
        this.a = ivjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.aH(true);
            return;
        }
        if (i == 1) {
            axpg axpgVar = this.a.al;
            if (axpgVar != null) {
                ((fzb) axpgVar.get()).n();
                return;
            }
            return;
        }
        int i2 = 2;
        if (i == 2) {
            ivj ivjVar = this.a;
            ivjVar.aV.a(ivjVar.bO);
        } else {
            ivj ivjVar2 = this.a;
            ivjVar2.aO.post(new iuc(ivjVar2, i2));
        }
    }
}

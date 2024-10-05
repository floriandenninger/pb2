package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayhh implements Runnable {
    final /* synthetic */ aylh a;
    private final /* synthetic */ int b;

    public ayhh(aylh aylhVar, int i) {
        this.b = i;
        this.a = aylhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.a(false);
            return;
        }
        if (i == 1) {
            this.a.a(true);
            return;
        }
        aykf aykfVar = (aykf) this.a;
        amkq.O(aykfVar.a.A.get(), "Channel must have been shut down");
        aykx aykxVar = aykfVar.a;
        aykxVar.C = true;
        aykxVar.l(false);
        aykfVar.a.g();
        aykfVar.a.h();
    }
}

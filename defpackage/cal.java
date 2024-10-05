package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cal implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ can b;
    final /* synthetic */ cex c;

    public cal(can canVar, cex cexVar, String str) {
        this.b = canVar;
        this.c = cexVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        can canVar;
        try {
            try {
                abd abdVar = (abd) this.c.get();
                if (abdVar != null) {
                    ajbh X = ajbh.X();
                    int i = can.j;
                    String.format("%s returned a %s result.", this.b.c.d, abdVar);
                    X.T(new Throwable[0]);
                    this.b.i = abdVar;
                } else {
                    ajbh.X();
                    ajbh.U(can.a, String.format("%s returned a null result. Treating it as a failure.", this.b.c.d), new Throwable[0]);
                }
                canVar = this.b;
            } catch (InterruptedException e) {
                e = e;
                ajbh.X();
                ajbh.U(can.a, String.format("%s failed because it threw an exception/error", this.a), e);
                canVar = this.b;
            } catch (CancellationException e2) {
                ajbh.X();
                int i2 = can.j;
                String.format("%s was cancelled", this.a);
                ajbh.V(e2);
                canVar = this.b;
            } catch (ExecutionException e3) {
                e = e3;
                ajbh.X();
                ajbh.U(can.a, String.format("%s failed because it threw an exception/error", this.a), e);
                canVar = this.b;
            }
            canVar.a();
        } catch (Throwable th) {
            this.b.a();
            throw th;
        }
    }
}

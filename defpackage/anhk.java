package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anhk implements Runnable {
    final Future a;
    final anhh b;

    public anhk(Future future, anhh anhhVar) {
        this.a = future;
        this.b = anhhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable k;
        Object obj = this.a;
        if (!(obj instanceof aniw) || (k = ((aniw) obj).k()) == null) {
            try {
                this.b.b(anaf.W(this.a));
                return;
            } catch (Error e) {
                e = e;
                this.b.qg(e);
                return;
            } catch (RuntimeException e2) {
                e = e2;
                this.b.qg(e);
                return;
            } catch (ExecutionException e3) {
                this.b.qg(e3.getCause());
                return;
            }
        }
        this.b.qg(k);
    }

    public final String toString() {
        ammu Y = amkq.Y(this);
        Y.a(this.b);
        return Y.toString();
    }
}

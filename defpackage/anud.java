package defpackage;

import android.os.Handler;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anud implements Executor, rpi {
    public final qob a;
    public final Queue b = new ArrayDeque();
    public int c = 0;
    private final Handler d;

    public anud(qob qobVar) {
        this.a = qobVar;
        this.d = new amcc(qobVar.B, (byte[]) null);
    }

    @Override // defpackage.rpi
    public final void a(rpt rptVar) {
        anuc anucVar;
        synchronized (this.b) {
            if (this.c == 2) {
                anucVar = (anuc) this.b.peek();
                qip.av(anucVar != null);
            } else {
                anucVar = null;
            }
            this.c = 0;
        }
        if (anucVar != null) {
            anucVar.a();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.d.post(runnable);
    }
}

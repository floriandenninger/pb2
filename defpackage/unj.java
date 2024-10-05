package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class unj implements Executor, uoc {
    private final uok a;
    private Runnable b;
    private boolean c;
    private boolean d;

    public unj(uok uokVar) {
        this.a = uokVar;
    }

    private final void b(Runnable runnable) {
        if (this.d) {
            return;
        }
        this.d = true;
        runnable.run();
    }

    @Override // defpackage.uoc
    public final void a(Activity activity) {
        this.a.b(this);
        synchronized (this) {
            Runnable runnable = this.b;
            if (runnable != null) {
                b(runnable);
                this.b = null;
            } else {
                this.c = true;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this) {
            if (!this.c) {
                uol uolVar = this.a.a.b;
                int i = uol.c;
                if (uolVar.b.get() <= 0) {
                    this.b = runnable;
                }
            }
            b(runnable);
        }
    }
}

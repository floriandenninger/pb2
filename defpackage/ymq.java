package defpackage;

import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ymq {
    private final ymy a;
    private final Executor b;
    private final amsx c;
    private final amsx d;

    public ymq(ymy ymyVar, Executor executor, List list, List list2) {
        this.a = ymyVar;
        this.b = executor;
        this.c = amsx.p(list);
        this.d = amsx.p(list2);
    }

    public final void a(apdz apdzVar, Runnable runnable, boolean z) {
        ymy ymyVar;
        ymy ymyVar2;
        if (!this.c.contains(apdzVar) || (ymyVar2 = this.a) == null) {
            if (this.d.contains(apdzVar) && (ymyVar = this.a) != null) {
                ymyVar.a(runnable, false);
                return;
            } else if (z) {
                runnable.run();
                return;
            } else {
                this.b.execute(runnable);
                return;
            }
        }
        ymyVar2.a(runnable, true);
    }

    public final void b(apdz apdzVar, Runnable runnable) {
        a(apdzVar, runnable, true);
    }

    public ymq(Executor executor) {
        this.a = null;
        this.b = executor;
        this.c = amvs.a;
        this.d = amvs.a;
    }
}

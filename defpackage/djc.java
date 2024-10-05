package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class djc implements dkf {
    public final Map a = new HashMap();
    private final Executor b;

    public djc(Executor executor) {
        this.b = executor;
    }

    @Override // defpackage.dkf
    public final void a(Runnable runnable) {
        synchronized (this.a) {
            this.a.remove(runnable);
        }
    }

    @Override // defpackage.dkf
    public final void b() {
    }

    @Override // defpackage.dkf
    public final void c(Runnable runnable) {
        synchronized (this.a) {
            Integer num = (Integer) this.a.get(runnable);
            this.a.put(runnable, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
        this.b.execute(new djb(this, runnable));
    }
}

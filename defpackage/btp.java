package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class btp {
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final btl b;
    private volatile buu c;

    public btp(btl btlVar) {
        this.b = btlVar;
    }

    private final buu b() {
        return this.b.l(a());
    }

    protected abstract String a();

    public final buu d() {
        this.b.f();
        if (!this.a.compareAndSet(false, true)) {
            return b();
        }
        if (this.c == null) {
            this.c = b();
        }
        return this.c;
    }

    public final void e(buu buuVar) {
        if (buuVar == this.c) {
            this.a.set(false);
        }
    }
}

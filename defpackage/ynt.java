package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ynt implements ynv, ynr {
    public final amsx a;
    public volatile boolean b;
    private final Executor c;
    private final ynu d;
    private volatile boolean e;

    public ynt(Executor executor, amsx amsxVar, ynu ynuVar) {
        this.c = executor;
        amsxVar.getClass();
        this.a = amsxVar;
        this.d = ynuVar;
        amxd listIterator = amsxVar.listIterator();
        while (listIterator.hasNext()) {
            ((yns) listIterator.next()).a = this;
        }
    }

    @Override // defpackage.ynr
    public final void a() {
        d();
    }

    protected abstract Runnable b();

    @Override // defpackage.ynv
    public void c() {
        throw null;
    }

    @Override // defpackage.ynv
    public final void d() {
        amxd listIterator = this.a.listIterator();
        while (listIterator.hasNext()) {
            if (!((yns) listIterator.next()).c()) {
                return;
            }
        }
        if (this.b || this.e) {
            return;
        }
        this.e = true;
        this.c.execute(b());
        this.d.b(this);
    }
}

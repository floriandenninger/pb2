package defpackage;

import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class yky implements ykl {
    public static final LinkedBlockingQueue a = new LinkedBlockingQueue();
    private final ykl b;

    public yky(ykl yklVar) {
        yklVar.getClass();
        this.b = yklVar;
    }

    private static ykx c() {
        ykx ykxVar = (ykx) a.poll();
        return ykxVar != null ? ykxVar : new ykx();
    }

    @Override // defpackage.ykl
    public final void a(Object obj, Exception exc) {
        ykx c = c();
        c.a = this.b;
        c.b = obj;
        c.d = exc;
        c.c = null;
        c.e = false;
        d(c);
    }

    @Override // defpackage.ykl
    public final void b(Object obj, Object obj2) {
        ykx c = c();
        c.a = this.b;
        c.b = obj;
        c.c = obj2;
        c.d = null;
        c.e = true;
        d(c);
    }

    protected abstract void d(Runnable runnable);
}

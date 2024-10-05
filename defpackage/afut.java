package defpackage;

import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afut implements Runnable, ykl {
    final /* synthetic */ afuu a;
    private final Object b;
    private final Object c;
    private final ykl d;
    private Object e;

    public afut(afuu afuuVar, Object obj, Object obj2, ykl yklVar) {
        this.a = afuuVar;
        this.b = obj;
        this.c = obj2;
        this.d = yklVar;
    }

    @Override // defpackage.ykl
    public final void a(Object obj, Exception exc) {
        this.d.a(this.b, exc);
    }

    @Override // defpackage.ykl
    public final void b(Object obj, Object obj2) {
        this.e = obj2;
        afuu afuuVar = this.a;
        if (afuuVar.a == null) {
            this.d.b(this.b, obj2);
            return;
        }
        Executor executor = afuuVar.b;
        if (executor != null) {
            executor.execute(this);
        } else {
            run();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.d.b(this.b, this.a.a.b(this.e));
        } catch (IOException e) {
            this.a.b(this.b, this.c, this.d, e);
        } catch (zjg e2) {
            this.a.b(this.b, this.c, this.d, e2);
        }
    }
}

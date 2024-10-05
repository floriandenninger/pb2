package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aywm extends AtomicReference implements Runnable, ayqx {
    private static final long serialVersionUID = 6812032969491025141L;
    final Object a;
    final long b;
    final aywn c;
    final AtomicBoolean d = new AtomicBoolean();

    public aywm(Object obj, long j, aywn aywnVar) {
        this.a = obj;
        this.b = j;
        this.c = aywnVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        if (this.d.compareAndSet(false, true)) {
            aywn aywnVar = this.c;
            long j = this.b;
            Object obj = this.a;
            if (j == aywnVar.g) {
                if (aywnVar.get() == 0) {
                    aywnVar.sd();
                    aywnVar.a.b(new ayrg("Could not deliver value due to lack of requests"));
                } else {
                    aywnVar.a.c(obj);
                    ayeq.n(aywnVar, 1L);
                    ayrz.c(this);
                }
            }
        }
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return get() == ayrz.a;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        ayrz.c(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        a();
    }
}

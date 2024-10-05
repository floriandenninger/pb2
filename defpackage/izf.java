package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class izf implements abdr {
    public final aasy b;
    private final Executor d;
    private final aadw e;
    public final AtomicInteger c = new AtomicInteger(0);
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public izf(Executor executor, aasy aasyVar, aadw aadwVar) {
        this.b = aasyVar;
        this.d = executor;
        this.e = aadwVar;
    }

    @Override // defpackage.abdr
    public final void no(abdu abduVar) {
        apwy b = this.e.b();
        if (b != null) {
            asvu asvuVar = b.e;
            if (asvuVar == null) {
                asvuVar = asvu.a;
            }
            if (asvuVar.bO) {
                amru a = this.b.a();
                int i = ((amvj) a).c;
                for (int i2 = 0; i2 < i; i2++) {
                    abduVar.d(((Integer) a.get(i2)).intValue());
                }
                return;
            }
        }
        if (this.c.get() == 0) {
            this.d.execute(new ize(this));
        }
        if (this.c.get() == 2) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                abduVar.d(((Integer) it.next()).intValue());
            }
            return;
        }
        abduVar.d(0);
    }
}

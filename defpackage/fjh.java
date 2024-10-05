package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fjh implements ypd {
    public final shf a;
    public final ScheduledExecutorService b;
    public final Executor c;
    private final ypa g;
    private final Set h = Collections.newSetFromMap(new WeakHashMap());
    public final Map d = new HashMap();
    public final Map e = new HashMap();
    public final Map f = new HashMap();

    public fjh(shf shfVar, ypa ypaVar, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.a = shfVar;
        this.g = ypaVar;
        this.b = scheduledExecutorService;
        this.c = executor;
    }

    public final void a(fjg fjgVar) {
        if (this.h.isEmpty()) {
            this.g.g(this);
        }
        this.h.add(fjgVar);
    }

    public final void b(fjg fjgVar) {
        this.h.remove(fjgVar);
        if (this.h.isEmpty()) {
            this.g.m(this);
        }
    }

    public final void c(agli agliVar) {
        this.d.put(agliVar.a.m(), Long.valueOf(this.a.c()));
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((fjg) it.next()).a(agliVar);
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{agli.class};
        }
        if (i == 0) {
            agli agliVar = (agli) obj;
            yjk.f();
            final String m = agliVar.a.m();
            long longValue = this.d.containsKey(m) ? ((Long) this.d.get(m)).longValue() : 0L;
            long c = this.a.c();
            long j = c - longValue > 500 ? 0L : (longValue + 500) - c;
            if (j == 0) {
                c(agliVar);
                return null;
            }
            this.f.put(m, agliVar);
            if (this.e.containsKey(m)) {
                return null;
            }
            anhy Q = anaf.Q(new anfy() { // from class: fje
                @Override // defpackage.anfy
                public final anhy a() {
                    fjh fjhVar = fjh.this;
                    agli agliVar2 = (agli) fjhVar.f.remove(m);
                    agliVar2.getClass();
                    return anaf.O(agliVar2);
                }
            }, j, TimeUnit.MILLISECONDS, this.b);
            anaf.Y(Q, new fjf(this, m), this.c);
            this.e.put(m, Q);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}

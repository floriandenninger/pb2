package defpackage;

import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amjc implements amja, amhh {
    public static final amxj a = amxj.l("com/google/apps/tiktok/tracing/TraceManagerImpl");
    public final shf b;
    public final anic c;
    public final ConcurrentMap d = new ConcurrentHashMap(2, 0.75f, 1);
    public final AtomicLong e = new AtomicLong(2100000);
    private final amig f;
    private final azrw g;
    private final amjo h;
    private final amhu i;

    public amjc(amig amigVar, shf shfVar, anic anicVar, azrw azrwVar, amjo amjoVar, amhu amhuVar) {
        this.f = amigVar;
        this.b = shfVar;
        this.c = anicVar;
        this.g = azrwVar;
        this.h = amjoVar;
        this.i = amhuVar;
    }

    @Override // defpackage.amhh
    public final Map a() {
        amrw h = amrz.h();
        for (Map.Entry entry : this.d.entrySet()) {
            h.g((UUID) entry.getKey(), ((amjz) entry.getValue()).a().d);
        }
        return h.c();
    }

    @Override // defpackage.amja
    public final amir b(String str, amip amipVar, amjl amjlVar) {
        return c(str, amipVar, this.b.c(), this.b.d(), amjlVar);
    }

    @Override // defpackage.amja
    public final amir c(String str, amip amipVar, long j, long j2, amjl amjlVar) {
        amir a2 = amjw.a();
        if (a2 != null) {
            amjw.k(a2, str);
        }
        UUID b = this.i.b();
        float f = this.h.a;
        b.getLeastSignificantBits();
        aone createBuilder = amjm.a.createBuilder();
        long leastSignificantBits = b.getLeastSignificantBits();
        createBuilder.copyOnWrite();
        amjm amjmVar = (amjm) createBuilder.instance;
        amjmVar.b |= 2;
        amjmVar.d = leastSignificantBits;
        long mostSignificantBits = b.getMostSignificantBits();
        createBuilder.copyOnWrite();
        amjm amjmVar2 = (amjm) createBuilder.instance;
        amjmVar2.b |= 1;
        amjmVar2.c = mostSignificantBits;
        createBuilder.copyOnWrite();
        amjm amjmVar3 = (amjm) createBuilder.instance;
        amjmVar3.b |= 4;
        amjmVar3.f = j;
        createBuilder.copyOnWrite();
        amjm amjmVar4 = (amjm) createBuilder.instance;
        amjmVar4.b |= 8;
        amjmVar4.g = j2;
        createBuilder.copyOnWrite();
        amjm amjmVar5 = (amjm) createBuilder.instance;
        amjmVar5.i = amjlVar.d;
        amjmVar5.b |= 32;
        amjm amjmVar6 = (amjm) createBuilder.build();
        long g = amjlVar == amjl.REALTIME ? j2 : this.b.g();
        amjx amjxVar = new amjx(str, amipVar);
        amjz amjzVar = new amjz(this, b, amjmVar6, amjxVar, g);
        amii amiiVar = new amii(amjxVar, b, amjzVar, this.b, g, amjlVar == amjl.UPTIME);
        amig amigVar = this.f;
        if (amigVar.d.compareAndSet(false, true)) {
            amigVar.c.execute(new amid(amigVar));
        }
        amif amifVar = new amif(amiiVar, amigVar.b);
        amig.a.put(amifVar, Boolean.TRUE);
        amie amieVar = amifVar.a;
        anic anicVar = this.c;
        amjzVar.d = amieVar;
        amieVar.d(amjzVar, anicVar);
        this.d.put(b, amjzVar);
        amjw.e(amiiVar);
        return amiiVar;
    }

    public void d(amjm amjmVar, SparseArray sparseArray, String str) {
        amir a2 = amjw.a();
        amjw.e(new amic(str, amic.c, amio.a));
        try {
            Iterator it = ((Set) this.g.get()).iterator();
            RuntimeException runtimeException = null;
            while (it.hasNext()) {
                try {
                    ((amiz) it.next()).b();
                } catch (RuntimeException e) {
                    if (runtimeException == null) {
                        runtimeException = e;
                    }
                }
            }
            if (runtimeException == null) {
            } else {
                throw runtimeException;
            }
        } finally {
            amjw.e(a2);
        }
    }
}

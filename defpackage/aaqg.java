package defpackage;

import j$.util.Comparator$CC;
import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.ToIntFunction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaqg implements abex {
    public final aaqd a;
    public final ScheduledExecutorService b;
    public final aahd c;
    public final long d;
    private final Executor h;
    private final aftq i;
    private final long j;
    private int l;
    private final AtomicReference m;
    private final PriorityQueue n;
    private final Object k = new Object();
    public final Map e = new ConcurrentHashMap();
    public final Map f = new ConcurrentHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public aaqg(ScheduledExecutorService scheduledExecutorService, aaqd aaqdVar, aagx aagxVar, axzg axzgVar, axzg axzgVar2, aftq aftqVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        Long l;
        Long l2;
        this.a = aaqdVar;
        this.c = aagxVar;
        this.b = scheduledExecutorService;
        this.h = new aapy(scheduledExecutorService);
        this.i = aftqVar;
        aqvj aqvjVar = axzgVar.b.b().C;
        aqvjVar = aqvjVar == null ? aqvj.a : aqvjVar;
        if (aqvjVar.a(45354115L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45354115L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45354115L);
            l = Long.valueOf(aqvkVar.b == 2 ? ((Long) aqvkVar.c).longValue() : 0L);
        } else {
            l = 0L;
        }
        this.j = l.longValue();
        aqvj aqvjVar2 = axzgVar2.b.b().C;
        aqvjVar2 = aqvjVar2 == null ? aqvj.a : aqvjVar2;
        if (aqvjVar2.a(45359557L)) {
            aoot aootVar2 = aqvjVar2.b;
            if (!aootVar2.containsKey(45359557L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar2 = (aqvk) aootVar2.get(45359557L);
            l2 = Long.valueOf(aqvkVar2.b == 2 ? ((Long) aqvkVar2.c).longValue() : 0L);
        } else {
            l2 = 0L;
        }
        this.d = l2.longValue();
        this.n = new PriorityQueue(1, Comparator$CC.comparingInt(new ToIntFunction() { // from class: aaqc
            @Override // j$.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                int bw = anaf.bw(((aaqe) obj).d.b);
                if (bw == 0) {
                    bw = 1;
                }
                return bw - 1;
            }
        }));
        this.m = new AtomicReference(aaqf.PAUSED);
    }

    private final void h(aaqf aaqfVar) {
        if (this.m.compareAndSet(aaqfVar, aaqf.DRAINING)) {
            this.h.execute(new Runnable() { // from class: aapz
                @Override // java.lang.Runnable
                public final void run() {
                    aaqg.this.d();
                }
            });
        }
    }

    @Override // defpackage.abex
    public final Map a(List list) {
        final ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            abez abezVar = (abez) it.next();
            aaqe aaqeVar = new aaqe(abezVar, this.i);
            aaqe aaqeVar2 = (aaqe) Map.EL.putIfAbsent(this.e, abezVar.c(), aaqeVar);
            if (aaqeVar2 == null) {
                hashMap.put(abezVar.c(), aaqeVar.b);
                arrayList.add(aaqeVar);
                aaqeVar.c.c("pcq");
                aftr aftrVar = aaqeVar.c;
                aone createBuilder = asmb.a.createBuilder();
                aone createBuilder2 = asmh.a.createBuilder();
                String c = aaqeVar.a.c();
                createBuilder2.copyOnWrite();
                asmh asmhVar = (asmh) createBuilder2.instance;
                c.getClass();
                asmhVar.b |= 1;
                asmhVar.c = c;
                createBuilder2.copyOnWrite();
                asmh asmhVar2 = (asmh) createBuilder2.instance;
                asmhVar2.b |= 2;
                asmhVar2.d = true;
                asmn b = asmn.b(aaqeVar.d.d);
                if (b == null) {
                    b = asmn.LATENCY_ACTION_UNKNOWN;
                }
                createBuilder2.copyOnWrite();
                asmh asmhVar3 = (asmh) createBuilder2.instance;
                asmhVar3.e = b.bO;
                asmhVar3.b |= 4;
                createBuilder.copyOnWrite();
                asmb asmbVar = (asmb) createBuilder.instance;
                asmh asmhVar4 = (asmh) createBuilder2.build();
                asmhVar4.getClass();
                asmbVar.A = asmhVar4;
                asmbVar.d |= 128;
                aftrVar.a((asmb) createBuilder.build());
            } else {
                hashMap.put(abezVar.c(), aaqeVar2.b);
            }
        }
        this.h.execute(new Runnable() { // from class: aaqb
            @Override // java.lang.Runnable
            public final void run() {
                aaqg.this.f(arrayList);
            }
        });
        return hashMap;
    }

    public final void b(String str) {
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f.get(str);
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final void c() {
        synchronized (this.k) {
            this.l--;
        }
        h(aaqf.SLEEPING);
    }

    public final synchronized void d() {
        while (this.m.get() != aaqf.PAUSED) {
            synchronized (this.k) {
                if (this.l < this.j) {
                    aaqe aaqeVar = (aaqe) this.n.poll();
                    if (aaqeVar != null) {
                        synchronized (this.k) {
                            this.l++;
                        }
                        if (aaqeVar.b.isCancelled()) {
                            this.e.remove(aaqeVar.a.c());
                            aaqeVar.a();
                            c();
                        } else {
                            this.b.execute(new aaqa(this, aaqeVar, 0));
                        }
                    } else {
                        this.m.compareAndSet(aaqf.DRAINING, aaqf.STOPPED);
                        return;
                    }
                } else {
                    this.m.compareAndSet(aaqf.DRAINING, aaqf.SLEEPING);
                    return;
                }
            }
        }
    }

    public final void e(String str, Throwable th) {
        aaqe aaqeVar = (aaqe) this.e.remove(str);
        if (aaqeVar != null) {
            if (th instanceof CancellationException) {
                aaqeVar.a();
            } else {
                aaqeVar.b.e(th);
                aaqeVar.c.c("pcc");
                aaqeVar.b(7);
            }
        }
        b(str);
        c();
    }

    public final synchronized void f(List list) {
        this.n.addAll(list);
        h(aaqf.STOPPED);
    }

    public final void g() {
        h(aaqf.PAUSED);
    }
}

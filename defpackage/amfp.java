package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class amfp implements anfz {
    public final /* synthetic */ amgd a;
    private final /* synthetic */ int b;

    public /* synthetic */ amfp(amgd amgdVar, int i) {
        this.b = i;
        this.a = amgdVar;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        if (this.b == 0) {
            final amgd amgdVar = this.a;
            final Map map = (Map) obj;
            if (map.isEmpty()) {
                return anaf.O(Collections.emptySet());
            }
            final amgk amgkVar = amgdVar.d;
            final Set keySet = map.keySet();
            final anhy submit = amgkVar.c.submit(new Callable() { // from class: amgj
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    boolean z;
                    ReentrantReadWriteLock reentrantReadWriteLock;
                    amgk amgkVar2 = amgk.this;
                    Collection<amgr> collection = keySet;
                    amgkVar2.b.writeLock().lock();
                    try {
                        amhd amhdVar = amhd.a;
                        boolean z2 = false;
                        try {
                            amhdVar = amgkVar2.a();
                        } catch (IOException e) {
                            if (!amgkVar2.f(e)) {
                                ((amxh) ((amxh) ((amxh) amgk.a.f()).h(e)).i("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "lambda$prepareForSync$3", (char) 195, "SyncManagerDataStore.java")).q("Error, could not read or clear store. Aborting sync attempt.");
                                z = false;
                                reentrantReadWriteLock = amgkVar2.b;
                            }
                        }
                        aone createBuilder = amhd.a.createBuilder();
                        createBuilder.mergeFrom((aonm) amhdVar);
                        createBuilder.copyOnWrite();
                        ((amhd) createBuilder.instance).d = amhd.emptyProtobufList();
                        long c = amgkVar2.d.c();
                        HashSet hashSet = new HashSet();
                        for (amhc amhcVar : amhdVar.d) {
                            amhf amhfVar = amhcVar.c;
                            if (amhfVar == null) {
                                amhfVar = amhf.a;
                            }
                            if (collection.contains(amgr.a(amhfVar))) {
                                amhf amhfVar2 = amhcVar.c;
                                if (amhfVar2 == null) {
                                    amhfVar2 = amhf.a;
                                }
                                hashSet.add(amgr.a(amhfVar2));
                                aone createBuilder2 = amhc.a.createBuilder();
                                createBuilder2.mergeFrom((aonm) amhcVar);
                                createBuilder2.copyOnWrite();
                                amhc amhcVar2 = (amhc) createBuilder2.instance;
                                amhcVar2.b |= 4;
                                amhcVar2.e = c;
                                createBuilder.H((amhc) createBuilder2.build());
                            } else {
                                createBuilder.H(amhcVar);
                            }
                        }
                        for (amgr amgrVar : collection) {
                            if (!hashSet.contains(amgrVar)) {
                                aone createBuilder3 = amhc.a.createBuilder();
                                amhf amhfVar3 = amgrVar.a;
                                createBuilder3.copyOnWrite();
                                amhc amhcVar3 = (amhc) createBuilder3.instance;
                                amhfVar3.getClass();
                                amhcVar3.c = amhfVar3;
                                amhcVar3.b |= 1;
                                long j = amgkVar2.f;
                                createBuilder3.copyOnWrite();
                                amhc amhcVar4 = (amhc) createBuilder3.instance;
                                amhcVar4.b |= 2;
                                amhcVar4.d = j;
                                createBuilder3.copyOnWrite();
                                amhc amhcVar5 = (amhc) createBuilder3.instance;
                                amhcVar5.b |= 4;
                                amhcVar5.e = c;
                                createBuilder3.copyOnWrite();
                                amhc amhcVar6 = (amhc) createBuilder3.instance;
                                amhcVar6.b |= 8;
                                amhcVar6.f = 0;
                                createBuilder.H((amhc) createBuilder3.build());
                            }
                        }
                        if (amhdVar.c < 0) {
                            long j2 = amgkVar2.f;
                            if (j2 < 0) {
                                j2 = amgkVar2.d.c();
                                amgkVar2.f = j2;
                            }
                            createBuilder.copyOnWrite();
                            amhd amhdVar2 = (amhd) createBuilder.instance;
                            amhdVar2.b |= 1;
                            amhdVar2.c = j2;
                        }
                        try {
                            amgkVar2.e((amhd) createBuilder.build());
                            amgkVar2.e.set(true);
                            z2 = true;
                        } catch (IOException unused) {
                        } catch (Throwable th) {
                            amgkVar2.e.set(true);
                            throw th;
                        }
                        z = Boolean.valueOf(z2);
                        reentrantReadWriteLock = amgkVar2.b;
                        reentrantReadWriteLock.writeLock().unlock();
                        return z;
                    } catch (Throwable th2) {
                        amgkVar2.b.writeLock().unlock();
                        throw th2;
                    }
                }
            });
            anhy g = amgdVar.g(submit);
            final Callable g2 = amjk.g(new Callable() { // from class: amfv
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return amgd.this.c(submit, map);
                }
            });
            anhy v = alta.v(g, new anfy() { // from class: amgc
                @Override // defpackage.anfy
                public final anhy a() {
                    return (anhy) g2.call();
                }
            }, amgdVar.b);
            amba ambaVar = amgdVar.c;
            map.getClass();
            anhy u = alta.u(v, amjk.g(new Callable() { // from class: amfx
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return map.keySet();
                }
            }), amgdVar.b);
            ambaVar.c(u);
            return u;
        }
        final amgd amgdVar2 = this.a;
        final long longValue = ((Long) obj).longValue();
        final adz adzVar = new adz();
        final adz adzVar2 = new adz();
        final long c = amgdVar2.a.c();
        return anfq.i(anfq.h(amgdVar2.g(amgdVar2.d.b()), amjk.a(new amml() { // from class: amfu
            @Override // defpackage.amml
            public final Object apply(Object obj2) {
                long j;
                long j2;
                amgd amgdVar3 = amgd.this;
                long j3 = longValue;
                long j4 = c;
                Map map2 = adzVar2;
                Map map3 = adzVar;
                Map map4 = (Map) obj2;
                synchronized (amgdVar3.h) {
                    synchronized (amgdVar3.g) {
                        for (Map.Entry entry : amgdVar3.g.entrySet()) {
                            amgr amgrVar = (amgr) entry.getKey();
                            if (!amgdVar3.h.containsKey(amgrVar)) {
                                long longValue2 = amgdVar3.i.containsKey(amgrVar) ? ((Long) amgdVar3.i.get(amgrVar)).longValue() : j3;
                                if (map4.containsKey(amgrVar)) {
                                    j2 = ((Long) map4.get(amgrVar)).longValue();
                                    j = j3;
                                } else {
                                    j = j3;
                                    j2 = j;
                                }
                                long max = Math.max(longValue2, j2);
                                amff a = ((amfk) entry.getValue()).a();
                                if (a.a() + max <= j4) {
                                    Iterator it = a.c().entrySet().iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            Map.Entry entry2 = (Map.Entry) it.next();
                                            amfg amfgVar = (amfg) entry2.getValue();
                                            long a2 = amfgVar.a();
                                            long j5 = j4 - max;
                                            long a3 = amfgVar.a() + a.a();
                                            if (a2 == -1 || j5 <= a3) {
                                                amfh amfhVar = (amfh) entry2.getKey();
                                                if (!map2.containsKey(amfhVar)) {
                                                    map2.put(amfhVar, Boolean.valueOf(((amfl) ((azrw) amgdVar3.e.get(amfhVar)).get()).a()));
                                                }
                                                if (!((Boolean) map2.get(amfhVar)).booleanValue()) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            SettableFuture f = SettableFuture.f();
                                            amgdVar3.h.put(amgrVar, f);
                                            map3.put(amgrVar, f);
                                            break;
                                        }
                                    }
                                }
                                j3 = j;
                            }
                        }
                    }
                }
                return map3;
            }
        }), amgdVar2.b), amjk.c(new amfp(amgdVar2, 0)), amgdVar2.b);
    }
}

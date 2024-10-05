package defpackage;

import android.content.Context;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.AutoValue_AccountId;
import com.google.common.util.concurrent.SettableFuture;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amgd implements amgy {
    private static final amxj j = amxj.l("com/google/apps/tiktok/sync/impl/SyncManager");
    public final shf a;
    public final anib b;
    public final amba c;
    public final amgk d;
    public final Map e;
    public final anhy f;
    private final Context k;
    private final anic l;
    private final ammv m;
    private final amha o;
    public final adz g = new adz();
    public final Map h = new adz();
    public final Map i = new adz();
    private final AtomicReference n = new AtomicReference();

    public amgd(shf shfVar, Context context, anib anibVar, anic anicVar, amba ambaVar, ammv ammvVar, amgk amgkVar, Set set, Set set2, Map map, amha amhaVar) {
        this.a = shfVar;
        this.k = context;
        this.b = anibVar;
        this.l = anicVar;
        this.c = ambaVar;
        this.m = ammvVar;
        this.d = amgkVar;
        this.e = map;
        amkq.O(set2.isEmpty(), "SyncletBindings cannot be bound outside of account scope without @ApplicationSynclet.");
        this.f = amgkVar.c();
        amxd listIterator = ((amvs) set).listIterator();
        while (listIterator.hasNext()) {
            amfk amfkVar = (amfk) listIterator.next();
            adz adzVar = this.g;
            amfi b = amfkVar.b();
            aone createBuilder = amhf.a.createBuilder();
            amhe amheVar = b.a;
            createBuilder.copyOnWrite();
            amhf amhfVar = (amhf) createBuilder.instance;
            amheVar.getClass();
            amhfVar.c = amheVar;
            amhfVar.b |= 1;
            adzVar.put(new amgr((amhf) createBuilder.build()), amfkVar);
        }
        this.o = amhaVar;
    }

    public static /* synthetic */ void i(anhy anhyVar) {
        try {
            anaf.W(anhyVar);
        } catch (CancellationException | ExecutionException e) {
            if (e.getCause() instanceof TimeoutException) {
                ((amxh) ((amxh) ((amxh) j.g()).h(e)).i("com/google/apps/tiktok/sync/impl/SyncManager", "lambda$onAccountsChanged$9", (char) 506, "SyncManager.java")).q("Timeout updating accounts in sync. Some accounts may not sync correctly.");
            } else {
                ((amxh) ((amxh) ((amxh) j.f()).h(e)).i("com/google/apps/tiktok/sync/impl/SyncManager", "lambda$onAccountsChanged$9", (char) 510, "SyncManager.java")).q("Updating sync accounts failed. Some accounts may not sync correctly.");
            }
        }
    }

    public static /* synthetic */ void k(anhy anhyVar) {
        try {
            anaf.W(anhyVar);
        } catch (CancellationException e) {
            ((amxh) ((amxh) ((amxh) j.f()).h(e)).i("com/google/apps/tiktok/sync/impl/SyncManager", "lambda$scheduleNextSync$14", (char) 590, "SyncManager.java")).q("The sync scheduling future was cancelled. This should never happen.");
        } catch (ExecutionException e2) {
            ((amxh) ((amxh) ((amxh) j.f()).h(e2)).i("com/google/apps/tiktok/sync/impl/SyncManager", "lambda$scheduleNextSync$14", (char) 588, "SyncManager.java")).q("Error scheduling next sync wakeup");
        }
    }

    private final anhy m() {
        return anfq.h(((alyw) ((amna) this.m).a).c(), amjk.a(akpw.l), this.b);
    }

    private final anhy n() {
        SettableFuture f = SettableFuture.f();
        if (this.n.compareAndSet(null, f)) {
            f.qK(anfq.h(m(), amjk.a(new amml() { // from class: amfo
                @Override // defpackage.amml
                public final Object apply(Object obj) {
                    amgd.this.h((Set) obj);
                    return null;
                }
            }), this.b));
        }
        return anaf.P((anhy) this.n.get());
    }

    public final /* synthetic */ anhy a(SettableFuture settableFuture, amgr amgrVar) {
        boolean z = false;
        try {
            anaf.W(settableFuture);
            z = true;
        } catch (CancellationException unused) {
        } catch (ExecutionException e) {
            if (e.getCause() instanceof TimeoutException) {
                ((amxh) ((amxh) ((amxh) j.g()).h(e)).i("com/google/apps/tiktok/sync/impl/SyncManager", "lambda$runSyncs$2", 278, "SyncManager.java")).s("Sync cancelled from timeout and will be retried later: %s", amgrVar.b.a());
            }
        }
        final long c = this.a.c();
        return alta.u(this.d.d(amgrVar, c, z), amjk.g(new Callable() { // from class: amft
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Long.valueOf(c);
            }
        }), this.b);
    }

    public final /* synthetic */ anhy b(anhy anhyVar, Long l) {
        final Set set;
        final amrz j2;
        Set emptySet = Collections.emptySet();
        try {
            set = (Set) anaf.W(anhyVar);
        } catch (CancellationException | ExecutionException e) {
            ((amxh) ((amxh) ((amxh) j.g()).h(e)).i("com/google/apps/tiktok/sync/impl/SyncManager", "lambda$scheduleNextSync$12", (char) 550, "SyncManager.java")).q("Unable to determine attempted syncs. They will not be used to schedule the next sync.");
            set = emptySet;
        }
        synchronized (this.g) {
            j2 = amrz.j(this.g);
        }
        final long longValue = l.longValue();
        final amha amhaVar = this.o;
        final amgv amgvVar = amhaVar.b;
        return anfq.i(anfq.i(anfq.h(amgvVar.b.b(), amjk.a(new amml() { // from class: amgu
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v29, types: [ammv] */
            /* JADX WARN: Type inference failed for: r4v32, types: [ammv] */
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                long convert;
                long convert2;
                long longValue2;
                long j3;
                amff amffVar;
                long j4;
                amgv amgvVar2 = amgv.this;
                Map map = j2;
                Set set2 = set;
                long j5 = longValue;
                Map map2 = (Map) obj;
                ArrayList<amgt> arrayList = new ArrayList();
                long c = amgvVar2.a.c();
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    amgr amgrVar = (amgr) entry.getKey();
                    amff a = ((amfk) entry.getValue()).a();
                    Long l2 = (Long) map2.get(amgrVar);
                    if (set2.contains(amgrVar)) {
                        longValue2 = c;
                    } else {
                        longValue2 = l2 == null ? j5 : l2.longValue();
                    }
                    amsv i = amsx.i();
                    amlr amlrVar = amlr.a;
                    Iterator it2 = it;
                    Set set3 = set2;
                    long a2 = a.a() + longValue2;
                    for (amfg amfgVar : a.c().values()) {
                        long a3 = amfgVar.a();
                        if (a3 != -1) {
                            j3 = j5;
                            long a4 = a3 + a.a() + longValue2;
                            if (c <= a4) {
                                if (!amlrVar.h()) {
                                    amlrVar = ammv.j(Long.valueOf(a4));
                                    amffVar = a;
                                    j4 = longValue2;
                                } else {
                                    amffVar = a;
                                    j4 = longValue2;
                                    amlrVar = ammv.j(Long.valueOf(Math.min(((Long) amlrVar.c()).longValue(), a4)));
                                }
                                i.c(amfgVar.b());
                            } else {
                                amffVar = a;
                                j4 = longValue2;
                            }
                        } else {
                            j3 = j5;
                            amffVar = a;
                            j4 = longValue2;
                            i.c(amfgVar.b());
                        }
                        a = amffVar;
                        j5 = j3;
                        longValue2 = j4;
                    }
                    long j6 = j5;
                    amgs a5 = amgt.a();
                    a5.a = a2;
                    a5.b = amlrVar;
                    a5.b(i.g());
                    arrayList.add(a5.a());
                    it = it2;
                    set2 = set3;
                    j5 = j6;
                }
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    amgt amgtVar = (amgt) arrayList.get(i2);
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    if (uqq.s(amgx.a)) {
                        convert2 = timeUnit.convert(5L, TimeUnit.SECONDS);
                    } else {
                        convert2 = timeUnit.convert(15L, TimeUnit.MINUTES);
                    }
                    long j7 = amgtVar.b;
                    long j8 = convert2 + c;
                    if (j7 < j8) {
                        long max = Math.max(c, j7);
                        amgs a6 = amgt.a();
                        a6.b(amgtVar.a);
                        a6.a = j8;
                        if (amgtVar.c.h()) {
                            long j9 = j8 - max;
                            amkq.N(j9 > 0);
                            amkq.N(j9 <= convert2);
                            a6.b = ammv.j(Long.valueOf(((Long) amgtVar.c.c()).longValue() + j9));
                        }
                        arrayList.set(i2, a6.a());
                    }
                }
                long abs = Math.abs(((SecureRandom) amgvVar2.d.a.get()).nextLong());
                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                if (uqq.s(amgx.a)) {
                    convert = timeUnit2.convert(5L, TimeUnit.SECONDS);
                } else {
                    convert = timeUnit2.convert(15L, TimeUnit.MINUTES);
                }
                long j10 = abs % convert;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    amgt amgtVar2 = (amgt) arrayList.get(i3);
                    amgs a7 = amgt.a();
                    a7.b(amgtVar2.a);
                    a7.a = amgtVar2.b + j10;
                    if (amgtVar2.c.h()) {
                        a7.b = ammv.j(Long.valueOf(((Long) amgtVar2.c.c()).longValue() + j10));
                    }
                    arrayList.set(i3, a7.a());
                }
                adz adzVar = new adz();
                for (amgt amgtVar3 : arrayList) {
                    Set set4 = amgtVar3.a;
                    amgt amgtVar4 = (amgt) adzVar.get(set4);
                    if (amgtVar4 == null) {
                        adzVar.put(set4, amgtVar3);
                    } else {
                        adzVar.put(set4, amgt.b(amgtVar4, amgtVar3));
                    }
                }
                ammv ammvVar = amlr.a;
                for (amgt amgtVar5 : adzVar.values()) {
                    if (amgtVar5.c.h()) {
                        ammvVar = ammvVar.h() ? ammv.j(Long.valueOf(Math.min(((Long) ammvVar.c()).longValue(), ((Long) amgtVar5.c.c()).longValue()))) : amgtVar5.c;
                    }
                }
                if (!ammvVar.h()) {
                    return adzVar;
                }
                HashMap hashMap = new HashMap(adzVar);
                amvs amvsVar = amvs.a;
                amgs a8 = amgt.a();
                a8.a = ((Long) ammvVar.c()).longValue();
                a8.b = ammvVar;
                a8.b(amvsVar);
                amgt a9 = a8.a();
                amgt amgtVar6 = (amgt) hashMap.get(amvsVar);
                if (amgtVar6 == null) {
                    hashMap.put(amvsVar, a9);
                } else {
                    hashMap.put(amvsVar, amgt.b(amgtVar6, a9));
                }
                return Collections.unmodifiableMap(hashMap);
            }
        }), amgvVar.c), amjk.c(new anfz() { // from class: amgz
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                amha amhaVar2 = amha.this;
                Map map = (Map) obj;
                if (map.isEmpty()) {
                    return anaf.O(null);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    amgt amgtVar = (amgt) ((Map.Entry) it.next()).getValue();
                    amcp amcpVar = amhaVar2.a;
                    amcq amcqVar = new amcq((byte[]) null);
                    amcqVar.a = amhb.class;
                    amcqVar.b(byo.a);
                    amcqVar.b = amcr.a(0L, TimeUnit.SECONDS);
                    amcqVar.c(amvs.a);
                    amcqVar.c = bxw.a(new HashMap());
                    Set set2 = amgtVar.a;
                    StringBuilder sb = new StringBuilder("SyncTask");
                    Iterator it2 = new TreeSet(set2).iterator();
                    while (it2.hasNext()) {
                        sb.append(((amfh) it2.next()).d);
                        sb.append('_');
                    }
                    amcqVar.d = ammv.j(new amcs(sb.toString()));
                    amcqVar.b = amcr.a(Math.max(0L, amgtVar.b - amhaVar2.c.c()), TimeUnit.MILLISECONDS);
                    boolean z = false;
                    boolean z2 = false;
                    boolean z3 = false;
                    for (amfh amfhVar : amgtVar.a) {
                        boolean z4 = true;
                        z |= amfhVar == amfh.ON_CHARGER;
                        z3 |= amfhVar == amfh.ON_NETWORK_CONNECTED;
                        if (amfhVar != amfh.ON_NETWORK_UNMETERED) {
                            z4 = false;
                        }
                        z2 |= z4;
                    }
                    byn bynVar = new byn();
                    bynVar.a = z;
                    if (z2) {
                        bynVar.c = 3;
                    } else if (z3) {
                        bynVar.c = 2;
                    }
                    amcqVar.b(bynVar.a());
                    arrayList.add(amcpVar.a(amcqVar.a()));
                }
                return anaf.J(arrayList).a(aein.f, angq.a);
            }
        }), amhaVar.d), amjk.c(new anfz() { // from class: amfq
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                amgd amgdVar = amgd.this;
                amrz amrzVar = j2;
                amgk amgkVar = amgdVar.d;
                return amgkVar.c.submit(new amgg(amgkVar, amrzVar.keySet(), 0));
            }
        }), angq.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ anhy c(anhy anhyVar, final Map map) {
        Throwable th;
        boolean z;
        amip amipVar;
        amfk amfkVar;
        try {
            z = ((Boolean) anaf.W(anhyVar)).booleanValue();
            th = null;
        } catch (CancellationException | ExecutionException e) {
            th = e;
            z = false;
        }
        if (z) {
            amkq.N(n().isDone());
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                final amgr amgrVar = (amgr) entry.getKey();
                final SettableFuture settableFuture = (SettableFuture) entry.getValue();
                StringBuilder sb = new StringBuilder("Synclet: ");
                sb.append(amgrVar.b.a());
                if (amgrVar.b()) {
                    sb.append(" ");
                    sb.append(((AutoValue_AccountId) amgrVar.c).a);
                }
                if (!amgrVar.b()) {
                    amipVar = amio.a;
                } else {
                    amin b = amip.b();
                    AccountId accountId = amgrVar.c;
                    if (((AutoValue_AccountId) accountId).a != -1) {
                        b.a(alwj.a, accountId);
                    }
                    amipVar = ((amip) b).e();
                }
                amil m = amjw.m(sb.toString(), amipVar);
                try {
                    final anhy v = alta.v(settableFuture, amjk.b(new anfy() { // from class: amgb
                        @Override // defpackage.anfy
                        public final anhy a() {
                            return amgd.this.a(settableFuture, amgrVar);
                        }
                    }), this.b);
                    m.a(v);
                    v.d(amjk.f(new Runnable() { // from class: amfs
                        @Override // java.lang.Runnable
                        public final void run() {
                            amgd.this.j(amgrVar, v);
                        }
                    }), this.b);
                    synchronized (this.g) {
                        amfkVar = (amfk) this.g.get(amgrVar);
                    }
                    if (amfkVar != null) {
                        amfj amfjVar = (amfj) amfkVar.c().get();
                        amfjVar.getClass();
                        settableFuture.qK(anaf.V(amfjVar.a(), amfkVar.a().b(), TimeUnit.MILLISECONDS, this.l));
                    } else {
                        settableFuture.cancel(true);
                    }
                    arrayList.add(v);
                    m.close();
                } catch (Throwable th2) {
                    try {
                        m.close();
                    } catch (Throwable unused) {
                    }
                    throw th2;
                }
            }
            return anaf.U(arrayList);
        }
        ((amxh) ((amxh) ((amxh) j.g()).h(th)).i("com/google/apps/tiktok/sync/impl/SyncManager", "lambda$sync$6", (char) 380, "SyncManager.java")).q("Failed preparing sync datastore for sync. Aborting sync attempt.");
        long c = this.a.c();
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            arrayList2.add(this.d.d((amgr) it.next(), c, false));
        }
        return alta.u(anaf.L(arrayList2), amjk.g(new Callable() { // from class: amfw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                amgd amgdVar = amgd.this;
                Map map2 = map;
                synchronized (amgdVar.h) {
                    Iterator it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        amgdVar.h.remove((amgr) it2.next());
                    }
                }
                return null;
            }
        }), this.b);
    }

    public final anhy d() {
        amkq.O(true, "onAccountsChanged called without an AccountManager bound");
        final anhy g = g(m());
        amgk amgkVar = this.d;
        final anhy submit = amgkVar.c.submit(amjk.g(new amgh(amgkVar, 1)));
        anhy b = anaf.K(g, submit).b(amjk.b(new anfy() { // from class: amfz
            @Override // defpackage.anfy
            public final anhy a() {
                int i;
                amgd amgdVar = amgd.this;
                anhy anhyVar = g;
                anhy anhyVar2 = submit;
                Set set = (Set) anaf.W(anhyVar);
                Set set2 = (Set) anaf.W(anhyVar2);
                amwe al = amkq.al(set, set2);
                amwe al2 = amkq.al(set2, set);
                amgdVar.h(al);
                HashSet hashSet = new HashSet();
                synchronized (amgdVar.g) {
                    for (amgr amgrVar : amgdVar.g.keySet()) {
                        if (al2.contains(amgrVar.c)) {
                            hashSet.add(amgrVar);
                        }
                    }
                    synchronized (amgdVar.h) {
                        Iterator it = hashSet.iterator();
                        while (true) {
                            i = 1;
                            if (!it.hasNext()) {
                                break;
                            }
                            anhy anhyVar3 = (anhy) amgdVar.h.get((amgr) it.next());
                            if (anhyVar3 != null) {
                                anhyVar3.cancel(true);
                            }
                        }
                    }
                    amgdVar.g.keySet().removeAll(hashSet);
                    amba ambaVar = amgdVar.c;
                    amgk amgkVar2 = amgdVar.d;
                    anhy submit2 = amgkVar2.c.submit(new amgg(amgkVar2, hashSet, i));
                    ambaVar.c(submit2);
                    amba.b(submit2, "Error removing accounts from sync. IDs: %s", al2);
                }
                if (!al.isEmpty() || !al2.isEmpty()) {
                    anhy O = anaf.O(Collections.emptySet());
                    amgdVar.l(O);
                    return anfq.h(O, amkq.aa(), angq.a);
                }
                return anaf.O(null);
            }
        }), this.b);
        this.n.set(b);
        anhy V = anaf.V(b, 10L, TimeUnit.SECONDS, this.l);
        anhz b2 = anhz.b(amjk.f(new amew(V, 4)));
        V.d(b2, angq.a);
        return b2;
    }

    @Override // defpackage.amgy
    public final anhy e() {
        anhy O = anaf.O(Collections.emptySet());
        l(O);
        return O;
    }

    @Override // defpackage.amgy
    public final anhy f() {
        final long c = this.a.c();
        final amgk amgkVar = this.d;
        return alta.v(amgkVar.c.submit(new Callable() { // from class: amgi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                amgk amgkVar2 = amgk.this;
                long j2 = c;
                amhd amhdVar = amhd.a;
                amgkVar2.b.writeLock().lock();
                try {
                    try {
                        amhdVar = amgkVar2.a();
                    } catch (IOException e) {
                        amnz.a(e);
                    }
                    aone createBuilder = amhd.a.createBuilder();
                    createBuilder.mergeFrom((aonm) amhdVar);
                    createBuilder.copyOnWrite();
                    amhd amhdVar2 = (amhd) createBuilder.instance;
                    amhdVar2.b |= 2;
                    amhdVar2.e = j2;
                    try {
                        amgkVar2.e((amhd) createBuilder.build());
                    } catch (IOException e2) {
                        ((amxh) ((amxh) ((amxh) amgk.a.g()).h(e2)).i("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "lambda$getLastWakeupAndSetNewWakeup$7", (char) 457, "SyncManagerDataStore.java")).q("Error writing sync data file. Cannot update last wakeup.");
                    }
                    amgkVar2.b.writeLock().unlock();
                    int i = amhdVar.b;
                    if ((i & 2) != 0) {
                        return Long.valueOf(amhdVar.e);
                    }
                    if ((i & 1) != 0) {
                        return Long.valueOf(amhdVar.c);
                    }
                    return -1L;
                } catch (Throwable th) {
                    amgkVar2.b.writeLock().unlock();
                    throw th;
                }
            }
        }), amjk.b(new anfy() { // from class: amfy
            @Override // defpackage.anfy
            public final anhy a() {
                amgd amgdVar = amgd.this;
                anhy i = anfq.i(amgdVar.f, amjk.c(new amfp(amgdVar, 1)), amgdVar.b);
                amgdVar.l(i);
                return i;
            }
        }), this.b);
    }

    public final anhy g(anhy anhyVar) {
        return anfq.i(n(), new aeds(anhyVar, 3), angq.a);
    }

    public final void h(Set set) {
        synchronized (this.g) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                AccountId accountId = (AccountId) it.next();
                try {
                    amxd listIterator = ((amvs) ((amgl) amgl.class.cast(((amdn) alta.t(this.k.getApplicationContext(), amdn.class)).gQ().a(accountId))).a()).listIterator();
                    while (listIterator.hasNext()) {
                        amfk amfkVar = (amfk) listIterator.next();
                        amfi b = amfkVar.b();
                        int a = accountId.a();
                        aone createBuilder = amhf.a.createBuilder();
                        amhe amheVar = b.a;
                        createBuilder.copyOnWrite();
                        amhf amhfVar = (amhf) createBuilder.instance;
                        amheVar.getClass();
                        amhfVar.c = amheVar;
                        amhfVar.b |= 1;
                        createBuilder.copyOnWrite();
                        amhf amhfVar2 = (amhf) createBuilder.instance;
                        amhfVar2.b |= 2;
                        amhfVar2.d = a;
                        this.g.put(new amgr((amhf) createBuilder.build()), amfkVar);
                    }
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonAccountEntryPoint?", e);
                }
            }
        }
    }

    public final /* synthetic */ void j(amgr amgrVar, anhy anhyVar) {
        synchronized (this.h) {
            this.h.remove(amgrVar);
            try {
                this.i.put(amgrVar, (Long) anaf.W(anhyVar));
            } catch (CancellationException | ExecutionException unused) {
            }
        }
    }

    public final void l(final anhy anhyVar) {
        anhy P = anaf.P(anfq.i(this.f, amjk.c(new anfz() { // from class: amfr
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                final amgd amgdVar = amgd.this;
                final anhy anhyVar2 = anhyVar;
                final Long l = (Long) obj;
                return alta.v(amgdVar.g(anhyVar2), amjk.b(new anfy() { // from class: amga
                    @Override // defpackage.anfy
                    public final anhy a() {
                        return amgd.this.b(anhyVar2, l);
                    }
                }), amgdVar.b);
            }
        }), this.b));
        this.c.c(P);
        P.d(new amew(P, 5), this.b);
    }
}

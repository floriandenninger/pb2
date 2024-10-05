package defpackage;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.Observer;
import com.google.android.libraries.elements.interfaces.Snapshot;
import com.google.android.libraries.elements.interfaces.TransactionRecord;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaih extends Observer implements aahu, aalk {
    public final aalo a;
    public final amrz b;
    public final aaht c;
    List g;
    private final aals h;
    private final Executor i;
    public boolean d = false;
    private boolean j = false;
    public final Map e = new ConcurrentHashMap();
    private final ConcurrentHashMap k = new ConcurrentHashMap();
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    private volatile boolean l = false;

    public aaih(azrw azrwVar, aals aalsVar, Map map, Executor executor) {
        aalo aaloVar = new aalo(azrwVar, this);
        this.a = aaloVar;
        this.h = aalsVar;
        this.b = amrz.j(map);
        this.i = executor;
        this.c = new aaht(this, new aaig(this), aalsVar, aaloVar);
    }

    public static aali k(final Map map, final Object obj) {
        aali aaliVar = (aali) map.get(obj);
        if (aaliVar == null) {
            synchronized (map) {
                aaliVar = (aali) map.get(obj);
                if (aaliVar == null) {
                    aaliVar = aali.e(new Runnable() { // from class: aaif
                        @Override // java.lang.Runnable
                        public final void run() {
                            aaih.o(map, obj);
                        }
                    });
                    map.put(obj, aaliVar);
                }
            }
        }
        return aaliVar;
    }

    public static void o(Map map, Object obj) {
        map.remove(obj);
    }

    public static boolean p(awuh awuhVar, aoqa aoqaVar) {
        if (aoqaVar.equals(aalj.a)) {
            return true;
        }
        aoqa aoqaVar2 = awuhVar.d;
        if (aoqaVar2 == null) {
            aoqaVar2 = aoqa.a;
        }
        return aora.a(aoqaVar, aoqaVar2) > 0;
    }

    private final synchronized void q() {
        List list = this.g;
        if (list != null) {
            final amru o = amru.o(list);
            this.i.execute(new Runnable() { // from class: aaie
                @Override // java.lang.Runnable
                public final void run() {
                    amru amruVar = amru.this;
                    int size = amruVar.size();
                    for (int i = 0; i < size; i++) {
                        ((Runnable) amruVar.get(i)).run();
                    }
                }
            });
        }
        this.g = null;
    }

    @Override // defpackage.aahu
    public final aypy a(Class cls) {
        return this.l ? aypy.J(aahw.e()) : k(this.f, cls).U();
    }

    @Override // defpackage.aakv
    public final aakt b(String str) {
        return (aakt) f(str).X();
    }

    @Override // defpackage.aalk
    public final aalc d(aoqa aoqaVar) {
        aaio c = c();
        c.b = aoqaVar;
        return c;
    }

    @Override // defpackage.aakv
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final aaio c() {
        return new aaio(this);
    }

    @Override // defpackage.aakv
    public final ayps f(String str) {
        return this.l ? ayps.q(aahw.e()) : ayps.u(new aahz(this, str, 2));
    }

    @Override // defpackage.aakv
    public final aypy g(Class cls) {
        return this.l ? aypy.J(aahw.e()) : k(this.k, cls).U();
    }

    @Override // defpackage.aakv
    public final aypy h(String str, boolean z) {
        if (this.l) {
            return aypy.J(aahw.e());
        }
        if (z) {
            return aypy.y(new aahz(this, str, 1));
        }
        return k(this.e, str).U();
    }

    @Override // defpackage.aakv
    public final aypy i(String str) {
        return this.l ? aypy.J(aahw.e()) : aypy.y(new aahz(this, str, 0));
    }

    @Override // defpackage.aakv
    public final ayqj j(String str) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ayph l(final List list, final boolean z) {
        if (list.isEmpty()) {
            return ayph.f();
        }
        ayph u = ayph.u(new Callable() { // from class: aaia
            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:41:0x003c
                	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
                	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
                */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                /*
                    r6 = this;
                    aaih r0 = defpackage.aaih.this
                    java.util.List r1 = r2
                    boolean r2 = r3
                    aaht r3 = r0.c
                    com.google.android.libraries.elements.interfaces.ByteStore r3 = r3.a
                    com.google.android.libraries.elements.interfaces.Transaction r3 = r3.createTransaction()
                    if (r3 == 0) goto L7a
                    r4 = 0
                    java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L3f defpackage.aall -> L41
                L15:
                    boolean r5 = r1.hasNext()     // Catch: java.lang.Throwable -> L3f defpackage.aall -> L41
                    if (r5 == 0) goto L25
                    java.lang.Object r5 = r1.next()     // Catch: java.lang.Throwable -> L3f defpackage.aall -> L41
                    aain r5 = (defpackage.aain) r5     // Catch: java.lang.Throwable -> L3f defpackage.aall -> L41
                    r5.a()     // Catch: java.lang.Throwable -> L3f defpackage.aall -> L41
                    goto L15
                L25:
                    monitor-enter(r0)     // Catch: java.lang.Throwable -> L3f defpackage.aall -> L41
                    r1 = 1
                    r2 = r2 ^ r1
                    r0.d = r2     // Catch: java.lang.Throwable -> L3c
                    r3.commit()     // Catch: java.lang.Throwable -> L3c
                    r2 = 0
                    r0.d = r2     // Catch: java.lang.Throwable -> L39
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch: defpackage.aall -> L36 java.lang.Throwable -> L6d
                    return r0
                L36:
                    r1 = move-exception
                    r3 = r4
                    goto L42
                L39:
                    r1 = move-exception
                    r3 = r4
                    goto L3d
                L3c:
                    r1 = move-exception
                L3d:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
                    throw r1     // Catch: java.lang.Throwable -> L3f defpackage.aall -> L41
                L3f:
                    r1 = move-exception
                    goto L6f
                L41:
                    r1 = move-exception
                L42:
                    r3.abort()     // Catch: java.lang.Throwable -> L3f
                    java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L6d
                    java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L6d
                    int r2 = r2.length()     // Catch: java.lang.Throwable -> L6d
                    int r2 = r2 + 38
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d
                    r3.<init>(r2)     // Catch: java.lang.Throwable -> L6d
                    java.lang.String r2 = "Transaction aborted due to failed edit"
                    r3.append(r2)     // Catch: java.lang.Throwable -> L6d
                    r3.append(r1)     // Catch: java.lang.Throwable -> L6d
                    java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L6d
                    r0.m(r1)     // Catch: java.lang.Throwable -> L6d
                    aall r2 = new aall     // Catch: java.lang.Throwable -> L6d
                    r2.<init>(r1)     // Catch: java.lang.Throwable -> L6d
                    throw r2     // Catch: java.lang.Throwable -> L6d
                L6d:
                    r1 = move-exception
                    r3 = r4
                L6f:
                    if (r3 == 0) goto L79
                    r3.abort()
                    java.lang.String r2 = "Transaction aborted due to unhandled exception"
                    r0.m(r2)
                L79:
                    throw r1
                L7a:
                    java.lang.String r1 = "Failed to create transaction"
                    r0.m(r1)
                    aall r0 = new aall
                    r0.<init>(r1)
                    goto L86
                L85:
                    throw r0
                L86:
                    goto L85
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.aaia.call():java.lang.Object");
            }
        });
        azrj W = azrj.W();
        u.I(W);
        return W;
    }

    public final void m(String str) {
        this.h.a("EntityStore", str);
    }

    public final synchronized void n() {
        if (this.l) {
            return;
        }
        this.l = true;
        m("clearing the store.");
        this.j = true;
        this.c.a.clear();
        q();
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            ((aali) it.next()).sh();
        }
        this.e.clear();
        Iterator it2 = this.k.values().iterator();
        while (it2.hasNext()) {
            ((aali) it2.next()).sh();
        }
        this.k.clear();
        Iterator it3 = this.f.values().iterator();
        while (it3.hasNext()) {
            ((aali) it3.next()).sh();
        }
        this.f.clear();
        this.j = false;
    }

    @Override // com.google.android.libraries.elements.interfaces.Observer
    public final synchronized void storeDidUpdate(ByteStore byteStore, TransactionRecord transactionRecord) {
        if (this.d) {
            return;
        }
        final boolean z = this.j;
        HashSet hashSet = new HashSet();
        this.g = new ArrayList();
        ArrayList<aakz> arrayList = new ArrayList();
        Snapshot beginState = transactionRecord.beginState();
        Snapshot endState = transactionRecord.endState();
        ArrayList keysOrdered = transactionRecord.keysOrdered();
        ArrayDeque<String> arrayDeque = new ArrayDeque(keysOrdered.size());
        HashSet hashSet2 = new HashSet();
        int size = keysOrdered.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            String str = (String) keysOrdered.get(size);
            if (!hashSet2.contains(str)) {
                hashSet2.add(str);
                arrayDeque.addFirst(str);
            }
        }
        for (String str2 : arrayDeque) {
            aahs c = this.c.c(str2, beginState);
            aahs c2 = this.c.c(str2, endState);
            if (c.a != null || c2.a != null) {
                aaku f = aaht.f(c.b);
                aaku f2 = aaht.f(c2.b);
                if (!amkq.b(f, f2) || !amkq.b(c.a, c2.a)) {
                    aakx a = aakz.a();
                    a.c(str2);
                    a.a = c.a;
                    a.b = c2.a;
                    a.d(f);
                    a.b(f2);
                    a.e(z ? aaky.CLEAR_ON_SIGN_OUT : aaky.UNKNOWN);
                    arrayList.add(a.a());
                }
            } else {
                String valueOf = String.valueOf(str2);
                m(valueOf.length() != 0 ? "Store update with no parseable values for ".concat(valueOf) : new String("Store update with no parseable values for "));
            }
        }
        for (final aakz aakzVar : arrayList) {
            String str3 = aakzVar.a;
            final aali aaliVar = (aali) this.e.get(str3);
            final aali aaliVar2 = (aali) this.k.get(aakzVar.b());
            if (aaliVar != null || aaliVar2 != null) {
                if (z) {
                    if (aaliVar != null) {
                        o(this.e, str3);
                    }
                    if (aaliVar2 != null) {
                        hashSet.add(aakzVar.b());
                    }
                }
                this.g.add(new Runnable() { // from class: aaid
                    @Override // java.lang.Runnable
                    public final void run() {
                        aali aaliVar3 = aali.this;
                        aakz aakzVar2 = aakzVar;
                        boolean z2 = z;
                        aali aaliVar4 = aaliVar2;
                        if (aaliVar3 != null) {
                            aaliVar3.c(aakzVar2);
                            if (z2) {
                                aaliVar3.sh();
                            }
                        }
                        if (aaliVar4 != null) {
                            aaliVar4.c(aakzVar2);
                        }
                    }
                });
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            final aali aaliVar3 = (aali) this.k.remove((Class) it.next());
            List list = this.g;
            aaliVar3.getClass();
            list.add(new Runnable() { // from class: aaic
                @Override // java.lang.Runnable
                public final void run() {
                    aali.this.sh();
                }
            });
        }
        q();
    }
}

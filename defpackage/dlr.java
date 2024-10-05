package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dlr {
    public Map a;
    public Map b;
    public Map c;
    public Map d;
    public Map e;
    public HashSet f;
    private Map g;

    public dlr() {
        this(null);
    }

    public static dlr a(dlr dlrVar) {
        return new dlr(dlrVar);
    }

    private static List o(List list) {
        ArrayList arrayList = new ArrayList(list == null ? 4 : list.size());
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    private static void p(String str, dlp dlpVar, Map map) {
        List list = (List) map.get(str);
        if (list == null) {
            list = o(null);
            map.put(str, list);
        }
        list.add(dlpVar);
    }

    private final void q(Map map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        synchronized (this) {
            l();
            this.e.clear();
            this.e.putAll(map);
        }
    }

    private final void r(Map map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        synchronized (this) {
            k();
            this.c.putAll(map);
        }
    }

    private final synchronized void s() {
        if (this.b == null) {
            this.b = new HashMap(4);
        }
    }

    private final synchronized void t() {
        if (this.a == null) {
            this.a = new HashMap(4);
        }
        if (this.d == null) {
            this.d = new HashMap(4);
        }
    }

    final synchronized Map b() {
        return this.d;
    }

    final synchronized Map c() {
        return this.b;
    }

    final synchronized Map d() {
        return this.c;
    }

    final synchronized Map e() {
        return this.a;
    }

    final synchronized Map f() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized Set g() {
        HashSet hashSet;
        hashSet = new HashSet();
        Map map = this.d;
        if (map != null) {
            hashSet.addAll(map.keySet());
        }
        Map map2 = this.a;
        if (map2 != null) {
            hashSet.addAll(map2.keySet());
        }
        return hashSet;
    }

    public final void h(dlr dlrVar) {
        List list;
        List list2;
        Map map;
        Map b = dlrVar.b();
        synchronized (this) {
            if (b != null) {
                Map map2 = this.a;
                if (map2 != null && !map2.isEmpty()) {
                    for (Map.Entry entry : b.entrySet()) {
                        String str = (String) entry.getKey();
                        synchronized (this) {
                            list = (List) this.a.get(str);
                            Map map3 = this.b;
                            list2 = map3 == null ? null : (List) map3.get(str);
                        }
                        if (list != null) {
                            List list3 = (List) entry.getValue();
                            if (list.size() == list3.size()) {
                                synchronized (this) {
                                    this.a.remove(str);
                                    Map map4 = this.b;
                                    if (map4 != null) {
                                        map4.remove(str);
                                    }
                                }
                            } else {
                                list.removeAll(list3);
                                if (list2 != null) {
                                    list2.removeAll(list3);
                                }
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = dlrVar.f;
        ArrayList arrayList = new ArrayList();
        if (hashSet != null && (map = dlrVar.e) != null) {
            arrayList.addAll(map.keySet());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                String str2 = (String) arrayList.get(i);
                if (!hashSet.contains(str2)) {
                    dlrVar.e.remove(str2);
                }
            }
        }
        q(dlrVar.f());
        r(dlrVar.d());
        Map map5 = this.g;
        if (map5 != null) {
            map5.clear();
        }
        Map map6 = dlrVar.g;
        if (map6 == null || map6.isEmpty()) {
            return;
        }
        Map map7 = this.g;
        if (map7 == null) {
            this.g = new HashMap(dlrVar.g);
        } else {
            map7.putAll(dlrVar.g);
        }
    }

    public final synchronized void i(List list, String str) {
        Map map = this.c;
        if (map == null) {
            return;
        }
        for (List list2 : map.values()) {
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                did.q((dmh) list2.get(i), list, str);
            }
        }
        this.c = null;
    }

    public final synchronized void j() {
        if (this.f == null) {
            this.f = new HashSet();
        }
    }

    public final synchronized void k() {
        if (this.c == null) {
            this.c = new HashMap();
        }
    }

    public final synchronized void l() {
        if (this.e == null) {
            this.e = new HashMap(4);
        }
    }

    public final synchronized void m(String str, dlp dlpVar, boolean z) {
        t();
        p(str, dlpVar, this.a);
        if (z) {
            s();
            p(str, dlpVar, this.b);
        }
    }

    public final synchronized boolean n() {
        boolean z;
        Map map = this.a;
        if (map != null) {
            z = map.isEmpty() ? false : true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0088, code lost:
    
        r0 = r2.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
    
        if (r0.hasNext() == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0096, code lost:
    
        r1 = (java.util.Map.Entry) r0.next();
        r7.d.put((java.lang.String) r1.getKey(), o((java.util.List) r1.getValue()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dlr(defpackage.dlr r8) {
        /*
            r7 = this;
            r7.<init>()
            if (r8 != 0) goto L6
            return
        L6:
            monitor-enter(r7)
            java.util.Map r0 = r8.e()     // Catch: java.lang.Throwable -> Lce
            java.util.Map r1 = r8.c()     // Catch: java.lang.Throwable -> Lce
            java.util.Map r2 = r8.b()     // Catch: java.lang.Throwable -> Lce
            if (r0 == 0) goto L1b
            boolean r3 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lce
            if (r3 == 0) goto L25
        L1b:
            if (r2 == 0) goto Lb3
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> Lce
            if (r3 == 0) goto L25
            goto Lb3
        L25:
            r7.t()     // Catch: java.lang.Throwable -> Lce
            if (r0 == 0) goto L50
            java.util.Set r3 = r0.keySet()     // Catch: java.lang.Throwable -> L4e
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L4e
        L32:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L4e
            if (r4 == 0) goto L50
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L4e
            java.util.Map r5 = r7.a     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r6 = r0.get(r4)     // Catch: java.lang.Throwable -> L4e
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L4e
            java.util.List r6 = o(r6)     // Catch: java.lang.Throwable -> L4e
            r5.put(r4, r6)     // Catch: java.lang.Throwable -> L4e
            goto L32
        L4e:
            r8 = move-exception
            goto Lb2
        L50:
            if (r1 == 0) goto L86
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L59
            goto L86
        L59:
            r7.s()     // Catch: java.lang.Throwable -> L4e
            java.util.Set r0 = r1.entrySet()     // Catch: java.lang.Throwable -> L4e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L4e
        L64:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L86
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L4e
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L4e
            java.util.Map r3 = r7.b     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r4 = r1.getKey()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L4e
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L4e
            java.util.List r1 = o(r1)     // Catch: java.lang.Throwable -> L4e
            r3.put(r4, r1)     // Catch: java.lang.Throwable -> L4e
            goto L64
        L86:
            if (r2 == 0) goto Lb3
            java.util.Set r0 = r2.entrySet()     // Catch: java.lang.Throwable -> L4e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L4e
        L90:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto Lb3
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L4e
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L4e
            java.util.Map r2 = r7.d     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L4e
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L4e
            java.util.List r1 = o(r1)     // Catch: java.lang.Throwable -> L4e
            r2.put(r3, r1)     // Catch: java.lang.Throwable -> L4e
            goto L90
        Lb2:
            throw r8     // Catch: java.lang.Throwable -> Lce
        Lb3:
            java.util.Map r0 = r8.f()     // Catch: java.lang.Throwable -> Lce
            r7.q(r0)     // Catch: java.lang.Throwable -> Lce
            java.util.Map r0 = r8.d()     // Catch: java.lang.Throwable -> Lce
            r7.r(r0)     // Catch: java.lang.Throwable -> Lce
            java.util.Map r8 = r8.g     // Catch: java.lang.Throwable -> Lce
            if (r8 == 0) goto Lcc
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lce
            r0.<init>(r8)     // Catch: java.lang.Throwable -> Lce
            r7.g = r0     // Catch: java.lang.Throwable -> Lce
        Lcc:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lce
            return
        Lce:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lce
            goto Ld2
        Ld1:
            throw r8
        Ld2:
            goto Ld1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlr.<init>(dlr):void");
    }
}

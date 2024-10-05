package defpackage;

import android.util.Pair;
import com.google.apps.tiktok.account.AccountId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alzf {
    public final azrw a;
    public final alyw b;
    public final shf c;
    public final azrw d;
    public final int e;
    public final Executor f;
    public final vgz g;
    private final anha h = anha.a();

    public alzf(azrw azrwVar, alyw alywVar, vgz vgzVar, shf shfVar, azrw azrwVar2, int i, Executor executor) {
        this.a = azrwVar;
        this.b = alywVar;
        this.g = vgzVar;
        this.c = shfVar;
        this.d = azrwVar2;
        this.e = i;
        this.f = executor;
    }

    public final anhy a() {
        anhy d = d();
        c(d);
        return d;
    }

    public final anhy b() {
        return this.g.b(new amml() { // from class: alzb
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                alzf alzfVar = alzf.this;
                aone builder = ((alzi) obj).toBuilder();
                long c = alzfVar.c.c();
                builder.copyOnWrite();
                alzi alziVar = (alzi) builder.instance;
                alziVar.b |= 1;
                alziVar.c = c;
                int i = alzfVar.e;
                builder.copyOnWrite();
                alzi alziVar2 = (alzi) builder.instance;
                alziVar2.b |= 2;
                alziVar2.d = i;
                return (alzi) builder.build();
            }
        }, angq.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(anhy anhyVar) {
        anaf.Y(anhyVar, amjk.e(new alze(this)), this.f);
    }

    public final anhy d() {
        return this.h.b(amjk.b(new anfy() { // from class: alzc
            @Override // defpackage.anfy
            public final anhy a() {
                final alzf alzfVar = alzf.this;
                alzh alzhVar = (alzh) alzfVar.a.get();
                boolean z = alzhVar.a;
                if (amsx.p(alzhVar.a().values()).isEmpty()) {
                    return alzfVar.b();
                }
                alzh alzhVar2 = (alzh) alzfVar.a.get();
                boolean z2 = alzhVar2.a;
                amrz a = alzhVar2.a();
                ArrayList arrayList = new ArrayList();
                amxd listIterator = a.entrySet().listIterator();
                while (listIterator.hasNext()) {
                    Map.Entry entry = (Map.Entry) listIterator.next();
                    final String str = (String) entry.getKey();
                    final alyx alyxVar = (alyx) entry.getValue();
                    arrayList.add(anfq.h(alyxVar.a(), amjk.a(new amml() { // from class: alzg
                        @Override // defpackage.amml
                        public final Object apply(Object obj) {
                            String str2 = str;
                            alyx alyxVar2 = alyxVar;
                            amru amruVar = (amru) obj;
                            int size = amruVar.size();
                            for (int i = 0; i < size; i++) {
                                alym alymVar = (alym) amruVar.get(i);
                                amkq.U(str2.equals(alymVar.i), "AccountProvider %s provides account(s) of different type from the declared one. Declared type: %s provided type: %s", alyxVar2, str2, alymVar.i);
                            }
                            return amruVar;
                        }
                    }), alzhVar2.b));
                }
                anht q = anht.q(anaf.J(arrayList).a(amjk.g(new adec(arrayList, 2)), alzhVar2.b));
                final int i = 1;
                anhy i2 = anfq.i(q, amjk.c(new anfz() { // from class: alzd
                    @Override // defpackage.anfz
                    public final anhy a(Object obj) {
                        if (i == 0) {
                            return alzfVar.b();
                        }
                        final amru amruVar = (amru) obj;
                        alzr alzrVar = alzfVar.b.b;
                        amil l = amjw.l("Sync Accounts");
                        try {
                            vgz vgzVar = ((amab) alzrVar).h;
                            final amml ammlVar = new amml() { // from class: alzz
                                @Override // defpackage.amml
                                public final Object apply(Object obj2) {
                                    int w;
                                    int i3;
                                    Collection collection = amruVar;
                                    aone builder = ((amal) obj2).toBuilder();
                                    amal amalVar = (amal) builder.build();
                                    HashMap hashMap = new HashMap();
                                    Iterator it = collection.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        alym alymVar = (alym) it.next();
                                        Iterator it2 = Collections.unmodifiableMap(Collections.unmodifiableMap(((amal) builder.instance).d)).values().iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                amao amaoVar = (amao) it2.next();
                                                alym alymVar2 = amaoVar.d;
                                                if (alymVar2 == null) {
                                                    alymVar2 = alym.a;
                                                }
                                                if (alymVar2.i.equals(alymVar.i) && alymVar2.c.equals(alymVar.c)) {
                                                    aone builder2 = amaoVar.toBuilder();
                                                    builder2.copyOnWrite();
                                                    amao amaoVar2 = (amao) builder2.instance;
                                                    alymVar.getClass();
                                                    alym alymVar3 = amaoVar2.d;
                                                    if (alymVar3 != null && alymVar3 != alym.a) {
                                                        aong aongVar = (aong) alym.a.createBuilder(amaoVar2.d);
                                                        aongVar.mergeFrom((aonm) alymVar);
                                                        amaoVar2.d = (alym) aongVar.buildPartial();
                                                    } else {
                                                        amaoVar2.d = alymVar;
                                                    }
                                                    amaoVar2.b = 2 | amaoVar2.b;
                                                    builder.G(amaoVar.c, (amao) builder2.build());
                                                    i3 = amaoVar.c;
                                                }
                                            } else {
                                                aone createBuilder = amao.a.createBuilder();
                                                createBuilder.copyOnWrite();
                                                amao amaoVar3 = (amao) createBuilder.instance;
                                                alymVar.getClass();
                                                amaoVar3.d = alymVar;
                                                amaoVar3.b = 2 | amaoVar3.b;
                                                createBuilder.copyOnWrite();
                                                amao amaoVar4 = (amao) createBuilder.instance;
                                                amaoVar4.e = 0;
                                                amaoVar4.b |= 4;
                                                i3 = ((amal) builder.instance).c;
                                                builder.copyOnWrite();
                                                amal amalVar2 = (amal) builder.instance;
                                                amalVar2.b |= 1;
                                                amalVar2.c = i3 + 1;
                                                createBuilder.copyOnWrite();
                                                amao amaoVar5 = (amao) createBuilder.instance;
                                                amaoVar5.b = 1 | amaoVar5.b;
                                                amaoVar5.c = i3;
                                                builder.G(i3, (amao) createBuilder.build());
                                                break;
                                            }
                                        }
                                        hashMap.put(AccountId.b(i3), alymVar);
                                    }
                                    amrz j = amrz.j(hashMap);
                                    amkq.O(j.size() == collection.size(), "Provider had duplicate accounts.");
                                    amsv i4 = amsx.i();
                                    Iterator it3 = Collections.unmodifiableMap(amalVar.d).values().iterator();
                                    while (it3.hasNext()) {
                                        i4.c(AccountId.b(((amao) it3.next()).c));
                                    }
                                    amsx<AccountId> p = amsx.p(amkq.al(i4.g(), j.keySet()));
                                    amrw h = amrz.h();
                                    Map unmodifiableMap = Collections.unmodifiableMap(Collections.unmodifiableMap(((amal) builder.instance).d));
                                    for (AccountId accountId : p) {
                                        Integer valueOf = Integer.valueOf(accountId.a());
                                        if (unmodifiableMap.containsKey(valueOf) && (w = alta.w(((amao) unmodifiableMap.get(valueOf)).e)) != 0 && w == 2) {
                                            h.g(accountId, (amao) unmodifiableMap.get(valueOf));
                                        }
                                    }
                                    amrz c = h.c();
                                    Iterator<E> it4 = p.iterator();
                                    while (it4.hasNext()) {
                                        int a2 = ((AccountId) it4.next()).a();
                                        builder.copyOnWrite();
                                        ((amal) builder.instance).a().remove(Integer.valueOf(a2));
                                    }
                                    return Pair.create(c, (amal) builder.build());
                                }
                            };
                            final AtomicReference atomicReference = new AtomicReference();
                            amka c = amka.c(anfq.h(vgzVar.b(amjk.a(new amml() { // from class: alzy
                                @Override // defpackage.amml
                                public final Object apply(Object obj2) {
                                    amml ammlVar2 = amml.this;
                                    AtomicReference atomicReference2 = atomicReference;
                                    Pair pair = (Pair) ammlVar2.apply((amal) obj2);
                                    atomicReference2.set(pair.first);
                                    return (amal) pair.second;
                                }
                            }), ((amab) alzrVar).a), amjk.a(new amaa(atomicReference, 0)), angq.a));
                            final amab amabVar = (amab) alzrVar;
                            amka h = c.i(new anfz() { // from class: alzv
                                @Override // defpackage.anfz
                                public final anhy a(Object obj2) {
                                    final amab amabVar2 = amab.this;
                                    ArrayList arrayList2 = new ArrayList();
                                    amxd listIterator2 = ((amrz) obj2).entrySet().listIterator();
                                    while (listIterator2.hasNext()) {
                                        Map.Entry entry2 = (Map.Entry) listIterator2.next();
                                        alyo a2 = alyo.a((AccountId) entry2.getKey(), amab.a((amao) entry2.getValue()).b);
                                        Set set = (Set) amabVar2.e.get();
                                        final ArrayList arrayList3 = new ArrayList(set.size());
                                        Iterator it = set.iterator();
                                        while (it.hasNext()) {
                                            try {
                                                arrayList3.add(((alyp) it.next()).a(a2));
                                            } catch (Exception e) {
                                                arrayList3.add(anaf.N(e));
                                            }
                                        }
                                        arrayList2.add(anaf.H(arrayList3).b(amjk.b(new anfy() { // from class: alzu
                                            @Override // defpackage.anfy
                                            public final anhy a() {
                                                amab amabVar3 = amab.this;
                                                List list = arrayList3;
                                                Set set2 = (Set) ((axqs) amabVar3.f).a;
                                                ArrayList arrayList4 = new ArrayList(set2.size());
                                                Iterator it2 = set2.iterator();
                                                while (it2.hasNext()) {
                                                    try {
                                                        arrayList4.add(((alyn) it2.next()).a());
                                                    } catch (Exception e2) {
                                                        arrayList4.add(anaf.N(e2));
                                                    }
                                                }
                                                list.addAll(arrayList4);
                                                return anaf.J(list).a(anaf.aa(), angq.a);
                                            }
                                        }), amabVar2.b));
                                    }
                                    return anaf.J(arrayList2).a(anaf.aa(), angq.a);
                                }
                            }, ((amab) alzrVar).b).h(amkq.aa(), angq.a);
                            l.a(h);
                            l.close();
                            return h;
                        } catch (Throwable th) {
                            try {
                                l.close();
                            } catch (Throwable unused) {
                            }
                            throw th;
                        }
                    }
                }), alzfVar.f);
                final int i3 = 0;
                return anfq.i(i2, amjk.c(new anfz() { // from class: alzd
                    @Override // defpackage.anfz
                    public final anhy a(Object obj) {
                        if (i3 == 0) {
                            return alzfVar.b();
                        }
                        final Collection amruVar = (amru) obj;
                        alzr alzrVar = alzfVar.b.b;
                        amil l = amjw.l("Sync Accounts");
                        try {
                            vgz vgzVar = ((amab) alzrVar).h;
                            final amml ammlVar = new amml() { // from class: alzz
                                @Override // defpackage.amml
                                public final Object apply(Object obj2) {
                                    int w;
                                    int i32;
                                    Collection collection = amruVar;
                                    aone builder = ((amal) obj2).toBuilder();
                                    amal amalVar = (amal) builder.build();
                                    HashMap hashMap = new HashMap();
                                    Iterator it = collection.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        alym alymVar = (alym) it.next();
                                        Iterator it2 = Collections.unmodifiableMap(Collections.unmodifiableMap(((amal) builder.instance).d)).values().iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                amao amaoVar = (amao) it2.next();
                                                alym alymVar2 = amaoVar.d;
                                                if (alymVar2 == null) {
                                                    alymVar2 = alym.a;
                                                }
                                                if (alymVar2.i.equals(alymVar.i) && alymVar2.c.equals(alymVar.c)) {
                                                    aone builder2 = amaoVar.toBuilder();
                                                    builder2.copyOnWrite();
                                                    amao amaoVar2 = (amao) builder2.instance;
                                                    alymVar.getClass();
                                                    alym alymVar3 = amaoVar2.d;
                                                    if (alymVar3 != null && alymVar3 != alym.a) {
                                                        aong aongVar = (aong) alym.a.createBuilder(amaoVar2.d);
                                                        aongVar.mergeFrom((aonm) alymVar);
                                                        amaoVar2.d = (alym) aongVar.buildPartial();
                                                    } else {
                                                        amaoVar2.d = alymVar;
                                                    }
                                                    amaoVar2.b = 2 | amaoVar2.b;
                                                    builder.G(amaoVar.c, (amao) builder2.build());
                                                    i32 = amaoVar.c;
                                                }
                                            } else {
                                                aone createBuilder = amao.a.createBuilder();
                                                createBuilder.copyOnWrite();
                                                amao amaoVar3 = (amao) createBuilder.instance;
                                                alymVar.getClass();
                                                amaoVar3.d = alymVar;
                                                amaoVar3.b = 2 | amaoVar3.b;
                                                createBuilder.copyOnWrite();
                                                amao amaoVar4 = (amao) createBuilder.instance;
                                                amaoVar4.e = 0;
                                                amaoVar4.b |= 4;
                                                i32 = ((amal) builder.instance).c;
                                                builder.copyOnWrite();
                                                amal amalVar2 = (amal) builder.instance;
                                                amalVar2.b |= 1;
                                                amalVar2.c = i32 + 1;
                                                createBuilder.copyOnWrite();
                                                amao amaoVar5 = (amao) createBuilder.instance;
                                                amaoVar5.b = 1 | amaoVar5.b;
                                                amaoVar5.c = i32;
                                                builder.G(i32, (amao) createBuilder.build());
                                                break;
                                            }
                                        }
                                        hashMap.put(AccountId.b(i32), alymVar);
                                    }
                                    amrz j = amrz.j(hashMap);
                                    amkq.O(j.size() == collection.size(), "Provider had duplicate accounts.");
                                    amsv i4 = amsx.i();
                                    Iterator it3 = Collections.unmodifiableMap(amalVar.d).values().iterator();
                                    while (it3.hasNext()) {
                                        i4.c(AccountId.b(((amao) it3.next()).c));
                                    }
                                    amsx<AccountId> p = amsx.p(amkq.al(i4.g(), j.keySet()));
                                    amrw h = amrz.h();
                                    Map unmodifiableMap = Collections.unmodifiableMap(Collections.unmodifiableMap(((amal) builder.instance).d));
                                    for (AccountId accountId : p) {
                                        Integer valueOf = Integer.valueOf(accountId.a());
                                        if (unmodifiableMap.containsKey(valueOf) && (w = alta.w(((amao) unmodifiableMap.get(valueOf)).e)) != 0 && w == 2) {
                                            h.g(accountId, (amao) unmodifiableMap.get(valueOf));
                                        }
                                    }
                                    amrz c = h.c();
                                    Iterator<E> it4 = p.iterator();
                                    while (it4.hasNext()) {
                                        int a2 = ((AccountId) it4.next()).a();
                                        builder.copyOnWrite();
                                        ((amal) builder.instance).a().remove(Integer.valueOf(a2));
                                    }
                                    return Pair.create(c, (amal) builder.build());
                                }
                            };
                            final AtomicReference atomicReference = new AtomicReference();
                            amka c = amka.c(anfq.h(vgzVar.b(amjk.a(new amml() { // from class: alzy
                                @Override // defpackage.amml
                                public final Object apply(Object obj2) {
                                    amml ammlVar2 = amml.this;
                                    AtomicReference atomicReference2 = atomicReference;
                                    Pair pair = (Pair) ammlVar2.apply((amal) obj2);
                                    atomicReference2.set(pair.first);
                                    return (amal) pair.second;
                                }
                            }), ((amab) alzrVar).a), amjk.a(new amaa(atomicReference, 0)), angq.a));
                            final amab amabVar = (amab) alzrVar;
                            amka h = c.i(new anfz() { // from class: alzv
                                @Override // defpackage.anfz
                                public final anhy a(Object obj2) {
                                    final amab amabVar2 = amab.this;
                                    ArrayList arrayList2 = new ArrayList();
                                    amxd listIterator2 = ((amrz) obj2).entrySet().listIterator();
                                    while (listIterator2.hasNext()) {
                                        Map.Entry entry2 = (Map.Entry) listIterator2.next();
                                        alyo a2 = alyo.a((AccountId) entry2.getKey(), amab.a((amao) entry2.getValue()).b);
                                        Set set = (Set) amabVar2.e.get();
                                        final List arrayList3 = new ArrayList(set.size());
                                        Iterator it = set.iterator();
                                        while (it.hasNext()) {
                                            try {
                                                arrayList3.add(((alyp) it.next()).a(a2));
                                            } catch (Exception e) {
                                                arrayList3.add(anaf.N(e));
                                            }
                                        }
                                        arrayList2.add(anaf.H(arrayList3).b(amjk.b(new anfy() { // from class: alzu
                                            @Override // defpackage.anfy
                                            public final anhy a() {
                                                amab amabVar3 = amab.this;
                                                List list = arrayList3;
                                                Set set2 = (Set) ((axqs) amabVar3.f).a;
                                                ArrayList arrayList4 = new ArrayList(set2.size());
                                                Iterator it2 = set2.iterator();
                                                while (it2.hasNext()) {
                                                    try {
                                                        arrayList4.add(((alyn) it2.next()).a());
                                                    } catch (Exception e2) {
                                                        arrayList4.add(anaf.N(e2));
                                                    }
                                                }
                                                list.addAll(arrayList4);
                                                return anaf.J(list).a(anaf.aa(), angq.a);
                                            }
                                        }), amabVar2.b));
                                    }
                                    return anaf.J(arrayList2).a(anaf.aa(), angq.a);
                                }
                            }, ((amab) alzrVar).b).h(amkq.aa(), angq.a);
                            l.a(h);
                            l.close();
                            return h;
                        } catch (Throwable th) {
                            try {
                                l.close();
                            } catch (Throwable unused) {
                            }
                            throw th;
                        }
                    }
                }), alzfVar.f);
            }
        }), this.f);
    }
}

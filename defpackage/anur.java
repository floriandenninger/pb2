package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anur extends anug implements anvi {
    private static final anwy c = anvd.b;
    private final List f;
    private final anuy g;
    public final Map a = new HashMap();
    private final Map d = new HashMap();
    private final Map e = new HashMap();
    public final AtomicReference b = new AtomicReference();

    public anur(Executor executor, Iterable iterable, Collection collection) {
        anuy anuyVar = new anuy(executor);
        this.g = anuyVar;
        ArrayList<anuj> arrayList = new ArrayList();
        arrayList.add(anuj.b(anuyVar, anuy.class, anwd.class, anwc.class));
        arrayList.add(anuj.b(this, anvi.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            anuj anujVar = (anuj) it.next();
            if (anujVar != null) {
                arrayList.add(anujVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next());
        }
        this.f = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                try {
                    anum anumVar = (anum) ((anwy) it3.next()).a();
                    if (anumVar != null) {
                        arrayList.addAll(anumVar.getComponents());
                        it3.remove();
                    }
                } catch (anuz e) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            if (this.a.isEmpty()) {
                aobq.D(arrayList);
            } else {
                ArrayList arrayList4 = new ArrayList(this.a.keySet());
                arrayList4.addAll(arrayList);
                aobq.D(arrayList4);
            }
            for (final anuj anujVar2 : arrayList) {
                this.a.put(anujVar2, new anva(new anwy() { // from class: anuo
                    @Override // defpackage.anwy
                    public final Object a() {
                        anur anurVar = anur.this;
                        anuj anujVar3 = anujVar2;
                        return anujVar3.d.a(new anvg(anujVar3, anurVar));
                    }
                }));
            }
            ArrayList arrayList5 = new ArrayList();
            for (anuj anujVar3 : arrayList) {
                if (anujVar3.c()) {
                    final anwy anwyVar = (anwy) this.a.get(anujVar3);
                    for (Class cls : anujVar3.a) {
                        if (!this.d.containsKey(cls)) {
                            this.d.put(cls, anwyVar);
                        } else {
                            final anve anveVar = (anve) ((anwy) this.d.get(cls));
                            arrayList5.add(new Runnable() { // from class: anuq
                                @Override // java.lang.Runnable
                                public final void run() {
                                    anve anveVar2 = anve.this;
                                    anwy anwyVar2 = anwyVar;
                                    if (anveVar2.b != anve.a) {
                                        throw new IllegalStateException("provide() can be called only once.");
                                    }
                                    synchronized (anveVar2) {
                                        anveVar2.b = anwyVar2;
                                    }
                                }
                            });
                        }
                    }
                }
            }
            arrayList3.addAll(arrayList5);
            ArrayList arrayList6 = new ArrayList();
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : this.a.entrySet()) {
                anuj anujVar4 = (anuj) entry.getKey();
                if (!anujVar4.c()) {
                    anwy anwyVar2 = (anwy) entry.getValue();
                    for (Class cls2 : anujVar4.a) {
                        if (!hashMap.containsKey(cls2)) {
                            hashMap.put(cls2, new HashSet());
                        }
                        ((Set) hashMap.get(cls2)).add(anwyVar2);
                    }
                }
            }
            for (Map.Entry entry2 : hashMap.entrySet()) {
                if (!this.e.containsKey(entry2.getKey())) {
                    this.e.put((Class) entry2.getKey(), anvb.b((Collection) entry2.getValue()));
                } else {
                    final anvb anvbVar = (anvb) this.e.get(entry2.getKey());
                    for (final anwy anwyVar3 : (Set) entry2.getValue()) {
                        arrayList6.add(new Runnable() { // from class: anup
                            @Override // java.lang.Runnable
                            public final void run() {
                                anvb.this.c(anwyVar3);
                            }
                        });
                    }
                }
            }
            arrayList3.addAll(arrayList6);
            for (anuj anujVar5 : this.a.keySet()) {
                for (anuu anuuVar : anujVar5.b) {
                    if (!anuuVar.e() || this.e.containsKey(anuuVar.a)) {
                        if (this.d.containsKey(anuuVar.a)) {
                            continue;
                        } else {
                            if (anuuVar.b == 1) {
                                throw new anvc(String.format("Unsatisfied dependency for component %s: %s", anujVar5, anuuVar.a));
                            }
                            if (!anuuVar.e()) {
                                this.d.put(anuuVar.a, new anve(anve.a));
                            }
                        }
                    } else {
                        this.e.put(anuuVar.a, anvb.b(Collections.emptySet()));
                    }
                }
            }
        }
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            ((Runnable) arrayList3.get(i)).run();
        }
        Boolean bool = (Boolean) this.b.get();
        if (bool != null) {
            d(this.a, bool.booleanValue());
        }
    }

    @Override // defpackage.anuk
    public final synchronized anwy b(Class cls) {
        return (anwy) this.d.get(cls);
    }

    @Override // defpackage.anuk
    public final synchronized anwy c(Class cls) {
        anvb anvbVar = (anvb) this.e.get(cls);
        if (anvbVar != null) {
            return anvbVar;
        }
        return c;
    }

    public final void d(Map map, boolean z) {
        Queue<anwa> queue;
        for (Map.Entry entry : map.entrySet()) {
            anuj anujVar = (anuj) entry.getKey();
            anwy anwyVar = (anwy) entry.getValue();
            int i = anujVar.c;
            if (i == 1 || (i == 2 && z)) {
                anwyVar.a();
            }
        }
        anuy anuyVar = this.g;
        synchronized (anuyVar) {
            queue = anuyVar.a;
            if (queue != null) {
                anuyVar.a = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (final anwa anwaVar : queue) {
                aocz.ae(anwaVar);
                synchronized (anuyVar) {
                    Queue queue2 = anuyVar.a;
                    if (queue2 != null) {
                        queue2.add(anwaVar);
                    } else {
                        for (final Map.Entry entry2 : anuyVar.a(anwaVar)) {
                            ((Executor) entry2.getValue()).execute(new Runnable() { // from class: anux
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Map.Entry entry3 = entry2;
                                    ((anwb) entry3.getKey()).a(anwaVar);
                                }
                            });
                        }
                    }
                }
            }
        }
    }
}

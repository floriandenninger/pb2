package defpackage;

import android.os.StrictMode;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tfn {
    public final anib a;
    public final tfi b;
    private final azrw c;
    private final Set d;
    private final shf e;
    private final Executor f;
    private volatile amrz g;

    public tfn(anib anibVar, azrw azrwVar, Set set, tfi tfiVar, shf shfVar) {
        this.a = anibVar;
        this.c = azrwVar;
        this.d = set;
        this.b = tfiVar;
        this.e = shfVar;
        this.f = anaf.E(anibVar);
        amkq.O(!set.isEmpty(), "No logging result handlers provided.");
    }

    public static anhy a(tfr tfrVar, tfo tfoVar) {
        try {
            return tfoVar.a(tfrVar);
        } catch (Throwable th) {
            return anaf.N(th);
        }
    }

    private final void d(anhy anhyVar) {
        amxd listIterator = ((amwf) this.d).listIterator();
        while (listIterator.hasNext()) {
            anaf.Y(anhyVar, new sfi(2), angq.a);
        }
    }

    public final List b(Class cls) {
        amrz amrzVar = this.g;
        if (amrzVar == null) {
            synchronized (this) {
                amrzVar = this.g;
                if (amrzVar == null) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    for (tfo tfoVar : (Set) this.c.get()) {
                        if (tfoVar.b().isEmpty()) {
                            arrayList.add(tfoVar);
                        } else {
                            amxd listIterator = ((amwf) tfoVar.b()).listIterator();
                            while (listIterator.hasNext()) {
                                Class cls2 = (Class) listIterator.next();
                                List list = (List) hashMap.get(cls2);
                                if (list == null) {
                                    list = new ArrayList();
                                    hashMap.put(cls2, list);
                                }
                                list.add(tfoVar);
                            }
                        }
                    }
                    hashMap.put(tfp.class, arrayList);
                    amrzVar = amrz.j(hashMap);
                    this.g = amrzVar;
                }
            }
        }
        return (List) amrzVar.getOrDefault(cls, amru.q());
    }

    public final void c(tfm tfmVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).detectAll().build());
        try {
            long f = this.e.f();
            final tfq tfqVar = new tfq();
            final List a = tfmVar.a();
            if (a != null) {
                if (!a.isEmpty()) {
                    final SettableFuture f2 = SettableFuture.f();
                    d(anfq.i(anaf.S(amjk.g(new Callable() { // from class: tfl
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            tfn tfnVar = tfn.this;
                            List<tfp> list = a;
                            ArrayList arrayList = new ArrayList(list.size());
                            for (tfp tfpVar : list) {
                                arrayList.add(new tfr(tfpVar, tfnVar.b.a(tfpVar)));
                            }
                            return arrayList;
                        }
                    }), this.f), amjk.c(new anfz() { // from class: tfk
                        @Override // defpackage.anfz
                        public final anhy a(Object obj) {
                            tfn tfnVar = tfn.this;
                            final SettableFuture settableFuture = f2;
                            final tfq tfqVar2 = tfqVar;
                            List<tfr> list = (List) obj;
                            int size = list.size();
                            ArrayList arrayList = new ArrayList(size + size + 1);
                            arrayList.add(settableFuture);
                            for (tfr tfrVar : list) {
                                try {
                                    List b = tfnVar.b(tfrVar.a.getClass());
                                    List b2 = tfnVar.b(tfp.class);
                                    ArrayList arrayList2 = new ArrayList(b.size() + b2.size());
                                    Iterator it = b.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(tfn.a(tfrVar, (tfo) it.next()));
                                    }
                                    Iterator it2 = b2.iterator();
                                    while (it2.hasNext()) {
                                        arrayList2.add(tfn.a(tfrVar, (tfo) it2.next()));
                                    }
                                    arrayList.add(anfq.h(anaf.L(arrayList2), amkq.aa(), angq.a));
                                    arrayList.add(tfrVar.b);
                                } catch (Throwable th) {
                                    arrayList.add(anaf.N(th));
                                }
                            }
                            final anhy a2 = anaf.J(arrayList).a(anaf.aa(), angq.a);
                            return anaf.H(arrayList).b(new anfy() { // from class: tfj
                                @Override // defpackage.anfy
                                public final anhy a() {
                                    tfq tfqVar3 = tfq.this;
                                    SettableFuture settableFuture2 = settableFuture;
                                    anhy anhyVar = a2;
                                    long longValue = ((Long) anaf.W(settableFuture2)).longValue();
                                    amkq.O(tfqVar3.a == -1, "Duration set more than once");
                                    tfqVar3.a = longValue;
                                    return anhyVar;
                                }
                            }, tfnVar.a);
                        }
                    }), this.f));
                    f2.o(Long.valueOf(this.e.f() - f));
                }
            }
        } catch (Throwable th) {
            anhy N = anaf.N(th);
            anaf.N(th);
            d(N);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}

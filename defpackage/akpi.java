package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akpi {
    public final akpr a;
    public final azqv b = azqv.ap();
    public final Executor c;
    public anhy d;
    private final Executor e;

    public akpi(akpr akprVar, Executor executor, Executor executor2) {
        this.a = akprVar;
        this.c = executor;
        this.e = executor2;
    }

    public final aypy a() {
        return this.b.y().U();
    }

    public final void b() {
        anhy anhyVar = this.d;
        if (anhyVar == null || anhyVar.isCancelled() || this.d.isDone()) {
            return;
        }
        this.d.cancel(true);
    }

    public final void c(final String str) {
        this.e.execute(new Runnable() { // from class: akph
            @Override // java.lang.Runnable
            public final void run() {
                final akpi akpiVar = akpi.this;
                String str2 = str;
                anhy anhyVar = akpiVar.d;
                if (anhyVar != null && !anhyVar.isCancelled() && !akpiVar.d.isDone()) {
                    akpiVar.d.cancel(true);
                }
                akpr akprVar = akpiVar.a;
                final ArrayList arrayList = new ArrayList();
                akpp akppVar = (akpp) akprVar;
                Iterator it = akppVar.b.iterator();
                while (it.hasNext()) {
                    arrayList.add(((akpf) it.next()).a(str2));
                }
                akpiVar.d = anfq.i(anaf.H(arrayList).a(new Callable() { // from class: akpm
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ArrayList arrayList2 = arrayList;
                        int size = arrayList2.size();
                        int i = 0;
                        while (i < size) {
                            akps akpsVar = (akps) anaf.W((anhy) arrayList2.get(i));
                            i++;
                            if (akpsVar != null) {
                                return akpsVar;
                            }
                        }
                        return null;
                    }
                }, akppVar.a), new akpn(akppVar, str2), akppVar.a);
                ynm.k(akpiVar.d, akpiVar.c, new ailg(9), new ynl() { // from class: akpg
                    @Override // defpackage.ynl, defpackage.zfi
                    public final void a(Object obj) {
                        akpi akpiVar2 = akpi.this;
                        akpiVar2.b.c((akps) obj);
                        akpiVar2.d = null;
                    }
                });
            }
        });
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tbi implements szh {
    public final int f;
    public final String g;
    public final tbt i;
    public final ajfv k;
    private final Executor l;
    public final Object b = new Object();
    public final tbr c = new tbr();
    public final tbr d = new tbr();
    public final tbr e = new tbr();
    public final List h = new ArrayList();
    public final AtomicReference j = new AtomicReference();

    public tbi(String str, int i, tbt tbtVar, Executor executor, ajfv ajfvVar) {
        this.f = i;
        this.l = executor;
        this.k = ajfvVar;
        this.i = tbtVar;
        this.g = str;
    }

    @Override // defpackage.szh
    public final void a() {
        synchronized (this.b) {
            this.c.b();
            this.d.b();
            this.e.b();
            this.h.clear();
        }
    }

    @Override // defpackage.szh
    public final void b() {
        this.d.c();
    }

    @Override // defpackage.szh
    public final void c() {
        this.c.c();
    }

    @Override // defpackage.szh
    public final void d() {
        this.e.c();
    }

    @Override // defpackage.szh
    public final synchronized void e(boolean z) {
        if (z) {
            a();
        } else {
            this.l.execute(new Runnable() { // from class: tbg
                @Override // java.lang.Runnable
                public final void run() {
                    amsx r;
                    int i;
                    amru o;
                    tbi tbiVar = tbi.this;
                    String str = (String) tbiVar.j.get();
                    tbn a = tbo.a();
                    if (str != null) {
                        r = amsx.r(str);
                    } else {
                        r = amvs.a;
                    }
                    a.c(r);
                    if (tbiVar.k.a(tbp.COMPONENT_MATERIALIZATION)) {
                        List a2 = tbiVar.c.a(tbp.COMPONENT_MATERIALIZATION.m, a);
                        if (a2.isEmpty()) {
                            return;
                        }
                        ((tbm) a2.get(0)).d = Integer.valueOf(tbiVar.f);
                        i = tbiVar.i.f(tbiVar.g, ((tbm) a2.get(0)).a());
                    } else {
                        i = -1;
                    }
                    if (tbiVar.k.a(tbp.TEMPLATE_FETCHING)) {
                        tbiVar.k(tbiVar.d.a(tbp.TEMPLATE_FETCHING.m, a), i);
                    }
                    if (tbiVar.k.a(tbp.TEMPLATE_RESOLUTION)) {
                        tbiVar.k(tbiVar.e.a(tbp.TEMPLATE_RESOLUTION.m, a), i);
                    }
                    if (tbiVar.k.a(tbp.PB_TO_FB)) {
                        synchronized (tbiVar.b) {
                            o = !tbiVar.h.isEmpty() ? amru.o(tbiVar.h) : null;
                        }
                        if (o != null) {
                            ArrayList arrayList = new ArrayList(o.size());
                            int size = o.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                tbh tbhVar = (tbh) o.get(i2);
                                tbm a3 = tbq.a();
                                a3.b(tbp.PB_TO_FB.m);
                                a3.c = Long.valueOf(tbhVar.a);
                                a.h = tbhVar.b;
                                a3.e = a.a();
                                arrayList.add(a3);
                            }
                            tbiVar.k(arrayList, i);
                        }
                    }
                }
            });
        }
    }

    @Override // defpackage.szh
    public final void f(long j) {
        synchronized (this.b) {
            this.h.add(new tbh(j, tbk.a(), null));
        }
    }

    @Override // defpackage.szh
    public final void g(String str) {
        if (str != null) {
            this.j.compareAndSet(null, str);
        }
    }

    @Override // defpackage.szh
    public final void h() {
        this.d.d();
    }

    @Override // defpackage.szh
    public final void i() {
        this.c.d();
    }

    @Override // defpackage.szh
    public final void j() {
        this.e.d();
    }

    public final void k(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tbm tbmVar = (tbm) it.next();
            tbmVar.d = Integer.valueOf(i);
            this.i.f(this.g, tbmVar.a());
        }
    }
}

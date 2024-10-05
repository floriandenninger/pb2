package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azif extends AtomicInteger implements ayqd, ayqx {
    static final Object a = new Object();
    private static final long serialVersionUID = -3688291656102519502L;
    final ayqd b;
    final ayrv c;
    final int d;
    ayqx f;
    final AtomicBoolean g = new AtomicBoolean();
    final Map e = new ConcurrentHashMap();

    public azif(ayqd ayqdVar, ayrv ayrvVar, int i) {
        this.b = ayqdVar;
        this.c = ayrvVar;
        this.d = i;
        lazySet(1);
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        ArrayList arrayList = new ArrayList(this.e.values());
        this.e.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            azig azigVar = ((azqp) arrayList.get(i)).b;
            azigVar.e = th;
            azigVar.d = true;
            azigVar.a();
        }
        this.b.b(th);
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        try {
            Object a2 = this.c.a(obj);
            Object obj2 = a2 != null ? a2 : a;
            azqp azqpVar = (azqp) this.e.get(obj2);
            if (azqpVar == null) {
                if (this.g.get()) {
                    return;
                }
                azqpVar = new azqp(a2, new azig(this.d, this, a2));
                this.e.put(obj2, azqpVar);
                getAndIncrement();
                this.b.c(azqpVar);
            }
            try {
                aysw.b(obj, "The value supplied is null");
                azig azigVar = azqpVar.b;
                azigVar.b.k(obj);
                azigVar.a();
            } catch (Throwable th) {
                aynu.c(th);
                this.f.qc();
                b(th);
            }
        } catch (Throwable th2) {
            aynu.c(th2);
            this.f.qc();
            b(th2);
        }
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.g.get();
    }

    public final void f(Object obj) {
        if (obj == null) {
            obj = a;
        }
        this.e.remove(obj);
        if (decrementAndGet() == 0) {
            this.f.qc();
        }
    }

    @Override // defpackage.ayqx
    public final void qc() {
        if (this.g.compareAndSet(false, true) && decrementAndGet() == 0) {
            this.f.qc();
        }
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        if (ayrz.h(this.f, ayqxVar)) {
            this.f = ayqxVar;
            this.b.se(this);
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
        ArrayList arrayList = new ArrayList(this.e.values());
        this.e.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            azig azigVar = ((azqp) arrayList.get(i)).b;
            azigVar.d = true;
            azigVar.a();
        }
        this.b.sh();
    }
}

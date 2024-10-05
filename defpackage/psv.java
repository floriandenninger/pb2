package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class psv {
    public final psf a;
    public final pso b;
    public final pst c;
    public final CopyOnWriteArraySet d;
    private final ArrayDeque e;
    private final ArrayDeque f;
    private boolean g;

    public psv(Looper looper, psf psfVar, pst pstVar) {
        this(new CopyOnWriteArraySet(), looper, psfVar, pstVar);
    }

    public final void a(Object obj) {
        if (this.g) {
            return;
        }
        pse.c(obj);
        this.d.add(new psu(obj));
    }

    public final void b() {
        if (this.f.isEmpty()) {
            return;
        }
        if (!this.b.d()) {
            pso psoVar = this.b;
            psoVar.h(psoVar.a(0));
        }
        boolean isEmpty = this.e.isEmpty();
        this.e.addAll(this.f);
        this.f.clear();
        if (!isEmpty) {
            return;
        }
        while (!this.e.isEmpty()) {
            ((Runnable) this.e.peekFirst()).run();
            this.e.removeFirst();
        }
    }

    public final void c(final int i, final pss pssVar) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.d);
        this.f.add(new Runnable() { // from class: psr
            @Override // java.lang.Runnable
            public final void run() {
                CopyOnWriteArraySet copyOnWriteArraySet2 = copyOnWriteArraySet;
                int i2 = i;
                pss pssVar2 = pssVar;
                Iterator it = copyOnWriteArraySet2.iterator();
                while (it.hasNext()) {
                    psu psuVar = (psu) it.next();
                    if (!psuVar.d) {
                        if (i2 != -1) {
                            psuVar.b.b(i2);
                        }
                        psuVar.c = true;
                        pssVar2.a(psuVar.a);
                    }
                }
            }
        });
    }

    public final void d() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((psu) it.next()).a(this.c);
        }
        this.d.clear();
        this.g = true;
    }

    public final void e(Object obj) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            psu psuVar = (psu) it.next();
            if (psuVar.a.equals(obj)) {
                psuVar.a(this.c);
                this.d.remove(psuVar);
            }
        }
    }

    public final void f(int i, pss pssVar) {
        c(i, pssVar);
        b();
    }

    public psv(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, psf psfVar, pst pstVar) {
        this.a = psfVar;
        this.d = copyOnWriteArraySet;
        this.c = pstVar;
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.b = psfVar.a(looper, new Handler.Callback() { // from class: psq
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                psv psvVar = psv.this;
                Iterator it = psvVar.d.iterator();
                while (it.hasNext()) {
                    psu psuVar = (psu) it.next();
                    pst pstVar2 = psvVar.c;
                    if (!psuVar.d && psuVar.c) {
                        psn a = psuVar.b.a();
                        psuVar.b = new psm();
                        psuVar.c = false;
                        pstVar2.a(psuVar.a, a);
                    }
                    if (psvVar.b.d()) {
                        return true;
                    }
                }
                return true;
            }
        });
    }
}

package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vuq {
    public int a = 1;
    private final PriorityQueue b = new PriorityQueue(5);
    private final PriorityQueue c = new PriorityQueue(5, Collections.reverseOrder());

    private final vup g(vuo vuoVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            vup vupVar = (vup) it.next();
            if (vupVar.b == vuoVar) {
                return vupVar;
            }
        }
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            vup vupVar2 = (vup) it2.next();
            if (vupVar2.b == vuoVar) {
                return vupVar2;
            }
        }
        return null;
    }

    private final synchronized void h() {
        if (this.b.size() < this.a) {
            vup vupVar = (vup) this.c.poll();
            if (vupVar != null) {
                this.b.add(vupVar);
                vupVar.c = false;
                vupVar.b.a();
            }
        } else {
            vcp.d(!this.b.isEmpty());
            vup vupVar2 = (vup) this.c.peek();
            if (vupVar2 != null) {
                vup vupVar3 = (vup) this.b.peek();
                if (vupVar2.a > vupVar3.a && !vupVar3.c) {
                    vupVar3.c = true;
                    vupVar3.b.b();
                }
            }
        }
    }

    public final synchronized void a(vuo vuoVar) {
        vuoVar.getClass();
        vup g = g(vuoVar);
        if (g == null || !this.b.remove(g)) {
            return;
        }
        this.c.add(g);
        h();
    }

    public final synchronized void b(int i) {
        if (i <= this.a) {
            return;
        }
        this.a = i;
        while (this.b.size() < this.a && !this.c.isEmpty()) {
            vup vupVar = (vup) this.c.poll();
            this.b.add(vupVar);
            vupVar.b.a();
        }
    }

    public final synchronized void c(vuo vuoVar, int i) {
        vuoVar.getClass();
        vup g = g(vuoVar);
        if (g == null) {
            this.c.add(new vup(i, vuoVar));
        } else {
            if (g.a == i) {
                return;
            }
            if (this.c.contains(g)) {
                this.c.remove(g);
                this.c.add(new vup(i, vuoVar));
            } else {
                this.b.remove(g);
                this.b.add(new vup(i, vuoVar));
            }
        }
        h();
    }

    public final synchronized void d(vuo vuoVar) {
        vuoVar.getClass();
        vup g = g(vuoVar);
        if (g != null) {
            this.b.remove(g);
            this.c.remove(g);
            h();
        }
    }

    public final synchronized boolean e(vuo vuoVar) {
        vcp.b(f(vuoVar));
        this.b.remove(g(vuoVar));
        int i = this.a;
        if (i == 1) {
            return false;
        }
        this.a = i - 1;
        return true;
    }

    public final synchronized boolean f(vuo vuoVar) {
        boolean z;
        vup g = g(vuoVar);
        if (g != null) {
            z = this.b.contains(g);
        }
        return z;
    }
}

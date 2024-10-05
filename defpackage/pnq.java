package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pnq {
    public final pnp d;
    public final bbx e;
    public final HashMap f;
    public final Set g;
    public boolean h;
    public att i;
    public final bbx k;
    public bdb j = new bdb();
    public final IdentityHashMap b = new IdentityHashMap();
    public final Map c = new HashMap();
    public final List a = new ArrayList();

    public pnq(pnp pnpVar, avk avkVar, Handler handler) {
        this.d = pnpVar;
        bbx bbxVar = new bbx();
        this.e = bbxVar;
        bbx bbxVar2 = new bbx(null);
        this.k = bbxVar2;
        this.f = new HashMap();
        this.g = new HashSet();
        if (avkVar != null) {
            bbxVar.a(handler, avkVar);
            bbxVar2.o(handler, avkVar);
        }
    }

    private final void h(int i, int i2) {
        while (i < this.a.size()) {
            ((pno) this.a.get(i)).d += i2;
            i++;
        }
    }

    private final void i(pno pnoVar) {
        pnn pnnVar = (pnn) this.f.get(pnoVar);
        if (pnnVar != null) {
            pnnVar.a.rr(pnnVar.b);
        }
    }

    private final void j(pno pnoVar) {
        if (pnoVar.e && pnoVar.c.isEmpty()) {
            pnn pnnVar = (pnn) this.f.remove(pnoVar);
            pse.c(pnnVar);
            pnnVar.a.j(pnnVar.b);
            pnnVar.a.ry(pnnVar.c);
            pnnVar.a.rx(pnnVar.c);
            this.g.remove(pnoVar);
        }
    }

    public final int a() {
        return this.a.size();
    }

    public final pou b() {
        if (this.a.isEmpty()) {
            return pou.d;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            pno pnoVar = (pno) this.a.get(i2);
            pnoVar.d = i;
            i += pnoVar.a.d.h();
        }
        return new pkx(this.a, this.j);
    }

    public final void c() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            pno pnoVar = (pno) it.next();
            if (pnoVar.c.isEmpty()) {
                i(pnoVar);
                it.remove();
            }
        }
    }

    public final void d(pno pnoVar) {
        bbm bbmVar = pnoVar.a;
        bbq bbqVar = new bbq() { // from class: pnl
            @Override // defpackage.bbq
            public final void a(bbr bbrVar, pou pouVar) {
                ((pmn) pnq.this.d).a.g(22);
            }
        };
        pnm pnmVar = new pnm(this, pnoVar);
        this.f.put(pnoVar, new pnn(bbmVar, bbqVar, pnmVar));
        bbmVar.b(pts.y(), pnmVar);
        bbmVar.jI(pts.y(), pnmVar);
        bbmVar.rv(bbqVar, this.i);
    }

    public final void e(bbp bbpVar) {
        pno pnoVar = (pno) this.b.remove(bbpVar);
        pse.c(pnoVar);
        pnoVar.a.u(bbpVar);
        pnoVar.c.remove(((bbj) bbpVar).e);
        if (!this.b.isEmpty()) {
            c();
        }
        j(pnoVar);
    }

    public final void f(int i, int i2) {
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            pno pnoVar = (pno) this.a.remove(i2);
            this.c.remove(pnoVar.b);
            h(i2, -pnoVar.a.d.h());
            pnoVar.e = true;
            if (this.h) {
                j(pnoVar);
            }
        }
    }

    public final pou g(int i, List list, bdb bdbVar) {
        if (!list.isEmpty()) {
            this.j = bdbVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                pno pnoVar = (pno) list.get(i2 - i);
                if (i2 > 0) {
                    pno pnoVar2 = (pno) this.a.get(i2 - 1);
                    pnoVar.c(pnoVar2.d + pnoVar2.a.d.h());
                } else {
                    pnoVar.c(0);
                }
                h(i2, pnoVar.a.d.h());
                this.a.add(i2, pnoVar);
                this.c.put(pnoVar.b, pnoVar);
                if (this.h) {
                    d(pnoVar);
                    if (this.b.isEmpty()) {
                        this.g.add(pnoVar);
                    } else {
                        i(pnoVar);
                    }
                }
            }
        }
        return b();
    }
}

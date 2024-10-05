package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agka {
    private static final Object m = new Object();
    public final shf j;
    public final Object k = new Object();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    public final yow l = new yow(new agpf(1));
    public final HashMap f = new HashMap();
    public final HashMap g = new HashMap();
    public final HashMap h = new HashMap();
    public final HashMap i = new HashMap();

    public agka(shf shfVar) {
        this.j = shfVar;
    }

    public final agjm a(String str) {
        agjm agjmVar;
        synchronized (this.k) {
            zhq.m(str);
            agjmVar = (agjm) this.a.get(str);
        }
        return agjmVar;
    }

    public final Collection b() {
        Collection values;
        synchronized (this.k) {
            values = this.b.values();
        }
        return values;
    }

    public final Set c(String str) {
        Set v;
        synchronized (this.k) {
            v = yjj.v(this.f, str);
        }
        return v;
    }

    public final void d(String str) {
        synchronized (this.k) {
            zhq.m(str);
            this.e.put(str, m);
            agjy agjyVar = (agjy) this.b.get(str);
            if (agjyVar != null) {
                agjyVar.g();
                this.l.a(Long.valueOf(agjyVar.c), agjyVar);
            }
        }
    }

    public final void e(String str, String str2) {
        synchronized (this.k) {
            yjj.w(this.g, str, str2);
            yjj.w(this.f, str2, str);
        }
    }

    public final void f(String str, String str2) {
        synchronized (this.k) {
            yjj.w(this.i, str, str2);
            yjj.w(this.h, str2, str);
        }
    }

    public final void g(agnm agnmVar) {
        String g = agnmVar.g();
        synchronized (this.k) {
            agjx agjxVar = (agjx) this.a.get(g);
            if (agjxVar != null) {
                agjxVar.g(agnmVar);
            }
        }
    }

    public final boolean h(String str) {
        boolean containsKey;
        synchronized (this.k) {
            zhq.m(str);
            containsKey = this.e.containsKey(str);
        }
        return containsKey;
    }

    public final agjw i(String str) {
        agjw agjwVar;
        synchronized (this.k) {
            zhq.m(str);
            agjwVar = (agjw) this.c.get(str);
        }
        return agjwVar;
    }

    public final agjy j(String str) {
        agjy agjyVar;
        synchronized (this.k) {
            zhq.m(str);
            agjyVar = (agjy) this.b.get(str);
        }
        return agjyVar;
    }

    public final agjy k(agnp agnpVar, atrx atrxVar, int i, byte[] bArr, agnf agnfVar, agno agnoVar, long j) {
        agnpVar.getClass();
        agjy agjyVar = new agjy(this, agnpVar, atrxVar, i, bArr, agnfVar, agnoVar, j);
        synchronized (this.k) {
            this.b.put(agnpVar.f(), agjyVar);
        }
        return agjyVar;
    }

    public final void l(agng agngVar, List list, atrx atrxVar, long j, long j2, int i) {
        synchronized (this.k) {
            agngVar.getClass();
            this.c.put(agngVar.a, new agjw(this, agngVar, list, atrxVar, j, j2, i));
        }
    }

    public final void m(bagd bagdVar, List list, List list2, int i) {
        synchronized (this.k) {
            bagdVar.getClass();
            this.d.put(bagdVar.a, new agjz(this, bagdVar, list, list2, i, null));
        }
    }
}

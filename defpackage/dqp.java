package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dqp {
    public Map a;

    public dqp() {
    }

    public dqp(Map map) {
        this.a = map;
    }

    public final void a(String str, Object obj) {
        if (this.a == null) {
            this.a = DesugarCollections.synchronizedMap(new HashMap());
        }
        this.a.put(str, obj);
    }

    public final void b(boolean z) {
        a("is_full_span", Boolean.valueOf(z));
    }

    public final void c(boolean z) {
        a("is_sticky", Boolean.valueOf(z));
    }

    public final void d(int i) {
        a("span_size", Integer.valueOf(i));
    }

    public final void e() {
        uqq.j();
        this.a.getClass();
        for (uyh uyhVar : uyh.values()) {
            uyi uyiVar = (uyi) this.a.get(uyhVar);
            if (uyiVar != null) {
                uyiVar.a();
            }
        }
        this.a = null;
    }

    public final void f(Map map) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this) {
            Map map2 = this.a;
            if (map != null) {
                hashMap = new HashMap(map);
                if (map2 != null) {
                    hashMap.keySet().removeAll(map2.keySet());
                }
            } else {
                hashMap = null;
            }
            Map map3 = this.a;
            if (map3 != null) {
                hashMap2 = new HashMap(map3);
                if (map != null) {
                    hashMap2.keySet().removeAll(map.keySet());
                }
            } else {
                hashMap2 = null;
            }
            if (map != null) {
                this.a = new HashMap(map);
            } else {
                this.a = null;
            }
        }
        if (hashMap2 != null) {
            for (dha dhaVar : hashMap2.values()) {
                dhe dheVar = dhaVar.q;
                dhaVar.ap();
            }
        }
        if (hashMap != null) {
            for (dha dhaVar2 : hashMap.values()) {
                dhe dheVar2 = dhaVar2.q;
                dhaVar2.ao();
            }
        }
    }
}

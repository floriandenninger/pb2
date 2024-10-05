package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rzb {
    public final Map a;
    public final List b;

    public rzb(byte[] bArr, byte[] bArr2) {
        this.b = new ArrayList();
        this.a = new HashMap();
    }

    public static void i(rzb rzbVar, long j) {
        rzbVar.c("exo_len", Long.valueOf(j));
    }

    private final synchronized List j(String str) {
        if (!this.b.contains(str)) {
            this.b.add(str);
        }
        List list = (List) this.a.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        this.a.put(str, arrayList);
        return arrayList;
    }

    public final int a() {
        return this.a.size();
    }

    public final Integer b(Object obj) {
        return (Integer) this.a.get(obj);
    }

    public final void c(String str, Object obj) {
        Map map = this.a;
        pse.c(obj);
        map.put(str, obj);
        this.b.remove(str);
    }

    public final synchronized List d(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            List<dbm> list = (List) this.a.get((String) it.next());
            if (list != null) {
                for (dbm dbmVar : list) {
                    if (dbmVar.a(cls, cls2)) {
                        arrayList.add(dbmVar.b);
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized List e(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            List<dbm> list = (List) this.a.get((String) it.next());
            if (list != null) {
                for (dbm dbmVar : list) {
                    if (dbmVar.a(cls, cls2) && !arrayList.contains(dbmVar.a)) {
                        arrayList.add(dbmVar.a);
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized void f(String str, cqp cqpVar, Class cls, Class cls2) {
        j(str).add(new dbm(cls, cls2, cqpVar));
    }

    public final synchronized void g(List list) {
        ArrayList arrayList = new ArrayList(this.b);
        this.b.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.b.add((String) it.next());
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            if (!list.contains(str)) {
                this.b.add(str);
            }
        }
    }

    public final synchronized void h(cqp cqpVar, Class cls, Class cls2) {
        j("legacy_prepend_all").add(0, new dbm(cls, cls2, cqpVar));
    }

    public rzb(byte[] bArr) {
        this.a = new HashMap();
        this.b = new ArrayList();
    }

    public rzb() {
        this.a = rwh.t();
        this.b = rwh.x();
    }
}

package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agvi {
    private final Map a = new LinkedHashMap();
    private final yow b = new yow(new agpf(2));

    public final synchronized agtu a(String str) {
        return (agtu) this.a.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized agtu b(String str) {
        this.b.b(str);
        return (agtu) this.a.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized List c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            agtu agtuVar = (agtu) this.a.get((String) it.next());
            if (agtuVar != null) {
                arrayList.add(agtuVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized Map d() {
        HashMap hashMap;
        hashMap = new HashMap(this.a.size());
        for (agtu agtuVar : this.a.values()) {
            hashMap.put(agtuVar.a, agtuVar.a());
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e(agtu agtuVar) {
        this.a.put(agtuVar.a, agtuVar);
        yow yowVar = this.b;
        String str = agtuVar.a;
        Iterator it = yowVar.a.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((LinkedList) it.next()).contains(str)) {
                this.b.b(agtuVar.a);
                break;
            }
        }
        this.b.a(new Pair(Integer.valueOf(agtuVar.h), Long.valueOf(agtw.k(agtuVar.e))), agtuVar.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f() {
        this.a.clear();
        this.b.a.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean g(String str) {
        return this.a.containsKey(str);
    }
}

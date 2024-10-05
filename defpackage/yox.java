package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yox implements Runnable {
    private final ypa a;
    private final Object b;
    private final Object c;

    public yox(ypa ypaVar, Object obj, Object obj2) {
        this.a = ypaVar;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Collection<ypc> collection;
        Object obj = this.c;
        obj.getClass();
        ypa ypaVar = this.a;
        ypaVar.d.readLock().lock();
        ArrayList arrayList = null;
        try {
            try {
                Map map = ypaVar.b;
                Class<?> cls = obj.getClass();
                if (!map.containsKey(cls)) {
                    collection = amvs.a;
                } else {
                    Set set = (Set) map.get(cls);
                    if (set != null && !set.isEmpty()) {
                        collection = amsx.p(set);
                    }
                    collection = amvs.a;
                }
            } catch (Exception e) {
                zga.d("exception ", e);
                ypaVar.d.readLock().unlock();
                collection = null;
            }
            if (collection != null && !collection.isEmpty()) {
                for (ypc ypcVar : collection) {
                    if (ypcVar.a() == null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(ypcVar);
                    } else {
                        int i = ypcVar.c;
                        if (i == this.b.hashCode() || i == ypa.a.hashCode()) {
                            ypcVar.b.a(this.c);
                        }
                    }
                }
                if (arrayList != null) {
                    this.a.k(arrayList);
                }
            }
        } finally {
            ypaVar.d.readLock().unlock();
        }
    }
}

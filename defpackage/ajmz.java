package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ajmz implements ajos {
    public final List a;
    private final Map b;
    private final ajmy c;

    public ajmz() {
        this(amvo.b, amvo.b);
    }

    private final void g(Class cls) {
        amkq.N(!this.b.containsKey(cls));
        this.b.put(cls, Integer.valueOf(d()));
        this.a.add(cls);
    }

    protected abstract ajom a(int i);

    @Override // defpackage.ajos
    public final int c(Object obj) {
        Integer num;
        if (obj == null || (num = (Integer) this.b.get(obj.getClass())) == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // defpackage.ajos
    public final int d() {
        return this.a.size();
    }

    @Override // defpackage.ajos
    public final ajom e(int i, ViewGroup viewGroup) {
        if (i < 0 || i > d()) {
            return null;
        }
        ajom a = a(i);
        if (a != null) {
            return a;
        }
        ajmy ajmyVar = this.c;
        Class cls = (Class) this.a.get(i);
        if (ajmyVar.a.containsKey(cls)) {
            return (ajom) ((azrw) ajmyVar.a.get(cls)).get();
        }
        ajoq a2 = ajmyVar.a(cls);
        if (a2 == null) {
            return null;
        }
        return a2.b(viewGroup);
    }

    @Override // defpackage.ajos
    public final void f(Class cls, ajoq ajoqVar) {
        cls.getClass();
        ajoqVar.getClass();
        if (this.b.containsKey(cls)) {
            ajoq a = this.c.a(cls);
            boolean z = false;
            if (a != null && a.getClass().isInstance(ajoqVar)) {
                z = true;
            }
            amkq.U(z, "Attempted to register a presenter factory with the same model type twice.model=%s  registered=%s  new=%s", cls, a.getClass(), ajoqVar.getClass());
            return;
        }
        g(cls);
        this.c.b.put(cls, ajoqVar);
    }

    public ajmz(Map map, Map map2) {
        amsx keySet;
        amsx keySet2;
        if (!map.isEmpty() && !map2.isEmpty()) {
            amvo amvoVar = (amvo) map;
            amvo amvoVar2 = (amvo) map2;
            if (amvoVar.d >= amvoVar2.d) {
                keySet = ((amrz) map2).keySet();
            } else {
                keySet = ((amrz) map).keySet();
            }
            if (amvoVar.d < amvoVar2.d) {
                keySet2 = ((amrz) map2).keySet();
            } else {
                keySet2 = ((amrz) map).keySet();
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(keySet);
            linkedHashSet.retainAll(keySet2);
            if (!linkedHashSet.isEmpty()) {
                String valueOf = String.valueOf(linkedHashSet.toString());
                throw new IllegalStateException(valueOf.length() != 0 ? "Duplicate keys are not allowed in the maps provided to BasePresenterViewPool.Repeated entries: ".concat(valueOf) : new String("Duplicate keys are not allowed in the maps provided to BasePresenterViewPool.Repeated entries: "));
            }
        }
        this.c = new ajmy(map, map2);
        int max = Math.max(((amvo) map2).d + ((amvo) map).d, 16);
        this.b = new HashMap(max);
        this.a = new ArrayList(max);
        Iterator it = ((amrz) map2).keySet().iterator();
        while (it.hasNext()) {
            g((Class) it.next());
        }
        Iterator it2 = ((amrz) map).keySet().iterator();
        while (it2.hasNext()) {
            g((Class) it2.next());
        }
    }
}

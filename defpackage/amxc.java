package defpackage;

import java.io.Serializable;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amxc extends ampe implements Serializable {
    final NavigableMap a;
    private transient Set b;

    private amxc(NavigableMap navigableMap) {
        this.a = navigableMap;
    }

    public static amxc d() {
        return new amxc(new TreeMap());
    }

    private final void e(amvf amvfVar) {
        if (amvfVar.m()) {
            this.a.remove(amvfVar.b);
        } else {
            this.a.put(amvfVar.b, amvfVar);
        }
    }

    @Override // defpackage.ampe, defpackage.amvh
    public final void a(amvf amvfVar) {
        if (amvfVar.m()) {
            return;
        }
        amqi amqiVar = amvfVar.b;
        amqi amqiVar2 = amvfVar.c;
        Map.Entry lowerEntry = this.a.lowerEntry(amqiVar);
        if (lowerEntry != null) {
            amvf amvfVar2 = (amvf) lowerEntry.getValue();
            if (amvfVar2.c.compareTo(amqiVar) >= 0) {
                if (amvfVar2.c.compareTo(amqiVar2) >= 0) {
                    amqiVar2 = amvfVar2.c;
                }
                amqiVar = amvfVar2.b;
            }
        }
        Map.Entry floorEntry = this.a.floorEntry(amqiVar2);
        if (floorEntry != null) {
            amvf amvfVar3 = (amvf) floorEntry.getValue();
            if (amvfVar3.c.compareTo(amqiVar2) >= 0) {
                amqiVar2 = amvfVar3.c;
            }
        }
        this.a.subMap(amqiVar, amqiVar2).clear();
        e(amvf.f(amqiVar, amqiVar2));
    }

    @Override // defpackage.ampe, defpackage.amvh
    public final void b(amvf amvfVar) {
        amvfVar.getClass();
        if (amvfVar.m()) {
            return;
        }
        Map.Entry lowerEntry = this.a.lowerEntry(amvfVar.b);
        if (lowerEntry != null) {
            amvf amvfVar2 = (amvf) lowerEntry.getValue();
            if (amvfVar2.c.compareTo(amvfVar.b) >= 0) {
                if (amvfVar.k() && amvfVar2.c.compareTo(amvfVar.c) >= 0) {
                    e(amvf.f(amvfVar.c, amvfVar2.c));
                }
                e(amvf.f(amvfVar2.b, amvfVar.b));
            }
        }
        Map.Entry floorEntry = this.a.floorEntry(amvfVar.c);
        if (floorEntry != null) {
            amvf amvfVar3 = (amvf) floorEntry.getValue();
            if (amvfVar.k() && amvfVar3.c.compareTo(amvfVar.c) >= 0) {
                e(amvf.f(amvfVar.c, amvfVar3.c));
            }
        }
        this.a.subMap(amvfVar.b, amvfVar.c).clear();
    }

    @Override // defpackage.amvh
    public final Set c() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        amxb amxbVar = new amxb(this.a.values());
        this.b = amxbVar;
        return amxbVar;
    }
}

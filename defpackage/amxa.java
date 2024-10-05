package defpackage;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amxa {
    public final NavigableMap a = new TreeMap();

    private amxa() {
    }

    public static amxa a() {
        return new amxa();
    }

    private final void f(amqi amqiVar, amqi amqiVar2, Object obj) {
        this.a.put(amqiVar, new amwz(amvf.f(amqiVar, amqiVar2), obj));
    }

    public final Object b(Comparable comparable) {
        Map.Entry floorEntry = this.a.floorEntry(amqi.f(comparable));
        Map.Entry entry = (floorEntry == null || !((amwz) floorEntry.getValue()).a.a(comparable)) ? null : (Map.Entry) floorEntry.getValue();
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    public final Map c() {
        return new amwy(this, this.a.values());
    }

    public final void d() {
        this.a.clear();
    }

    public final void e(amvf amvfVar, Object obj) {
        if (amvfVar.m()) {
            return;
        }
        obj.getClass();
        if (!amvfVar.m()) {
            Map.Entry lowerEntry = this.a.lowerEntry(amvfVar.b);
            if (lowerEntry != null) {
                amwz amwzVar = (amwz) lowerEntry.getValue();
                if (amwzVar.a().compareTo(amvfVar.b) > 0) {
                    if (amwzVar.a().compareTo(amvfVar.c) > 0) {
                        f(amvfVar.c, amwzVar.a(), ((amwz) lowerEntry.getValue()).b);
                    }
                    f(amwzVar.a.b, amvfVar.b, ((amwz) lowerEntry.getValue()).b);
                }
            }
            Map.Entry lowerEntry2 = this.a.lowerEntry(amvfVar.c);
            if (lowerEntry2 != null) {
                amwz amwzVar2 = (amwz) lowerEntry2.getValue();
                if (amwzVar2.a().compareTo(amvfVar.c) > 0) {
                    f(amvfVar.c, amwzVar2.a(), ((amwz) lowerEntry2.getValue()).b);
                }
            }
            this.a.subMap(amvfVar.b, amvfVar.c).clear();
        }
        this.a.put(amvfVar.b, new amwz(amvfVar, obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof amxa) {
            return c().equals(((amxa) obj).c());
        }
        return false;
    }

    public final int hashCode() {
        return c().hashCode();
    }

    public final String toString() {
        return this.a.values().toString();
    }
}

package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajmy {
    public final Map a;
    public final aeg b = new aeg();
    private final Map c;

    public ajmy(Map map, Map map2) {
        this.c = map;
        this.a = map2;
    }

    public final ajoq a(Class cls) {
        int c = this.b.c(cls);
        if (c >= 0) {
            return (ajoq) this.b.i(c);
        }
        if (!this.c.containsKey(cls)) {
            return null;
        }
        ajoq ajoqVar = (ajoq) ((azrw) this.c.get(cls)).get();
        this.b.put(cls, ajoqVar);
        return ajoqVar;
    }
}

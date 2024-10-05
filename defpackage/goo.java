package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class goo implements ajvz {
    private final Map a;

    public goo() {
        this(null);
    }

    private static Object c(Object obj) {
        if (obj instanceof atnz) {
            return new gon(obj.getClass(), ((atnz) obj).f.I());
        }
        if (obj instanceof arih) {
            return new gon(obj.getClass(), ((arih) obj).m.I());
        }
        return obj instanceof atni ? new gon(obj.getClass(), ((atni) obj).g.I()) : obj;
    }

    public final ammv a(Object obj) {
        return ammv.i(this.a.remove(c(obj)));
    }

    public final void b(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        this.a.put(c(obj), obj2);
    }

    @Override // defpackage.ajvz
    public final ajxe ph() {
        return new gom(amrz.j(this.a));
    }

    public goo(ajxe ajxeVar) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        if (ajxeVar instanceof gom) {
            hashMap.putAll(((gom) ajxeVar).a);
        }
    }
}

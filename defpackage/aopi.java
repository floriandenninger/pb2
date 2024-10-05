package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aopi {
    public static final aopi a = new aopi();
    private final ConcurrentMap b = new ConcurrentHashMap();
    private final aooq c = new aooq();

    private aopi() {
    }

    public final aopq a(Class cls) {
        aonz.i(cls, "messageType");
        aopq aopqVar = (aopq) this.b.get(cls);
        if (aopqVar == null) {
            aooq aooqVar = this.c;
            aopr.p(cls);
            aoov a2 = aooqVar.a.a(cls);
            if (!a2.c()) {
                if (aonm.class.isAssignableFrom(cls)) {
                    if (aooq.a(a2)) {
                        aopqVar = aopa.n(a2, aopd.b, aoom.b, aopr.c, aomx.a, aoou.b);
                    } else {
                        aopqVar = aopa.n(a2, aopd.b, aoom.b, aopr.c, null, aoou.b);
                    }
                } else if (aooq.a(a2)) {
                    aopqVar = aopa.n(a2, aopd.a, aoom.a, aopr.a, aomx.a(), aoou.a);
                } else {
                    aopqVar = aopa.n(a2, aopd.a, aoom.a, aopr.b, null, aoou.a);
                }
            } else if (!aonm.class.isAssignableFrom(cls)) {
                aopqVar = aopb.c(aopr.a, aomx.a(), a2.a());
            } else {
                aopqVar = aopb.c(aopr.c, aomx.a, a2.a());
            }
            aonz.i(cls, "messageType");
            aonz.i(aopqVar, "schema");
            aopq aopqVar2 = (aopq) this.b.putIfAbsent(cls, aopqVar);
            if (aopqVar2 != null) {
                return aopqVar2;
            }
        }
        return aopqVar;
    }

    public final aopq b(Object obj) {
        return a(obj.getClass());
    }
}

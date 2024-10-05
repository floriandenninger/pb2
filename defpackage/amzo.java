package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amzo {
    private static final Set a;

    static {
        Set singleton = Collections.singleton(amxn.a);
        a = singleton;
        amzd.a(singleton);
    }

    public static String a(amyo amyoVar) {
        return amyr.b(amyoVar.l());
    }

    public static boolean b(amyo amyoVar, amzk amzkVar, Set set) {
        return (amyoVar.k() == null && amzkVar.a() <= set.size() && set.containsAll(amzkVar.b())) ? false : true;
    }

    public static void c(amzk amzkVar, amza amzaVar, StringBuilder sb) {
        amyn amynVar = new amyn(sb);
        amzkVar.c(amzaVar, amynVar);
        if (amynVar.c) {
            amynVar.b.append(amynVar.a);
        }
    }
}

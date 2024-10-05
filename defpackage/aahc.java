package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aahc {
    public static final /* synthetic */ int a = 0;

    static {
        aahd aahdVar = aahd.j;
    }

    public static void a(aahd aahdVar, apxf apxfVar) {
        aahdVar.c(apxfVar, amvo.b);
    }

    public static void b(aahd aahdVar, List list) {
        aahdVar.d(list, amvo.b);
    }

    @Deprecated
    public static void c(aahd aahdVar, List list, Map map) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aahdVar.c((apxf) it.next(), map);
        }
    }

    @Deprecated
    public static void d(aahd aahdVar, List list, Object obj) {
        aahdVar.d(list, obj != null ? amrz.k("com.google.android.libraries.youtube.innertube.endpoint.tag", obj) : amvo.b);
    }
}

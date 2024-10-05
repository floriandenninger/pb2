package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tbc implements swp {
    public final tbt a;
    public final Executor b;
    public final String c;
    public final ajfv d;

    public tbc(tbt tbtVar, Executor executor, ajfv ajfvVar) {
        this.a = tbtVar;
        this.b = executor;
        String b = tbtVar.b();
        this.c = b;
        this.d = ajfvVar;
        tbtVar.d(b);
    }

    public static List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hx hxVar = (hx) it.next();
            if (hxVar.a != null && hxVar.b != null) {
                tbm a = tbq.a();
                a.b(tbp.NATIVE_LIBRARY_CHECK.m);
                a.c = Long.valueOf(((Long) hxVar.b).longValue() / 1000);
                tbn a2 = tbo.a();
                a2.c(amvs.a);
                a2.a = (String) hxVar.a;
                a2.h = new aksx(false, 0L);
                a.e = a2.a();
                arrayList.add(a);
            }
        }
        return arrayList;
    }
}

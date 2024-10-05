package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uzx {
    public static final Set a = Collections.newSetFromMap(new WeakHashMap());
    public static int b = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(uzv uzvVar) {
        if (uqq.n()) {
            a.add(uzvVar);
            int i = b;
            if (i != -1) {
                uzvVar.b(i);
                return;
            }
            return;
        }
        uqq.l(new uzw(uzvVar));
    }

    public static void b() {
        uqq.j();
    }

    public static void c(int i) {
        uqq.j();
        b = i;
        Iterator it = a.iterator();
        while (it.hasNext()) {
            ((uzv) it.next()).b(i);
        }
    }
}

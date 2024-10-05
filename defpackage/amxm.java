package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amxm extends amyc {
    public amxm(Class cls) {
        super("tags", cls, false);
    }

    @Override // defpackage.amyc
    public final /* bridge */ /* synthetic */ void b(Object obj, amyb amybVar) {
        for (Map.Entry entry : ((anam) obj).c.d) {
            if (!((Set) entry.getValue()).isEmpty()) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    amybVar.a((String) entry.getKey(), it.next());
                }
            } else {
                amybVar.a((String) entry.getKey(), null);
            }
        }
    }
}

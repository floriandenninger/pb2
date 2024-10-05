package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class actj implements ypb {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public final List d = new ArrayList();
    public final List e = new ArrayList();
    final /* synthetic */ actq f;

    public actj(actq actqVar) {
        this.f = actqVar;
    }

    private static final void b(Object obj, List list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ypb) it.next()).a(obj);
        }
    }

    @Override // defpackage.ypb
    public final void a(Object obj) {
        b(obj, this.c);
        b(obj, this.a);
        b(obj, this.b);
        b(obj, this.d);
        b(obj, this.e);
        actq actqVar = this.f;
        for (actb actbVar : actqVar.b) {
            if (!actbVar.a) {
                actqVar.c.b(actbVar.b());
            }
        }
        actqVar.b.clear();
    }
}

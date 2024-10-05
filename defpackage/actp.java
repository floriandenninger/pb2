package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class actp implements ypb {
    final /* synthetic */ actq a;
    private final actf b;

    public actp(actq actqVar, actf actfVar) {
        this.a = actqVar;
        actfVar.getClass();
        this.b = actfVar;
    }

    @Override // defpackage.ypb
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ynz a = this.b.a((ynz) obj);
        if (a != null) {
            if (!this.a.a.isEmpty()) {
                Iterator it = this.a.a.iterator();
                while (it.hasNext()) {
                    ((actb) it.next()).a(a);
                }
            }
            if (this.a.b.isEmpty()) {
                return;
            }
            Iterator it2 = this.a.b.iterator();
            while (it2.hasNext()) {
                ((actb) it2.next()).a(a);
            }
        }
    }
}

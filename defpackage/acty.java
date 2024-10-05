package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acty implements ypb {
    final /* synthetic */ actz a;
    private final actf b;

    public acty(actz actzVar, actf actfVar) {
        this.a = actzVar;
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

package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vfd implements anfz {
    public final List a;
    public final Executor b;

    private vfd(List list, Executor executor) {
        this.a = list;
        this.b = executor;
    }

    public static vfd b(List list, Executor executor) {
        return new vfd(list, executor);
    }

    @Override // defpackage.anfz
    public final /* bridge */ /* synthetic */ anhy a(Object obj) {
        final vgy vgyVar = (vgy) obj;
        int i = ((amvj) this.a).c;
        ArrayList arrayList = new ArrayList(i);
        amxe it = ((amru) this.a).iterator();
        while (it.hasNext()) {
            arrayList.add(((vez) it.next()).c());
        }
        final anfz c = amjk.c(new vfc(this, arrayList, i, 0));
        final angq angqVar = angq.a;
        vgyVar.a.e.a();
        return anfq.i(anfq.i(anaf.P(vgyVar.a.c.c()), amjk.c(new anfz() { // from class: vgx
            @Override // defpackage.anfz
            public final anhy a(Object obj2) {
                vgy vgyVar2 = vgy.this;
                return vgyVar2.a.b.j(c, angqVar);
            }
        }), angq.a), amjk.c(new vfc(this, i, arrayList, 1)), angq.a);
    }
}

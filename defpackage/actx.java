package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class actx implements ypb {
    final /* synthetic */ actz a;
    private final String b;

    public actx(actz actzVar, String str) {
        this.a = actzVar;
        zhq.m(str);
        this.b = str;
    }

    @Override // defpackage.ypb
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ynz ynzVar = (ynz) obj;
        ynzVar.g(this.b);
        Iterator it = this.a.a.iterator();
        while (it.hasNext()) {
            actb actbVar = (actb) it.next();
            if (actbVar.a(ynzVar)) {
                it.remove();
                if (!actbVar.a) {
                    this.a.b.add(actbVar);
                }
            }
        }
    }
}

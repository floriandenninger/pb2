package defpackage;

import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aldi implements anhh {
    final /* synthetic */ String a;
    final /* synthetic */ aldn b;

    public aldi(aldn aldnVar, String str) {
        this.b = aldnVar;
        this.a = str;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.b.d(this.a, (aleb) obj);
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        if (this.b.h(this.a) != 3 || (th instanceof CancellationException)) {
            return;
        }
        Iterator it = this.b.b.iterator();
        while (it.hasNext()) {
            ((aldm) it.next()).p(this.a);
        }
    }
}

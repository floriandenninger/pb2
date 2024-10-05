package defpackage;

import android.accounts.Account;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ulf implements anhh {
    final /* synthetic */ ulg a;

    public ulf(ulg ulgVar) {
        this.a = ulgVar;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            this.a.h((Account) it.next());
        }
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
    }
}

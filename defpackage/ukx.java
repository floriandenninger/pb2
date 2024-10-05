package defpackage;

import android.accounts.Account;
import android.util.Log;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ukx implements anhh {
    final /* synthetic */ uky a;

    public ukx(uky ukyVar) {
        this.a = ukyVar;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.b.c((Account[]) ((List) obj).toArray(new Account[0]));
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        Log.e("OneGoogle", "Failed to load accounts", th);
        this.a.b.c(new Account[0]);
    }
}

package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vjw implements vjv {
    private final AccountManager a;

    public vjw(Context context) {
        this.a = AccountManager.get(context);
    }

    @Override // defpackage.vjv
    public final Account[] a() {
        return this.a.getAccountsByType("com.google");
    }
}

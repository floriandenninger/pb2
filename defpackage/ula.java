package defpackage;

import android.accounts.AccountManager;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ula implements ukw {
    private boolean a = false;
    private final OnAccountsUpdateListener b;
    private final AccountManager c;

    public ula(Context context, uke ukeVar, OnAccountsUpdateListener onAccountsUpdateListener) {
        this.b = onAccountsUpdateListener;
        this.c = AccountManager.get(context.getApplicationContext());
        if (aih.c(context, "android.permission.GET_ACCOUNTS") != 0) {
            ukg ukgVar = (ukg) ukeVar;
            amkq.o(amkq.l(new ukf(ukgVar, 2), ukgVar.c), new sfi(4), angq.a);
        }
    }

    @Override // defpackage.ukw
    public final void a() {
        synchronized (this) {
            if (!this.a) {
                this.c.addOnAccountsUpdatedListener(this.b, null, false, new String[]{"com.google"});
                this.a = true;
            }
        }
    }

    @Override // defpackage.ukw
    public final void b() {
        synchronized (this) {
            if (this.a) {
                try {
                    this.c.removeOnAccountsUpdatedListener(this.b);
                } catch (IllegalArgumentException e) {
                    Log.w("OneGoogle", "Failed to remove an OnAccountsUpdatedListener", e);
                }
                this.a = false;
            }
        }
    }
}

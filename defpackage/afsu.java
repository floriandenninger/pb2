package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afsu implements Runnable {
    public final zfi a;
    private final Activity b;
    private final Account c;
    private final String d;

    public afsu(Activity activity, Account account, String str, zfi zfiVar) {
        this.b = activity;
        this.c = account;
        this.d = str;
        this.a = zfiVar;
    }

    public static ayps a(final Activity activity, final Account account, String str) {
        final AccountManager accountManager = AccountManager.get(activity);
        String valueOf = String.valueOf(Uri.encode(str));
        final String concat = valueOf.length() != 0 ? "weblogin:continue=".concat(valueOf) : new String("weblogin:continue=");
        return ayps.i(new aypu() { // from class: afsq
            @Override // defpackage.aypu
            public final void a(azcc azccVar) {
                Activity activity2 = activity;
                String str2 = concat;
                AccountManager accountManager2 = accountManager;
                Account account2 = account;
                yjk.e();
                String valueOf2 = String.valueOf(str2);
                if (valueOf2.length() != 0) {
                    "Getting authToken for authTokenType = ".concat(valueOf2);
                }
                final AccountManagerFuture<Bundle> authToken = accountManager2.getAuthToken(account2, str2, (Bundle) null, activity2, (AccountManagerCallback<Bundle>) null, (Handler) null);
                ayrz.f(azccVar, aynu.e(new ayrm() { // from class: afsr
                    @Override // defpackage.ayrm
                    public final void a() {
                        authToken.cancel(true);
                    }
                }));
                azccVar.c(authToken.getResult());
            }
        }).m(zxi.i).x(afly.h).r(aflz.d).l(ggc.m).o(zxi.h).k(new ayrs() { // from class: afss
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                accountManager.invalidateAuthToken(account.type, (String) obj);
            }
        });
    }

    @Override // java.lang.Runnable
    public final void run() {
        final String str = (String) a(this.b, this.c, this.d).X();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.b.runOnUiThread(new Runnable() { // from class: afst
            @Override // java.lang.Runnable
            public final void run() {
                afsu afsuVar = afsu.this;
                afsuVar.a.a(str);
            }
        });
    }
}

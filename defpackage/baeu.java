package defpackage;

import J.N;
import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import java.io.IOException;
import org.chromium.base.ThreadUtils;
import org.chromium.net.HttpNegotiateAuthenticator;
import org.chromium.net.NetError;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baeu implements AccountManagerCallback {
    public final baev a;
    final /* synthetic */ HttpNegotiateAuthenticator b;
    private final /* synthetic */ int c;

    public baeu(HttpNegotiateAuthenticator httpNegotiateAuthenticator, baev baevVar, int i) {
        this.c = i;
        this.b = httpNegotiateAuthenticator;
        this.a = baevVar;
    }

    @Override // android.accounts.AccountManagerCallback
    public final void run(AccountManagerFuture accountManagerFuture) {
        if (this.c == 0) {
            try {
                Bundle bundle = (Bundle) accountManagerFuture.getResult();
                if (!bundle.containsKey("intent")) {
                    this.b.processResult(bundle, this.a);
                    return;
                } else {
                    Context context = ayeq.a;
                    context.registerReceiver(new baet(this, context), new IntentFilter("android.accounts.LOGIN_ACCOUNTS_CHANGED"));
                    return;
                }
            } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                badx.f("net_auth", "ERR_UNEXPECTED: Error while attempting to obtain a token.", e);
                N.M0s8NeYn(this.a.a, this.b, -9, null);
                return;
            }
        }
        try {
            Account[] accountArr = (Account[]) accountManagerFuture.getResult();
            int length = accountArr.length;
            if (length == 0) {
                badx.f("net_auth", "ERR_MISSING_AUTH_CREDENTIALS: No account provided for the kerberos authentication. Please verify the configuration policies and that the CONTACTS runtime permission is granted. ", new Object[0]);
                N.M0s8NeYn(this.a.a, this.b, NetError.ERR_MISSING_AUTH_CREDENTIALS, null);
                return;
            }
            if (length > 1) {
                badx.f("net_auth", "ERR_MISSING_AUTH_CREDENTIALS: Found %d accounts eligible for the kerberos authentication. Please fix the configuration by providing a single account.", Integer.valueOf(length));
                N.M0s8NeYn(this.a.a, this.b, NetError.ERR_MISSING_AUTH_CREDENTIALS, null);
            } else if (this.b.lacksPermission(ayeq.a, "android.permission.USE_CREDENTIALS", true)) {
                badx.d("net_auth", "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: USE_CREDENTIALS permission not granted. Aborting authentication.", new Object[0]);
                N.M0s8NeYn(this.a.a, this.b, NetError.ERR_MISCONFIGURED_AUTH_ENVIRONMENT, null);
            } else {
                baev baevVar = this.a;
                baevVar.e = accountArr[0];
                baevVar.b.getAuthToken(baevVar.e, baevVar.d, baevVar.c, true, (AccountManagerCallback<Bundle>) new baeu(this.b, baevVar, 0), new Handler(ThreadUtils.b()));
            }
        } catch (AuthenticatorException | OperationCanceledException | IOException e2) {
            badx.f("net_auth", "ERR_UNEXPECTED: Error while attempting to retrieve accounts.", e2);
            N.M0s8NeYn(this.a.a, this.b, -9, null);
        }
    }
}

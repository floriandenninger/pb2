package defpackage;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Bundle;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class wkj implements AccountManagerCallback {
    private final wjh a;

    public wkj(wjh wjhVar) {
        this.a = wjhVar;
    }

    @Override // android.accounts.AccountManagerCallback
    public final void run(AccountManagerFuture accountManagerFuture) {
        if (!accountManagerFuture.isDone()) {
            Integer.toString(1);
            return;
        }
        try {
            Bundle bundle = (Bundle) accountManagerFuture.getResult();
            if (bundle == null) {
                Integer.toString(2);
                return;
            }
            String string = bundle.getString("authAccount");
            if (string == null) {
                Integer.toString(3);
            } else {
                wjh wjhVar = this.a;
                whl.c(wjhVar.b, string, new wjg(wjhVar));
            }
        } catch (AuthenticatorException unused) {
            Integer.toString(4);
        } catch (OperationCanceledException unused2) {
            Integer.toString(5);
        } catch (IOException unused3) {
            Integer.toString(6);
        }
    }
}

package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class wco implements afti {
    private final Context a;
    private final aifh b;

    /* JADX INFO: Access modifiers changed from: protected */
    public wco(aifh aifhVar, Context context, byte[] bArr) {
        this.b = aifhVar;
        this.a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bundle c(AccountIdentity accountIdentity) {
        if (!accountIdentity.h() && accountIdentity.l() != 3) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("delegatee_user_id", accountIdentity.d());
        if (accountIdentity.h()) {
            bundle.putInt(wcy.DELEGTATION_TYPE, 1);
        }
        if (!accountIdentity.j() && !accountIdentity.f()) {
            return bundle;
        }
        bundle.putInt(wcy.DELEGTATION_TYPE, 3);
        return bundle;
    }

    @Override // defpackage.afti
    public /* bridge */ /* synthetic */ aftg a(afsx afsxVar) {
        throw null;
    }

    @Override // defpackage.afti
    public /* bridge */ /* synthetic */ void b(afsx afsxVar) {
        throw null;
    }

    public abstract aftg d(AccountIdentity accountIdentity);

    @Deprecated
    public final aftg e(AccountIdentity accountIdentity) {
        return f(new Account(accountIdentity.a(), "com.google"), c(accountIdentity));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized aftg f(Account account, Bundle bundle) {
        try {
            try {
                try {
                } catch (UserRecoverableAuthException e) {
                    return k(e);
                }
            } catch (IOException e2) {
                return new aftg(null, null, e2, true);
            }
        } catch (qdf e3) {
            qmy.a.d(this.a, e3.a);
            return k(e3);
        } catch (qcw e4) {
            return new aftg(null, null, e4, false);
        }
        return aftg.c(g(account, bundle));
    }

    protected abstract String g(Account account, Bundle bundle);

    public abstract void h(AccountIdentity accountIdentity);

    public abstract void i(Iterable iterable);

    public final void j(Executor executor, final AccountIdentity accountIdentity) {
        if (accountIdentity.g()) {
            return;
        }
        executor.execute(new Runnable() { // from class: wcn
            @Override // java.lang.Runnable
            public final void run() {
                wco.this.d(accountIdentity);
            }
        });
    }

    private final aftg k(UserRecoverableAuthException userRecoverableAuthException) {
        Intent intent = userRecoverableAuthException.b;
        Intent intent2 = intent == null ? null : new Intent(intent);
        intent2.getClass();
        aifh aifhVar = this.b;
        if (aifhVar != null) {
            aifhVar.a.d(new afth(intent2, userRecoverableAuthException));
        }
        return new aftg(null, intent2, null, false);
    }
}

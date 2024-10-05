package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.TokenData;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ucl implements ucj {
    private final Context a;
    private final shf b;

    public ucl(Context context, shf shfVar) {
        this.a = context;
        this.b = shfVar;
    }

    private final uck c(Account account) {
        Context context = this.a;
        Bundle bundle = Bundle.EMPTY;
        bundle.getClass();
        TokenData b = qde.b(context, account, "oauth2:https://www.googleapis.com/auth/notifications", bundle);
        b.getClass();
        return new uck(b);
    }

    @Override // defpackage.ucj
    public final String a(String str) {
        str.getClass();
        Context context = this.a;
        qip.ay(str, "accountName must be provided");
        qip.au("Calling this from your main thread can lead to deadlock");
        qde.h(context, 8400000);
        String f = qde.f(context, new Account(str, "com.google"), "^^_account_id_^^", new Bundle());
        f.getClass();
        return f;
    }

    @Override // defpackage.ucj
    public final String b(String str) {
        String str2;
        str.getClass();
        if (axxa.a.get().a()) {
            synchronized (this) {
                Account account = new Account(str, "com.google");
                uck c = c(account);
                if (TimeUnit.SECONDS.toMillis(c.b) - this.b.c() <= TimeUnit.MINUTES.toMillis(5L)) {
                    tyo.p("GnpGoogleAuthUtilImpl", "Token for [" + ((Object) account.name) + ", oauth2:https://www.googleapis.com/auth/notifications] is invalid with expiration " + c.b + ", refreshing...", new Object[0]);
                    qde.g(this.a, c.a);
                    c = c(account);
                }
                tyo.p("GnpGoogleAuthUtilImpl", "Returning valid token for [" + ((Object) account.name) + ", oauth2:https://www.googleapis.com/auth/notifications] with expiration " + c.b, new Object[0]);
                str2 = c.a;
            }
            return str2;
        }
        String l = qde.l(this.a, str, "oauth2:https://www.googleapis.com/auth/notifications");
        l.getClass();
        return l;
    }
}

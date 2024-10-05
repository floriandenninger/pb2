package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wcp extends wco {
    private final wkk a;
    private final ConcurrentHashMap b;
    private final aloh c;

    public wcp(aifh aifhVar, Context context, aloh alohVar, wkk wkkVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(aifhVar, context, null);
        this.b = new ConcurrentHashMap();
        this.c = alohVar;
        this.a = wkkVar;
    }

    private final synchronized void k(String str) {
        try {
            qde.g(this.c.a, str);
        } catch (IOException e) {
            zga.d("AuthTokenProvider: clearToken IOException", e);
        } catch (qcw e2) {
            zga.d("AuthTokenProvider: clearToken GoogleAuthException", e2);
        }
    }

    private static final String l(String str, String str2) {
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(str2 == null ? "" : str2.length() != 0 ? "-".concat(str2) : new String("-"));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private static final String m(AccountIdentity accountIdentity) {
        return l(accountIdentity.a(), (accountIdentity.h() || accountIdentity.l() == 3) ? accountIdentity.d() : null);
    }

    @Override // defpackage.wco, defpackage.afti
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final aftg a(AccountIdentity accountIdentity) {
        String m = m(accountIdentity);
        String str = (String) this.b.get(m);
        if (str == null) {
            synchronized (this) {
                String str2 = (String) this.b.get(m);
                if (str2 != null) {
                    return aftg.c(str2);
                }
                return f(new Account(accountIdentity.a(), "com.google"), c(accountIdentity));
            }
        }
        return aftg.c(str);
    }

    @Override // defpackage.wco
    protected final String g(Account account, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("handle_notification", true);
        String l = l(account.name, bundle.getString("delegatee_user_id"));
        aloh alohVar = this.c;
        String str = qde.b(alohVar.a, account, this.a.f, bundle).b;
        this.b.put(l, str);
        return str;
    }

    @Override // defpackage.wco, defpackage.afti
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final synchronized void b(AccountIdentity accountIdentity) {
        String m = m(accountIdentity);
        if (this.b.containsKey(m)) {
            k((String) this.b.get(m));
            this.b.remove(m);
        }
    }

    @Override // defpackage.wco
    public final synchronized void i(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.b.remove(m((AccountIdentity) it.next()));
        }
    }
}

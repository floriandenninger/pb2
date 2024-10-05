package defpackage;

import android.accounts.Account;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wcf {
    private final wkk a;

    public wcf(wkk wkkVar) {
        this.a = wkkVar;
    }

    public final Account a(afsx afsxVar) {
        if (afsxVar instanceof AccountIdentity) {
            return this.a.b(((AccountIdentity) afsxVar).a());
        }
        return null;
    }

    public final Account b(afsx afsxVar) {
        if (!(afsxVar instanceof AccountIdentity)) {
            return null;
        }
        return wkk.a(((AccountIdentity) afsxVar).a(), this.a.i());
    }

    public final boolean c(afsx afsxVar) {
        Account b;
        if ((afsxVar instanceof AccountIdentity) && (b = b(afsxVar)) != null) {
            return this.a.d(b);
        }
        return false;
    }

    public final boolean d(afsx afsxVar) {
        Account b;
        if ((afsxVar instanceof AccountIdentity) && (b = b(afsxVar)) != null) {
            return this.a.e(b);
        }
        return false;
    }

    public final boolean e(afsx afsxVar) {
        Account b;
        if ((afsxVar instanceof AccountIdentity) && (b = b(afsxVar)) != null) {
            return this.a.f(b);
        }
        return false;
    }

    public final boolean f(afsx afsxVar) {
        Account b;
        if ((afsxVar instanceof AccountIdentity) && (b = b(afsxVar)) != null) {
            return this.a.g(b);
        }
        return false;
    }
}

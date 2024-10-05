package defpackage;

import android.accounts.AccountManager;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amda implements axqr {
    private final azrw a;

    public amda(azrw azrwVar) {
        this.a = azrwVar;
    }

    public static AccountManager b(Context context) {
        AccountManager accountManager = (AccountManager) context.getSystemService("account");
        ayaw.k(accountManager);
        return accountManager;
    }

    @Override // defpackage.azrw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AccountManager get() {
        return b((Context) ((axqs) this.a).a);
    }
}

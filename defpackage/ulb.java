package defpackage;

import android.accounts.OnAccountsUpdateListener;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ulb implements ukv {
    private final /* synthetic */ int a;

    public ulb(int i) {
        this.a = i;
    }

    @Override // defpackage.ukv
    public final ukw a(Context context, uke ukeVar, OnAccountsUpdateListener onAccountsUpdateListener) {
        return this.a != 0 ? new ukz(context, ukeVar, onAccountsUpdateListener) : new ula(context, ukeVar, onAccountsUpdateListener);
    }
}

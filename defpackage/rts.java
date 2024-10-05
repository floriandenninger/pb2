package defpackage;

import android.accounts.Account;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rts implements axzs {
    public static final amyi a = rwh.k();
    public final Context b;
    public final Account c;

    public rts(Context context, Account account) {
        this.b = context;
        this.c = account;
    }

    @Override // defpackage.axzs
    public final axzr a(aych aychVar, axzo axzoVar, axzp axzpVar) {
        return new rtr(this, axzpVar.a(aychVar, axzoVar));
    }
}

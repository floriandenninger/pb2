package defpackage;

import android.accounts.Account;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rrj extends qob {
    public final Context a;
    public final String b;
    public final int c;
    public final int d;

    public rrj(Context context, rrd rrdVar) {
        super(context, rre.a, rrdVar, new ante(1));
        this.a = context;
        this.c = rrdVar.a;
        Account account = rrdVar.c;
        this.b = account != null ? account.name : null;
        this.d = 1;
    }
}

package defpackage;

import android.content.Intent;
import com.google.apps.tiktok.account.AccountId;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alxb {
    public static final amxj a = amxj.l("com/google/apps/tiktok/account/api/controller/AccountIntents");

    public static void a(Intent intent, AccountId accountId) {
        amkq.E(accountId.a() != -1);
        intent.putExtra("account_id", accountId.a());
        intent.putExtra("$tiktok$account_id_owned", true);
    }
}

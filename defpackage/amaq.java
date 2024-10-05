package defpackage;

import android.content.Intent;
import com.google.apps.tiktok.account.AccountId;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amaq implements alxk, alxl {
    private final alyw a;

    public amaq(alyw alywVar) {
        this.a = alywVar;
    }

    private static boolean c(Intent intent) {
        return intent.hasExtra("viewerid");
    }

    @Override // defpackage.alxj
    public final anhy a(alxo alxoVar) {
        amil l = amjw.l("Get Intent Account");
        try {
            Intent intent = alxoVar.a;
            if (intent.hasExtra("account_id")) {
                int intExtra = intent.getIntExtra("account_id", -1);
                if (intExtra != -1 && !intent.getBooleanExtra("$tiktok$account_id_owned", false)) {
                    ((amxh) ((amxh) alxb.a.f()).i("com/google/apps/tiktok/account/api/controller/AccountIntents", "getAccount", 106, "AccountIntents.java")).q("AccountId was manually propagated. Use AccountIntents instead.");
                }
                anhy O = anaf.O(intExtra != -1 ? AccountId.b(intExtra) : null);
                l.close();
                return O;
            }
            if (c(intent)) {
                amkq.N(c(intent));
                String stringExtra = intent.getStringExtra("viewerid");
                stringExtra.getClass();
                if (intent.hasExtra("effectiveid")) {
                    stringExtra = intent.getStringExtra("effectiveid");
                    stringExtra.getClass();
                }
                anhy h = aney.h(this.a.a("google", stringExtra), IllegalArgumentException.class, akpw.k, angq.a);
                l.a(h);
                l.close();
                return h;
            }
            anhy O2 = anaf.O(null);
            l.close();
            return O2;
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // defpackage.alxk
    public final anhy b(AccountId accountId) {
        return anaf.O(null);
    }
}

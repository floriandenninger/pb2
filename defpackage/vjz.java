package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vjz {
    private static final amxj b = amxj.l("com/google/android/libraries/user/profile/photopicker/common/account/PhotoPickerAccount");
    public ammv a = amlr.a;
    private final Account c;

    public vjz(Context context, Account account, vjv vjvVar) {
        this.c = account;
        a(vjvVar.a());
        AccountManager.get(context).addOnAccountsUpdatedListener(new OnAccountsUpdateListener() { // from class: vjy
            @Override // android.accounts.OnAccountsUpdateListener
            public final void onAccountsUpdated(Account[] accountArr) {
                vjz.this.a(accountArr);
            }
        }, null, false);
    }

    public final void a(Account[] accountArr) {
        ammv ammvVar;
        ((amxh) ((amxh) b.c()).i("com/google/android/libraries/user/profile/photopicker/common/account/PhotoPickerAccount", "updateAccountId", 61, "PhotoPickerAccount.java")).q("Updating account id");
        int i = 0;
        while (true) {
            if (i >= accountArr.length) {
                ammvVar = amlr.a;
                break;
            } else {
                if (accountArr[i].equals(this.c)) {
                    ammvVar = ammv.j(Integer.valueOf(i));
                    break;
                }
                i++;
            }
        }
        this.a = ammvVar;
    }
}

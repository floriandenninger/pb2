package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentProviderClient;
import android.content.Context;
import android.os.Parcelable;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uco implements ucn {
    public Context a;

    @Override // defpackage.ucn
    public final Set a() {
        int i = 0;
        if (aih.c(this.a, "android.permission.GET_ACCOUNTS") != 0 || tyo.k()) {
            Object[] objArr = new Object[0];
            if (tyo.q(2)) {
                tyo.o("DeviceAccountsUtilImpl", "Try to retrieve accounts list from Accounts ContentProvider.", objArr);
            }
            ContentProviderClient acquireContentProviderClient = this.a.getContentResolver().acquireContentProviderClient("com.google.android.gms.auth.accounts");
            try {
                if (acquireContentProviderClient == null) {
                    throw new ucm();
                }
                try {
                    Parcelable[] parcelableArray = acquireContentProviderClient.call("get_accounts", "com.google", null).getParcelableArray("accounts");
                    HashSet hashSet = new HashSet();
                    int length = parcelableArray.length;
                    while (i < length) {
                        hashSet.add(((Account) parcelableArray[i]).name);
                        i++;
                    }
                    return hashSet;
                } catch (Exception e) {
                    throw new ucm(e);
                }
            } finally {
                acquireContentProviderClient.release();
            }
        }
        HashSet hashSet2 = new HashSet();
        Account[] accountsByType = AccountManager.get(this.a).getAccountsByType("com.google");
        int length2 = accountsByType.length;
        while (i < length2) {
            hashSet2.add(accountsByType[i].name);
            i++;
        }
        return hashSet2;
    }

    @Override // defpackage.ucn
    public final boolean b(String str) {
        try {
            return a().contains(str);
        } catch (ucm e) {
            Object[] objArr = new Object[0];
            if (!tyo.q(6)) {
                return true;
            }
            Log.e("GnpSdk", tyo.o("DeviceAccountsUtilImpl", "HasCorrespondingAccountOnDevice falled back to true", objArr), e);
            return true;
        }
    }
}

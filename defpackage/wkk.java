package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wkk {
    public static final Set a;
    public static final Set b;
    public static final String c;
    private static final String h;
    protected final AccountManager d;
    public final Context e;
    public final String f;
    public final wki g;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("https://www.googleapis.com/auth/youtube");
        hashSet.add("https://www.googleapis.com/auth/youtube.force-ssl");
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        a = unmodifiableSet;
        HashSet hashSet2 = new HashSet(unmodifiableSet);
        hashSet2.add("https://www.googleapis.com/auth/identity.lateimpersonation");
        b = Collections.unmodifiableSet(hashSet2);
        h = rrx.a("uca");
        c = rrx.a("hgp");
        rrx.a("HOSTED");
    }

    public wkk(AccountManager accountManager, wki wkiVar, Set set, Context context) {
        this.d = accountManager;
        this.g = wkiVar;
        String valueOf = String.valueOf(TextUtils.join(" ", set));
        this.f = valueOf.length() != 0 ? "oauth2:".concat(valueOf) : new String("oauth2:");
        this.e = context;
    }

    public static Account a(String str, Account[] accountArr) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (Account account : accountArr) {
            if (TextUtils.equals(account.name, str)) {
                return account;
            }
        }
        return null;
    }

    public static boolean c(String str, Account[] accountArr) {
        return a(str, accountArr) != null;
    }

    public final Account b(String str) {
        return a(str, h());
    }

    public final boolean d(Account account) {
        yjk.e();
        return this.g.a(account, new String[]{aobk.a.a}).intValue() == 1;
    }

    public final boolean e(Account account) {
        yjk.e();
        return this.g.a(account, new String[]{aobi.a.a}).intValue() == 1;
    }

    public final boolean f(Account account) {
        try {
            return a(account.name, this.g.c(new String[]{c})) != null;
        } catch (IOException | qcw unused) {
            return true;
        }
    }

    public final boolean g(Account account) {
        try {
            return a(account.name, this.g.c(new String[]{h})) != null;
        } catch (IOException | qcw unused) {
            return true;
        }
    }

    public final Account[] h() {
        return this.g.b();
    }

    @Deprecated
    public final Account[] i() {
        try {
            return h();
        } catch (RemoteException | qnk | qnl unused) {
            return new Account[0];
        }
    }

    public final void j(Activity activity, wjh wjhVar) {
        activity.getClass();
        if (Build.VERSION.SDK_INT >= 23 || activity.checkCallingOrSelfPermission("android.permission.MANAGE_ACCOUNTS") == 0) {
            this.d.addAccount("com.google", null, null, null, activity, new wkj(wjhVar), null);
            return;
        }
        zga.l("startAddAccountActivity called with a listener but without MANAGE_ACCOUNTS permission,the listener will be ignored");
        Intent intent = new Intent("android.settings.ADD_ACCOUNT_SETTINGS");
        intent.putExtra("account_types", new String[]{"com.google"});
        activity.startActivity(intent);
    }
}

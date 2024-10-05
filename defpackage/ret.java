package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Build;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ret extends rhg {
    public Boolean a;
    public long b;
    private long c;
    private String d;
    private AccountManager e;

    public ret(rgt rgtVar) {
        super(rgtVar);
    }

    public final long a() {
        j();
        return this.c;
    }

    public final String b() {
        j();
        return Build.MODEL;
    }

    public final String c() {
        j();
        return Build.VERSION.RELEASE;
    }

    public final String d() {
        j();
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e() {
        Account[] result;
        n();
        Q();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.b > 86400000) {
            this.a = null;
        }
        Boolean bool = this.a;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (aih.c(I(), "android.permission.GET_ACCOUNTS") != 0) {
            aF().g.a("Permission error checking for dasher/unicorn accounts");
            this.b = currentTimeMillis;
            this.a = false;
            return false;
        }
        if (this.e == null) {
            this.e = AccountManager.get(I());
        }
        try {
            result = this.e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            aF().d.b("Exception checking account types", e);
        }
        if (result == null || result.length <= 0) {
            Account[] result2 = this.e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
            if (result2 != null && result2.length > 0) {
                this.a = true;
                this.b = currentTimeMillis;
                return true;
            }
            this.b = currentTimeMillis;
            this.a = false;
            return false;
        }
        this.a = true;
        this.b = currentTimeMillis;
        return true;
    }

    @Override // defpackage.rhg
    protected final boolean f() {
        Calendar calendar = Calendar.getInstance();
        this.c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String lowerCase = locale.getLanguage().toLowerCase(Locale.ENGLISH);
        String lowerCase2 = locale.getCountry().toLowerCase(Locale.ENGLISH);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.d = sb.toString();
        return false;
    }
}

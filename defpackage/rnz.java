package defpackage;

import android.util.Log;
import com.google.android.gms.phenotype.Configurations;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rnz {
    protected final String a;
    protected long b;
    protected final qob c;

    public rnz(qob qobVar, String str) {
        this.c = qobVar;
        this.a = str;
        synchronized (qri.a) {
        }
        this.b = 2000L;
    }

    public final boolean a(int i) {
        if (i <= 0) {
            String valueOf = String.valueOf(this.a);
            Log.w("PhenotypeFlagCommitter", valueOf.length() != 0 ? "No more attempts remaining, giving up for ".concat(valueOf) : new String("No more attempts remaining, giving up for "));
            return false;
        }
        Configurations b = b(this.a);
        if (b == null) {
            return false;
        }
        String str = b.a;
        if (str == null || str.isEmpty()) {
            return true;
        }
        try {
            rqr.e(this.c.D(b.a), this.b, TimeUnit.MILLISECONDS);
            uuy.f(uvg.a(this.a));
            return true;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            String str2 = this.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 41);
            sb.append("Committing snapshot for ");
            sb.append(str2);
            sb.append(" failed, retrying");
            Log.w("PhenotypeFlagCommitter", sb.toString(), e);
            return a(i - 1);
        }
    }

    protected final Configurations b(String str) {
        try {
            return (Configurations) rqr.e(this.c.E(str, ""), this.b, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 31);
            sb.append("Retrieving snapshot for ");
            sb.append(str);
            sb.append(" failed");
            Log.e("PhenotypeFlagCommitter", sb.toString(), e);
            return null;
        }
    }
}

package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.youtube.R;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rvm {
    public final String a;
    public final String b;

    public rvm(String str) {
        this.a = str;
        this.b = "Auth";
        qip.aq(true, "tag \"%s\" is longer than the %d character maximum", "Auth", 23);
        for (int i = 2; i <= 7 && !Log.isLoggable(this.b, i); i++) {
        }
    }

    protected final String a(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.a.concat(str);
    }

    public final void b(String str, Object... objArr) {
        Log.w(this.b, a(str, objArr));
    }

    public final void c(Object... objArr) {
        Log.e(this.b, a("GoogleAuthUtil", objArr));
    }

    public rvm(Context context) {
        this.a = context.getString(R.string.aplosA11yDomainExplorerDomainAnnounce);
        this.b = context.getString(R.string.aplosA11yDomainExplorerValueAnnounce);
    }
}

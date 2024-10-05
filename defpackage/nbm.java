package defpackage;

import android.util.Log;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nbm {
    public boolean a;

    public nbm() {
        this.a = false;
    }

    public nbm(boolean z) {
        this.a = z;
    }

    public static String c(String str, String str2, Object[] objArr) {
        if (objArr.length != 0) {
            str2 = String.format(Locale.US, str2, objArr);
        }
        StringBuilder sb = new StringBuilder(str.length() + 3 + String.valueOf(str2).length());
        sb.append("[");
        sb.append(str);
        sb.append("] ");
        sb.append(str2);
        return sb.toString();
    }

    public final void a(boolean z) {
        yjk.f();
        this.a = z;
    }

    public final boolean b() {
        yjk.f();
        return this.a;
    }

    public final boolean d(int i) {
        return this.a || Log.isLoggable("Notifications", i);
    }
}

package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qkw {
    protected final String a;
    public String b;

    public qkw(String str) {
        qip.ay(str, "The log tag cannot be null or empty.");
        this.a = str;
        str.length();
    }

    public final String a(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        if (TextUtils.isEmpty(this.b)) {
            return str;
        }
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public final void b(String str, Object... objArr) {
        Log.e(this.a, a(str, objArr));
    }

    public final void c(Throwable th, String str, Object... objArr) {
        Log.e(this.a, a(str, objArr), th);
    }

    public final void d(String str, Object... objArr) {
        Log.w(this.a, a(str, objArr));
    }

    public final void e(Throwable th, String str, Object... objArr) {
        Log.w(this.a, a(str, objArr), th);
    }
}

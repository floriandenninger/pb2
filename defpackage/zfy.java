package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.os.ConditionVariable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zfy {
    private final String a;
    private final ContentResolver b;
    private volatile boolean c;

    public zfy(Context context, String str) {
        ContentResolver contentResolver = context.getContentResolver();
        contentResolver.getClass();
        this.b = contentResolver;
        zhq.m(str);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 9);
        sb.append("youtube:");
        sb.append(str);
        sb.append(":");
        this.a = sb.toString();
    }

    private final String f(String str) {
        String valueOf = String.valueOf(this.a);
        return str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
    }

    private final void g(String str) {
        if (this.c) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 71);
        sb.append("Fetching the Gservices key '");
        sb.append(str);
        sb.append("' before the end of the bulk initialization");
        zga.l(sb.toString());
    }

    public final int a(String str, int i) {
        g(str);
        return rsb.a(this.b, f(str), i);
    }

    public final String b(String str, String str2) {
        g(str);
        return rsb.d(this.b, f(str), str2);
    }

    public final void c(Executor executor, ConditionVariable conditionVariable) {
        executor.execute(new zfx(this, conditionVariable));
    }

    public final void d() {
        rsb.f(this.b, this.a);
        rsb.h(this.b, 0L);
        rsb.g(this.b, "http_stats", false);
        this.c = true;
    }

    public final boolean e(String str, boolean z) {
        g(str);
        return rsb.g(this.b, f(str), z);
    }
}

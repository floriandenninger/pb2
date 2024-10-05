package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vev {
    public Context a;
    public anfz b;
    public String c;
    public Handler d;
    public final amnv e = amkq.y(10);
    public final TimeUnit f = TimeUnit.SECONDS;

    public final vey a() {
        return new vey(this);
    }

    public final void b() {
        this.c = "com.google.android.gms.permission.INTERNAL_BROADCAST";
    }

    public final void c(Context context) {
        this.a = context.getApplicationContext();
    }
}

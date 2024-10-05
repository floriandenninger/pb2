package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alph {
    public static final ammr c = new ammr("PrewarmService", (char[]) null);
    private static final Intent d = new Intent("com.google.android.play.core.prewarm.BIND_PREWARM_SERVICE").setPackage("com.android.vending");
    public final alqa a;
    public final String b;

    public alph(Context context) {
        if (alsi.a(context)) {
            this.a = new alqa(context.getApplicationContext(), c, "PrewarmService", d, alpf.a, null);
        } else {
            this.a = null;
        }
        this.b = context.getPackageName();
    }
}

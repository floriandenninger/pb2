package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alqy {
    public static final ammr c = new ammr("SplitInstallService", (char[]) null);
    private static final Intent d = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");
    public final String a;
    public alqa b;

    public alqy(Context context) {
        this.a = context.getPackageName();
        if (alsi.a(context)) {
            this.b = new alqa(alta.q(context), c, "SplitInstallService", d, alpf.d, null);
        }
    }
}

package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alop {
    public static final ammr e = new ammr("AppUpdateService", (char[]) null);
    private static final Intent f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");
    public alqa a;
    public final String b;
    public final Context c;
    public final aloh d;

    public alop(Context context, aloh alohVar, byte[] bArr) {
        this.b = context.getPackageName();
        this.c = context;
        this.d = alohVar;
        if (alsi.a(context)) {
            this.a = new alqa(alta.q(context), e, "AppUpdateService", f, alpf.b, null);
        }
    }

    public static int a(Bundle bundle) {
        return bundle.getInt("error.code", -2);
    }

    public static Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putAll(alou.a("app_update"));
        bundle.putInt("playcore.version.code", 11002);
        return bundle;
    }

    public static alsc c() {
        e.k("onError(%d)", -9);
        return alta.r(new aloy(-9));
    }
}

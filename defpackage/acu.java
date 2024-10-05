package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acu {
    public final Intent a;
    public Bundle b;
    public final skw c;

    public acu() {
        this.a = new Intent("android.intent.action.VIEW");
        this.c = new skw();
    }

    private final void b(IBinder iBinder) {
        Bundle bundle = new Bundle();
        bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
        this.a.putExtras(bundle);
    }

    public final acv a() {
        if (!this.a.hasExtra("android.support.customtabs.extra.SESSION")) {
            b(null);
        }
        this.a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        Intent intent = this.a;
        Integer num = this.c.a;
        Bundle bundle = new Bundle();
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        intent.putExtras(bundle);
        this.a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        return new acv(this.a, this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [ay, android.os.IBinder] */
    public acu(acx acxVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.a = intent;
        this.c = new skw();
        intent.setPackage(acxVar.b.getPackageName());
        b(acxVar.a);
    }
}

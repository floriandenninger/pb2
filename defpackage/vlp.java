package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vlp {
    public final PackageManager a;

    public vlp(PackageManager packageManager) {
        this.a = packageManager;
    }

    public final boolean a(Intent intent) {
        return !this.a.queryIntentActivities(intent, 65536).isEmpty();
    }

    public final boolean b() {
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setPackage("com.google.android.apps.photos");
        intent.setType("image/*");
        return !this.a.queryIntentActivities(intent, 65536).isEmpty();
    }
}

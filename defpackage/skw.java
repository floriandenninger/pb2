package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class skw {
    public Integer a;

    public final int a(Context context) {
        if (this.a == null) {
            try {
                this.a = Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                this.a = -1;
            }
        }
        return this.a.intValue();
    }
}

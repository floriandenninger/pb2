package defpackage;

import android.content.ComponentName;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cdw {
    static {
        ajbh.S("PackageManagerHelper");
    }

    public static void a(Context context, Class cls, boolean z) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), true != z ? 2 : 1, 1);
            ajbh X = ajbh.X();
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = true != z ? "disabled" : "enabled";
            String.format("%s %s", objArr);
            X.T(new Throwable[0]);
        } catch (Exception e) {
            ajbh X2 = ajbh.X();
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            objArr2[1] = true == z ? "enabled" : "disabled";
            String.format("%s could not be %s", objArr2);
            X2.T(e);
        }
    }
}

package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class qmz {
    public static final int c;
    public static final qmz d;

    static {
        int i = qnm.c;
        c = 213880000;
        d = new qmz();
    }

    public final int g(Context context) {
        return h(context, c);
    }

    public final int h(Context context, int i) {
        int b = qnm.b(context, i);
        if (qnm.f(context, b)) {
            return 18;
        }
        return b;
    }

    public final Intent i(Context context, int i, String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            return qsm.c();
        }
        if (context == null || !oba.ae(context)) {
            StringBuilder sb = new StringBuilder();
            sb.append("gcore_");
            sb.append(c);
            sb.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
            sb.append("-");
            if (context != null) {
                sb.append(context.getPackageName());
            }
            sb.append("-");
            if (context != null) {
                try {
                    sb.append(qtu.b(context).d(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return qsm.b(sb.toString());
        }
        return qsm.a();
    }

    public final PendingIntent j(Context context, int i, String str) {
        Intent i2 = i(context, i, str);
        if (i2 == null) {
            return null;
        }
        return rai.a(context, 0, i2, rai.a | 134217728);
    }
}

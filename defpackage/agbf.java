package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agbf implements agbr {
    private final Context a;

    public agbf(Context context) {
        this.a = context;
    }

    private static void b(dy dyVar) {
        dyVar.G = 1;
    }

    @Override // defpackage.agbr
    public final void a(apeo apeoVar, acra acraVar, agbs agbsVar, dy dyVar) {
        if (Build.VERSION.SDK_INT >= 26 && apeoVar != null) {
            apek apekVar = apeoVar.e;
            if (apekVar == null) {
                apekVar = apek.a;
            }
            int cd = anaf.cd(apekVar.s);
            if (cd == 0) {
                cd = 1;
            }
            if (cd != 1) {
                NotificationManager notificationManager = (NotificationManager) this.a.getSystemService("notification");
                String num = Integer.toString(cd - 1);
                if (notificationManager.getNotificationChannel(num) != null) {
                    dyVar.E = num;
                    if (apekVar.q) {
                        b(dyVar);
                        return;
                    }
                    return;
                }
            }
            whl.y(dyVar);
            if (apekVar.n) {
                return;
            }
            b(dyVar);
        }
    }
}

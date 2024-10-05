package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gkx {
    private final Context a;
    private final aaea b;
    private final azrw c;

    public gkx(Context context, aaea aaeaVar, azrw azrwVar) {
        this.a = context;
        this.b = aaeaVar;
        this.c = azrwVar;
    }

    public final anhy a() {
        AppOpsManager appOpsManager = (AppOpsManager) this.a.getSystemService("appops");
        if (appOpsManager == null || appOpsManager.checkOpNoThrow("android:picture_in_picture", Process.myUid(), this.a.getPackageName()) == 2) {
            return anaf.O(gkw.SYSTEM_DISABLED);
        }
        return anfq.h(((aili) this.c.get()).g(), gbr.e, angq.a);
    }

    public final int b() {
        if (Build.VERSION.SDK_INT < 26 || !this.a.getPackageManager().hasSystemFeature("android.software.picture_in_picture")) {
            return 1;
        }
        arfd a = this.b.a();
        if (a == null) {
            return 2;
        }
        aswb aswbVar = a.e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        return aswbVar.m ? 3 : 2;
    }
}

package defpackage;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agel {
    private final Context a;
    private final aaea b;

    public agel(Context context, aaea aaeaVar) {
        this.a = context;
        this.b = aaeaVar;
    }

    public final boolean a() {
        TelephonyManager telephonyManager = (TelephonyManager) this.a.getSystemService("phone");
        int i = -1;
        if (telephonyManager != null && Build.VERSION.SDK_INT >= 28) {
            i = telephonyManager.getSimCarrierId();
        }
        atfr atfrVar = this.b.a().f;
        if (atfrVar == null) {
            atfrVar = atfr.a;
        }
        return atfrVar.j.contains(Integer.valueOf(i));
    }
}

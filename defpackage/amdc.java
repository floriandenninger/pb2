package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amdc implements axqr {
    private final azrw a;

    public amdc(azrw azrwVar) {
        this.a = azrwVar;
    }

    public static TelephonyManager b(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ayaw.k(telephonyManager);
        return telephonyManager;
    }

    public static amdc c(azrw azrwVar) {
        return new amdc(azrwVar);
    }

    @Override // defpackage.azrw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final TelephonyManager get() {
        return b((Context) ((axqs) this.a).a);
    }
}

package defpackage;

import android.content.Context;
import android.net.wifi.WifiManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amdd implements axqr {
    private final azrw a;

    public amdd(azrw azrwVar) {
        this.a = azrwVar;
    }

    public static WifiManager b(Context context) {
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        ayaw.k(wifiManager);
        return wifiManager;
    }

    public static amdd c(azrw azrwVar) {
        return new amdd(azrwVar);
    }

    @Override // defpackage.azrw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final WifiManager get() {
        return b((Context) ((axqs) this.a).a);
    }
}

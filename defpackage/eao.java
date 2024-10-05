package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eao {
    public NetworkCapabilities a;

    public eao(ConnectivityManager connectivityManager) {
        if (connectivityManager == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        try {
            connectivityManager.registerDefaultNetworkCallback(new ean(this));
        } catch (RuntimeException unused) {
            synchronized (eao.class) {
                this.a = null;
            }
        }
    }

    public static eao a(Context context) {
        if (context != null) {
            return new eao((ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }
}

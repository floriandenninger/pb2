package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rfu extends rka {
    public rfu(rki rkiVar) {
        super(rkiVar);
    }

    public final boolean a() {
        V();
        ConnectivityManager connectivityManager = (ConnectivityManager) I().getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    @Override // defpackage.rka
    protected final void b() {
    }
}

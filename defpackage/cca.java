package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cca extends cbx {
    static final String f = ajbh.S("NetworkStateTracker");
    public static final /* synthetic */ int g = 0;
    private final ConnectivityManager h;
    private cbz i;
    private cby j;

    public cca(Context context, cfa cfaVar) {
        super(context, cfaVar);
        this.h = (ConnectivityManager) this.a.getSystemService("connectivity");
        if (c()) {
            this.i = new cbz(this);
        } else {
            this.j = new cby(this);
        }
    }

    private static boolean c() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.cbx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cbg b() {
        NetworkCapabilities networkCapabilities;
        boolean z;
        NetworkInfo activeNetworkInfo = this.h.getActiveNetworkInfo();
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                networkCapabilities = this.h.getNetworkCapabilities(this.h.getActiveNetwork());
            } catch (SecurityException e) {
                ajbh.X();
                ajbh.U(f, "Unable to validate active network", e);
            }
            if (networkCapabilities != null) {
                if (networkCapabilities.hasCapability(16)) {
                    z = true;
                    return new cbg(z2, z, this.h.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
                }
            }
        }
        z = false;
        return new cbg(z2, z, this.h.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
    }

    @Override // defpackage.cbx
    public final void d() {
        if (c()) {
            try {
                ajbh.X().T(new Throwable[0]);
                this.h.registerDefaultNetworkCallback(this.i);
                return;
            } catch (IllegalArgumentException | SecurityException e) {
                ajbh.X();
                ajbh.U(f, "Received exception while registering network callback", e);
                return;
            }
        }
        ajbh.X().T(new Throwable[0]);
        this.a.registerReceiver(this.j, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // defpackage.cbx
    public final void e() {
        if (c()) {
            try {
                ajbh.X().T(new Throwable[0]);
                this.h.unregisterNetworkCallback(this.i);
                return;
            } catch (IllegalArgumentException | SecurityException e) {
                ajbh.X();
                ajbh.U(f, "Received exception while unregistering network callback", e);
                return;
            }
        }
        ajbh.X().T(new Throwable[0]);
        this.a.unregisterReceiver(this.j);
    }
}

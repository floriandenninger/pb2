package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yvt implements yvu {
    private static final String a = zga.a("NetworkProvider");
    private final zey b;
    private final ConnectivityManager c;
    private final WifiManager d;
    private WifiInfo e;
    private boolean f;
    private NetworkInfo g;
    private boolean h;
    private NetworkInfo i;
    private boolean j;
    private boolean k;
    private boolean l;
    private List m;
    private boolean n;
    private boolean o;
    private boolean p;

    public yvt(ConnectivityManager connectivityManager, WifiManager wifiManager, zey zeyVar) {
        this.b = zeyVar;
        this.c = connectivityManager;
        this.d = wifiManager;
        i();
    }

    private final void i() {
        this.f = true;
        this.h = true;
        this.j = true;
        this.l = true;
        this.n = true;
        this.p = true;
    }

    private final boolean j() {
        if (this.h) {
            this.g = this.c.getActiveNetworkInfo();
            this.h = false;
        }
        NetworkInfo networkInfo = this.g;
        return (networkInfo == null || networkInfo.isConnectedOrConnecting()) ? false : true;
    }

    private static final List k() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                arrayList.add(new ysu(networkInterfaces.nextElement()));
            }
        } catch (SocketException e) {
            zga.o(a, "error getting the network interfaces", e);
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // defpackage.yvu
    public final NetworkInfo a() {
        if (!this.b.a || j()) {
            return this.c.getActiveNetworkInfo();
        }
        if (this.h) {
            this.g = this.c.getActiveNetworkInfo();
            this.h = false;
        }
        return this.g;
    }

    @Override // defpackage.yvu
    public final NetworkInfo b() {
        if (!this.b.a || j()) {
            return this.c.getNetworkInfo(0);
        }
        if (this.j) {
            this.i = this.c.getNetworkInfo(0);
            this.j = false;
        }
        return this.i;
    }

    @Override // defpackage.yvu
    public final WifiInfo c() {
        if (!this.b.a || j()) {
            return this.d.getConnectionInfo();
        }
        if (this.f) {
            this.e = this.d.getConnectionInfo();
            this.f = false;
        }
        return this.e;
    }

    @Override // defpackage.yvu
    public final List d() {
        if (!this.b.a || j()) {
            return k();
        }
        if (this.n) {
            this.m = k();
            this.n = false;
        }
        return this.m;
    }

    @Override // defpackage.yvu
    public final void e(NetworkCapabilities networkCapabilities) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.o = networkCapabilities.hasCapability(25);
            this.p = false;
        }
    }

    @Override // defpackage.yvu
    public final void f() {
        i();
    }

    @Override // defpackage.yvu
    public final boolean g() {
        if (!this.b.a || j()) {
            return this.c.isActiveNetworkMetered();
        }
        if (this.l) {
            this.k = this.c.isActiveNetworkMetered();
            this.l = false;
        }
        return this.k;
    }

    @Override // defpackage.yvu
    public final boolean h() {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        boolean hasCapability;
        if (this.p) {
            if (Build.VERSION.SDK_INT >= 30 && (activeNetwork = this.c.getActiveNetwork()) != null) {
                try {
                    networkCapabilities = this.c.getNetworkCapabilities(activeNetwork);
                } catch (SecurityException unused) {
                    networkCapabilities = null;
                }
                if (networkCapabilities != null) {
                    hasCapability = networkCapabilities.hasCapability(25);
                    this.o = hasCapability;
                    this.p = false;
                }
            }
            hasCapability = false;
            this.o = hasCapability;
            this.p = false;
        }
        return this.o;
    }
}

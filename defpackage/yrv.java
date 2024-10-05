package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.os.Build;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yrv implements ysy {
    private static final Map d;
    public final yvu a;
    public final azrw b;
    public final yrh c;

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put("\"GIN-3g\"", 10);
        hashMap.put("GIN-3g", 10);
        hashMap.put("\"GIN-2g\"", 2);
        hashMap.put("GIN-2g", 2);
        hashMap.put("\"GIN-2g-poor\"", 2);
        hashMap.put("GIN-2g-poor", 2);
    }

    public yrv(yvu yvuVar, ConnectivityManager connectivityManager, azrw azrwVar, yrh yrhVar) {
        yvuVar.getClass();
        this.a = yvuVar;
        this.b = azrwVar;
        this.c = yrhVar;
        ((yrn) azrwVar.get()).a.G().X(new ayrs() { // from class: yrt
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                yrv yrvVar = yrv.this;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                yrh yrhVar2 = yrvVar.c;
                if (yrhVar2.d()) {
                    yrhVar2.b();
                }
                yrvVar.a.f();
                if (booleanValue) {
                    ((yrn) yrvVar.b.get()).b(yrvVar.o(), yrvVar.p(), yrvVar.q(), yrvVar.i(), yrvVar.a());
                }
            }
        });
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new yru(this));
            } catch (SecurityException unused) {
            }
        }
    }

    private static final long A(int i) {
        switch (i) {
            case 1:
                return v(114.0d);
            case 2:
                return v(135.0d);
            case 3:
                return v(384.0d);
            case 4:
                return v(115.0d);
            case 5:
                return v(700.0d);
            case 6:
            case 14:
                return v(900.0d);
            case 7:
                return v(70.0d);
            case 8:
                return w(1.8d);
            case 9:
            case 10:
                return w(1.0d);
            case 11:
                return v(13.0d);
            case 12:
                return w(5.0d);
            case 13:
                return w(5.0d);
            case 15:
                return w(5.0d);
            default:
                return -1L;
        }
    }

    private static final boolean B(int i) {
        if (i == 13) {
            return true;
        }
        if (i != 20) {
            return false;
        }
        return z();
    }

    private final int t() {
        NetworkInfo a = this.a.a();
        if (a == null) {
            return 0;
        }
        WifiInfo c = this.a.c();
        if (c != null) {
            Map map = d;
            if (map.containsKey(c.getSSID())) {
                return ((Integer) map.get(c.getSSID())).intValue();
            }
        }
        return a.getSubtype();
    }

    private static long v(double d2) {
        return (long) (d2 * 1000.0d);
    }

    private static long w(double d2) {
        return (long) (d2 * 1000000.0d);
    }

    private final boolean x(NetworkInfo networkInfo) {
        WifiInfo c;
        if (networkInfo.getType() != 1 || (c = this.a.c()) == null) {
            return false;
        }
        return d.containsKey(c.getSSID());
    }

    private final boolean y(int i) {
        NetworkInfo a = this.a.a();
        if (a != null) {
            if (x(a)) {
                return i == 0;
            }
            if (a.getType() == i) {
                return true;
            }
        }
        return false;
    }

    private static boolean z() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @Override // defpackage.ysy
    public final int a() {
        NetworkInfo a = this.a.a();
        if (a == null || !o()) {
            return 2;
        }
        int type = a.getType();
        if (type == 0) {
            return u(a.getSubtype());
        }
        if (type != 1) {
            return type != 6 ? 1 : 6;
        }
        if (x(a)) {
            return u(t());
        }
        return i() ? 10 : 3;
    }

    @Override // defpackage.ysy
    public final long b() {
        return c(this.a.a());
    }

    @Override // defpackage.ysy
    public final long c(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnected()) {
            return 0L;
        }
        int type = networkInfo.getType();
        if (type == 0) {
            return A(networkInfo.getSubtype());
        }
        if (type == 1) {
            if (x(networkInfo)) {
                return A(t());
            }
            return w(this.a.c().getLinkSpeed());
        }
        if (type == 6) {
            return w(3.0d);
        }
        if (type != 9) {
            return -1L;
        }
        return w(480.0d);
    }

    @Override // defpackage.ysy
    public final NetworkInfo d() {
        return this.a.a();
    }

    @Override // defpackage.ysy
    public final ammv e() {
        return ammv.i(this.a.c());
    }

    @Override // defpackage.ysy
    public final aqjw f() {
        return g(this.a.a());
    }

    @Override // defpackage.ysy
    public final aqjw g(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnected()) {
            return aqjw.DETAILED_NETWORK_TYPE_DISCONNECTED;
        }
        int type = networkInfo.getType();
        if (type != 0) {
            if (type != 1) {
                if (type == 9) {
                    return aqjw.DETAILED_NETWORK_TYPE_ETHERNET;
                }
                if (type == 6) {
                    return aqjw.DETAILED_NETWORK_TYPE_WIMAX;
                }
                if (type == 7) {
                    return aqjw.DETAILED_NETWORK_TYPE_BLUETOOTH;
                }
                return aqjw.DETAILED_NETWORK_TYPE_NON_MOBILE_UNKNOWN;
            }
            WifiInfo c = this.a.c();
            if (c == null) {
                return aqjw.DETAILED_NETWORK_TYPE_WIFI;
            }
            if (d.containsKey(c.getSSID())) {
                return aqjw.DETAILED_NETWORK_TYPE_INTERNAL_WIFI_IMPAIRED;
            }
            return aqjw.DETAILED_NETWORK_TYPE_WIFI;
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == 20) {
            if (this.c.d()) {
                return aqjw.DETAILED_NETWORK_TYPE_NR_SA;
            }
            return aqjw.DETAILED_NETWORK_TYPE_MOBILE_UNKNOWN;
        }
        switch (subtype) {
            case 1:
                return aqjw.DETAILED_NETWORK_TYPE_GPRS;
            case 2:
                return aqjw.DETAILED_NETWORK_TYPE_EDGE;
            case 3:
                return aqjw.DETAILED_NETWORK_TYPE_UMTS;
            case 4:
                return aqjw.DETAILED_NETWORK_TYPE_CDMA;
            case 5:
                return aqjw.DETAILED_NETWORK_TYPE_EVDO_0;
            case 6:
                return aqjw.DETAILED_NETWORK_TYPE_EVDO_A;
            case 7:
                return aqjw.DETAILED_NETWORK_TYPE_1_X_RTT;
            case 8:
                return aqjw.DETAILED_NETWORK_TYPE_HSDPA;
            case 9:
                return aqjw.DETAILED_NETWORK_TYPE_HSUPA;
            case 10:
                return aqjw.DETAILED_NETWORK_TYPE_HSPA;
            case 11:
                return aqjw.DETAILED_NETWORK_TYPE_IDEN;
            case 12:
                return aqjw.DETAILED_NETWORK_TYPE_EVDO_B;
            case 13:
                if (this.c.c()) {
                    return aqjw.DETAILED_NETWORK_TYPE_NR_NSA;
                }
                return aqjw.DETAILED_NETWORK_TYPE_LTE;
            case 14:
                return aqjw.DETAILED_NETWORK_TYPE_EHRPD;
            case 15:
                return aqjw.DETAILED_NETWORK_TYPE_HSPAP;
            default:
                return aqjw.DETAILED_NETWORK_TYPE_MOBILE_UNKNOWN;
        }
    }

    @Override // defpackage.ysy
    public final List h() {
        return this.a.d();
    }

    @Override // defpackage.ysy
    public final boolean i() {
        return o() && this.a.g();
    }

    @Override // defpackage.ysy
    public final boolean j() {
        return y(9);
    }

    @Override // defpackage.ysy
    public final boolean k() {
        NetworkInfo a = this.a.a();
        if (a == null) {
            return false;
        }
        int type = a.getType();
        if (type == 0) {
            return B(a.getSubtype());
        }
        if (type != 1) {
            if (type != 6 && type != 9) {
                return false;
            }
        } else if (x(a)) {
            return B(t());
        }
        return true;
    }

    @Override // defpackage.ysy
    public final boolean l() {
        return this.c.b.d();
    }

    @Override // defpackage.ysy
    public final boolean m() {
        return y(0);
    }

    @Override // defpackage.ysy
    public final boolean n() {
        return this.a.b() != null;
    }

    @Override // defpackage.ysy
    public final boolean o() {
        NetworkInfo a = this.a.a();
        return a != null && a.isConnectedOrConnecting();
    }

    @Override // defpackage.ysy
    public final boolean p() {
        NetworkInfo a = this.a.a();
        return a != null && a.isConnected();
    }

    @Override // defpackage.ysy
    public final boolean q() {
        return this.a.h();
    }

    @Override // defpackage.ysy
    public final boolean r() {
        return y(1);
    }

    @Override // defpackage.ysy
    public final String[] s() {
        WifiInfo c;
        String[] strArr = {"", "", ""};
        NetworkInfo a = this.a.a();
        if (a != null && a.isConnected()) {
            strArr[0] = a.getTypeName();
            strArr[1] = a.getSubtypeName();
            if (a.getType() == 1 && (c = this.a.c()) != null) {
                strArr[2] = c.getSSID();
            }
        }
        return strArr;
    }

    private final int u(int i) {
        if (i == 20) {
            if (z()) {
                return !this.c.d() ? 9 : 11;
            }
            return 7;
        }
        switch (i) {
            case 1:
            case 2:
                return 4;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
                return 5;
            case 13:
                return this.c.c() ? 12 : 6;
            default:
                return 7;
        }
    }
}

package defpackage;

import android.content.SharedPreferences;
import android.net.wifi.WifiInfo;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adtv {
    public static final String a = zga.a("MDX.discoveryUtils");
    public final azrw b;
    public final boolean c;
    public final SharedPreferences d;

    public adtv(azrw azrwVar, boolean z, SharedPreferences sharedPreferences) {
        this.b = azrwVar;
        this.c = z;
        this.d = sharedPreferences;
    }

    public static boolean e(String str) {
        try {
            Inet4Address inet4Address = (Inet4Address) Inet4Address.getByName(str);
            if (inet4Address == null) {
                return false;
            }
            if (inet4Address.isSiteLocalAddress()) {
                return true;
            }
            return inet4Address.isLinkLocalAddress();
        } catch (ClassCastException e) {
            zga.f(a, "Cannot use IPv6 addresses.", e);
            return false;
        } catch (UnknownHostException unused) {
            zga.c(a, str.length() != 0 ? "Failed to validate IPv4 address ".concat(str) : new String("Failed to validate IPv4 address "));
            return false;
        }
    }

    private final ysu h() {
        List d = d();
        for (int i = 0; i < d.size(); i++) {
            if (d.get(i) != null) {
                return (ysu) d.get(i);
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0018, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0005, code lost:
    
        if (r3 != null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r3.hasMoreElements() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        r1 = (java.net.InetAddress) r3.nextElement();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if ((r1 instanceof java.net.Inet4Address) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.net.InetAddress i(defpackage.ysu r3) {
        /*
            java.util.Enumeration r3 = r3.c()
            r0 = 0
            if (r3 == 0) goto L18
        L7:
            boolean r1 = r3.hasMoreElements()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r3.nextElement()
            java.net.InetAddress r1 = (java.net.InetAddress) r1
            boolean r2 = r1 instanceof java.net.Inet4Address
            if (r2 == 0) goto L7
            return r1
        L18:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adtv.i(ysu):java.net.InetAddress");
    }

    public final ysu a() {
        if (this.c) {
            return h();
        }
        ammv e = ((ysy) this.b.get()).e();
        if (!e.h()) {
            return null;
        }
        int ipAddress = ((WifiInfo) e.c()).getIpAddress();
        try {
            InetAddress byAddress = InetAddress.getByAddress(new byte[]{(byte) ipAddress, (byte) (ipAddress >> 8), (byte) (ipAddress >> 16), (byte) (ipAddress >> 24)});
            List d = d();
            for (int i = 0; i < d.size(); i++) {
                ysu ysuVar = (ysu) d.get(i);
                Enumeration c = ysuVar.c();
                while (c.hasMoreElements()) {
                    if (byAddress.equals((InetAddress) c.nextElement())) {
                        return ysuVar;
                    }
                }
            }
        } catch (UnknownHostException unused) {
        }
        return null;
    }

    public final String b() {
        ysy ysyVar = (ysy) this.b.get();
        return ysyVar.r() ? ysyVar.s()[2] : "";
    }

    public final String c() {
        ysu h;
        InetAddress i;
        if (!this.c || (h = h()) == null || (i = i(h)) == null) {
            ammv e = ((ysy) this.b.get()).e();
            if (!e.h()) {
                return null;
            }
            int ipAddress = ((WifiInfo) e.c()).getIpAddress();
            try {
                return InetAddress.getByAddress(new byte[]{(byte) ipAddress, (byte) (ipAddress >> 8), (byte) (ipAddress >> 16), (byte) (ipAddress >> 24)}).getHostAddress();
            } catch (UnknownHostException e2) {
                throw new AssertionError(e2);
            }
        }
        return i.getHostAddress();
    }

    public final List d() {
        List<ysu> h = ((ysy) this.b.get()).h();
        if (h.isEmpty()) {
            return h;
        }
        ArrayList arrayList = new ArrayList();
        for (ysu ysuVar : h) {
            try {
                if (!ysuVar.a.isLoopback() && !ysuVar.a.isPointToPoint() && ysuVar.c().hasMoreElements() && i(ysuVar) != null) {
                    arrayList.add(ysuVar);
                }
            } catch (SocketException e) {
                zga.f(a, String.format(Locale.US, "Could not read interface type for %s", ysuVar.a()), e);
            }
        }
        return arrayList;
    }

    public final boolean f() {
        return ((ysy) this.b.get()).p();
    }

    public final boolean g(int i) {
        if (this.c) {
            return true;
        }
        ysy ysyVar = (ysy) this.b.get();
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1 || i2 == 2) {
            return (ysyVar.r() || ysyVar.j()) && ysyVar.p();
        }
        if (i2 == 3) {
            return ysyVar.p();
        }
        String cT = amkq.cT(i);
        StringBuilder sb = new StringBuilder(cT.length() + 21);
        sb.append("illegal sessionType: ");
        sb.append(cT);
        amkq.O(false, sb.toString());
        return false;
    }
}

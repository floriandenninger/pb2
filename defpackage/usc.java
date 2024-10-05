package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class usc {
    private static shf w = new zhr(1);
    final long a;
    long b;
    long c;
    int d;
    int e;
    final String f;
    String i;
    int j;
    String k;
    bacc l;
    int m;
    babo n;
    babt o;
    babg p;
    int q;
    int r;
    int s;
    int t;
    private int x;
    babu u = babu.REQUEST_STATUS_UNSPECIFIED;
    int v = -1;
    final String g = ammx.b(null);
    final boolean h = false;

    private usc(String str, String str2, boolean z, long j) {
        this.f = ammx.b(str2);
        this.a = j;
    }

    static usc c(String str, long j) {
        return new usc(null, str, false, j);
    }

    public static usc d(uns unsVar, String str, long j) {
        return c(str, j);
    }

    public int a() {
        return this.m;
    }

    public int b() {
        return this.x;
    }

    public usc e(int i, int i2) {
        this.c = w.d() - this.a;
        this.d = i;
        this.e = i2;
        return this;
    }

    public usc f(String str) {
        if (!ammx.e(str)) {
            this.k = str;
        }
        return this;
    }

    public usc g(int i) {
        if (i >= 0) {
            this.j = i;
        }
        return this;
    }

    public usc h(babg babgVar) {
        this.p = babgVar;
        return this;
    }

    public usc i(String str) {
        this.i = str;
        return this;
    }

    public usc j(int i) {
        this.r = i;
        return this;
    }

    public usc k(int i) {
        this.q = i;
        return this;
    }

    public usc l(babu babuVar) {
        this.u = babuVar;
        return this;
    }

    public usc m(int i) {
        this.x = i;
        return this;
    }

    public usc n(uns unsVar, long j) {
        this.c = j;
        return this;
    }

    public usc o(uns unsVar, long j) {
        this.b = j;
        return this;
    }

    public void p(Context context) {
        NetworkInfo activeNetworkInfo;
        this.l = uou.s(context);
        int i = -1;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                i = activeNetworkInfo.getType();
            }
        } catch (SecurityException e) {
            ((amxh) ((amxh) ((amxh) urz.a.g()).h(e)).i("com/google/android/libraries/performance/primes/metrics/network/NetworkCapture", "getNetworkType", '$', "NetworkCapture.java")).q("Failed to get network type, Please add: android.permission.ACCESS_NETWORK_STATE to AndroidManifest.xml");
        }
        babo b = babo.b(i);
        if (b == null) {
            b = babo.NONE;
        }
        this.n = b;
    }

    public boolean q() {
        return this.b > 0 || this.c > 0 || this.d > 0 || this.e > 0 || this.s > 0 || this.u == babu.FAILED || this.u == babu.CANCELED || this.v > 0;
    }
}

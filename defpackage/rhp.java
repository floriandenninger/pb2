package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import java.net.URL;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rhp implements Runnable {
    final /* synthetic */ rid a;
    private final /* synthetic */ int b;

    public rhp(rid ridVar, int i) {
        this.b = i;
        this.a = ridVar;
    }

    public /* synthetic */ rhp(rid ridVar, int i, byte[] bArr) {
        this.b = i;
        this.a = ridVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Pair pair;
        NetworkInfo activeNetworkInfo;
        if (this.b == 0) {
            rgf rgfVar = this.a.f;
            rgfVar.a.q();
            if (rgfVar.c()) {
                if (rgfVar.d()) {
                    rgfVar.a.g().t.b(null);
                    Bundle bundle = new Bundle();
                    bundle.putString("source", "(not set)");
                    bundle.putString("medium", "(not set)");
                    bundle.putString("_cis", "intent");
                    bundle.putLong("_cc", 1L);
                    rgfVar.a.k().v("auto", "_cmpx", bundle);
                } else {
                    String a = rgfVar.a.g().t.a();
                    if (TextUtils.isEmpty(a)) {
                        rgfVar.a.aF().d.a("Cache still valid but referrer not found");
                    } else {
                        long a2 = ((rgfVar.a.g().u.a() / 3600000) - 1) * 3600000;
                        Uri parse = Uri.parse(a);
                        Bundle bundle2 = new Bundle();
                        Pair pair2 = new Pair(parse.getPath(), bundle2);
                        for (String str : parse.getQueryParameterNames()) {
                            bundle2.putString(str, parse.getQueryParameter(str));
                        }
                        ((Bundle) pair2.second).putLong("_cc", a2);
                        rgfVar.a.k().v(pair2.first == null ? "app" : (String) pair2.first, "_cmp", (Bundle) pair2.second);
                    }
                    rgfVar.a.g().t.b(null);
                }
                rgfVar.a.g().u.b(0L);
                return;
            }
            return;
        }
        rid ridVar = this.a;
        ridVar.n();
        if (ridVar.M().q.b()) {
            ridVar.aF().j.a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long a3 = ridVar.M().r.a();
        ridVar.M().r.b(1 + a3);
        ridVar.J();
        if (a3 >= 5) {
            ridVar.aF().f.a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            ridVar.M().q.a(true);
            return;
        }
        rgt rgtVar = ridVar.w;
        rgtVar.q();
        rgt.z(rgtVar.l());
        String p = rgtVar.d().p();
        rgc g = rgtVar.g();
        g.n();
        g.Q();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str2 = g.g;
        if (str2 == null || elapsedRealtime >= g.i) {
            g.i = elapsedRealtime + g.J().g(p);
            try {
                pvg a4 = pvh.a(g.I());
                g.g = "";
                String str3 = a4.a;
                if (str3 != null) {
                    g.g = str3;
                }
                g.h = a4.b;
            } catch (Exception e) {
                g.aF().j.b("Unable to get advertising id", e);
                g.g = "";
            }
            pair = new Pair(g.g, Boolean.valueOf(g.h));
        } else {
            pair = new Pair(str2, Boolean.valueOf(g.h));
        }
        if (!rgtVar.f.m() || ((Boolean) pair.second).booleanValue() || TextUtils.isEmpty((CharSequence) pair.first)) {
            rgtVar.aF().j.a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        rih l = rgtVar.l();
        l.j();
        ConnectivityManager connectivityManager = (ConnectivityManager) l.I().getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
            if (activeNetworkInfo != null || !activeNetworkInfo.isConnected()) {
                rgtVar.aF().f.a("Network is not available for Deferred Deep Link request. Skipping");
            }
            rkm p2 = rgtVar.p();
            rgtVar.d().s();
            URL aA = p2.aA(p, (String) pair.first, rgtVar.g().r.a() - 1);
            if (aA != null) {
                rih l2 = rgtVar.l();
                rhl rhlVar = new rhl(rgtVar, null);
                l2.n();
                l2.j();
                l2.aG().e(new rig(l2, p, aA, rhlVar, null));
                return;
            }
            return;
        }
        activeNetworkInfo = null;
        if (activeNetworkInfo != null) {
        }
        rgtVar.aF().f.a("Network is not available for Deferred Deep Link request. Skipping");
    }
}

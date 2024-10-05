package defpackage;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rgd implements Runnable {
    final /* synthetic */ ServiceConnection a;
    final /* synthetic */ rge b;
    final /* synthetic */ ptt c;

    public rgd(rge rgeVar, ptt pttVar, ServiceConnection serviceConnection) {
        this.b = rgeVar;
        this.c = pttVar;
        this.a = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rge rgeVar = this.b;
        rgf rgfVar = rgeVar.b;
        String str = rgeVar.a;
        ptt pttVar = this.c;
        ServiceConnection serviceConnection = this.a;
        rgfVar.a.q();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        Bundle bundle2 = null;
        try {
            Parcel pn = pttVar.pn();
            ecr.g(pn, bundle);
            Parcel po = pttVar.po(1, pn);
            Bundle bundle3 = (Bundle) ecr.a(po, Bundle.CREATOR);
            po.recycle();
            if (bundle3 == null) {
                rgfVar.a.aF().c.a("Install Referrer Service returned a null response");
            } else {
                bundle2 = bundle3;
            }
        } catch (Exception e) {
            rgfVar.a.aF().c.b("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        rgfVar.a.q();
        rgt.A();
        if (bundle2 != null) {
            long j = bundle2.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j == 0) {
                rgfVar.a.aF().f.a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle2.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    rgfVar.a.aF().c.a("No referrer defined in Install Referrer response");
                } else {
                    rgfVar.a.aF().k.b("InstallReferrer API result", string);
                    Bundle t = rgfVar.a.p().t(Uri.parse(string.length() != 0 ? "?".concat(string) : new String("?")));
                    if (t == null) {
                        rgfVar.a.aF().c.a("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = t.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = bundle2.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j2 == 0) {
                                rgfVar.a.aF().c.a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                t.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == rgfVar.a.g().e.a()) {
                            rgfVar.a.aF().k.a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (rgfVar.a.v()) {
                            rgfVar.a.g().e.b(j);
                            rgfVar.a.aF().k.b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            t.putString("_cis", "referrer API v2");
                            rgfVar.a.k().X("_cmp", t, str);
                        }
                    }
                }
            }
        }
        qtj.a().b(rgfVar.a.a, serviceConnection);
    }
}

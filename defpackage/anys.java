package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anys {
    public final antc a;
    private final anyw b;
    private final qms c;
    private final anwy d;
    private final anwy e;
    private final anxe f;

    public anys(antc antcVar, anyw anywVar, qms qmsVar, anwy anwyVar, anwy anwyVar2, anxe anxeVar) {
        this.a = antcVar;
        this.b = anywVar;
        this.c = qmsVar;
        this.d = anwyVar;
        this.e = anwyVar2;
        this.f = anxeVar;
    }

    public static final rpt b(rpt rptVar) {
        return rptVar.b(qmq.l, new qxc(7));
    }

    private final String c() {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(this.a.g().getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    public final rpt a(String str, String str2, Bundle bundle) {
        int a;
        try {
            bundle.putString("scope", str2);
            bundle.putString("sender", str);
            bundle.putString("subtype", str);
            bundle.putString("gmp_app_id", this.a.e().b);
            bundle.putString("gmsv", Integer.toString(this.b.a()));
            bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
            bundle.putString("app_ver", this.b.c());
            bundle.putString("app_ver_name", this.b.d());
            bundle.putString("firebase-app-name-hash", c());
            try {
                String str3 = ((anxj) rqr.d(this.f.l())).a;
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString("Goog-Firebase-Installations-Auth", str3);
                } else {
                    Log.w("FirebaseMessaging", "FIS auth token is empty");
                }
            } catch (InterruptedException | ExecutionException e) {
                Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            }
            bundle.putString("appid", (String) rqr.d(this.f.a()));
            bundle.putString("cliv", "fcm-20.1.7_1p");
            anwg anwgVar = (anwg) this.e.a();
            aoag aoagVar = (aoag) this.d.a();
            if (anwgVar != null && aoagVar != null && (a = anwgVar.a("fire-iid")) != 1) {
                bundle.putString("Firebase-Client-Log-Type", Integer.toString(aocz.ac(a)));
                bundle.putString("Firebase-Client", aoagVar.a());
            }
            return this.c.b(bundle);
        } catch (InterruptedException | ExecutionException e2) {
            return rqr.b(e2);
        }
    }
}

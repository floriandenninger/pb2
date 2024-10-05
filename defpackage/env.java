package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.SparseBooleanArray;
import com.google.android.apps.youtube.app.application.upgrade.NewVersionAvailableActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class env {
    private final Context a;
    private final zic b;
    private final faa c;
    private final aadw d;

    public env(Context context, zic zicVar, faa faaVar, aadw aadwVar) {
        this.a = context;
        this.b = zicVar;
        this.c = faaVar;
        this.d = aadwVar;
    }

    public static boolean a(Intent intent) {
        return intent.getBooleanExtra("show_force_upgrade", false);
    }

    public final Intent b(Intent intent) {
        zic zicVar = this.b;
        aadw aadwVar = this.d;
        aseb asebVar = aaec.a;
        atej atejVar = aadwVar.b().k;
        if (atejVar == null) {
            atejVar = atej.a;
        }
        avso avsoVar = atejVar.e;
        if (avsoVar == null) {
            avsoVar = avso.a;
        }
        if (zicVar.compareTo(new zic((avsoVar.b & 16) != 0 ? avsoVar.c : null)) >= 0) {
            int a = zgx.a(this.a);
            int a2 = this.c.a.a("min_app_version", 0);
            String b = this.c.a.b("denylisted_app_versions", "");
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            for (String str : b.split(",")) {
                try {
                    sparseBooleanArray.put(Integer.parseInt(str), true);
                } catch (NumberFormatException unused) {
                }
            }
            if (a >= a2 && !sparseBooleanArray.get(a)) {
                return null;
            }
        }
        Intent intent2 = new Intent(this.a, (Class<?>) NewVersionAvailableActivity.class);
        intent2.setFlags(268435456);
        intent2.putExtra("show_force_upgrade", true);
        if (intent != null) {
            intent2.putExtra("forward_intent", intent);
        }
        return intent2;
    }
}

package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qhc {
    public static final qkw a = new qkw("ApplicationAnalytics");
    public final qgz b;
    public final qhe c;
    public final SharedPreferences d;
    public qhd e;
    private final Handler g = new amcc(Looper.getMainLooper(), (byte[]) null);
    private final Runnable f = new Runnable() { // from class: qha
        @Override // java.lang.Runnable
        public final void run() {
            qhc qhcVar = qhc.this;
            qhd qhdVar = qhcVar.e;
            if (qhdVar != null) {
                qhcVar.b.a(qhcVar.c.b(qhdVar), 223);
            }
            qhcVar.g();
        }
    };

    public qhc(SharedPreferences sharedPreferences, qgz qgzVar, Bundle bundle, String str) {
        this.d = sharedPreferences;
        this.b = qgzVar;
        this.c = new qhe(bundle, str);
    }

    public static String a() {
        qft a2 = qft.a();
        qip.an(a2);
        return a2.c().a;
    }

    private final void i(CastDevice castDevice) {
        qhd qhdVar = this.e;
        if (qhdVar == null) {
            return;
        }
        qhdVar.c = castDevice.k;
        qhdVar.g = castDevice.h;
        qhdVar.h = castDevice.e;
    }

    private final boolean j() {
        String a2;
        String str;
        if (this.e == null || (a2 = a()) == null || (str = this.e.b) == null || !TextUtils.equals(str, a2)) {
            return false;
        }
        qip.an(this.e);
        return true;
    }

    public final void b() {
        this.g.removeCallbacks(this.f);
    }

    public final void c(qfy qfyVar) {
        if (j()) {
            CastDevice b = qfyVar != null ? qfyVar.b() : null;
            if (b != null && !TextUtils.equals(this.e.c, b.k)) {
                i(b);
            }
            qip.an(this.e);
            return;
        }
        a.d("The analyticsSession should not be null for logging. Create a dummy one.", new Object[0]);
        d(qfyVar);
    }

    public final void d(qfy qfyVar) {
        qhd a2 = qhd.a();
        this.e = a2;
        a2.b = a();
        CastDevice b = qfyVar == null ? null : qfyVar.b();
        if (b != null) {
            i(b);
        }
        qip.an(this.e);
        qhd qhdVar = this.e;
        int i = 0;
        if (qfyVar != null) {
            qip.as("Must be called from the main thread.");
            qgl qglVar = qfyVar.g;
            if (qglVar != null) {
                try {
                    if (qglVar.a() >= 211100000) {
                        i = qfyVar.g.f();
                    }
                } catch (RemoteException unused) {
                }
            }
        }
        qhdVar.i = i;
        qip.an(this.e);
    }

    public final void e(qfy qfyVar, int i) {
        c(qfyVar);
        this.b.a(this.c.c(this.e, i), 228);
        b();
        this.e = null;
    }

    public final void f() {
        qhd qhdVar = this.e;
        SharedPreferences sharedPreferences = this.d;
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("application_id", qhdVar.b);
        edit.putString("receiver_metrics_id", qhdVar.c);
        edit.putLong("analytics_session_id", qhdVar.d);
        edit.putInt("event_sequence_number", qhdVar.e);
        edit.putString("receiver_session_id", qhdVar.f);
        edit.putInt("device_capabilities", qhdVar.g);
        edit.putString("device_model_name", qhdVar.h);
        edit.putInt("analytics_session_start_type", qhdVar.i);
        edit.apply();
    }

    public final void g() {
        Handler handler = this.g;
        Runnable runnable = this.f;
        qip.an(runnable);
        handler.postDelayed(runnable, 300000L);
    }

    public final boolean h(String str) {
        String str2;
        if (!j()) {
            return false;
        }
        qip.an(this.e);
        return (str == null || (str2 = this.e.f) == null || !TextUtils.equals(str2, str)) ? false : true;
    }
}

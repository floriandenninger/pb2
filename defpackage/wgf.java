package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.android.youtube.R;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wgf implements wgd {
    final aca a;

    public wgf(ce ceVar, Executor executor, wgc wgcVar) {
        this.a = new aca(ceVar, executor, new wge(wgcVar), null);
    }

    @Override // defpackage.wgd
    public final void a(abz abzVar) {
        aca acaVar = this.a;
        dd ddVar = acaVar.a;
        if (ddVar == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        if (ddVar.Y()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
            return;
        }
        dd ddVar2 = acaVar.a;
        abs absVar = (abs) ddVar2.f("androidx.biometric.BiometricFragment");
        if (absVar == null) {
            absVar = new abs();
            dn k = ddVar2.k();
            k.r(absVar, "androidx.biometric.BiometricFragment");
            k.k();
            ddVar2.aa();
        }
        Context a = aca.a(absVar);
        if (a == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client context was null.");
            return;
        }
        absVar.b.b = abzVar;
        int c = abd.c(abzVar, null);
        if (Build.VERSION.SDK_INT >= 23 && Build.VERSION.SDK_INT < 30 && c == 15) {
            absVar.b.c = abm.b();
        } else {
            absVar.b.c = null;
        }
        if (absVar.r()) {
            absVar.b.e = absVar.O(R.string.confirm_device_credential_password);
        } else {
            absVar.b.e = null;
        }
        if (!absVar.r() || abv.a(a).b() == 0) {
            if (absVar.b.j) {
                absVar.a.postDelayed(new abr(absVar, 1), 600L);
                return;
            } else {
                absVar.q();
                return;
            }
        }
        absVar.b.h = true;
        absVar.n();
    }
}

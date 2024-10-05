package defpackage;

import android.hardware.fingerprint.FingerprintManager;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class wga extends FingerprintManager.AuthenticationCallback {
    private final wfx a;

    public wga(wfx wfxVar) {
        this.a = wfxVar;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i, CharSequence charSequence) {
        ((weo) this.a).f();
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        weo weoVar = (weo) this.a;
        if (weoVar.e > 0) {
            whu.G(weoVar.c, weoVar.a.getString(R.string.retry_fingerprint));
            weoVar.e--;
        } else {
            weoVar.f();
        }
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        final weo weoVar = (weo) this.a;
        weoVar.b.setImageResource(R.drawable.quantum_ic_fingerprint_googblue_48);
        weoVar.g();
        weoVar.b.postDelayed(new Runnable() { // from class: wem
            @Override // java.lang.Runnable
            public final void run() {
                weo.this.d.j(1);
            }
        }, 500L);
    }
}

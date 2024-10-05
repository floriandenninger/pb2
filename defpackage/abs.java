package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abs extends ce {
    public final Handler a = new Handler(Looper.getMainLooper());
    public acd b;

    private final void aH() {
        this.b.g = false;
        if (ar()) {
            dd mO = mO();
            acn acnVar = (acn) mO.f("androidx.biometric.FingerprintDialogFragment");
            if (acnVar != null) {
                if (acnVar.ar()) {
                    acnVar.kv();
                    return;
                }
                dn k = mO.k();
                k.m(acnVar);
                k.k();
            }
        }
    }

    @Override // defpackage.ce
    public final void T(int i, int i2, Intent intent) {
        super.T(i, i2, intent);
        if (i == 1) {
            this.b.i = false;
            if (i2 == -1) {
                new abw(null, 1);
                aG();
            } else {
                o(10, O(R.string.generic_error_user_canceled));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i) {
        if (this.b.k) {
            return;
        }
        if (s()) {
            this.b.f = i;
            if (i == 1) {
                aF(abo.c(qR(), 10));
            }
        }
        acf c = this.b.c();
        CancellationSignal cancellationSignal = c.a;
        if (cancellationSignal != null) {
            try {
                ace.b(cancellationSignal);
            } catch (NullPointerException e) {
                Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e);
            }
            c.a = null;
        }
        aio aioVar = c.b;
        if (aioVar != null) {
            try {
                aioVar.a();
            } catch (NullPointerException e2) {
                Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e2);
            }
            c.b = null;
        }
    }

    public final void aF(CharSequence charSequence) {
        acd acdVar = this.b;
        if (acdVar.i) {
            return;
        }
        if (!acdVar.h) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
        } else {
            acdVar.h = false;
            acdVar.h().execute(new abi(this, charSequence));
        }
    }

    public final void aG() {
        acd acdVar = this.b;
        if (acdVar.h) {
            acdVar.h = false;
            acdVar.h().execute(new abk(this, 2));
        } else {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        }
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        this.b.g = false;
        aH();
        if (!this.b.i && ar()) {
            dn k = mO().k();
            k.m(this);
            k.k();
        }
        Context qR = qR();
        if (qR != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT == 29 && str != null) {
                for (String str2 : qR.getResources().getStringArray(R.array.delay_showing_prompt_models)) {
                    if (str.equals(str2)) {
                        acd acdVar = this.b;
                        acdVar.j = true;
                        this.a.postDelayed(new abr(acdVar, 0), 600L);
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.ce
    public final void mD() {
        super.mD();
        if (Build.VERSION.SDK_INT >= 29 || this.b.i) {
            return;
        }
        ci C = C();
        if (C == null || !C.isChangingConfigurations()) {
            a(0);
        }
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        Context a = aca.a(this);
        if (a == null) {
            return;
        }
        this.b = aca.b(a);
        new WeakReference(C());
        acd acdVar = this.b;
        if (acdVar.l == null) {
            acdVar.l = new aow();
        }
        acdVar.l.f(this, new abj(this, 1));
        acd acdVar2 = this.b;
        if (acdVar2.m == null) {
            acdVar2.m = new aow();
        }
        acdVar2.m.f(this, new abj(this, 0));
        acd acdVar3 = this.b;
        if (acdVar3.n == null) {
            acdVar3.n = new aow();
        }
        acdVar3.n.f(this, new abj(this, 2));
        acd acdVar4 = this.b;
        if (acdVar4.o == null) {
            acdVar4.o = new aow();
        }
        acdVar4.o.f(this, new abj(this, 3));
        acd acdVar5 = this.b;
        if (acdVar5.p == null) {
            acdVar5.p = new aow();
        }
        acdVar5.p.f(this, new abj(this, 4));
        acd acdVar6 = this.b;
        if (acdVar6.r == null) {
            acdVar6.r = new aow();
        }
        acdVar6.r.f(this, new abj(this, 5));
    }

    @Override // defpackage.ce
    public final void mS() {
        super.mS();
        if (Build.VERSION.SDK_INT == 29 && abd.d(this.b.a())) {
            acd acdVar = this.b;
            acdVar.k = true;
            this.a.postDelayed(new abr(acdVar, 2, null), 250L);
        }
    }

    public final void n() {
        Context a = aca.a(this);
        if (a == null) {
            Log.e("BiometricFragment", "Failed to check device credential. Client Context not found.");
            return;
        }
        KeyguardManager b = abp.b(a);
        if (b == null) {
            o(12, O(R.string.generic_error_no_keyguard));
            return;
        }
        CharSequence g = this.b.g();
        CharSequence f = this.b.f();
        this.b.q();
        if (f == null) {
            f = null;
        }
        Intent a2 = abm.a(b, g, f);
        if (a2 == null) {
            o(14, O(R.string.generic_error_no_device_credential));
            return;
        }
        this.b.i = true;
        if (s()) {
            aH();
        }
        a2.setFlags(134742016);
        startActivityForResult(a2, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(int i, CharSequence charSequence) {
        aF(charSequence);
        d();
    }

    public final void p(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = O(R.string.default_error_msg);
        }
        this.b.n(2);
        this.b.m(charSequence);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q() {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abs.q():void");
    }

    public final boolean r() {
        return Build.VERSION.SDK_INT <= 28 && abd.d(this.b.a());
    }

    public final boolean s() {
        if (Build.VERSION.SDK_INT < 28) {
            return true;
        }
        Context a = aca.a(this);
        if (a != null && this.b.c != null) {
            String str = Build.MANUFACTURER;
            String str2 = Build.MODEL;
            if (Build.VERSION.SDK_INT == 28) {
                if (str != null) {
                    for (String str3 : a.getResources().getStringArray(R.array.crypto_fingerprint_fallback_vendors)) {
                        if (str.equalsIgnoreCase(str3)) {
                            return true;
                        }
                    }
                }
                if (abn.h(a, str2, R.array.crypto_fingerprint_fallback_prefixes)) {
                    return true;
                }
            }
        }
        return Build.VERSION.SDK_INT == 28 && !abt.c(qR());
    }
}

package defpackage;

import android.hardware.fingerprint.FingerprintManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gf extends FingerprintManager.AuthenticationCallback {
    final /* synthetic */ gg a;

    public gf(gg ggVar) {
        this.a = ggVar;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i, CharSequence charSequence) {
        this.a.a.c.a(i, charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        this.a.a.c.b();
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
        acb acbVar = (acb) this.a.a.c;
        if (acbVar.a.get() != null) {
            acd acdVar = (acd) acbVar.a.get();
            if (acdVar.n == null) {
                acdVar.n = new aow();
            }
            acd.p(acdVar.n, charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x003d  */
    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager.AuthenticationResult r4) {
        /*
            r3 = this;
            gg r0 = r3.a
            android.hardware.fingerprint.FingerprintManager$CryptoObject r4 = r4.getCryptoObject()
            r1 = 0
            if (r4 != 0) goto Lb
        L9:
            r2 = r1
            goto L3a
        Lb:
            javax.crypto.Cipher r2 = r4.getCipher()
            if (r2 == 0) goto L1b
            gh r2 = new gh
            javax.crypto.Cipher r4 = r4.getCipher()
            r2.<init>(r4)
            goto L3a
        L1b:
            java.security.Signature r2 = r4.getSignature()
            if (r2 == 0) goto L2b
            gh r2 = new gh
            java.security.Signature r4 = r4.getSignature()
            r2.<init>(r4)
            goto L3a
        L2b:
            javax.crypto.Mac r2 = r4.getMac()
            if (r2 == 0) goto L9
            gh r2 = new gh
            javax.crypto.Mac r4 = r4.getMac()
            r2.<init>(r4)
        L3a:
            if (r2 != 0) goto L3d
            goto L5a
        L3d:
            javax.crypto.Cipher r4 = r2.b
            if (r4 == 0) goto L47
            abx r1 = new abx
            r1.<init>(r4)
            goto L5a
        L47:
            java.security.Signature r4 = r2.a
            if (r4 == 0) goto L51
            abx r1 = new abx
            r1.<init>(r4)
            goto L5a
        L51:
            javax.crypto.Mac r4 = r2.c
            if (r4 == 0) goto L5a
            abx r1 = new abx
            r1.<init>(r4)
        L5a:
            abw r4 = new abw
            r2 = 2
            r4.<init>(r1, r2)
            abg r0 = r0.a
            abf r0 = r0.c
            r0.c(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gf.onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager$AuthenticationResult):void");
    }
}

package defpackage;

import com.google.android.gms.auth.UserRecoverableAuthException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vlm {
    private final baez a;

    public vlm(baez baezVar, byte[] bArr) {
        this.a = baezVar;
    }

    public static boolean b(Throwable th) {
        return (th instanceof UserRecoverableAuthException) || (th instanceof qdg);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003b, code lost:
    
        if (r0.isConnected() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r0.hasCapability(16) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.vmd a(java.lang.Throwable r6) {
        /*
            r5 = this;
            baez r0 = r5.a
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 1
            r3 = 0
            r4 = 23
            if (r1 < r4) goto L29
            android.net.ConnectivityManager r1 = r0.a
            android.net.Network r1 = r1.getActiveNetwork()
            android.net.ConnectivityManager r0 = r0.a
            android.net.NetworkCapabilities r0 = r0.getNetworkCapabilities(r1)
            if (r0 == 0) goto L3e
            r1 = 12
            boolean r1 = r0.hasCapability(r1)
            if (r1 == 0) goto L3e
            r1 = 16
            boolean r0 = r0.hasCapability(r1)
            if (r0 == 0) goto L3e
            goto L3f
        L29:
            android.net.ConnectivityManager r0 = r0.a
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            if (r0 == 0) goto L3e
            boolean r1 = r0.isAvailable()
            if (r1 == 0) goto L3e
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L3e
            goto L3f
        L3e:
            r2 = 0
        L3f:
            if (r2 != 0) goto L44
            vmd r6 = defpackage.vmd.OFFLINE
            return r6
        L44:
            boolean r6 = b(r6)
            if (r6 == 0) goto L4d
            vmd r6 = defpackage.vmd.RETRYABLE
            return r6
        L4d:
            vmd r6 = defpackage.vmd.NON_RETRYABLE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vlm.a(java.lang.Throwable):vmd");
    }
}

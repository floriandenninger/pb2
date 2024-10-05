package defpackage;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bafr implements bafq {
    private final X509TrustManagerExtensions a;

    public bafr(X509TrustManager x509TrustManager) {
        this.a = new X509TrustManagerExtensions(x509TrustManager);
    }

    @Override // defpackage.bafq
    public final List a(X509Certificate[] x509CertificateArr, String str, String str2) {
        try {
            return this.a.checkServerTrusted(x509CertificateArr, str, str2);
        } catch (RuntimeException e) {
            badx.d("X509Util", "checkServerTrusted() unexpectedly threw: %s", e);
            throw new CertificateException(e);
        }
    }
}

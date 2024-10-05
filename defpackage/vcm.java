package defpackage;

import android.util.Log;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class vcm implements TrustManager, X509TrustManager {
    private static final String a = "vcm";

    private static final void a() {
        Log.e(a, "App is using openSSL stack, but is not using ProviderInstaller. Please Fix.");
        throw new RuntimeException("Unsafe use of platform SSL stack.");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        a();
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        a();
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}

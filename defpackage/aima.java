package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.ProtocolException;
import org.apache.http.protocol.HttpContext;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aima implements HttpRequestInterceptor {
    private final Mac a;

    public aima() {
        SecretKey generateKey = KeyGenerator.getInstance("HmacSHA1").generateKey();
        Mac mac = Mac.getInstance("HmacSHA1");
        this.a = mac;
        mac.init(generateKey);
    }

    public final synchronized String a(Uri uri) {
        String queryParameter = uri.getQueryParameter("sparams");
        if (TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        String encodedPath = uri.getEncodedPath();
        if (!TextUtils.isEmpty(encodedPath)) {
            this.a.update(encodedPath.getBytes());
        }
        this.a.update("sparams".getBytes());
        this.a.update(queryParameter.getBytes());
        for (String str : queryParameter.split(",")) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String queryParameter2 = uri.getQueryParameter(str);
            if (queryParameter2 == null) {
                return null;
            }
            this.a.update(str.getBytes());
            this.a.update(queryParameter2.getBytes());
        }
        return Base64.encodeToString(this.a.doFinal(), 10);
    }

    @Override // org.apache.http.HttpRequestInterceptor
    public final void process(HttpRequest httpRequest, HttpContext httpContext) {
        Uri parse = Uri.parse(httpRequest.getRequestLine().getUri());
        String a = a(parse);
        if (a == null || !a.equals(parse.getQueryParameter("sig"))) {
            ProtocolException protocolException = new ProtocolException("URL not signed correctly");
            zga.d("URL not signed correctly", protocolException);
            throw protocolException;
        }
    }
}

package defpackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ecz implements ecy {
    private String a;
    private String b;

    public ecz() {
    }

    @Override // defpackage.ecy
    public final void a(String str, Map map) {
        HttpURLConnection httpURLConnection;
        String f = esv.f(str, map);
        String property = System.getProperty("http.agent");
        if (!esv.g(this.a) && !esv.g(this.b)) {
            property = String.format("%s %s/%s", property, this.a, this.b);
        }
        String valueOf = String.valueOf(property);
        if (valueOf.length() != 0) {
            "User Agent: ".concat(valueOf);
        }
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(f).openConnection();
            } catch (Throwable th) {
                th = th;
            }
        } catch (MalformedURLException e) {
            e = e;
        } catch (IOException e2) {
            e = e2;
        }
        try {
            httpURLConnection.setRequestProperty("User-Agent", property);
            String valueOf2 = String.valueOf(f);
            if (valueOf2.length() != 0) {
                "to send ".concat(valueOf2);
            }
            httpURLConnection.getResponseCode();
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        } catch (MalformedURLException e3) {
            e = e3;
            String valueOf3 = String.valueOf(f);
            esv.h(valueOf3.length() != 0 ? "wrong url format: ".concat(valueOf3) : new String("wrong url format: "));
            throw new ecx(e.getMessage());
        } catch (IOException e4) {
            e = e4;
            esv.h("IO error");
            throw new ecx(e.getMessage());
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection2 = httpURLConnection;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            throw th;
        }
    }

    public ecz(String str, String str2) {
        this.a = esv.g(str) ? null : str.trim();
        this.b = esv.g(str2) ? null : str2.trim();
    }
}

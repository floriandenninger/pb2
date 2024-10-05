package defpackage;

import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crf implements cqw {
    private final cvo a;
    private final int b;
    private HttpURLConnection c;
    private InputStream d;
    private volatile boolean e;

    public crf(cvo cvoVar, int i) {
        this.a = cvoVar;
        this.b = i;
    }

    private static int f(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException unused) {
            return -1;
        }
    }

    @Override // defpackage.cqw
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.cqw
    public final void b() {
        this.e = true;
    }

    @Override // defpackage.cqw
    public final void c() {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.c = null;
    }

    @Override // defpackage.cqw
    public final void d(cof cofVar, cqv cqvVar) {
        ddi.b();
        try {
            cvo cvoVar = this.a;
            if (cvoVar.b == null) {
                cvoVar.b = new URL(cvoVar.c());
            }
            cqvVar.f(g(cvoVar.b, 0, null, this.a.d()));
        } catch (IOException e) {
            cqvVar.g(e);
        }
    }

    @Override // defpackage.cqw
    public final int e() {
        return 2;
    }

    private final InputStream g(URL url, int i, URL url2, Map map) {
        if (i >= 5) {
            throw new cpy("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new cpy("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setConnectTimeout(this.b);
            httpURLConnection.setReadTimeout(this.b);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.c = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.d = this.c.getInputStream();
                if (this.e) {
                    return null;
                }
                int f = f(this.c);
                int i2 = f / 100;
                if (i2 == 2) {
                    HttpURLConnection httpURLConnection2 = this.c;
                    try {
                        if (!TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.d = httpURLConnection2.getInputStream();
                        } else {
                            this.d = new dde(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        }
                        return this.d;
                    } catch (IOException e) {
                        throw new cpy("Failed to obtain InputStream", f(httpURLConnection2), e);
                    }
                }
                if (i2 != 3) {
                    if (f == -1) {
                        throw new cpy(-1);
                    }
                    try {
                        throw new cpy(this.c.getResponseMessage(), f);
                    } catch (IOException e2) {
                        throw new cpy("Failed to get a response message", f, e2);
                    }
                }
                String headerField = this.c.getHeaderField("Location");
                if (!TextUtils.isEmpty(headerField)) {
                    try {
                        URL url3 = new URL(url, headerField);
                        c();
                        return g(url3, i + 1, url, map);
                    } catch (MalformedURLException e3) {
                        String valueOf = String.valueOf(headerField);
                        throw new cpy(valueOf.length() != 0 ? "Bad redirect url: ".concat(valueOf) : new String("Bad redirect url: "), f, e3);
                    }
                }
                throw new cpy("Received empty or null redirect url", f);
            } catch (IOException e4) {
                throw new cpy("Failed to connect or obtain data", f(this.c), e4);
            }
        } catch (IOException e5) {
            throw new cpy("URL.openConnection threw", 0, e5);
        }
    }
}

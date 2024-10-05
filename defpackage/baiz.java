package defpackage;

import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baiz extends HttpURLConnection {
    public final baje a;
    public UrlRequest b;
    public final bajb c;
    public bajc d;
    public UrlResponseInfo e;
    public IOException f;
    public boolean g;
    private final CronetEngine h;
    private final List i;
    private boolean j;
    private int k;
    private boolean l;
    private int m;
    private boolean n;
    private List o;
    private Map p;

    public baiz(URL url, CronetEngine cronetEngine) {
        super(url);
        this.h = cronetEngine;
        this.a = new baje();
        this.c = new bajb(this);
        this.i = new ArrayList();
    }

    private final int g(String str) {
        for (int i = 0; i < this.i.size(); i++) {
            if (((String) ((Pair) this.i.get(i)).first).equalsIgnoreCase(str)) {
                return i;
            }
        }
        return -1;
    }

    private final long h() {
        long j = this.fixedContentLength;
        try {
            long j2 = getClass().getField("fixedContentLengthLong").getLong(this);
            return j2 != -1 ? j2 : j;
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return j;
        }
    }

    private final List i() {
        List list = this.o;
        if (list != null) {
            return list;
        }
        this.o = new ArrayList();
        for (Map.Entry entry : this.e.getAllHeadersAsList()) {
            if (!((String) entry.getKey()).equalsIgnoreCase("Content-Encoding")) {
                this.o.add(new AbstractMap.SimpleImmutableEntry(entry));
            }
        }
        List unmodifiableList = Collections.unmodifiableList(this.o);
        this.o = unmodifiableList;
        return unmodifiableList;
    }

    private final Map.Entry j(int i) {
        try {
            l();
            List i2 = i();
            if (i >= i2.size()) {
                return null;
            }
            return (Map.Entry) i2.get(i);
        } catch (IOException unused) {
            return null;
        }
    }

    private final Map k() {
        Map map = this.p;
        if (map != null) {
            return map;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry entry : i()) {
            ArrayList arrayList = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add((String) entry.getValue());
            treeMap.put((String) entry.getKey(), Collections.unmodifiableList(arrayList));
        }
        Map unmodifiableMap = Collections.unmodifiableMap(treeMap);
        this.p = unmodifiableMap;
        return unmodifiableMap;
    }

    private final void l() {
        bajc bajcVar = this.d;
        if (bajcVar != null) {
            bajcVar.b();
            if (o()) {
                this.d.close();
            }
        }
        if (!this.n) {
            n();
            this.a.a();
        }
        if (this.n) {
            IOException iOException = this.f;
            if (iOException == null) {
                if (this.e == null) {
                    throw new NullPointerException("Response info is null when there is no exception.");
                }
                return;
            }
            throw iOException;
        }
        throw new IllegalStateException("No response.");
    }

    private final void m(String str, String str2, boolean z) {
        if (this.connected) {
            throw new IllegalStateException("Cannot modify request property after connection is made.");
        }
        int g = g(str);
        if (g >= 0) {
            if (z) {
                this.i.remove(g);
            } else {
                throw new UnsupportedOperationException("Cannot add multiple headers of the same key, " + str + ". crbug.com/432719.");
            }
        }
        this.i.add(Pair.create(str, str2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b7, code lost:
    
        if (r5.j != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d5, code lost:
    
        if (r5.l != false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void n() {
        /*
            r5 = this;
            boolean r0 = r5.connected
            if (r0 == 0) goto L5
            return
        L5:
            org.chromium.net.CronetEngine r0 = r5.h
            java.net.URL r1 = r5.getURL()
            java.lang.String r1 = r1.toString()
            baiy r2 = new baiy
            r2.<init>(r5)
            baje r3 = r5.a
            org.chromium.net.UrlRequest$Builder r0 = r0.newUrlRequestBuilder(r1, r2, r3)
            org.chromium.net.ExperimentalUrlRequest$Builder r0 = (org.chromium.net.ExperimentalUrlRequest.Builder) r0
            boolean r1 = r5.doOutput
            if (r1 == 0) goto L78
            java.lang.String r1 = r5.method
            java.lang.String r2 = "GET"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L2e
            java.lang.String r1 = "POST"
            r5.method = r1
        L2e:
            bajc r1 = r5.d
            java.lang.String r2 = "Content-Length"
            if (r1 == 0) goto L60
            org.chromium.net.UploadDataProvider r1 = r1.a()
            baje r3 = r5.a
            r0.setUploadDataProvider(r1, r3)
            java.lang.String r1 = r5.getRequestProperty(r2)
            if (r1 != 0) goto L5a
            boolean r1 = r5.o()
            if (r1 != 0) goto L5a
            bajc r1 = r5.d
            org.chromium.net.UploadDataProvider r1 = r1.a()
            long r3 = r1.getLength()
            java.lang.String r1 = java.lang.Long.toString(r3)
            r5.addRequestProperty(r2, r1)
        L5a:
            bajc r1 = r5.d
            r1.c()
            goto L6b
        L60:
            java.lang.String r1 = r5.getRequestProperty(r2)
            if (r1 != 0) goto L6b
            java.lang.String r1 = "0"
            r5.addRequestProperty(r2, r1)
        L6b:
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = r5.getRequestProperty(r1)
            if (r2 != 0) goto L78
            java.lang.String r2 = "application/x-www-form-urlencoded"
            r5.addRequestProperty(r1, r2)
        L78:
            java.util.List r1 = r5.i
            java.util.Iterator r1 = r1.iterator()
        L7e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L96
            java.lang.Object r2 = r1.next()
            android.util.Pair r2 = (android.util.Pair) r2
            java.lang.Object r3 = r2.first
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.second
            java.lang.String r2 = (java.lang.String) r2
            r0.addHeader(r3, r2)
            goto L7e
        L96:
            boolean r1 = r5.getUseCaches()
            if (r1 != 0) goto L9f
            r0.disableCache()
        L9f:
            java.lang.String r1 = r5.method
            r0.setHttpMethod(r1)
            boolean r1 = r5.j
            r2 = -1
            r3 = 1
            if (r1 == 0) goto Lab
            goto Lb9
        Lab:
            int r1 = android.net.TrafficStats.getThreadStatsTag()
            if (r1 == r2) goto Lb5
            r5.k = r1
            r5.j = r3
        Lb5:
            boolean r1 = r5.j
            if (r1 == 0) goto Lbe
        Lb9:
            int r1 = r5.k
            r0.setTrafficStatsTag(r1)
        Lbe:
            boolean r1 = r5.l
            if (r1 == 0) goto Lc3
            goto Ld7
        Lc3:
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r1 < r4) goto Ldc
            int r1 = android.net.TrafficStats.getThreadStatsUid()
            if (r1 == r2) goto Ld3
            r5.m = r1
            r5.l = r3
        Ld3:
            boolean r1 = r5.l
            if (r1 == 0) goto Ldc
        Ld7:
            int r1 = r5.m
            r0.setTrafficStatsUid(r1)
        Ldc:
            org.chromium.net.ExperimentalUrlRequest r0 = r0.build()
            r5.b = r0
            r0.start()
            r5.connected = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.baiz.n():void");
    }

    private final boolean o() {
        return this.chunkLength > 0;
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        m(str, str2, false);
    }

    public final void b(int i) {
        if (!this.connected) {
            this.j = true;
            this.k = i;
            return;
        }
        throw new IllegalStateException("Cannot modify traffic stats tag after connection is made.");
    }

    @Override // java.net.URLConnection
    public final void connect() {
        getOutputStream();
        n();
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        if (this.connected) {
            this.b.cancel();
        }
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        try {
            l();
            if (this.e.getHttpStatusCode() >= 400) {
                return this.c;
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        Map.Entry j = j(i);
        if (j == null) {
            return null;
        }
        return (String) j.getValue();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i) {
        Map.Entry j = j(i);
        if (j == null) {
            return null;
        }
        return (String) j.getKey();
    }

    @Override // java.net.URLConnection
    public final Map getHeaderFields() {
        try {
            l();
            return k();
        } catch (IOException unused) {
            return Collections.emptyMap();
        }
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        l();
        if (this.instanceFollowRedirects || !this.g) {
            if (this.e.getHttpStatusCode() >= 400) {
                throw new FileNotFoundException(this.url.toString());
            }
            return this.c;
        }
        throw new IOException("Cannot read response body of a redirect.");
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        if (this.d == null && this.doOutput) {
            if (this.connected) {
                throw new ProtocolException("Cannot write to OutputStream after receiving response.");
            }
            if (o()) {
                this.d = new baiv(this.chunkLength, this.a);
                n();
            } else {
                long h = h();
                if (h != -1) {
                    this.d = new baix(h, this.a);
                    n();
                } else {
                    String requestProperty = getRequestProperty("Content-Length");
                    if (requestProperty == null) {
                        this.d = new bait();
                    } else {
                        this.d = new bait(Long.parseLong(requestProperty));
                    }
                }
            }
        }
        return this.d;
    }

    @Override // java.net.URLConnection
    public final Map getRequestProperties() {
        if (this.connected) {
            throw new IllegalStateException("Cannot access request headers after connection is set.");
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Pair pair : this.i) {
            if (!treeMap.containsKey(pair.first)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add((String) pair.second);
                treeMap.put((String) pair.first, Collections.unmodifiableList(arrayList));
            } else {
                throw new IllegalStateException("Should not have multiple values.");
            }
        }
        return Collections.unmodifiableMap(treeMap);
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        int g = g(str);
        if (g >= 0) {
            return (String) ((Pair) this.i.get(g)).second;
        }
        return null;
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        l();
        return this.e.getHttpStatusCode();
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        l();
        return this.e.getHttpStatusText();
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i) {
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        m(str, str2, true);
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return false;
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        try {
            l();
            Map k = k();
            if (!k.containsKey(str)) {
                return null;
            }
            return (String) ((List) k.get(str)).get(r4.size() - 1);
        } catch (IOException unused) {
            return null;
        }
    }
}

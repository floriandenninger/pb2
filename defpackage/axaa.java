package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axaa implements axam {
    public final HttpURLConnection a;
    public final awzu b;
    public final byte[] c;
    public long d;
    public int e = -1;
    public int f = 0;
    public awxr g;
    private int h;

    public axaa(HttpURLConnection httpURLConnection, String str, awzx awzxVar, awzu awzuVar) {
        this.a = httpURLConnection;
        try {
            httpURLConnection.setRequestMethod(str);
            httpURLConnection.setReadTimeout(300000);
            httpURLConnection.setConnectTimeout(300000);
            httpURLConnection.setDoInput(true);
            this.b = awzuVar;
            if (awzuVar != null) {
                httpURLConnection.setDoOutput(true);
                if (awzuVar.a() >= 0) {
                    long a = awzuVar.a() - awzuVar.e();
                    if (a < 2147483647L) {
                        httpURLConnection.setFixedLengthStreamingMode((int) a);
                    } else {
                        httpURLConnection.setFixedLengthStreamingMode(a);
                    }
                } else {
                    httpURLConnection.setChunkedStreamingMode(0);
                }
            }
            for (String str2 : awzxVar.c()) {
                Iterator it = awzxVar.b(str2).iterator();
                while (it.hasNext()) {
                    httpURLConnection.addRequestProperty(str2, (String) it.next());
                }
            }
            this.h = 1;
            this.c = new byte[65536];
        } catch (ProtocolException e) {
            throw new IllegalArgumentException("Invalid http method.", e);
        }
    }

    @Override // defpackage.axam
    public final anhy a() {
        anhz a = anhz.a(new Callable() { // from class: awzz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                awzy d;
                axaa axaaVar = axaa.this;
                try {
                    synchronized (axaaVar) {
                        awxr awxrVar = axaaVar.g;
                        if (awxrVar != null) {
                            awxrVar.d();
                        }
                    }
                    axaaVar.g();
                    try {
                        OutputStream outputStream = axaaVar.a.getOutputStream();
                        axaaVar.a.connect();
                        if (axaaVar.b != null) {
                            long currentTimeMillis = System.currentTimeMillis();
                            loop0: while (true) {
                                int i = 0;
                                while (axaaVar.h()) {
                                    axaaVar.g();
                                    int i2 = 0;
                                    while (i2 < 65536 && axaaVar.h()) {
                                        try {
                                            int b = axaaVar.b.b(axaaVar.c, i2, 65536 - i2);
                                            axaaVar.d += b;
                                            i2 += b;
                                            try {
                                                outputStream.write(axaaVar.c, i2 - b, b);
                                            } catch (IOException unused) {
                                                d = axaaVar.d();
                                            }
                                        } catch (IOException e) {
                                            throw new axao(axan.REQUEST_BODY_READ_ERROR, e);
                                        }
                                    }
                                    i += i2;
                                    if (i >= axaaVar.e) {
                                        boolean z = true;
                                        if (axaaVar.f > 0) {
                                            long currentTimeMillis2 = System.currentTimeMillis();
                                            if (currentTimeMillis2 - currentTimeMillis >= axaaVar.f) {
                                                currentTimeMillis = currentTimeMillis2;
                                            } else {
                                                z = false;
                                            }
                                        }
                                        if (z) {
                                            synchronized (axaaVar) {
                                                awxr awxrVar2 = axaaVar.g;
                                                if (awxrVar2 != null) {
                                                    awxrVar2.a(axaaVar);
                                                }
                                            }
                                        }
                                    }
                                }
                                break loop0;
                            }
                            d = axaaVar.d();
                        } else {
                            d = axaaVar.d();
                        }
                    } catch (FileNotFoundException e2) {
                        throw new axao(axan.BAD_URL, e2);
                    } catch (IOException e3) {
                        try {
                            d = axaaVar.d();
                        } catch (axao unused2) {
                            throw new axao(axan.CONNECTION_ERROR, e3);
                        }
                    }
                    synchronized (axaaVar) {
                        awxr awxrVar3 = axaaVar.g;
                        if (awxrVar3 != null) {
                            awxrVar3.c(axaaVar);
                        }
                    }
                    return new axap(d);
                } catch (axao e4) {
                    synchronized (axaaVar) {
                        awxr awxrVar4 = axaaVar.g;
                        if (awxrVar4 != null) {
                            awxrVar4.b(axaaVar);
                        }
                        return new axap(e4);
                    }
                }
            }
        });
        anio anioVar = new anio();
        anioVar.d("Scotty-Uploader-HttpUrlConnectionHttpClient-%d");
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(anio.b(anioVar));
        newSingleThreadExecutor.execute(a);
        newSingleThreadExecutor.shutdown();
        return a;
    }

    @Override // defpackage.axam
    public final /* synthetic */ anhy b() {
        return awxr.f();
    }

    @Override // defpackage.axam
    public final awzu c() {
        return this.b;
    }

    public final awzy d() {
        InputStream errorStream;
        awzx awzxVar;
        g();
        try {
            int responseCode = this.a.getResponseCode();
            try {
                errorStream = this.a.getInputStream();
            } catch (IOException unused) {
                errorStream = this.a.getErrorStream();
            }
            Map<String, List<String>> headerFields = this.a.getHeaderFields();
            if (headerFields != null) {
                awzxVar = new awzx();
                for (String str : headerFields.keySet()) {
                    if (str != null) {
                        Iterator<String> it = headerFields.get(str).iterator();
                        while (it.hasNext()) {
                            awzxVar.d(str, it.next());
                        }
                    }
                }
            } else {
                awzxVar = null;
            }
            return new awzy(responseCode, awzxVar, errorStream);
        } catch (IOException e) {
            throw new axao(axan.CONNECTION_ERROR, "Error while reading response code.", e);
        }
    }

    @Override // defpackage.axam
    public final String e() {
        return null;
    }

    @Override // defpackage.axam
    public final void f() {
        synchronized (this) {
            this.h = 3;
            notifyAll();
        }
    }

    public final synchronized void g() {
        int i;
        while (true) {
            i = this.h;
            if (i != 2) {
                break;
            } else {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        if (i == 3) {
            throw new axao(axan.CANCELED, "");
        }
        amkq.v(i == 1);
    }

    public final boolean h() {
        try {
            return this.b.i();
        } catch (IOException e) {
            throw new axao(axan.REQUEST_BODY_READ_ERROR, e);
        }
    }

    @Override // defpackage.axam
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // defpackage.axam
    public final synchronized void j(awxr awxrVar, int i, int i2) {
        this.g = awxrVar;
        if (i > 0) {
            this.e = i;
        }
        this.f = i2;
    }
}

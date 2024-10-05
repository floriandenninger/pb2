package defpackage;

import android.util.Log;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pfu implements pgf {
    private static final Pattern a = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference b = new AtomicReference();
    private final String c;
    private final HashMap d;
    private HttpURLConnection e;
    private InputStream f;
    private boolean g;
    private long h;
    private long i;
    private long j;
    private long k;

    public pfu(String str) {
        opn.m(str);
        this.c = str;
        this.d = new HashMap();
    }

    private final void d() {
        HttpURLConnection httpURLConnection = this.e;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.e = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d1, code lost:
    
        if (r6 != 0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b3  */
    @Override // defpackage.pfq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(defpackage.pfs r18) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pfu.b(pfs):long");
    }

    @Override // defpackage.pfq
    public final void c() {
        try {
            if (this.f != null) {
                HttpURLConnection httpURLConnection = this.e;
                long j = this.i;
                if (j != -1) {
                    j -= this.k;
                }
                if (pgz.a == 19 || pgz.a == 20) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (j == -1) {
                            if (inputStream.read() != -1) {
                            }
                        } else if (j <= 2048) {
                        }
                        String name = inputStream.getClass().getName();
                        if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                            Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                            declaredMethod.setAccessible(true);
                            declaredMethod.invoke(inputStream, new Object[0]);
                        }
                    } catch (IOException | Exception unused) {
                    }
                }
                try {
                    this.f.close();
                } catch (IOException e) {
                    throw new pfy(e, 3);
                }
            }
        } finally {
            this.f = null;
            d();
            if (this.g) {
                this.g = false;
            }
        }
    }

    @Override // defpackage.pfq
    public final int a(byte[] bArr, int i, int i2) {
        try {
            if (this.j != this.h) {
                byte[] bArr2 = (byte[]) b.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.j;
                    long j2 = this.h;
                    if (j != j2) {
                        int read = this.f.read(bArr2, 0, (int) Math.min(j2 - j, bArr2.length));
                        if (Thread.interrupted()) {
                            throw new InterruptedIOException();
                        }
                        if (read == -1) {
                            throw new EOFException();
                        }
                        this.j += read;
                    } else {
                        b.set(bArr2);
                        break;
                    }
                }
            }
            if (i2 == 0) {
                return 0;
            }
            int read2 = this.f.read(bArr, i, i2);
            if (read2 != -1) {
                this.k += read2;
                return read2;
            }
            long j3 = this.i;
            if (j3 != -1 && j3 != this.k) {
                throw new EOFException();
            }
            return -1;
        } catch (IOException e) {
            throw new pfy(e, 2);
        }
    }
}

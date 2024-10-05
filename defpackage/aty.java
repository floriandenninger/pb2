package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aty extends atb implements atr {
    final UrlRequest.Callback b;
    public final boolean c;
    public final boolean d;
    public UrlRequest e;
    public ath f;
    public UrlResponseInfo g;
    public IOException h;
    public boolean i;
    public final eun j;
    private final CronetEngine k;
    private final Executor l;
    private final int m;
    private final int n;
    private final atq o;
    private final ammy p;
    private boolean q;
    private long r;
    private ByteBuffer s;
    private volatile long t;

    static {
        pmo.b("goog.exo.cronet");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public aty(CronetEngine cronetEngine, Executor executor, int i, int i2, boolean z, ammy ammyVar, boolean z2) {
        super(true);
        this.k = cronetEngine;
        pse.c(executor);
        this.l = executor;
        this.m = i;
        this.n = i2;
        this.c = z;
        this.p = ammyVar;
        this.d = z2;
        this.b = new atx(this);
        this.o = new atq();
        this.j = new eun((char[]) null);
    }

    private static int q(UrlRequest urlRequest) {
        eun eunVar = new eun((char[]) null);
        int[] iArr = new int[1];
        urlRequest.getStatus(new atv(iArr, eunVar, null));
        eunVar.a();
        return iArr[0];
    }

    private static String r(Map map, String str) {
        List list = (List) map.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    private final ByteBuffer s() {
        if (this.s == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32768);
            this.s = allocateDirect;
        }
        return this.s;
    }

    private final void t(ByteBuffer byteBuffer, ath athVar) {
        UrlRequest urlRequest = this.e;
        int i = pts.a;
        urlRequest.read(byteBuffer);
        try {
        } catch (InterruptedException unused) {
            if (byteBuffer == this.s) {
                this.s = null;
            }
            Thread.currentThread().interrupt();
            this.h = new InterruptedIOException();
        } catch (SocketTimeoutException e) {
            if (byteBuffer == this.s) {
                this.s = null;
            }
            this.h = new atn(e, athVar, 2002, 2);
        }
        if (this.j.c(this.n)) {
            IOException iOException = this.h;
            if (iOException != null) {
                if (iOException instanceof atn) {
                    throw ((atn) iOException);
                }
                throw atn.rn(iOException, athVar, 2);
            }
            return;
        }
        throw new SocketTimeoutException();
    }

    @Override // defpackage.atb, defpackage.ate
    public final Map a() {
        UrlResponseInfo urlResponseInfo = this.g;
        return urlResponseInfo == null ? Collections.emptyMap() : urlResponseInfo.getAllHeaders();
    }

    @Override // defpackage.atc
    public final int g(byte[] bArr, int i, int i2) {
        pse.g(this.q);
        if (i2 == 0) {
            return 0;
        }
        if (this.r == 0) {
            return -1;
        }
        ByteBuffer s = s();
        if (!s.hasRemaining()) {
            this.j.f();
            ath athVar = this.f;
            int i3 = pts.a;
            t(s, athVar);
            if (this.i) {
                this.r = 0L;
                return -1;
            }
            pse.g(s.hasRemaining());
        }
        long[] jArr = new long[3];
        long j = this.r;
        if (j == -1) {
            j = Long.MAX_VALUE;
        }
        jArr[0] = j;
        jArr[1] = s.remaining();
        jArr[2] = i2;
        amkq.E(true);
        long j2 = jArr[0];
        for (int i4 = 1; i4 < 3; i4++) {
            long j3 = jArr[i4];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        int i5 = (int) j2;
        s.get(bArr, i, i5);
        long j4 = this.r;
        if (j4 != -1) {
            this.r = j4 - i5;
        }
        c(i5);
        return i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00aa, code lost:
    
        if (r14 != 0) goto L38;
     */
    @Override // defpackage.ate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long h(defpackage.ath r17) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aty.h(ath):long");
    }

    @Override // defpackage.ate
    public final Uri i() {
        UrlResponseInfo urlResponseInfo = this.g;
        if (urlResponseInfo == null) {
            return null;
        }
        return Uri.parse(urlResponseInfo.getUrl());
    }

    @Override // defpackage.ate
    public final synchronized void j() {
        UrlRequest urlRequest = this.e;
        if (urlRequest != null) {
            urlRequest.cancel();
            this.e = null;
        }
        ByteBuffer byteBuffer = this.s;
        if (byteBuffer != null) {
        }
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = false;
        if (this.q) {
            this.q = false;
            d();
        }
    }

    @Override // defpackage.atr
    public final int k() {
        UrlResponseInfo urlResponseInfo = this.g;
        if (urlResponseInfo == null || urlResponseInfo.getHttpStatusCode() <= 0) {
            return -1;
        }
        return this.g.getHttpStatusCode();
    }

    @Override // defpackage.atr
    public final void l() {
        this.o.b();
    }

    @Override // defpackage.atr
    public final void m(String str, String str2) {
        this.o.c(str, str2);
    }

    public final int n(ByteBuffer byteBuffer) {
        pse.g(this.q);
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Passed buffer is not a direct ByteBuffer");
        }
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        if (this.r == 0) {
            return -1;
        }
        int remaining = byteBuffer.remaining();
        ByteBuffer byteBuffer2 = this.s;
        if (byteBuffer2 != null) {
            int min = Math.min(byteBuffer2.remaining(), byteBuffer.remaining());
            int limit = byteBuffer2.limit();
            byteBuffer.put(byteBuffer2);
            if (min != 0) {
                long j = this.r;
                if (j != -1) {
                    this.r = j - min;
                }
                c(min);
                return min;
            }
        }
        this.j.f();
        ath athVar = this.f;
        int i = pts.a;
        t(byteBuffer, athVar);
        if (this.i) {
            this.r = 0L;
            return -1;
        }
        pse.g(remaining > byteBuffer.remaining());
        int remaining2 = remaining - byteBuffer.remaining();
        long j2 = this.r;
        if (j2 != -1) {
            this.r = j2 - remaining2;
        }
        c(remaining2);
        return remaining2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public UrlRequest.Builder o(ath athVar) {
        UrlRequest.Builder allowDirectExecutor = this.k.newUrlRequestBuilder(athVar.a.toString(), this.b, this.l).setPriority(3).allowDirectExecutor();
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.o.a());
        hashMap.putAll(athVar.e);
        for (Map.Entry entry : hashMap.entrySet()) {
            allowDirectExecutor.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        if (athVar.d == null || hashMap.containsKey("Content-Type")) {
            String c = ats.c(athVar.g, athVar.h);
            if (c != null) {
                allowDirectExecutor.addHeader("Range", c);
            }
            allowDirectExecutor.setHttpMethod(athVar.e());
            byte[] bArr = athVar.d;
            if (bArr != null) {
                allowDirectExecutor.setUploadDataProvider(new atu(bArr), this.l);
            }
            return allowDirectExecutor;
        }
        throw new atw(athVar, (char[]) null);
    }

    public final void p() {
        this.t = SystemClock.elapsedRealtime() + this.m;
    }
}

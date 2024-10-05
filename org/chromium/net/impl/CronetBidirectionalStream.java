package org.chromium.net.impl;

import J.N;
import defpackage.ayeq;
import defpackage.badx;
import defpackage.baft;
import defpackage.bafu;
import defpackage.bafv;
import defpackage.bafw;
import defpackage.bafx;
import defpackage.bafy;
import defpackage.bafz;
import defpackage.bagf;
import defpackage.bagh;
import defpackage.baie;
import defpackage.baif;
import defpackage.baii;
import defpackage.baij;
import defpackage.bail;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.RequestFinishedInfo;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class CronetBidirectionalStream extends ExperimentalBidirectionalStream {
    public final bail a;
    public final String b;
    public boolean d;
    public baij g;
    private final CronetUrlRequestContext h;
    private final Executor i;
    private final String j;
    private final int k;
    private final String[] l;
    private final boolean m;
    private final Collection n;
    private final boolean o;
    private final int p;
    private final boolean q;
    private final int r;
    private CronetException s;
    private LinkedList t;
    private LinkedList u;
    private boolean v;
    private RequestFinishedInfo.Metrics w;
    private long x;
    private bafz y;
    public final Object c = new Object();
    public int e = 0;
    public int f = 0;

    public CronetBidirectionalStream(CronetUrlRequestContext cronetUrlRequestContext, String str, int i, BidirectionalStream.Callback callback, Executor executor, String str2, List list, boolean z, Collection collection, boolean z2, int i2, boolean z3, int i3) {
        int i4 = 0;
        this.h = cronetUrlRequestContext;
        this.j = str;
        int i5 = 4;
        if (i == 0) {
            i5 = 1;
        } else if (i == 1) {
            i5 = 2;
        } else if (i == 2) {
            i5 = 3;
        } else if (i != 3) {
            if (i != 4) {
                throw new IllegalArgumentException("Invalid stream priority.");
            }
            i5 = 5;
        }
        this.k = i5;
        this.a = new bail(callback);
        this.i = executor;
        this.b = str2;
        int size = list.size();
        String[] strArr = new String[size + size];
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int i6 = i4 + 1;
            strArr[i4] = (String) entry.getKey();
            i4 = i6 + 1;
            strArr[i6] = (String) entry.getValue();
        }
        this.l = strArr;
        this.m = z;
        this.t = new LinkedList();
        this.u = new LinkedList();
        this.n = collection;
        this.o = z2;
        this.p = i2;
        this.q = z3;
        this.r = i3;
    }

    public static boolean d(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    private static ArrayList f(String[] strArr) {
        ArrayList arrayList = new ArrayList(strArr.length >> 1);
        for (int i = 0; i < strArr.length; i += 2) {
            arrayList.add(new AbstractMap.SimpleImmutableEntry(strArr[i], strArr[i + 1]));
        }
        return arrayList;
    }

    private final void g(boolean z) {
        badx.e(CronetUrlRequestContext.b, "destroyNativeStreamLocked " + toString(), new Object[0]);
        long j = this.x;
        if (j == 0) {
            return;
        }
        N.MS2l1kNx(j, this, z);
        this.h.d();
        this.x = 0L;
    }

    private final void h(CronetException cronetException) {
        i(new bafy(this, cronetException));
    }

    private final void i(Runnable runnable) {
        try {
            this.i.execute(runnable);
        } catch (RejectedExecutionException e) {
            badx.d(CronetUrlRequestContext.b, "Exception posting task to executor", e);
            synchronized (this.c) {
                this.f = 6;
                this.e = 6;
                g(false);
            }
        }
    }

    private final void j() {
        int size = this.u.size();
        ByteBuffer[] byteBufferArr = new ByteBuffer[size];
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        for (int i = 0; i < size; i++) {
            ByteBuffer byteBuffer = (ByteBuffer) this.u.poll();
            byteBufferArr[i] = byteBuffer;
            iArr[i] = byteBuffer.position();
            iArr2[i] = byteBuffer.limit();
        }
        this.f = 9;
        this.d = true;
        if (N.MwJCBTMQ(this.x, this, byteBufferArr, iArr, iArr2, this.v && this.t.isEmpty())) {
            return;
        }
        this.f = 8;
        throw new IllegalArgumentException("Unable to call native writev.");
    }

    private void onCanceled() {
        i(new bafx(this, 0));
    }

    private void onError(int i, int i2, int i3, String str, long j) {
        baij baijVar = this.g;
        if (baijVar != null) {
            baijVar.a(j);
        }
        if (i == 10 || i == 3) {
            h(new baie("Exception in BidirectionalStream: " + str, i, i2, i3));
            return;
        }
        h(new baft("Exception in BidirectionalStream: " + str, i, i2));
    }

    private void onMetricsCollected(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15) {
        synchronized (this.c) {
            if (this.w == null) {
                this.w = new bagh(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, z, j14, j15);
                int i = this.e;
                this.h.f(new baif(this.j, this.n, this.w, i == 7 ? 0 : i == 5 ? 2 : 1, this.g, this.s));
            } else {
                throw new IllegalStateException("Metrics collection should only happen once.");
            }
        }
    }

    private void onReadCompleted(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        int i4;
        this.g.a(j);
        if (byteBuffer.position() != i2 || byteBuffer.limit() != i3) {
            h(new bagf("ByteBuffer modified externally during read", null));
            return;
        }
        if (i < 0 || (i4 = i2 + i) > i3) {
            h(new bagf("Invalid number of bytes read", null));
            return;
        }
        byteBuffer.position(i4);
        bafz bafzVar = this.y;
        bafzVar.a = byteBuffer;
        bafzVar.b = i == 0;
        i(bafzVar);
    }

    private void onResponseHeadersReceived(int i, String str, String[] strArr, long j) {
        try {
            this.g = new baij(Arrays.asList(this.j), i, "", f(strArr), false, str, null, j);
            i(new bafx(this, 1));
        } catch (Exception unused) {
            h(new bagf("Cannot prepare ResponseInfo", null));
        }
    }

    private void onResponseTrailersReceived(String[] strArr) {
        i(new bafw(this, new baii(f(strArr))));
    }

    private void onStreamReady(boolean z) {
        i(new bafv(this, z));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004e, code lost:
    
        h(new defpackage.bagf("ByteBuffer modified externally during write", null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0059, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void onWritevCompleted(java.nio.ByteBuffer[] r7, int[] r8, int[] r9, boolean r10) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.c
            monitor-enter(r0)
            boolean r1 = r6.e()     // Catch: java.lang.Throwable -> L5a
            if (r1 == 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5a
            return
        Lb:
            r1 = 8
            r6.f = r1     // Catch: java.lang.Throwable -> L5a
            java.util.LinkedList r1 = r6.u     // Catch: java.lang.Throwable -> L5a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L5a
            if (r1 != 0) goto L1a
            r6.j()     // Catch: java.lang.Throwable -> L5a
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5a
            r0 = 0
            r1 = 0
        L1d:
            int r2 = r7.length
            if (r1 >= r2) goto L59
            r3 = r7[r1]
            int r4 = r3.position()
            r5 = r8[r1]
            if (r4 != r5) goto L4e
            int r4 = r3.limit()
            r5 = r9[r1]
            if (r4 == r5) goto L33
            goto L4e
        L33:
            int r4 = r3.limit()
            r3.position(r4)
            baga r4 = new baga
            if (r10 == 0) goto L44
            int r2 = r2 + (-1)
            if (r1 != r2) goto L44
            r2 = 1
            goto L45
        L44:
            r2 = 0
        L45:
            r4.<init>(r6, r3, r2)
            r6.i(r4)
            int r1 = r1 + 1
            goto L1d
        L4e:
            bagf r7 = new bagf
            java.lang.String r8 = "ByteBuffer modified externally during write"
            r9 = 0
            r7.<init>(r8, r9)
            r6.h(r7)
        L59:
            return
        L5a:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5a
            goto L5e
        L5d:
            throw r7
        L5e:
            goto L5d
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetBidirectionalStream.onWritevCompleted(java.nio.ByteBuffer[], int[], int[], boolean):void");
    }

    public final void a(CronetException cronetException) {
        this.s = cronetException;
        synchronized (this.c) {
            if (e()) {
                return;
            }
            this.f = 6;
            this.e = 6;
            g(false);
            try {
                this.a.onFailed(this, this.g, cronetException);
            } catch (Exception e) {
                badx.d(CronetUrlRequestContext.b, "Exception notifying of failed request", e);
            }
        }
    }

    public final void b() {
        synchronized (this.c) {
            if (e()) {
                return;
            }
            if (this.f == 10 && this.e == 4) {
                this.f = 7;
                this.e = 7;
                g(false);
                try {
                    this.a.onSucceeded(this, this.g);
                } catch (Exception e) {
                    badx.d(CronetUrlRequestContext.b, "Exception in onSucceeded method", e);
                }
            }
        }
    }

    public final void c(Exception exc) {
        bafu bafuVar = new bafu("CalledByNative method has thrown an exception", exc);
        badx.d(CronetUrlRequestContext.b, "Exception in CalledByNative method", exc);
        a(bafuVar);
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void cancel() {
        synchronized (this.c) {
            if (!e() && this.e != 0) {
                this.f = 5;
                this.e = 5;
                g(true);
            }
        }
    }

    public final boolean e() {
        return this.e != 0 && this.x == 0;
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void flush() {
        int i;
        synchronized (this.c) {
            if (e() || !((i = this.f) == 8 || i == 9)) {
                return;
            }
            if (this.t.isEmpty() && this.u.isEmpty()) {
                if (!this.d) {
                    this.d = true;
                    N.MGLIR7Sc(this.x, this);
                    if (!d(this.b)) {
                        this.f = 10;
                    }
                }
                return;
            }
            if (!this.t.isEmpty()) {
                this.u.addAll(this.t);
                this.t.clear();
            }
            if (this.f == 9) {
                return;
            }
            j();
        }
    }

    @Override // org.chromium.net.BidirectionalStream
    public final boolean isDone() {
        boolean e;
        synchronized (this.c) {
            e = e();
        }
        return e;
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void read(ByteBuffer byteBuffer) {
        synchronized (this.c) {
            ayeq.s(byteBuffer);
            ayeq.r(byteBuffer);
            if (this.e == 2) {
                if (e()) {
                    return;
                }
                if (this.y == null) {
                    this.y = new bafz(this);
                }
                this.e = 3;
                if (N.Md_rPmgC(this.x, this, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                    return;
                }
                this.e = 2;
                throw new IllegalArgumentException("Unable to call native read");
            }
            throw new IllegalStateException("Unexpected read attempt.");
        }
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void start() {
        synchronized (this.c) {
            if (this.e == 0) {
                try {
                    this.x = N.MqTDYvZd(this, this.h.c(), !this.m, this.h.g(), this.o, this.p, this.q, this.r);
                    this.h.e();
                    int McDUim_I = N.McDUim_I(this.x, this, this.j, this.k, this.b, this.l, !d(r7));
                    if (McDUim_I == -1) {
                        throw new IllegalArgumentException("Invalid http method " + this.b);
                    }
                    if (McDUim_I <= 0) {
                        this.f = 1;
                        this.e = 1;
                    } else {
                        int i = McDUim_I - 1;
                        throw new IllegalArgumentException("Invalid header " + this.l[i] + "=" + this.l[i + 1]);
                    }
                } catch (RuntimeException e) {
                    g(false);
                    throw e;
                }
            } else {
                throw new IllegalStateException("Stream is already started.");
            }
        }
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void write(ByteBuffer byteBuffer, boolean z) {
        synchronized (this.c) {
            ayeq.r(byteBuffer);
            if (!byteBuffer.hasRemaining() && !z) {
                throw new IllegalArgumentException("Empty buffer before end of stream.");
            }
            if (!this.v) {
                if (e()) {
                    return;
                }
                this.t.add(byteBuffer);
                if (z) {
                    this.v = true;
                }
                return;
            }
            throw new IllegalArgumentException("Write after writing end of stream.");
        }
    }
}

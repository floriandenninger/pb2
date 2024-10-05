package org.chromium.net.impl;

import J.N;
import android.content.Context;
import android.os.ConditionVariable;
import defpackage.ayeq;
import defpackage.badx;
import defpackage.baea;
import defpackage.bafs;
import defpackage.bagb;
import defpackage.bagc;
import defpackage.bagd;
import defpackage.bage;
import defpackage.bagp;
import defpackage.bagq;
import defpackage.bagr;
import defpackage.bags;
import defpackage.baig;
import defpackage.baik;
import defpackage.bain;
import defpackage.baio;
import defpackage.baip;
import defpackage.baiz;
import defpackage.bajd;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.NetworkQualityRttListener;
import org.chromium.net.NetworkQualityThroughputListener;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class CronetUrlRequestContext extends bagb {
    public static final String b = "CronetUrlRequestContext";
    private static final HashSet f = new HashSet();
    public final Object c;
    public long d;
    public Thread e;
    private final ConditionVariable g;
    private final AtomicInteger h;
    private final boolean i;
    private final Object j;
    private final Object k;
    private int l;
    private int m;
    private int n;
    private int o;
    private final baea p;
    private final baea q;
    private final Map r;
    private volatile ConditionVariable s;
    private final String t;
    private boolean u;

    public CronetUrlRequestContext(bage bageVar) {
        String str;
        Object obj = new Object();
        this.c = obj;
        this.g = new ConditionVariable(false);
        this.h = new AtomicInteger(0);
        this.j = new Object();
        this.k = new Object();
        this.l = 0;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = new baea();
        this.q = new baea();
        this.r = new HashMap();
        this.i = bageVar.n;
        CronetLibraryLoader.a(bageVar.a, bageVar);
        N.MnO2u2DQ(3);
        if (bageVar.k == 1) {
            String str2 = bageVar.f;
            this.t = str2;
            HashSet hashSet = f;
            synchronized (hashSet) {
                if (!hashSet.add(str2)) {
                    throw new IllegalStateException("Disk cache storage path already in use");
                }
            }
        } else {
            this.t = null;
        }
        synchronized (obj) {
            String str3 = bageVar.e;
            String str4 = bageVar.f;
            boolean z = bageVar.g;
            if (z) {
                Context context = bageVar.a;
                StringBuilder sb = new StringBuilder();
                sb.append(context.getPackageName());
                baik.b(sb);
                str = sb.toString();
            } else {
                str = "";
            }
            long MB3ntV7V = N.MB3ntV7V(str3, str4, z, str, bageVar.h, bageVar.i, bageVar.j, bageVar.k, bageVar.l, bageVar.m, 0L, bageVar.n, bageVar.d, bageVar.a(10));
            for (bagd bagdVar : bageVar.b) {
                N.MyRIv1Ij(MB3ntV7V, bagdVar.a, bagdVar.b, bagdVar.c);
            }
            for (bagc bagcVar : bageVar.c) {
                N.Muq3ic6p(MB3ntV7V, bagcVar.a, bagcVar.b, bagcVar.c, bagcVar.d.getTime());
            }
            long M135Cu0D = N.M135Cu0D(MB3ntV7V);
            this.d = M135Cu0D;
            if (M135Cu0D == 0) {
                throw new NullPointerException("Context Adapter creation failed.");
            }
        }
        CronetLibraryLoader.c(new bagp(this));
    }

    private final void h() {
        if (!j()) {
            throw new IllegalStateException("Engine is shut down.");
        }
    }

    private static void i(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e) {
            badx.d(b, "Exception posting task to executor", e);
        }
    }

    private void initNetworkThread() {
        this.e = Thread.currentThread();
        this.g.open();
        Thread.currentThread().setName("ChromiumNet");
    }

    private final boolean j() {
        return this.d != 0;
    }

    private void onEffectiveConnectionTypeChanged(int i) {
        synchronized (this.j) {
            this.l = i;
        }
    }

    private void onRTTOrThroughputEstimatesComputed(int i, int i2, int i3) {
        synchronized (this.j) {
            this.m = i;
            this.n = i2;
            this.o = i3;
        }
    }

    private void onRttObservation(int i, long j, int i2) {
        synchronized (this.j) {
            Iterator it = this.p.iterator();
            while (it.hasNext()) {
                bain bainVar = (bain) it.next();
                i(bainVar.getExecutor(), new bagq(bainVar, i, j, i2));
            }
        }
    }

    private void onThroughputObservation(int i, long j, int i2) {
        synchronized (this.j) {
            Iterator it = this.q.iterator();
            while (it.hasNext()) {
                baio baioVar = (baio) it.next();
                i(baioVar.getExecutor(), new bagr(baioVar, i, j, i2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bagb
    public final ExperimentalBidirectionalStream a(String str, BidirectionalStream.Callback callback, Executor executor, String str2, List list, int i, boolean z, Collection collection, boolean z2, int i2, boolean z3, int i3) {
        synchronized (this.c) {
            try {
                try {
                    h();
                    return new CronetBidirectionalStream(this, str, i, callback, executor, str2, list, z, collection, z2, i2, z3, i3);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        synchronized (this.k) {
            this.r.put(listener, new baip(listener));
        }
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final void addRttListener(NetworkQualityRttListener networkQualityRttListener) {
        if (!this.i) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.j) {
            if (this.p.b()) {
                synchronized (this.c) {
                    h();
                    N.MpnFLFF2(this.d, this, true);
                }
            }
            this.p.d(new bain(networkQualityRttListener));
        }
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final void addThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
        if (!this.i) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.j) {
            if (this.q.b()) {
                synchronized (this.c) {
                    h();
                    N.MnPUhNKP(this.d, this, true);
                }
            }
            this.q.d(new baio(networkQualityThroughputListener));
        }
    }

    @Override // defpackage.bagb
    public final baig b(String str, UrlRequest.Callback callback, Executor executor, int i, Collection collection, boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3, RequestFinishedInfo.Listener listener, int i4) {
        synchronized (this.c) {
            try {
                try {
                    h();
                    return new CronetUrlRequest(this, str, i, callback, executor, collection, z, z2, z3, z4, i2, z5, i3, listener, i4);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public final long c() {
        long j;
        synchronized (this.c) {
            h();
            j = this.d;
        }
        return j;
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final void configureNetworkQualityEstimatorForTesting(boolean z, boolean z2, boolean z3) {
        if (!this.i) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.c) {
            h();
            N.M6sIJDgy(this.d, this, z, z2, z3);
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final URLStreamHandlerFactory createURLStreamHandlerFactory() {
        return new bajd(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        this.h.decrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        this.h.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(RequestFinishedInfo requestFinishedInfo) {
        synchronized (this.k) {
            if (this.r.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.r.values());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                baip baipVar = (baip) arrayList.get(i);
                i(baipVar.getExecutor(), new bags(baipVar, requestFinishedInfo));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g() {
        boolean z;
        synchronized (this.k) {
            z = !this.r.isEmpty();
        }
        return z;
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final int getDownstreamThroughputKbps() {
        int i;
        if (!this.i) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.j) {
            i = this.o;
            if (i == -1) {
                i = -1;
            }
        }
        return i;
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final int getEffectiveConnectionType() {
        int i;
        if (!this.i) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.j) {
            int i2 = this.l;
            i = 5;
            if (i2 == 0) {
                i = 0;
            } else if (i2 == 1) {
                i = 1;
            } else if (i2 == 2) {
                i = 2;
            } else if (i2 == 3) {
                i = 3;
            } else if (i2 == 4) {
                i = 4;
            } else if (i2 != 5) {
                throw new RuntimeException("Internal Error: Illegal EffectiveConnectionType value " + i2);
            }
        }
        return i;
    }

    @Override // org.chromium.net.CronetEngine
    public final byte[] getGlobalMetricsDeltas() {
        return N.M7CZ_Klr();
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final int getHttpRttMs() {
        int i;
        if (!this.i) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.j) {
            i = this.m;
            if (i == -1) {
                i = -1;
            }
        }
        return i;
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final int getTransportRttMs() {
        int i;
        if (!this.i) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.j) {
            i = this.n;
            if (i == -1) {
                i = -1;
            }
        }
        return i;
    }

    @Override // org.chromium.net.CronetEngine
    public final String getVersionString() {
        return "Cronet/" + ayeq.t();
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        return new bafs(str, callback, executor, this);
    }

    @Override // defpackage.bagb, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final /* bridge */ /* synthetic */ UrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor) {
        return super.newUrlRequestBuilder(str, callback, executor);
    }

    @Override // org.chromium.net.CronetEngine
    public final URLConnection openConnection(URL url) {
        return openConnection(url, Proxy.NO_PROXY);
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        synchronized (this.k) {
            this.r.remove(listener);
        }
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final void removeRttListener(NetworkQualityRttListener networkQualityRttListener) {
        if (!this.i) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.j) {
            if (this.p.c(new bain(networkQualityRttListener)) && this.p.b()) {
                synchronized (this.c) {
                    h();
                    N.MpnFLFF2(this.d, this, false);
                }
            }
        }
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final void removeThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
        if (!this.i) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.j) {
            if (this.q.c(new baio(networkQualityThroughputListener)) && this.q.b()) {
                synchronized (this.c) {
                    h();
                    N.MnPUhNKP(this.d, this, false);
                }
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void shutdown() {
        if (this.t != null) {
            HashSet hashSet = f;
            synchronized (hashSet) {
                hashSet.remove(this.t);
            }
        }
        synchronized (this.c) {
            h();
            if (this.h.get() != 0) {
                throw new IllegalStateException("Cannot shutdown with active requests.");
            }
            if (Thread.currentThread() == this.e) {
                throw new IllegalThreadStateException("Cannot shutdown from network thread.");
            }
        }
        this.g.block();
        synchronized (this.c) {
            if (this.u) {
                h();
                this.s = new ConditionVariable();
                N.MKFm_qQ7(this.d, this);
                this.u = false;
                this.s.block();
            }
        }
        synchronized (this.c) {
            if (j()) {
                N.MeBvNXm5(this.d, this);
                this.d = 0L;
            }
        }
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final void startNetLogToDisk(String str, boolean z, int i) {
        synchronized (this.c) {
            h();
            N.MTULt02u(this.d, this, str, z, i);
            this.u = true;
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void startNetLogToFile(String str, boolean z) {
        synchronized (this.c) {
            h();
            if (N.MgwJQAH1(this.d, this, str, z)) {
                this.u = true;
            } else {
                throw new RuntimeException("Unable to start NetLog");
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void stopNetLog() {
        synchronized (this.c) {
            if (this.u) {
                h();
                this.s = new ConditionVariable();
                N.MKFm_qQ7(this.d, this);
                this.u = false;
                this.s.block();
            }
        }
    }

    public void stopNetLogCompleted() {
        this.s.open();
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final URLConnection openConnection(URL url, Proxy proxy) {
        if (proxy.type() != Proxy.Type.DIRECT) {
            throw new UnsupportedOperationException();
        }
        String protocol = url.getProtocol();
        if ("http".equals(protocol) || "https".equals(protocol)) {
            return new baiz(url, this);
        }
        throw new UnsupportedOperationException("Unexpected protocol:" + protocol);
    }
}

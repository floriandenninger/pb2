package org.chromium.net.impl;

import J.N;
import defpackage.badx;
import defpackage.bagi;
import defpackage.baiq;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class CronetUploadDataStream extends UploadDataSink {
    public static final String a = "CronetUploadDataStream";
    public final baiq b;
    public final CronetUrlRequest c;
    public long d;
    public long e;
    public ByteBuffer f;
    public long h;
    private final Executor j;
    private long k;
    private boolean m;
    private final Runnable l = new bagi(this, 1);
    public final Object g = new Object();
    public int i = 3;

    public CronetUploadDataStream(UploadDataProvider uploadDataProvider, Executor executor, CronetUrlRequest cronetUrlRequest) {
        this.j = executor;
        this.b = new baiq(uploadDataProvider);
        this.c = cronetUrlRequest;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(int i) {
        if (this.i == i) {
            return;
        }
        throw new IllegalStateException("Expected " + i + ", but was " + this.i);
    }

    private final void f() {
        synchronized (this.g) {
            if (this.i == 0) {
                this.m = true;
                return;
            }
            long j = this.h;
            if (j != 0) {
                N.MMW1G0N1(j);
                this.h = 0L;
                c(new bagi(this, 2));
            }
        }
    }

    private final void g() {
        synchronized (this.g) {
            if (this.i != 0) {
                if (this.m) {
                    f();
                }
            } else {
                throw new IllegalStateException("Method should not be called when read has not completed.");
            }
        }
    }

    public final void a() {
        this.c.b();
    }

    public final void b(Throwable th) {
        int i;
        synchronized (this.g) {
            i = this.i;
            if (i != 3) {
                this.i = 3;
                this.f = null;
                g();
            } else {
                throw new IllegalStateException("There is no read or rewind or length check in progress.");
            }
        }
        if (i == 2) {
            try {
                this.b.close();
            } catch (Exception e) {
                badx.d(a, "Failure closing data provider", e);
            }
        }
        this.c.f(th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(Runnable runnable) {
        try {
            this.j.execute(runnable);
        } catch (Throwable th) {
            this.c.f(th);
        }
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadError(Exception exc) {
        synchronized (this.g) {
            e(0);
            b(exc);
        }
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadSucceeded(boolean z) {
        synchronized (this.g) {
            e(0);
            if (this.k != this.f.limit()) {
                throw new IllegalStateException("ByteBuffer limit changed");
            }
            if (z && this.d >= 0) {
                throw new IllegalArgumentException("Non-chunked upload can't have last chunk");
            }
            int position = this.f.position();
            long j = this.e - position;
            this.e = j;
            if (j < 0) {
                long j2 = this.d;
                if (j2 >= 0) {
                    throw new IllegalArgumentException(String.format("Read upload data length %d exceeds expected length %d", Long.valueOf(j2 - j), Long.valueOf(this.d)));
                }
            }
            this.f.position(0);
            this.f = null;
            this.i = 3;
            g();
            long j3 = this.h;
            if (j3 != 0) {
                N.MpWH3VIr(j3, this, position, z);
            }
        }
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindError(Exception exc) {
        synchronized (this.g) {
            e(1);
            b(exc);
        }
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindSucceeded() {
        synchronized (this.g) {
            e(1);
            this.i = 3;
            this.e = this.d;
            long j = this.h;
            if (j != 0) {
                N.MFpRjSMv(j, this);
            }
        }
    }

    void onUploadDataStreamDestroyed() {
        f();
    }

    void readData(ByteBuffer byteBuffer) {
        this.f = byteBuffer;
        this.k = byteBuffer.limit();
        c(this.l);
    }

    void rewind() {
        c(new bagi(this, 0));
    }
}

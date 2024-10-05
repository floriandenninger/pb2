package defpackage;

import J.N;
import org.chromium.net.impl.CronetUploadDataStream;
import org.chromium.net.impl.CronetUrlRequest;
import org.chromium.net.impl.CronetUrlRequestContext;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bagl implements Runnable {
    final /* synthetic */ CronetUrlRequest a;
    private final /* synthetic */ int b;

    public bagl(CronetUrlRequest cronetUrlRequest, int i) {
        this.b = i;
        this.a = cronetUrlRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.b();
            synchronized (this.a.c) {
                if (this.a.j()) {
                    return;
                }
                this.a.k = true;
                try {
                    CronetUrlRequest cronetUrlRequest = this.a;
                    cronetUrlRequest.d.onResponseStarted(cronetUrlRequest, cronetUrlRequest.g);
                    return;
                } catch (Exception e) {
                    this.a.e(e);
                    return;
                }
            }
        }
        if (i == 1) {
            CronetUploadDataStream cronetUploadDataStream = this.a.f;
            synchronized (cronetUploadDataStream.g) {
                cronetUploadDataStream.i = 2;
            }
            try {
                cronetUploadDataStream.c.b();
                long length = cronetUploadDataStream.b.getLength();
                cronetUploadDataStream.d = length;
                cronetUploadDataStream.e = length;
            } catch (Throwable th) {
                cronetUploadDataStream.b(th);
            }
            synchronized (cronetUploadDataStream.g) {
                cronetUploadDataStream.i = 3;
            }
            synchronized (this.a.c) {
                if (this.a.j()) {
                    return;
                }
                CronetUrlRequest cronetUrlRequest2 = this.a;
                CronetUploadDataStream cronetUploadDataStream2 = cronetUrlRequest2.f;
                long j = cronetUrlRequest2.a;
                synchronized (cronetUploadDataStream2.g) {
                    cronetUploadDataStream2.h = N.MA4X1aZa(cronetUploadDataStream2, j, cronetUploadDataStream2.d);
                }
                this.a.i();
                return;
            }
        }
        if (i == 2) {
            synchronized (this.a.c) {
                if (this.a.j()) {
                    return;
                }
                this.a.c(0);
                try {
                    CronetUrlRequest cronetUrlRequest3 = this.a;
                    cronetUrlRequest3.d.onSucceeded(cronetUrlRequest3, cronetUrlRequest3.g);
                    this.a.d();
                    return;
                } catch (Exception e2) {
                    badx.d(CronetUrlRequestContext.b, "Exception in onSucceeded method", e2);
                    return;
                }
            }
        }
        if (i != 3) {
            try {
                CronetUrlRequest cronetUrlRequest4 = this.a;
                cronetUrlRequest4.d.onFailed(cronetUrlRequest4, cronetUrlRequest4.g, cronetUrlRequest4.h);
                this.a.d();
                return;
            } catch (Exception e3) {
                badx.d(CronetUrlRequestContext.b, "Exception in onFailed method", e3);
                return;
            }
        }
        try {
            CronetUrlRequest cronetUrlRequest5 = this.a;
            cronetUrlRequest5.d.onCanceled(cronetUrlRequest5, cronetUrlRequest5.g);
            this.a.d();
        } catch (Exception e4) {
            badx.d(CronetUrlRequestContext.b, "Exception in onCanceled method", e4);
        }
    }
}

package defpackage;

import org.chromium.net.impl.CronetBidirectionalStream;
import org.chromium.net.impl.CronetUrlRequestContext;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bafx implements Runnable {
    final /* synthetic */ CronetBidirectionalStream a;
    private final /* synthetic */ int b;

    public bafx(CronetBidirectionalStream cronetBidirectionalStream, int i) {
        this.b = i;
        this.a = cronetBidirectionalStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            try {
                CronetBidirectionalStream cronetBidirectionalStream = this.a;
                cronetBidirectionalStream.a.onCanceled(cronetBidirectionalStream, cronetBidirectionalStream.g);
                return;
            } catch (Exception e) {
                badx.d(CronetUrlRequestContext.b, "Exception in onCanceled method", e);
                return;
            }
        }
        synchronized (this.a.c) {
            if (this.a.e()) {
                return;
            }
            this.a.e = 2;
            try {
                CronetBidirectionalStream cronetBidirectionalStream2 = this.a;
                cronetBidirectionalStream2.a.onResponseHeadersReceived(cronetBidirectionalStream2, cronetBidirectionalStream2.g);
            } catch (Exception e2) {
                this.a.c(e2);
            }
        }
    }
}

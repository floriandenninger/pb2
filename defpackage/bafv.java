package defpackage;

import org.chromium.net.impl.CronetBidirectionalStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bafv implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ CronetBidirectionalStream b;

    public bafv(CronetBidirectionalStream cronetBidirectionalStream, boolean z) {
        this.b = cronetBidirectionalStream;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.c) {
            if (this.b.e()) {
                return;
            }
            CronetBidirectionalStream cronetBidirectionalStream = this.b;
            cronetBidirectionalStream.d = this.a;
            cronetBidirectionalStream.e = 2;
            try {
                if (!CronetBidirectionalStream.d(cronetBidirectionalStream.b)) {
                    CronetBidirectionalStream cronetBidirectionalStream2 = this.b;
                    if (cronetBidirectionalStream2.d) {
                        cronetBidirectionalStream2.f = 10;
                        CronetBidirectionalStream cronetBidirectionalStream3 = this.b;
                        cronetBidirectionalStream3.a.onStreamReady(cronetBidirectionalStream3);
                        return;
                    }
                }
                CronetBidirectionalStream cronetBidirectionalStream32 = this.b;
                cronetBidirectionalStream32.a.onStreamReady(cronetBidirectionalStream32);
                return;
            } catch (Exception e) {
                this.b.c(e);
                return;
            }
            this.b.f = 8;
        }
    }
}

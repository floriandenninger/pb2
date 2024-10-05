package defpackage;

import org.chromium.net.UrlResponseInfo;
import org.chromium.net.impl.CronetBidirectionalStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bafw implements Runnable {
    final /* synthetic */ UrlResponseInfo.HeaderBlock a;
    final /* synthetic */ CronetBidirectionalStream b;

    public bafw(CronetBidirectionalStream cronetBidirectionalStream, UrlResponseInfo.HeaderBlock headerBlock) {
        this.b = cronetBidirectionalStream;
        this.a = headerBlock;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.c) {
            if (this.b.e()) {
                return;
            }
            try {
                CronetBidirectionalStream cronetBidirectionalStream = this.b;
                cronetBidirectionalStream.a.onResponseTrailersReceived(cronetBidirectionalStream, cronetBidirectionalStream.g, this.a);
            } catch (Exception e) {
                this.b.c(e);
            }
        }
    }
}

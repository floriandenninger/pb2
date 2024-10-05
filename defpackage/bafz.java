package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.impl.CronetBidirectionalStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bafz implements Runnable {
    public ByteBuffer a;
    public boolean b;
    final /* synthetic */ CronetBidirectionalStream c;

    public bafz(CronetBidirectionalStream cronetBidirectionalStream) {
        this.c = cronetBidirectionalStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            ByteBuffer byteBuffer = this.a;
            this.a = null;
            synchronized (this.c.c) {
                if (this.c.e()) {
                    return;
                }
                boolean z = false;
                if (this.b) {
                    CronetBidirectionalStream cronetBidirectionalStream = this.c;
                    cronetBidirectionalStream.e = 4;
                    if (cronetBidirectionalStream.f == 10) {
                        z = true;
                    }
                } else {
                    this.c.e = 2;
                }
                CronetBidirectionalStream cronetBidirectionalStream2 = this.c;
                cronetBidirectionalStream2.a.onReadCompleted(cronetBidirectionalStream2, cronetBidirectionalStream2.g, byteBuffer, this.b);
                if (z) {
                    this.c.b();
                }
            }
        } catch (Exception e) {
            this.c.c(e);
        }
    }
}

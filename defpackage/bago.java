package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.impl.CronetUrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bago implements Runnable {
    public ByteBuffer a;
    final /* synthetic */ CronetUrlRequest b;

    public bago(CronetUrlRequest cronetUrlRequest) {
        this.b = cronetUrlRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b();
        ByteBuffer byteBuffer = this.a;
        this.a = null;
        try {
            synchronized (this.b.c) {
                if (this.b.j()) {
                    return;
                }
                this.b.k = true;
                CronetUrlRequest cronetUrlRequest = this.b;
                cronetUrlRequest.d.onReadCompleted(cronetUrlRequest, cronetUrlRequest.g, byteBuffer);
            }
        } catch (Exception e) {
            this.b.e(e);
        }
    }
}

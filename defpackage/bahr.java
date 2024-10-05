package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bahr implements bahy {
    final /* synthetic */ UrlResponseInfo a;
    final /* synthetic */ ByteBuffer b;
    final /* synthetic */ bahu c;

    public bahr(bahu bahuVar, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        this.c = bahuVar;
        this.a = urlResponseInfo;
        this.b = byteBuffer;
    }

    @Override // defpackage.bahy
    public final void a() {
        if (this.c.d.g.compareAndSet(5, 4)) {
            bahu bahuVar = this.c;
            bahuVar.a.onReadCompleted(bahuVar.d, this.a, this.b);
        }
    }
}

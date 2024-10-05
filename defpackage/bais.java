package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bais extends UploadDataProvider {
    final /* synthetic */ bait a;

    public bais(bait baitVar) {
        this.a = baitVar;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        bait baitVar = this.a;
        int i = baitVar.a;
        if (i != -1) {
            return i;
        }
        boolean z = baitVar.c;
        ByteBuffer byteBuffer = baitVar.b;
        return z ? byteBuffer.limit() : byteBuffer.position();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining < this.a.b.remaining()) {
            byteBuffer.put(this.a.b.array(), this.a.b.position(), remaining);
            ByteBuffer byteBuffer2 = this.a.b;
            byteBuffer2.position(byteBuffer2.position() + remaining);
        } else {
            byteBuffer.put(this.a.b);
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        this.a.b.position(0);
        uploadDataSink.onRewindSucceeded();
    }
}

package defpackage;

import java.net.HttpRetryException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class baiw extends UploadDataProvider {
    final /* synthetic */ baix a;

    public baiw(baix baixVar) {
        this.a = baixVar;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.a.b;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= this.a.c.remaining()) {
            byteBuffer.put(this.a.c);
            this.a.c.clear();
            uploadDataSink.onReadSucceeded(false);
            this.a.a.c();
            return;
        }
        int limit = this.a.c.limit();
        ByteBuffer byteBuffer2 = this.a.c;
        byteBuffer2.limit(byteBuffer2.position() + byteBuffer.remaining());
        byteBuffer.put(this.a.c);
        this.a.c.limit(limit);
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        uploadDataSink.onRewindError(new HttpRetryException("Cannot retry streamed Http body", -1));
    }
}

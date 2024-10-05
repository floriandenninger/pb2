package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.entity.AbstractHttpEntity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ailp extends AbstractHttpEntity {
    private final ate a;
    private final ath b;
    private bff c;

    public ailp(ate ateVar, ath athVar) {
        ateVar.getClass();
        this.a = ateVar;
        this.b = athVar;
        setContentType("video/mp4");
    }

    @Override // org.apache.http.HttpEntity
    public final synchronized InputStream getContent() {
        if (this.c == null) {
            this.c = new bff(this.a, this.b);
        }
        return this.c;
    }

    @Override // org.apache.http.HttpEntity
    public final long getContentLength() {
        return this.b.h;
    }

    @Override // org.apache.http.HttpEntity
    public final boolean isRepeatable() {
        return false;
    }

    @Override // org.apache.http.HttpEntity
    public final boolean isStreaming() {
        return true;
    }

    @Override // org.apache.http.HttpEntity
    public final void writeTo(OutputStream outputStream) {
        outputStream.getClass();
        InputStream content = getContent();
        try {
            anbt.g(content, outputStream);
        } finally {
            content.close();
        }
    }
}

package org.chromium.net;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class UploadDataProvider implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public abstract long getLength();

    public abstract void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer);

    public abstract void rewind(UploadDataSink uploadDataSink);
}

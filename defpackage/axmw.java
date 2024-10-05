package defpackage;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axmw {
    static {
        ByteBuffer.allocate(0).asReadOnlyBuffer();
    }

    public static void a(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        int i = 0;
        while (true) {
            int read = readableByteChannel.read(byteBuffer);
            if (read == -1) {
                break;
            }
            i += read;
            if (i == remaining) {
                if (read != -1) {
                    return;
                }
            }
        }
        throw new EOFException("End of file. No more boxes.");
    }
}

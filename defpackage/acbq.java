package defpackage;

import java.net.ProtocolException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acbq {
    public static final /* synthetic */ int a = 0;
    private static final byte[] b = {-81, 1};
    private static final byte[] c = {-81, 0};
    private static final byte[] d = {39, 1, 0, 0, 0};
    private static final byte[] e = {23, 1, 0, 0, 0};
    private static final byte[] f = {39, 0, 0, 0, 0};
    private static final byte[] g = {23, 0, 0, 0, 0};

    public static int a(byte b2) {
        return b2 + 64;
    }

    public static int b(ByteBuffer byteBuffer, int i) {
        return (byteBuffer.get(i + 2) & 255) | ((byteBuffer.get(i) & 255) << 16) | ((byteBuffer.get(i + 1) & 255) << 8);
    }

    public static boolean c(int i) {
        return (i & 16777215) == 16777215 || (i & (-16777216)) != 0;
    }

    public static boolean d(int i) {
        return (i & (-16777216)) == 0;
    }

    public static byte[] e(int i, boolean z) {
        if (i == 10) {
            return z ? c : b;
        }
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unsupported audio codec: ");
        sb.append(i);
        throw new ProtocolException(sb.toString());
    }

    public static byte[] f(int i, boolean z, boolean z2) {
        if (i == 7) {
            return z ? z2 ? g : f : z2 ? e : d;
        }
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unsupported video codec: ");
        sb.append(i);
        throw new ProtocolException(sb.toString());
    }
}

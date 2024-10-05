package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anjg {
    public static final byte[] a = new byte[1024];
    public static final int[] b = new int[1024];

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(InputStream inputStream, byte[] bArr, int i, int i2) {
        try {
            return inputStream.read(bArr, i, i2);
        } catch (IOException e) {
            throw new aniz(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(bArr, i2, bArr, i, i3 - i2);
    }
}

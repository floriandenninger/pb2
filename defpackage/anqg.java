package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class anqg implements anrd {
    private static final int[] b = i(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});
    int[] a;
    private final int c;

    public anqg(byte[] bArr, int i) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.a = i(bArr);
        this.c = i;
    }

    static void f(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = iArr[i] + iArr[i2];
        iArr[i] = i5;
        int j = j(i5 ^ iArr[i4], 16);
        iArr[i4] = j;
        int i6 = iArr[i3] + j;
        iArr[i3] = i6;
        int j2 = j(iArr[i2] ^ i6, 12);
        iArr[i2] = j2;
        int i7 = iArr[i] + j2;
        iArr[i] = i7;
        int j3 = j(iArr[i4] ^ i7, 8);
        iArr[i4] = j3;
        int i8 = iArr[i3] + j3;
        iArr[i3] = i8;
        iArr[i2] = j(iArr[i2] ^ i8, 7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(int[] iArr, int[] iArr2) {
        int[] iArr3 = b;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            f(iArr, 0, 4, 8, 12);
            f(iArr, 1, 5, 9, 13);
            f(iArr, 2, 6, 10, 14);
            f(iArr, 3, 7, 11, 15);
            f(iArr, 0, 5, 10, 15);
            f(iArr, 1, 6, 11, 12);
            f(iArr, 2, 7, 8, 13);
            f(iArr, 3, 4, 9, 14);
        }
    }

    static int[] i(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    private static int j(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    @Override // defpackage.anrd
    public final byte[] a(byte[] bArr) {
        int length = bArr.length;
        if (length > Integer.MAX_VALUE - b()) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer allocate = ByteBuffer.allocate(b() + length);
        e(allocate, bArr);
        return allocate.array();
    }

    public abstract int b();

    public abstract int[] c(int[] iArr, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ByteBuffer d(byte[] bArr, int i) {
        int[] c = c(i(bArr), i);
        int[] iArr = (int[]) c.clone();
        h(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            c[i2] = c[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(c, 0, 16);
        return order;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() - b() < bArr.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        byte[] a = anrj.a(b());
        byteBuffer.put(a);
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        int remaining = wrap.remaining();
        int i = (remaining / 64) + 1;
        for (int i2 = 0; i2 < i; i2++) {
            ByteBuffer d = d(a, this.c + i2);
            if (i2 == i - 1) {
                aocz.at(byteBuffer, wrap, d, remaining % 64);
            } else {
                aocz.at(byteBuffer, wrap, d, 64);
            }
        }
    }
}

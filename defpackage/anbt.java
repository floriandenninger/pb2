package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anbt {
    static {
        new anbr();
    }

    public static void a(InputStream inputStream, byte[] bArr) {
        f(inputStream, bArr, bArr.length);
    }

    public static void b(InputStream inputStream, long j) {
        byte[] bArr = null;
        long j2 = 0;
        while (j2 < j) {
            long j3 = j - j2;
            int available = inputStream.available();
            long skip = available == 0 ? 0L : inputStream.skip(Math.min(available, j3));
            if (skip == 0) {
                int min = (int) Math.min(j3, 8192L);
                if (bArr == null) {
                    bArr = new byte[min];
                }
                skip = inputStream.read(bArr, 0, min);
                if (skip == -1) {
                    break;
                }
            }
            j2 += skip;
        }
        if (j2 >= j) {
            return;
        }
        StringBuilder sb = new StringBuilder(100);
        sb.append("reached end of stream after skipping ");
        sb.append(j2);
        sb.append(" bytes; ");
        sb.append(j);
        sb.append(" bytes expected");
        throw new EOFException(sb.toString());
    }

    public static byte[] c(InputStream inputStream) {
        inputStream.getClass();
        return i(inputStream, new ArrayDeque(20), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] d(InputStream inputStream, long j) {
        amkq.I(j >= 0, "expectedSize (%s) must be non-negative", j);
        if (j > 2147483639) {
            StringBuilder sb = new StringBuilder(62);
            sb.append(j);
            sb.append(" bytes is too large to fit in a byte array");
            throw new OutOfMemoryError(sb.toString());
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            int i3 = i - i2;
            int read = inputStream.read(bArr, i3, i2);
            if (read == -1) {
                return Arrays.copyOf(bArr, i3);
            }
            i2 -= read;
        }
        int read2 = inputStream.read();
        if (read2 == -1) {
            return bArr;
        }
        ArrayDeque arrayDeque = new ArrayDeque(22);
        arrayDeque.add(bArr);
        arrayDeque.add(new byte[]{(byte) read2});
        return i(inputStream, arrayDeque, i + 1);
    }

    public static InputStream e(InputStream inputStream) {
        return new anbs(inputStream);
    }

    public static void f(InputStream inputStream, byte[] bArr, int i) {
        inputStream.getClass();
        bArr.getClass();
        int i2 = 0;
        amkq.M(0, i, bArr.length);
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read == -1) {
                break;
            } else {
                i2 += read;
            }
        }
        if (i2 == i) {
            return;
        }
        StringBuilder sb = new StringBuilder(81);
        sb.append("reached end of stream after reading ");
        sb.append(i2);
        sb.append(" bytes; ");
        sb.append(i);
        sb.append(" bytes expected");
        throw new EOFException(sb.toString());
    }

    public static void g(InputStream inputStream, OutputStream outputStream) {
        inputStream.getClass();
        outputStream.getClass();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    private static byte[] h(Queue queue, int i) {
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int min = Math.min(i2, bArr2.length);
            System.arraycopy(bArr2, 0, bArr, i - i2, min);
            i2 -= min;
        }
        return bArr;
    }

    private static byte[] i(InputStream inputStream, Queue queue, int i) {
        int i2 = 8192;
        while (i < 2147483639) {
            int min = Math.min(i2, 2147483639 - i);
            byte[] bArr = new byte[min];
            queue.add(bArr);
            int i3 = 0;
            while (i3 < min) {
                int read = inputStream.read(bArr, i3, min - i3);
                if (read == -1) {
                    return h(queue, i);
                }
                i3 += read;
                i += read;
            }
            long j = i2;
            i2 = anaf.ag(j + j);
        }
        if (inputStream.read() == -1) {
            return h(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}

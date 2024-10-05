package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bacu implements Cloneable, ByteChannel, bacw, bacv {
    public bade a;
    public long b;

    public final byte a(long j) {
        int i;
        badi.a(this.b, j, 1L);
        long j2 = this.b;
        if (j2 - j <= j) {
            long j3 = j - j2;
            bade badeVar = this.a;
            do {
                badeVar = badeVar.g;
                int i2 = badeVar.c;
                i = badeVar.b;
                j3 += i2 - i;
            } while (j3 < 0);
            return badeVar.a[i + ((int) j3)];
        }
        bade badeVar2 = this.a;
        while (true) {
            int i3 = badeVar2.c;
            int i4 = badeVar2.b;
            long j4 = i3 - i4;
            if (j >= j4) {
                j -= j4;
                badeVar2 = badeVar2.f;
            } else {
                return badeVar2.a[i4 + ((int) j)];
            }
        }
    }

    public final byte b() {
        long j = this.b;
        if (j == 0) {
            throw new IllegalStateException("size == 0");
        }
        bade badeVar = this.a;
        int i = badeVar.b;
        int i2 = badeVar.c;
        int i3 = i + 1;
        byte b = badeVar.a[i];
        this.b = j - 1;
        if (i3 == i2) {
            this.a = badeVar.a();
            badf.b(badeVar);
        } else {
            badeVar.b = i3;
        }
        return b;
    }

    public final int c(byte[] bArr, int i, int i2) {
        badi.a(bArr.length, i, i2);
        bade badeVar = this.a;
        if (badeVar == null) {
            return -1;
        }
        int min = Math.min(i2, badeVar.c - badeVar.b);
        System.arraycopy(badeVar.a, badeVar.b, bArr, i, min);
        int i3 = badeVar.b + min;
        badeVar.b = i3;
        this.b -= min;
        if (i3 == badeVar.c) {
            this.a = badeVar.a();
            badf.b(badeVar);
        }
        return min;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        bacu bacuVar = new bacu();
        if (this.b != 0) {
            bade b = this.a.b();
            bacuVar.a = b;
            b.g = b;
            b.f = b;
            bade badeVar = this.a;
            while (true) {
                badeVar = badeVar.f;
                if (badeVar == this.a) {
                    break;
                }
                bacuVar.a.g.d(badeVar.b());
            }
            bacuVar.b = this.b;
        }
        return bacuVar;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.badh
    public final void close() {
    }

    @Override // defpackage.bacw
    public final long d(bacx bacxVar) {
        throw null;
    }

    @Override // defpackage.badh
    public final long e(bacu bacuVar, long j) {
        if (j >= 0) {
            long j2 = this.b;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            bacuVar.m(this, j);
            return j;
        }
        StringBuilder sb = new StringBuilder(35);
        sb.append("byteCount < 0: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bacu)) {
            return false;
        }
        bacu bacuVar = (bacu) obj;
        long j = this.b;
        if (j != bacuVar.b) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        bade badeVar = this.a;
        bade badeVar2 = bacuVar.a;
        int i = badeVar.b;
        int i2 = badeVar2.b;
        while (j2 < this.b) {
            long min = Math.min(badeVar.c - i, badeVar2.c - i2);
            int i3 = 0;
            while (i3 < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (badeVar.a[i] != badeVar2.a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == badeVar.c) {
                badeVar = badeVar.f;
                i = badeVar.b;
            }
            if (i2 == badeVar2.c) {
                badeVar2 = badeVar2.f;
                i2 = badeVar2.b;
            }
            j2 += min;
        }
        return true;
    }

    @Override // defpackage.bacw
    public final InputStream f() {
        throw null;
    }

    @Override // java.io.Flushable
    public final void flush() {
    }

    public final String g(long j, Charset charset) {
        badi.a(this.b, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j > 2147483647L) {
            StringBuilder sb = new StringBuilder(51);
            sb.append("byteCount > Integer.MAX_VALUE: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
        if (j == 0) {
            return "";
        }
        bade badeVar = this.a;
        int i = badeVar.b;
        if (i + j > badeVar.c) {
            return new String(p(j), charset);
        }
        String str = new String(badeVar.a, i, (int) j, charset);
        int i2 = (int) (badeVar.b + j);
        badeVar.b = i2;
        this.b -= j;
        if (i2 == badeVar.c) {
            this.a = badeVar.a();
            badf.b(badeVar);
        }
        return str;
    }

    public final String h() {
        try {
            return g(this.b, badi.a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final int hashCode() {
        bade badeVar = this.a;
        if (badeVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = badeVar.c;
            for (int i3 = badeVar.b; i3 < i2; i3++) {
                i = (i * 31) + badeVar.a[i3];
            }
            badeVar = badeVar.f;
        } while (badeVar != this.a);
        return i;
    }

    public final String i(long j) {
        return g(j, badi.a);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bade j(int i) {
        bade badeVar = this.a;
        if (badeVar == null) {
            bade a = badf.a();
            this.a = a;
            a.g = a;
            a.f = a;
            return a;
        }
        bade badeVar2 = badeVar.g;
        if (badeVar2.c + i <= 8192 && badeVar2.e) {
            return badeVar2;
        }
        bade a2 = badf.a();
        badeVar2.d(a2);
        return a2;
    }

    public final void m(bacu bacuVar, long j) {
        bade a;
        if (bacuVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        badi.a(bacuVar.b, 0L, j);
        while (j > 0) {
            bade badeVar = bacuVar.a;
            int i = badeVar.c - badeVar.b;
            if (j < i) {
                bade badeVar2 = this.a;
                bade badeVar3 = badeVar2 != null ? badeVar2.g : null;
                if (badeVar3 != null && badeVar3.e) {
                    if ((badeVar3.c + j) - (badeVar3.d ? 0 : badeVar3.b) <= 8192) {
                        badeVar.c(badeVar3, (int) j);
                        bacuVar.b -= j;
                        this.b += j;
                        return;
                    }
                }
                int i2 = (int) j;
                if (i2 > 0 && i2 <= i) {
                    if (i2 >= 1024) {
                        a = badeVar.b();
                    } else {
                        a = badf.a();
                        System.arraycopy(badeVar.a, badeVar.b, a.a, 0, i2);
                    }
                    a.c = a.b + i2;
                    badeVar.b += i2;
                    badeVar.g.d(a);
                    bacuVar.a = a;
                } else {
                    throw new IllegalArgumentException();
                }
            }
            bade badeVar4 = bacuVar.a;
            long j2 = badeVar4.c - badeVar4.b;
            bacuVar.a = badeVar4.a();
            bade badeVar5 = this.a;
            if (badeVar5 == null) {
                this.a = badeVar4;
                badeVar4.g = badeVar4;
                badeVar4.f = badeVar4;
            } else {
                badeVar5.g.d(badeVar4);
                bade badeVar6 = badeVar4.g;
                if (badeVar6 != badeVar4) {
                    if (badeVar6.e) {
                        int i3 = badeVar4.c - badeVar4.b;
                        if (i3 <= (8192 - badeVar6.c) + (badeVar6.d ? 0 : badeVar6.b)) {
                            badeVar4.c(badeVar6, i3);
                            badeVar4.a();
                            badf.b(badeVar4);
                        }
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            bacuVar.b -= j2;
            this.b += j2;
            j -= j2;
        }
    }

    @Override // defpackage.bacw
    public final boolean n(long j) {
        throw null;
    }

    public final byte[] o() {
        try {
            return p(this.b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final byte[] p(long j) {
        badi.a(this.b, 0L, j);
        if (j > 2147483647L) {
            StringBuilder sb = new StringBuilder(51);
            sb.append("byteCount > Integer.MAX_VALUE: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int c = c(bArr, i2, i - i2);
            if (c == -1) {
                throw new EOFException();
            }
            i2 += c;
        }
        return bArr;
    }

    public final void q(int i) {
        bade j = j(1);
        byte[] bArr = j.a;
        int i2 = j.c;
        j.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
    }

    @Override // defpackage.bacv
    public final /* bridge */ /* synthetic */ void r() {
        q(34);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        bade badeVar = this.a;
        if (badeVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), badeVar.c - badeVar.b);
        byteBuffer.put(badeVar.a, badeVar.b, min);
        int i = badeVar.b + min;
        badeVar.b = i;
        this.b -= min;
        if (i == badeVar.c) {
            this.a = badeVar.a();
            badf.b(badeVar);
        }
        return min;
    }

    public final void s(int i) {
        bade j = j(4);
        byte[] bArr = j.a;
        int i2 = j.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & PrivateKeyType.INVALID);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & PrivateKeyType.INVALID);
        bArr[i5] = (byte) (i & PrivateKeyType.INVALID);
        j.c = i5 + 1;
        this.b += 4;
    }

    public final String toString() {
        bacx badgVar;
        long j = this.b;
        if (j > 2147483647L) {
            StringBuilder sb = new StringBuilder(46);
            sb.append("size > Integer.MAX_VALUE: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
        int i = (int) j;
        if (i == 0) {
            badgVar = bacx.b;
        } else {
            badgVar = new badg(this, i);
        }
        return badgVar.toString();
    }

    public final void k() {
        try {
            l(this.b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            bade j = j(1);
            int min = Math.min(i, 8192 - j.c);
            byteBuffer.get(j.a, j.c, min);
            i -= min;
            j.c += min;
        }
        this.b += remaining;
        return remaining;
    }

    public final void t(String str, int i, int i2) {
        char charAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(27);
            sb.append("beginIndex < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(48);
            sb2.append("endIndex < beginIndex: ");
            sb2.append(i2);
            sb2.append(" < ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i2 > str.length()) {
            int length = str.length();
            StringBuilder sb3 = new StringBuilder(51);
            sb3.append("endIndex > string.length: ");
            sb3.append(i2);
            sb3.append(" > ");
            sb3.append(length);
            throw new IllegalArgumentException(sb3.toString());
        }
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                bade j = j(1);
                byte[] bArr = j.a;
                int i3 = j.c - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                }
                int i5 = j.c;
                int i6 = (i3 + i) - i5;
                j.c = i5 + i6;
                this.b += i6;
            } else {
                if (charAt2 < 2048) {
                    q((charAt2 >> 6) | 192);
                    q((charAt2 & '?') | 128);
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    q((charAt2 >> '\f') | 224);
                    q(((charAt2 >> 6) & 63) | 128);
                    q((charAt2 & '?') | 128);
                } else {
                    int i7 = i + 1;
                    char charAt3 = i7 < i2 ? str.charAt(i7) : (char) 0;
                    if (charAt2 > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                        q(63);
                        i = i7;
                    } else {
                        int i8 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + 65536;
                        q((i8 >> 18) | 240);
                        q(((i8 >> 12) & 63) | 128);
                        q(((i8 >> 6) & 63) | 128);
                        q((i8 & 63) | 128);
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final void l(long j) {
        while (j > 0) {
            if (this.a != null) {
                int min = (int) Math.min(j, r0.c - r0.b);
                long j2 = min;
                this.b -= j2;
                j -= j2;
                bade badeVar = this.a;
                int i = badeVar.b + min;
                badeVar.b = i;
                if (i == badeVar.c) {
                    this.a = badeVar.a();
                    badf.b(badeVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }
}

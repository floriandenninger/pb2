package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class axrs {
    public static final Charset c = Charset.forName("UTF-8");
    private transient String a;
    public axrr d;
    public boolean e;
    public byte[] f;
    public byte[] g;
    public transient int h;

    public axrs(axrr axrrVar, List list) {
        this.d = axrrVar;
        this.e = true;
        long j = 0;
        while (list.iterator().hasNext()) {
            j += ((axrs) r7.next()).g.length;
        }
        if (j < 0 || j > 2147483647L) {
            throw new axrp(1009, "Max frame length has been exceeded.");
        }
        int i = (int) j;
        this.h = i;
        byte[] bArr = new byte[i];
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            axrs axrsVar = (axrs) it.next();
            byte[] bArr2 = axrsVar.g;
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += axrsVar.g.length;
        }
        d(bArr);
    }

    private axrs(axrr axrrVar, boolean z) {
        this.d = axrrVar;
        this.e = z;
    }

    public static axrs a(InputStream inputStream) {
        axrr axrrVar;
        int read = inputStream.read();
        h(read);
        byte b = (byte) read;
        boolean z = (b & 128) != 0;
        int i = b & 15;
        axrr[] values = axrr.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                axrrVar = null;
                break;
            }
            axrrVar = values[i2];
            if (axrrVar.g == i) {
                break;
            }
            i2++;
        }
        int i3 = b & 112;
        if (i3 != 0) {
            String valueOf = String.valueOf(Integer.toBinaryString(i3));
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
            sb.append("The reserved bits (");
            sb.append(valueOf);
            sb.append(") must be 0.");
            throw new axrp(1002, sb.toString());
        }
        if (axrrVar != null) {
            if (!axrrVar.a() || z) {
                axrs axrsVar = new axrs(axrrVar, z);
                int read2 = inputStream.read();
                h(read2);
                byte b2 = (byte) read2;
                int i4 = b2 & 128;
                int i5 = b2 & Byte.MAX_VALUE;
                axrsVar.h = i5;
                if (i5 == 126) {
                    int read3 = inputStream.read();
                    h(read3);
                    int read4 = inputStream.read();
                    h(read4);
                    char c2 = (char) ((read3 << 8) | read4);
                    axrsVar.h = c2;
                    if (c2 < '~') {
                        throw new axrp(1002, "Invalid data frame 2byte length. (not using minimal length encoding)");
                    }
                } else if (i5 == 127) {
                    int read5 = inputStream.read();
                    h(read5);
                    int read6 = inputStream.read();
                    h(read6);
                    int read7 = inputStream.read();
                    h(read7);
                    int read8 = inputStream.read();
                    h(read8);
                    h(inputStream.read());
                    h(inputStream.read());
                    h(inputStream.read());
                    int read9 = inputStream.read();
                    h(read9);
                    long j = (read5 << 56) | (read6 << 48) | (read7 << 40) | (read8 << 32) | (r11 << 24) | (r12 << 16) | (r13 << 8) | read9;
                    if (j < 65536) {
                        throw new axrp(1002, "Invalid data frame 4byte length. (not using minimal length encoding)");
                    }
                    if (j < 0 || j > 2147483647L) {
                        throw new axrp(1009, "Max frame length has been exceeded.");
                    }
                    axrsVar.h = (int) j;
                }
                if (axrsVar.d.a()) {
                    if (axrsVar.h <= 125) {
                        if (axrsVar.d == axrr.Close && axrsVar.h == 1) {
                            throw new axrp(1002, "Received close frame with payload len 1.");
                        }
                    } else {
                        throw new axrp(1002, "Control frame with payload length > 125 bytes.");
                    }
                }
                if (i4 != 0) {
                    axrsVar.f = new byte[4];
                    int i6 = 0;
                    while (true) {
                        byte[] bArr = axrsVar.f;
                        int length2 = bArr.length;
                        if (i6 >= 4) {
                            break;
                        }
                        int read10 = inputStream.read(bArr, i6, 4 - i6);
                        h(read10);
                        i6 += read10;
                    }
                }
                axrsVar.g = new byte[axrsVar.h];
                int i7 = 0;
                while (true) {
                    int i8 = axrsVar.h;
                    if (i7 >= i8) {
                        break;
                    }
                    int read11 = inputStream.read(axrsVar.g, i7, i8 - i7);
                    h(read11);
                    i7 += read11;
                }
                if (axrsVar.f()) {
                    int i9 = 0;
                    while (true) {
                        byte[] bArr2 = axrsVar.g;
                        if (i9 >= bArr2.length) {
                            break;
                        }
                        bArr2[i9] = (byte) (bArr2[i9] ^ axrsVar.f[i9 % 4]);
                        i9++;
                    }
                }
                if (axrsVar.d == axrr.Text) {
                    axrsVar.a = b(axrsVar.g);
                }
                return axrsVar.d == axrr.Close ? new axrq(axrsVar) : axrsVar;
            }
            throw new axrp(1002, "Fragmented control frame.");
        }
        StringBuilder sb2 = new StringBuilder(56);
        sb2.append("Received frame with reserved/unknown opcode ");
        sb2.append(i);
        sb2.append(".");
        throw new axrp(1002, sb2.toString());
    }

    public static String b(byte[] bArr) {
        return new String(bArr, c);
    }

    public static byte[] g(String str) {
        return str.getBytes(c);
    }

    private static void h(int i) {
        if (i < 0) {
            throw new EOFException();
        }
    }

    public final String c() {
        if (this.a == null) {
            try {
                this.a = b(this.g);
            } catch (CharacterCodingException e) {
                throw new RuntimeException("Undetected CharacterCodingException", e);
            }
        }
        return this.a;
    }

    public final void d(byte[] bArr) {
        this.g = bArr;
        this.h = bArr.length;
        this.a = null;
    }

    public final void e(byte[] bArr) {
        this.f = bArr;
    }

    public final boolean f() {
        return this.f != null;
    }

    public final String toString() {
        String sb;
        StringBuilder sb2 = new StringBuilder("WS[");
        sb2.append(this.d);
        sb2.append(", ");
        sb2.append(true != this.e ? "inter" : "fin");
        sb2.append(", ");
        sb2.append(true != f() ? "unmasked" : "masked");
        sb2.append(", ");
        if (this.g == null) {
            sb = "null";
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('[');
            sb3.append(this.g.length);
            sb3.append("b] ");
            if (this.d == axrr.Text) {
                String c2 = c();
                if (c2.length() > 100) {
                    sb3.append(c2.substring(0, 100));
                    sb3.append("...");
                } else {
                    sb3.append(c2);
                }
            } else {
                sb3.append("0x");
                for (int i = 0; i < Math.min(this.g.length, 50); i++) {
                    sb3.append(Integer.toHexString(this.g[i] & 255));
                }
                if (this.g.length > 50) {
                    sb3.append("...");
                }
            }
            sb = sb3.toString();
        }
        sb2.append(sb);
        sb2.append(']');
        return sb2.toString();
    }

    public axrs(axrr axrrVar, String str) {
        this(axrrVar, true);
        e(null);
        this.g = g(str);
        this.h = str.length();
        this.a = str;
    }

    public axrs(axrr axrrVar, byte[] bArr) {
        this(axrrVar, true);
        e(null);
        d(bArr);
    }

    public axrs(axrs axrsVar) {
        this.d = axrsVar.d;
        this.e = axrsVar.e;
        d(axrsVar.g);
        e(axrsVar.f);
    }
}

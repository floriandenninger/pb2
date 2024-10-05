package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayog {
    private static final Logger a = Logger.getLogger(ayog.class.getName());
    private static final byte[] b = "-bin".getBytes(amme.a);

    private ayog() {
    }

    public static byte[][] a(aycd aycdVar) {
        int length;
        byte[][] f = aybe.f(aycdVar);
        int i = 0;
        int i2 = 0;
        while (true) {
            length = f.length;
            if (i >= length) {
                break;
            }
            byte[] bArr = f[i];
            byte[] bArr2 = f[i + 1];
            if (!c(bArr, b)) {
                for (byte b2 : bArr2) {
                    if (b2 < 32 || b2 > 126) {
                        String str = new String(bArr, amme.a);
                        Logger logger = a;
                        Level level = Level.WARNING;
                        String arrays = Arrays.toString(bArr2);
                        StringBuilder sb = new StringBuilder(str.length() + 55 + String.valueOf(arrays).length());
                        sb.append("Metadata key=");
                        sb.append(str);
                        sb.append(", value=");
                        sb.append(arrays);
                        sb.append(" contains invalid ASCII characters");
                        logger.logp(level, "io.grpc.internal.TransportFrameUtil", "toHttp2Headers", sb.toString());
                        break;
                    }
                }
                f[i2] = bArr;
                f[i2 + 1] = bArr2;
            } else {
                f[i2] = bArr;
                f[i2 + 1] = aybe.b.i(bArr2).getBytes(amme.a);
            }
            i2 += 2;
            i += 2;
        }
        return i2 == length ? f : (byte[][]) Arrays.copyOfRange(f, 0, i2);
    }

    public static byte[][] b(byte[][] bArr) {
        int i = 0;
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            int i2 = i + 1;
            byte[] bArr3 = bArr[i2];
            if (c(bArr2, b)) {
                for (byte b2 : bArr3) {
                    if (b2 == 44) {
                        ArrayList arrayList = new ArrayList(bArr.length + 10);
                        for (int i3 = 0; i3 < i; i3++) {
                            arrayList.add(bArr[i3]);
                        }
                        while (i < bArr.length) {
                            byte[] bArr4 = bArr[i];
                            byte[] bArr5 = bArr[i + 1];
                            if (c(bArr4, b)) {
                                int i4 = 0;
                                int i5 = 0;
                                while (true) {
                                    int length = bArr5.length;
                                    if (i4 <= length) {
                                        if (i4 == length || bArr5[i4] == 44) {
                                            byte[] j = anbp.d.j(new String(bArr5, i5, i4 - i5, amme.a));
                                            arrayList.add(bArr4);
                                            arrayList.add(j);
                                            i5 = i4 + 1;
                                        }
                                        i4++;
                                    }
                                }
                            } else {
                                arrayList.add(bArr4);
                                arrayList.add(bArr5);
                            }
                            i += 2;
                        }
                        return (byte[][]) arrayList.toArray(new byte[0]);
                    }
                }
                bArr[i2] = anbp.d.j(new String(bArr3, amme.a));
            }
            i += 2;
        }
        return bArr;
    }

    private static boolean c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i = length; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i - length]) {
                return false;
            }
        }
        return true;
    }
}

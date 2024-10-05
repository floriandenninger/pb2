package defpackage;

import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class pse {
    public static volatile boolean c;

    public static amru b(plf plfVar, List list) {
        amrp f = amru.f();
        for (int i = 0; i < list.size(); i++) {
            Bundle bundle = (Bundle) list.get(i);
            c(bundle);
            f.h(plfVar.a(bundle));
        }
        return f.g();
    }

    public static Object c(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object d(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException();
    }

    public static void e(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void f(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void g(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void h(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    public static void i(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void j(Object obj, Object obj2) {
        if (obj == null) {
            throw new IllegalStateException((String) obj2);
        }
    }

    public static String k(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        int[] t = t(str2);
        if (t[0] != -1) {
            sb.append(str2);
            s(sb, t[1], t[2]);
            return sb.toString();
        }
        int[] t2 = t(str);
        if (t[3] == 0) {
            sb.append((CharSequence) str, 0, t2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (t[2] == 0) {
            sb.append((CharSequence) str, 0, t2[2]);
            sb.append(str2);
            return sb.toString();
        }
        if (t[1] != 0) {
            int i = t2[0] + 1;
            sb.append((CharSequence) str, 0, i);
            sb.append(str2);
            return s(sb, t[1] + i, i + t[2]);
        }
        if (str2.charAt(0) == '/') {
            sb.append((CharSequence) str, 0, t2[1]);
            sb.append(str2);
            int i2 = t2[1];
            return s(sb, i2, t[2] + i2);
        }
        int i3 = t2[0];
        int i4 = t2[1];
        if (i3 + 2 >= i4 || i4 != t2[2]) {
            int lastIndexOf = str.lastIndexOf(47, t2[2] - 1);
            int i5 = lastIndexOf == -1 ? t2[1] : lastIndexOf + 1;
            sb.append((CharSequence) str, 0, i5);
            sb.append(str2);
            return s(sb, t2[1], i5 + t[2]);
        }
        sb.append((CharSequence) str, 0, i4);
        sb.append('/');
        sb.append(str2);
        int i6 = t2[1];
        return s(sb, i6, t[2] + i6 + 1);
    }

    public static Object l(amnv amnvVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return amnvVar.get();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void m(List list, yxw yxwVar) {
        String str = (String) yxwVar.a();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(str);
    }

    public static puh n(int i, int i2, String str) {
        return new puh(i, i2, str);
    }

    public static int o(int i) {
        int[] iArr = {1, 2, 3, 4, 5};
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    public static boolean p(int[] iArr) {
        return iArr == null || iArr.length == 0;
    }

    public static long q(byte[] bArr) {
        int length = bArr.length;
        int i = 37;
        char c2 = 0;
        if (length <= 32) {
            if (length > 16) {
                long j = (length + length) - 7286425919675154353L;
                long w = w(bArr, 0) * (-5435081209227447693L);
                long w2 = w(bArr, 8);
                long w3 = w(bArr, length - 8) * j;
                return v(Long.rotateRight(w + w2, 43) + Long.rotateRight(w3, 30) + (w(bArr, length - 16) * (-7286425919675154353L)), w + Long.rotateRight(w2 - 7286425919675154353L, 18) + w3, j);
            }
            if (length >= 8) {
                long j2 = (length + length) - 7286425919675154353L;
                long w4 = w(bArr, 0) - 7286425919675154353L;
                long w5 = w(bArr, length - 8);
                return v((Long.rotateRight(w5, 37) * j2) + w4, (Long.rotateRight(w4, 25) + w5) * j2, j2);
            }
            if (length >= 4) {
                return v(length + ((u(bArr, 0) & 4294967295L) << 3), u(bArr, length - 4) & 4294967295L, (length + length) - 7286425919675154353L);
            }
            if (length > 0) {
                return (-7286425919675154353L) * x((((bArr[0] & 255) + ((bArr[length >> 1] & 255) << 8)) * (-7286425919675154353L)) ^ ((length + ((bArr[length - 1] & 255) << 2)) * (-4348849565147123417L)));
            }
            return -7286425919675154353L;
        }
        if (length <= 64) {
            long j3 = (length + length) - 7286425919675154353L;
            long w6 = w(bArr, 0) * (-7286425919675154353L);
            long w7 = w(bArr, 8);
            long w8 = w(bArr, length - 8) * j3;
            long rotateRight = Long.rotateRight(w6 + w7, 43) + Long.rotateRight(w8, 30) + (w(bArr, length - 16) * (-7286425919675154353L));
            long rotateRight2 = Long.rotateRight(w7 - 7286425919675154353L, 18);
            long w9 = w(bArr, 16) * j3;
            long w10 = w(bArr, 24);
            long w11 = (rotateRight + w(bArr, length - 32)) * j3;
            return v(Long.rotateRight(w9 + w10, 43) + Long.rotateRight(w11, 30) + ((v(rotateRight, rotateRight2 + w6 + w8, j3) + w(bArr, length - 24)) * j3), w9 + Long.rotateRight(w10 + w6, 18) + w11, j3);
        }
        long x = x(-7956866745689871395L) * (-7286425919675154353L);
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long w12 = w(bArr, 0) + 95310865018149119L;
        int i2 = length - 1;
        int i3 = (i2 >> 6) * 64;
        int i4 = i2 & 63;
        int i5 = (i3 + i4) - 63;
        long j4 = 2480279821605975764L;
        int i6 = 0;
        while (true) {
            long rotateRight3 = Long.rotateRight(w12 + j4 + jArr[c2] + w(bArr, i6 + 8), i);
            long rotateRight4 = Long.rotateRight(j4 + jArr[1] + w(bArr, i6 + 48), 42);
            long j5 = (rotateRight3 * (-5435081209227447693L)) ^ jArr2[1];
            long w13 = (rotateRight4 * (-5435081209227447693L)) + jArr[c2] + w(bArr, i6 + 40);
            long rotateRight5 = Long.rotateRight(x + jArr2[c2], 33) * (-5435081209227447693L);
            long j6 = jArr[1] * (-5435081209227447693L);
            long j7 = j5 + jArr2[c2];
            int i7 = i4;
            int i8 = i3;
            y(bArr, i6, j6, j7, jArr);
            y(bArr, i6 + 32, rotateRight5 + jArr2[1], w(bArr, i6 + 16) + w13, jArr2);
            int i9 = i6 + 64;
            if (i9 == i8) {
                long j8 = j5 & 255;
                long j9 = (-5435081209227447693L) + j8 + j8;
                long j10 = jArr2[0] + i7;
                long j11 = jArr[0] + j10;
                jArr[0] = j11;
                jArr2[0] = j10 + j11;
                long rotateRight6 = Long.rotateRight(rotateRight5 + w13 + j11 + w(bArr, i5 + 8), 37);
                long rotateRight7 = Long.rotateRight(w13 + jArr[1] + w(bArr, i5 + 48), 42);
                long j12 = (rotateRight6 * j9) ^ (jArr2[1] * 9);
                long w14 = (rotateRight7 * j9) + (jArr[0] * 9) + w(bArr, i5 + 40);
                long rotateRight8 = Long.rotateRight(j5 + jArr2[0], 33) * j9;
                y(bArr, i5, jArr[1] * j9, jArr2[0] + j12, jArr);
                y(bArr, i5 + 32, rotateRight8 + jArr2[1], w(bArr, i5 + 16) + w14, jArr2);
                return v(v(jArr[0], jArr2[0], j9) + (x(w14) * (-4348849565147123417L)) + j12, v(jArr[1], jArr2[1], j9) + rotateRight8, j9);
            }
            i6 = i9;
            i3 = i8;
            x = j5;
            w12 = rotateRight5;
            i4 = i7;
            c2 = 0;
            j4 = w13;
            i = 37;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Integer r(String str) {
        char c2;
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1118317585:
                if (str.equals("REPEAT_ALL_AND_SHUFFLE")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -962896020:
                if (str.equals("REPEAT_SINGLE")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1645938909:
                if (str.equals("REPEAT_ALL")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1645952171:
                if (str.equals("REPEAT_OFF")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            return 0;
        }
        if (c2 == 1) {
            return 1;
        }
        if (c2 != 2) {
            return c2 != 3 ? null : 3;
        }
        return 2;
    }

    private static String s(StringBuilder sb, int i, int i2) {
        int i3;
        int i4;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i5 = i;
        int i6 = i5;
        while (i5 <= i2) {
            if (i5 == i2) {
                i3 = i5;
            } else if (sb.charAt(i5) == '/') {
                i3 = i5 + 1;
            } else {
                i5++;
            }
            int i7 = i6 + 1;
            if (i5 != i7 || sb.charAt(i6) != '.') {
                if (i5 == i6 + 2 && sb.charAt(i6) == '.' && sb.charAt(i7) == '.') {
                    i4 = sb.lastIndexOf("/", i6 - 2) + 1;
                    int i8 = i4 > i ? i4 : i;
                    sb.delete(i8, i3);
                    i2 -= i3 - i8;
                } else {
                    i4 = i5 + 1;
                }
                i6 = i4;
            } else {
                sb.delete(i6, i3);
                i2 -= i3 - i6;
            }
            i5 = i6;
        }
        return sb.toString();
    }

    private static int[] t(String str) {
        int i;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i2 = indexOf4 + 2;
        if (i2 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i2) == '/') {
            i = str.indexOf(47, indexOf4 + 3);
            if (i == -1 || i > indexOf2) {
                i = indexOf2;
            }
        } else {
            i = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    private static int u(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private static long v(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    private static long w(byte[] bArr, int i) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, 8);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getLong();
    }

    private static long x(long j) {
        return j ^ (j >>> 47);
    }

    private static void y(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long w = w(bArr, i);
        long w2 = w(bArr, i + 8);
        long w3 = w(bArr, i + 16);
        long w4 = w(bArr, i + 24);
        long j3 = j + w;
        long rotateRight = Long.rotateRight(j2 + j3 + w4, 21);
        long j4 = w2 + j3 + w3;
        long rotateRight2 = Long.rotateRight(j4, 44);
        jArr[0] = j4 + w4;
        jArr[1] = rotateRight + rotateRight2 + j3;
    }

    public void a(pum pumVar) {
        throw null;
    }
}

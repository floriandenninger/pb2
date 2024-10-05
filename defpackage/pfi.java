package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pfi {
    public pcn L;
    public int M;
    public String a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public byte[] f;
    public byte[] g;
    public byte[] h;
    public int i = -1;
    public int j = -1;
    public int k = -1;
    public int l = -1;
    public int m = 0;
    public byte[] n = null;
    public int o = -1;
    public boolean p = false;
    public int q = -1;
    public int r = -1;
    public int s = -1;
    public int t = 1000;
    public int u = 200;
    public float v = -1.0f;
    public float w = -1.0f;
    public float x = -1.0f;
    public float y = -1.0f;
    public float z = -1.0f;
    public float A = -1.0f;
    public float B = -1.0f;
    public float C = -1.0f;
    public float D = -1.0f;
    public float E = -1.0f;
    public int F = 1;
    public int G = -1;
    public int H = 8000;
    public long I = 0;

    /* renamed from: J, reason: collision with root package name */
    public long f264J = 0;
    public String K = "eng";

    public static Pair a(pgx pgxVar) {
        try {
            pgxVar.z(4);
            int h = (pgxVar.h() & 3) + 1;
            if (h == 3) {
                throw new oyo();
            }
            ArrayList arrayList = new ArrayList();
            int h2 = pgxVar.h() & 31;
            for (int i = 0; i < h2; i++) {
                arrayList.add(pgv.e(pgxVar));
            }
            int h3 = pgxVar.h();
            for (int i2 = 0; i2 < h3; i2++) {
                arrayList.add(pgv.e(pgxVar));
            }
            return Pair.create(arrayList, Integer.valueOf(h));
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new oyo("Error parsing AVC codec private");
        }
    }

    public static Pair b(pgx pgxVar) {
        try {
            pgxVar.z(21);
            int h = pgxVar.h() & 3;
            int h2 = pgxVar.h();
            int i = pgxVar.b;
            int i2 = 0;
            for (int i3 = 0; i3 < h2; i3++) {
                pgxVar.A(1);
                int k = pgxVar.k();
                for (int i4 = 0; i4 < k; i4++) {
                    int k2 = pgxVar.k();
                    i2 += k2 + 4;
                    pgxVar.A(k2);
                }
            }
            pgxVar.z(i);
            byte[] bArr = new byte[i2];
            int i5 = 0;
            for (int i6 = 0; i6 < h2; i6++) {
                pgxVar.A(1);
                int k3 = pgxVar.k();
                for (int i7 = 0; i7 < k3; i7++) {
                    int k4 = pgxVar.k();
                    System.arraycopy(pgv.a, 0, bArr, i5, 4);
                    int i8 = i5 + 4;
                    System.arraycopy(pgxVar.a, pgxVar.b, bArr, i8, k4);
                    i5 = i8 + k4;
                    pgxVar.A(k4);
                }
            }
            return Pair.create(i2 == 0 ? null : Collections.singletonList(bArr), Integer.valueOf(h + 1));
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new oyo("Error parsing HEVC codec private");
        }
    }

    public static List c(pgx pgxVar) {
        try {
            pgxVar.A(16);
            long l = pgxVar.l();
            if (l != 826496599) {
                StringBuilder sb = new StringBuilder(57);
                sb.append("Unsupported FourCC compression type: ");
                sb.append(l);
                throw new oyo(sb.toString());
            }
            int i = pgxVar.b + 20;
            byte[] bArr = pgxVar.a;
            while (true) {
                int length = bArr.length;
                if (i < length - 4) {
                    if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 1 && bArr[i + 3] == 15) {
                        return Collections.singletonList(Arrays.copyOfRange(bArr, i, length));
                    }
                    i++;
                } else {
                    throw new oyo("Failed to find FourCC VC1 initialization data");
                }
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new oyo("Error parsing FourCC VC1 codec private");
        }
    }

    public static List d(byte[] bArr) {
        int i;
        int i2;
        try {
            if (bArr[0] == 2) {
                int i3 = 1;
                int i4 = 0;
                while (true) {
                    i = bArr[i3];
                    if (i != -1) {
                        break;
                    }
                    i4 += PrivateKeyType.INVALID;
                    i3++;
                }
                int i5 = i3 + 1;
                int i6 = i4 + i;
                int i7 = 0;
                while (true) {
                    i2 = bArr[i5];
                    if (i2 != -1) {
                        break;
                    }
                    i7 += PrivateKeyType.INVALID;
                    i5++;
                }
                int i8 = i5 + 1;
                int i9 = i7 + i2;
                if (bArr[i8] != 1) {
                    throw new oyo("Error parsing vorbis codec private");
                }
                byte[] bArr2 = new byte[i6];
                System.arraycopy(bArr, i8, bArr2, 0, i6);
                int i10 = i8 + i6;
                if (bArr[i10] != 3) {
                    throw new oyo("Error parsing vorbis codec private");
                }
                int i11 = i10 + i9;
                if (bArr[i11] != 5) {
                    throw new oyo("Error parsing vorbis codec private");
                }
                int length = bArr.length - i11;
                byte[] bArr3 = new byte[length];
                System.arraycopy(bArr, i11, bArr3, 0, length);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            }
            throw new oyo("Error parsing vorbis codec private");
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new oyo("Error parsing vorbis codec private");
        }
    }

    public static boolean e(pgx pgxVar) {
        try {
            int f = pgxVar.f();
            if (f == 1) {
                return true;
            }
            if (f == 65534) {
                pgxVar.z(24);
                if (pgxVar.m() == pfj.a.getMostSignificantBits()) {
                    if (pgxVar.m() == pfj.a.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new oyo("Error parsing MS/ACM codec private");
        }
    }
}

package defpackage;

import android.util.Log;
import android.util.Pair;
import androidx.media3.common.DrmInitData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pja {
    public pjb R;
    public boolean S;
    public bjc V;
    public int W;
    public String a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public byte[] h;
    public bjb i;
    public byte[] j;
    public DrmInitData k;
    public int l = -1;
    public int m = -1;
    public int n = -1;
    public int o = -1;
    public int p = 0;
    public int q = -1;
    public float r = 0.0f;
    public float s = 0.0f;
    public float t = 0.0f;
    public byte[] u = null;
    public int v = -1;
    public boolean w = false;
    public int x = -1;
    public int y = -1;
    public int z = -1;
    public int A = 1000;
    public int B = 200;
    public float C = -1.0f;
    public float D = -1.0f;
    public float E = -1.0f;
    public float F = -1.0f;
    public float G = -1.0f;
    public float H = -1.0f;
    public float I = -1.0f;

    /* renamed from: J, reason: collision with root package name */
    public float f266J = -1.0f;
    public float K = -1.0f;
    public float L = -1.0f;
    public int M = 1;
    public int N = -1;
    public int O = 8000;
    public long P = 0;
    public long Q = 0;
    public boolean T = true;
    public String U = "eng";

    public static Pair a(pth pthVar) {
        try {
            pthVar.H(16);
            long n = pthVar.n();
            if (n == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (n == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (n != 826496599) {
                Log.w("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int i = pthVar.b + 20;
            byte[] bArr = pthVar.a;
            while (true) {
                int length = bArr.length;
                if (i < length - 4) {
                    if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 1 && bArr[i + 3] == 15) {
                        return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr, i, length)));
                    }
                    i++;
                } else {
                    throw pnr.a("Failed to find FourCC VC1 initialization data", null);
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw pnr.a("Error parsing FourCC private data", e);
        }
    }

    public static List b(byte[] bArr) {
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
                    throw pnr.a("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i6];
                System.arraycopy(bArr, i8, bArr2, 0, i6);
                int i10 = i8 + i6;
                if (bArr[i10] != 3) {
                    throw pnr.a("Error parsing vorbis codec private", null);
                }
                int i11 = i10 + i9;
                if (bArr[i11] != 5) {
                    throw pnr.a("Error parsing vorbis codec private", null);
                }
                int length = bArr.length - i11;
                byte[] bArr3 = new byte[length];
                System.arraycopy(bArr, i11, bArr3, 0, length);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            }
            throw pnr.a("Error parsing vorbis codec private", null);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw pnr.a("Error parsing vorbis codec private", e);
        }
    }

    public static boolean d(pth pthVar) {
        try {
            int g = pthVar.g();
            if (g == 1) {
                return true;
            }
            if (g == 65534) {
                pthVar.G(24);
                if (pthVar.o() == pjc.b.getMostSignificantBits()) {
                    if (pthVar.o() == pjc.b.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw pnr.a("Error parsing MS/ACM codec private", e);
        }
    }

    public final void c() {
        pjb pjbVar = this.R;
        if (pjbVar != null) {
            pjbVar.a(this);
        }
    }
}

package defpackage;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahit implements Runnable {
    final /* synthetic */ ahiw a;

    public ahit(ahiw ahiwVar) {
        this.a = ahiwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr;
        int i;
        ahit ahitVar = this;
        ahiw ahiwVar = ahitVar.a;
        if (!ahiwVar.b.isEmpty()) {
            ArrayList arrayList = new ArrayList(ahiwVar.b);
            ahiwVar.b.clear();
            double d = ahiwVar.c;
            Double.isNaN(d);
            double d2 = d / 1000.0d;
            double d3 = ahiwVar.d;
            Double.isNaN(d3);
            double d4 = d3 / 1000.0d;
            ahiwVar.c = -1L;
            ahiwVar.d = 0L;
            ahiwVar.l = -1L;
            ahiwVar.e = null;
            byte b = 0;
            if (arrayList.size() != 0) {
                int length = ((byte[]) arrayList.get(0)).length;
                byte[] bArr2 = new byte[length];
                for (int i2 = 0; i2 < length; i2++) {
                    bArr2[i2] = ((byte[]) arrayList.get(0))[i2];
                }
                for (int i3 = 1; i3 < arrayList.size(); i3++) {
                    for (int i4 = 0; i4 < length; i4++) {
                        byte b2 = ((byte[]) arrayList.get(i3))[i4];
                        byte[] bArr3 = (byte[]) arrayList.get(i3);
                        bArr3[i4] = (byte) (bArr3[i4] - bArr2[i4]);
                        bArr2[i4] = b2;
                    }
                }
            }
            if (arrayList.size() == 0) {
                bArr = new byte[0];
            } else {
                int length2 = ((byte[]) arrayList.get(0)).length;
                byte[] bArr4 = new byte[arrayList.size() * length2];
                for (int i5 = 0; i5 < length2; i5++) {
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        bArr4[(arrayList.size() * i5) + i6] = ((byte[]) arrayList.get(i6))[i5];
                    }
                }
                bArr = bArr4;
            }
            int length3 = bArr.length;
            byte[] bArr5 = new byte[length3 + length3 + 3];
            bArr5[0] = 0;
            bArr5[1] = (byte) (length3 >> 8);
            bArr5[2] = (byte) length3;
            byte[] bArr6 = new byte[256];
            byte[] bArr7 = new byte[256];
            int[] iArr = new int[256];
            int i7 = 0;
            for (int i8 = 256; i7 < i8; i8 = 256) {
                byte b3 = (byte) i7;
                bArr6[i7] = b3;
                bArr7[i7] = b3;
                iArr[i7] = 0;
                i7++;
            }
            int i9 = 3;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length3) {
                byte b4 = bArr[i10];
                byte[] bArr8 = bArr;
                byte a = ahiw.a(bArr6, b4);
                int i12 = b & 255;
                int i13 = length3;
                int i14 = b4 & 255;
                int i15 = i9;
                if (bArr7[i12] == b4) {
                    iArr[i12] = iArr[i12] + 4;
                    i = 1;
                } else {
                    i = 1;
                    int i16 = iArr[i12] >> 1;
                    iArr[i12] = i16;
                    if (i16 == 0) {
                        bArr7[i12] = b4;
                        iArr[i12] = 1;
                    }
                }
                if (iArr[i14] > i) {
                    ahiw.a(bArr6, bArr7[i14]);
                }
                if (a == 0) {
                    i11++;
                    i9 = i15;
                } else {
                    int i17 = i15;
                    while (i11 > 0) {
                        int i18 = i11 - 1;
                        int i19 = i17 + 1;
                        bArr5[i17] = i18 % 2 == 0 ? (byte) 0 : (byte) -2;
                        i11 = i18 >> 1;
                        i17 = i19;
                    }
                    if (a != -1) {
                        if (a == -2) {
                            a = -2;
                        }
                        bArr5[i17] = a;
                        i9 = i17 + 1;
                    }
                    bArr5[i17] = -1;
                    i17++;
                    bArr5[i17] = a;
                    i9 = i17 + 1;
                }
                i10++;
                b = b4;
                bArr = bArr8;
                length3 = i13;
            }
            while (i11 > 0) {
                int i20 = i11 - 1;
                int i21 = i9 + 1;
                bArr5[i9] = i20 % 2 == 0 ? (byte) 0 : (byte) -2;
                i11 = i20 >> 1;
                i9 = i21;
            }
            ahiwVar.m.post(new ahiv(ahiwVar, d2, d4, Base64.encodeToString(Arrays.copyOf(bArr5, i9), 10)));
            ahitVar = this;
        }
        if (!ahitVar.a.i) {
            ahitVar.a.c(30000L);
        } else {
            ahitVar.a.quit();
        }
    }
}

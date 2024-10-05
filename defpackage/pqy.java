package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pqy extends ppu {
    private final pth a;
    private final pth b;
    private final pqx c;
    private Inflater d;

    public pqy() {
        super("PgsDecoder");
        this.a = new pth();
        this.b = new pth();
        this.c = new pqx();
    }

    @Override // defpackage.ppu
    protected final ppw q(byte[] bArr, int i, boolean z) {
        ArrayList arrayList;
        ppp pppVar;
        pth pthVar;
        int i2;
        int i3;
        int k;
        pqy pqyVar = this;
        pqyVar.a.E(bArr, i);
        pth pthVar2 = pqyVar.a;
        if (pthVar2.a() > 0 && pthVar2.c() == 120) {
            if (pqyVar.d == null) {
                pqyVar.d = new Inflater();
            }
            if (pts.S(pthVar2, pqyVar.b, pqyVar.d)) {
                pth pthVar3 = pqyVar.b;
                pthVar2.E(pthVar3.a, pthVar3.c);
            }
        }
        pqyVar.c.a();
        ArrayList arrayList2 = new ArrayList();
        while (pqyVar.a.a() >= 3) {
            pth pthVar4 = pqyVar.a;
            pqx pqxVar = pqyVar.c;
            int i4 = pthVar4.c;
            int i5 = pthVar4.i();
            int m = pthVar4.m();
            int i6 = pthVar4.b + m;
            if (i6 > i4) {
                pthVar4.G(i4);
                arrayList = arrayList2;
                pppVar = null;
            } else {
                if (i5 == 128) {
                    arrayList = arrayList2;
                    if (pqxVar.d == 0 || pqxVar.e == 0 || pqxVar.h == 0 || pqxVar.i == 0 || (i2 = (pthVar = pqxVar.a).c) == 0 || pthVar.b != i2 || !pqxVar.c) {
                        pppVar = null;
                    } else {
                        pthVar.G(0);
                        int i7 = pqxVar.h * pqxVar.i;
                        int[] iArr = new int[i7];
                        int i8 = 0;
                        while (i8 < i7) {
                            int i9 = pqxVar.a.i();
                            if (i9 != 0) {
                                i3 = i8 + 1;
                                iArr[i8] = pqxVar.b[i9];
                            } else {
                                int i10 = pqxVar.a.i();
                                if (i10 != 0) {
                                    i3 = ((i10 & 64) == 0 ? i10 & 63 : ((i10 & 63) << 8) | pqxVar.a.i()) + i8;
                                    Arrays.fill(iArr, i8, i3, (i10 & 128) == 0 ? 0 : pqxVar.b[pqxVar.a.i()]);
                                }
                            }
                            i8 = i3;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr, pqxVar.h, pqxVar.i, Bitmap.Config.ARGB_8888);
                        ppo ppoVar = new ppo();
                        ppoVar.b = createBitmap;
                        ppoVar.f = pqxVar.f / pqxVar.d;
                        ppoVar.g = 0;
                        ppoVar.b(pqxVar.g / pqxVar.e, 0);
                        ppoVar.e = 0;
                        ppoVar.h = pqxVar.h / pqxVar.d;
                        ppoVar.i = pqxVar.i / pqxVar.e;
                        pppVar = ppoVar.a();
                    }
                    pqxVar.a();
                } else {
                    switch (i5) {
                        case 20:
                            if (m % 5 == 2) {
                                pthVar4.H(2);
                                Arrays.fill(pqxVar.b, 0);
                                int i11 = 0;
                                for (int i12 = m / 5; i11 < i12; i12 = i12) {
                                    int i13 = pthVar4.i();
                                    int i14 = pthVar4.i();
                                    int i15 = pthVar4.i();
                                    int i16 = pthVar4.i();
                                    int i17 = pthVar4.i();
                                    double d = i14;
                                    double d2 = i15 - 128;
                                    double d3 = i16 - 128;
                                    int[] iArr2 = pqxVar.b;
                                    Double.isNaN(d2);
                                    Double.isNaN(d);
                                    int c = pts.c((int) (d + (1.402d * d2)), 0, PrivateKeyType.INVALID) << 16;
                                    Double.isNaN(d3);
                                    Double.isNaN(d);
                                    Double.isNaN(d2);
                                    int c2 = c | (i17 << 24) | (pts.c((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, PrivateKeyType.INVALID) << 8);
                                    Double.isNaN(d3);
                                    Double.isNaN(d);
                                    iArr2[i13] = c2 | pts.c((int) (d + (d3 * 1.772d)), 0, PrivateKeyType.INVALID);
                                    i11++;
                                    arrayList2 = arrayList2;
                                }
                                arrayList = arrayList2;
                                pqxVar.c = true;
                                break;
                            }
                            break;
                        case 21:
                            if (m >= 4) {
                                pthVar4.H(3);
                                int i18 = m - 4;
                                if ((pthVar4.i() & 128) != 0) {
                                    if (i18 >= 7 && (k = pthVar4.k()) >= 4) {
                                        pqxVar.h = pthVar4.m();
                                        pqxVar.i = pthVar4.m();
                                        pqxVar.a.C(k - 4);
                                        i18 -= 7;
                                    }
                                }
                                pth pthVar5 = pqxVar.a;
                                int i19 = pthVar5.b;
                                int i20 = pthVar5.c;
                                if (i19 < i20 && i18 > 0) {
                                    int min = Math.min(i18, i20 - i19);
                                    pthVar4.B(pqxVar.a.a, i19, min);
                                    pqxVar.a.G(i19 + min);
                                    break;
                                }
                            }
                            break;
                        case 22:
                            if (m >= 19) {
                                pqxVar.d = pthVar4.m();
                                pqxVar.e = pthVar4.m();
                                pthVar4.H(11);
                                pqxVar.f = pthVar4.m();
                                pqxVar.g = pthVar4.m();
                                break;
                            }
                            break;
                    }
                    arrayList = arrayList2;
                    pppVar = null;
                }
                pthVar4.G(i6);
            }
            if (pppVar != null) {
                ArrayList arrayList3 = arrayList;
                arrayList3.add(pppVar);
                arrayList2 = arrayList3;
                pqyVar = this;
            } else {
                pqyVar = this;
                arrayList2 = arrayList;
            }
        }
        return new pqw(Collections.unmodifiableList(arrayList2), 2);
    }
}

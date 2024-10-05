package defpackage;

import android.util.Pair;
import com.google.android.exoplayer.MediaFormat;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pek extends pei {
    private static final double[] a = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private boolean c;
    private long d;
    private final boolean[] e;
    private final pej f;
    private boolean g;
    private long h;
    private long i;
    private boolean j;
    private boolean k;
    private long l;
    private long m;

    public pek(pcn pcnVar) {
        super(pcnVar);
        this.e = new boolean[4];
        this.f = new pej();
    }

    @Override // defpackage.pei
    public final void a(pgx pgxVar) {
        byte[] bArr;
        int i;
        boolean z;
        float f;
        int i2;
        float f2;
        int i3;
        if (pgxVar.a() > 0) {
            int i4 = pgxVar.b;
            int i5 = pgxVar.c;
            byte[] bArr2 = pgxVar.a;
            this.h += pgxVar.a();
            this.b.f(pgxVar, pgxVar.a());
            int i6 = i4;
            while (true) {
                int a2 = pgv.a(bArr2, i4, i5, this.e);
                if (a2 == i5) {
                    break;
                }
                int i7 = a2 + 3;
                int i8 = pgxVar.a[i7] & 255;
                if (this.c) {
                    bArr = bArr2;
                } else {
                    int i9 = a2 - i6;
                    if (i9 > 0) {
                        this.f.a(bArr2, i6, a2);
                    }
                    int i10 = i9 < 0 ? -i9 : 0;
                    pej pejVar = this.f;
                    if (!pejVar.a) {
                        bArr = bArr2;
                        if (i8 == 179) {
                            pejVar.a = true;
                            i8 = 179;
                        }
                    } else if (pejVar.c == 0 && i8 == 181) {
                        pejVar.c = pejVar.b;
                        bArr = bArr2;
                        i8 = 181;
                    } else {
                        int i11 = pejVar.b - i10;
                        pejVar.b = i11;
                        pejVar.a = false;
                        byte[] copyOf = Arrays.copyOf(pejVar.d, i11);
                        byte b = copyOf[4];
                        int i12 = copyOf[5] & 255;
                        int i13 = ((b & 255) << 4) | (i12 >> 4);
                        int i14 = ((i12 & 15) << 8) | (copyOf[6] & 255);
                        int i15 = (copyOf[7] & 240) >> 4;
                        if (i15 == 2) {
                            f = i14 * 4;
                            i2 = i13 * 3;
                        } else if (i15 == 3) {
                            f = i14 * 16;
                            i2 = i13 * 9;
                        } else if (i15 != 4) {
                            f2 = 1.0f;
                            MediaFormat k = MediaFormat.k("video/mpeg2", -1L, i13, i14, Collections.singletonList(copyOf), f2);
                            i3 = (copyOf[7] & 15) - 1;
                            long j = 0;
                            if (i3 >= 0 || i3 >= 8) {
                                bArr = bArr2;
                            } else {
                                double d = a[i3];
                                byte b2 = copyOf[pejVar.c + 9];
                                int i16 = (b2 & 96) >> 5;
                                int i17 = b2 & 31;
                                if (i16 != i17) {
                                    double d2 = i16;
                                    Double.isNaN(d2);
                                    bArr = bArr2;
                                    double d3 = i17 + 1;
                                    Double.isNaN(d3);
                                    d *= (d2 + 1.0d) / d3;
                                } else {
                                    bArr = bArr2;
                                }
                                j = (long) (1000000.0d / d);
                            }
                            Pair create = Pair.create(k, Long.valueOf(j));
                            this.b.d((MediaFormat) create.first);
                            this.d = ((Long) create.second).longValue();
                            this.c = true;
                        } else {
                            f = i14 * 121;
                            i2 = i13 * 100;
                        }
                        f2 = f / i2;
                        MediaFormat k2 = MediaFormat.k("video/mpeg2", -1L, i13, i14, Collections.singletonList(copyOf), f2);
                        i3 = (copyOf[7] & 15) - 1;
                        long j2 = 0;
                        if (i3 >= 0) {
                        }
                        bArr = bArr2;
                        Pair create2 = Pair.create(k2, Long.valueOf(j2));
                        this.b.d((MediaFormat) create2.first);
                        this.d = ((Long) create2.second).longValue();
                        this.c = true;
                    }
                }
                if (this.c) {
                    if (i8 != 184) {
                        if (i8 == 0) {
                            i8 = 0;
                        }
                    }
                    int i18 = i5 - a2;
                    if (this.g) {
                        i = i18;
                        this.b.g(this.m, this.k ? 1 : 0, ((int) (this.h - this.l)) - i, i, null);
                        z = false;
                        this.k = false;
                    } else {
                        i = i18;
                        z = false;
                    }
                    if (i8 == 184) {
                        this.g = z;
                        this.k = true;
                    } else {
                        this.m = this.j ? this.i : this.m + this.d;
                        this.l = this.h - i;
                        this.j = false;
                        this.g = true;
                    }
                }
                i6 = a2;
                i4 = i7;
                bArr2 = bArr;
            }
            if (this.c) {
                return;
            }
            this.f.a(bArr2, i6, i5);
        }
    }

    @Override // defpackage.pei
    public final void b() {
    }

    @Override // defpackage.pei
    public final void c(long j, boolean z) {
        boolean z2 = j != -1;
        this.j = z2;
        if (z2) {
            this.i = j;
        }
    }

    @Override // defpackage.pei
    public final void d() {
        pgv.d(this.e);
        pej pejVar = this.f;
        pejVar.a = false;
        pejVar.b = 0;
        pejVar.c = 0;
        this.j = false;
        this.g = false;
        this.h = 0L;
    }
}

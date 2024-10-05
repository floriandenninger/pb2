package defpackage;

import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer.MediaFormat;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class peg extends pei {
    private static final byte[] c = {73, 68, 51};
    public long a;
    private final pgw d;
    private final pgx e;
    private final pcn f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private long l;
    private int m;
    private pcn n;
    private long o;

    public peg(pcn pcnVar, pcn pcnVar2) {
        super(pcnVar);
        this.f = pcnVar2;
        pcnVar2.d(MediaFormat.d());
        this.d = new pgw(new byte[7]);
        this.e = new pgx(Arrays.copyOf(c, 10));
        e();
    }

    private final void f(pcn pcnVar, long j, int i, int i2) {
        this.g = 3;
        this.h = i;
        this.n = pcnVar;
        this.o = j;
        this.m = i2;
    }

    private final boolean g(pgx pgxVar, byte[] bArr, int i) {
        int min = Math.min(pgxVar.a(), i - this.h);
        pgxVar.u(bArr, this.h, min);
        int i2 = this.h + min;
        this.h = i2;
        return i2 == i;
    }

    @Override // defpackage.pei
    public final void b() {
    }

    @Override // defpackage.pei
    public final void c(long j, boolean z) {
        this.a = j;
    }

    @Override // defpackage.pei
    public final void d() {
        e();
    }

    public final void e() {
        this.g = 0;
        this.h = 0;
        this.i = 256;
    }

    @Override // defpackage.pei
    public final void a(pgx pgxVar) {
        int i;
        while (pgxVar.a() > 0) {
            int i2 = this.g;
            if (i2 == 0) {
                byte[] bArr = pgxVar.a;
                int i3 = pgxVar.b;
                int i4 = pgxVar.c;
                while (true) {
                    if (i3 < i4) {
                        int i5 = i3 + 1;
                        int i6 = bArr[i3] & 255;
                        int i7 = this.i;
                        if (i7 == 512) {
                            if (i6 < 240 || i6 == 255) {
                                i7 = 512;
                            } else {
                                this.j = 1 == ((i6 & 1) ^ 1);
                                this.g = 2;
                                this.h = 0;
                                pgxVar.z(i5);
                            }
                        }
                        int i8 = i6 | i7;
                        if (i8 != 329) {
                            if (i8 == 511) {
                                this.i = 512;
                            } else if (i8 == 836) {
                                i = 1024;
                            } else {
                                if (i8 == 1075) {
                                    this.g = 1;
                                    this.h = 3;
                                    this.m = 0;
                                    this.e.z(0);
                                    pgxVar.z(i5);
                                    break;
                                }
                                if (i7 != 256) {
                                    this.i = 256;
                                    i3 = i5 - 1;
                                }
                            }
                            i3 = i5;
                        } else {
                            i = 768;
                        }
                        this.i = i;
                        i3 = i5;
                    } else {
                        pgxVar.z(i3);
                        break;
                    }
                }
            } else if (i2 != 1) {
                if (i2 != 2) {
                    int min = Math.min(pgxVar.a(), this.m - this.h);
                    this.n.f(pgxVar, min);
                    int i9 = this.h + min;
                    this.h = i9;
                    int i10 = this.m;
                    if (i9 == i10) {
                        this.n.g(this.a, 1, i10, 0, null);
                        this.a += this.o;
                        e();
                    }
                } else {
                    if (g(pgxVar, this.d.a, true != this.j ? 5 : 7)) {
                        this.d.d(0);
                        if (!this.k) {
                            int a = this.d.a(2) + 1;
                            if (a != 2) {
                                StringBuilder sb = new StringBuilder(61);
                                sb.append("Detected audio object type: ");
                                sb.append(a);
                                sb.append(", but assuming AAC LC.");
                                Log.w("AdtsReader", sb.toString());
                            }
                            int a2 = this.d.a(4);
                            this.d.e(1);
                            int a3 = this.d.a(3);
                            byte[] bArr2 = pgj.a;
                            byte[] bArr3 = {(byte) (((a2 >> 1) & 7) | 16), (byte) (((a2 << 7) & 128) | ((a3 << 3) & 120))};
                            Pair a4 = pgj.a(bArr3);
                            MediaFormat b = MediaFormat.b(null, "audio/mp4a-latm", -1, -1, -1L, ((Integer) a4.second).intValue(), ((Integer) a4.first).intValue(), Collections.singletonList(bArr3), null);
                            this.l = 1024000000 / b.r;
                            this.b.d(b);
                            this.k = true;
                        } else {
                            this.d.e(10);
                        }
                        this.d.e(4);
                        int a5 = this.d.a(13) - 7;
                        if (this.j) {
                            a5 -= 2;
                        }
                        f(this.b, this.l, 0, a5);
                    }
                }
            } else if (g(pgxVar, this.e.a, 10)) {
                this.f.f(this.e, 10);
                this.e.z(6);
                f(this.f, 0L, 10, 10 + this.e.g());
            }
        }
    }
}

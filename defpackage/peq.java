package defpackage;

import com.google.android.exoplayer.MediaFormat;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class peq extends pei {
    private final pgx a;
    private final pgt c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;
    private long h;
    private int i;
    private long j;

    public peq(pcn pcnVar) {
        super(pcnVar);
        this.d = 0;
        pgx pgxVar = new pgx(4);
        this.a = pgxVar;
        pgxVar.a[0] = -1;
        this.c = new pgt();
    }

    @Override // defpackage.pei
    public final void b() {
    }

    @Override // defpackage.pei
    public final void c(long j, boolean z) {
        this.j = j;
    }

    @Override // defpackage.pei
    public final void d() {
        this.d = 0;
        this.e = 0;
        this.g = false;
    }

    @Override // defpackage.pei
    public final void a(pgx pgxVar) {
        while (pgxVar.a() > 0) {
            int i = this.d;
            if (i == 0) {
                byte[] bArr = pgxVar.a;
                int i2 = pgxVar.b;
                int i3 = pgxVar.c;
                while (true) {
                    if (i2 < i3) {
                        byte b = bArr[i2];
                        boolean z = (b & 255) == 255;
                        boolean z2 = this.g && (b & 224) == 224;
                        this.g = z;
                        if (z2) {
                            pgxVar.z(i2 + 1);
                            this.g = false;
                            this.a.a[1] = bArr[i2];
                            this.e = 2;
                            this.d = 1;
                            break;
                        }
                        i2++;
                    } else {
                        pgxVar.z(i3);
                        break;
                    }
                }
            } else if (i == 1) {
                int min = Math.min(pgxVar.a(), 4 - this.e);
                pgxVar.u(this.a.a, this.e, min);
                int i4 = this.e + min;
                this.e = i4;
                if (i4 >= 4) {
                    this.a.z(0);
                    if (pgt.b(this.a.c(), this.c)) {
                        pgt pgtVar = this.c;
                        this.i = pgtVar.c;
                        if (!this.f) {
                            int i5 = pgtVar.g;
                            int i6 = pgtVar.d;
                            this.h = (i5 * 1000000) / i6;
                            this.b.d(MediaFormat.b(null, pgtVar.b, -1, 4096, -1L, pgtVar.e, i6, null, null));
                            this.f = true;
                        }
                        this.a.z(0);
                        this.b.f(this.a, 4);
                        this.d = 2;
                    } else {
                        this.e = 0;
                        this.d = 1;
                    }
                }
            } else {
                int min2 = Math.min(pgxVar.a(), this.i - this.e);
                this.b.f(pgxVar, min2);
                int i7 = this.e + min2;
                this.e = i7;
                int i8 = this.i;
                if (i7 >= i8) {
                    this.b.g(this.j, 1, i8, 0, null);
                    this.j += this.h;
                    this.e = 0;
                    this.d = 0;
                }
            }
        }
    }
}

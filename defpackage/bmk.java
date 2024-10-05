package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bmk implements bly {
    private final pth a;
    private final biv b;
    private final String c;
    private bjc d;
    private String e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private long j;
    private int k;
    private long l;

    public bmk() {
        this(null);
    }

    @Override // defpackage.bly
    public final void a(pth pthVar) {
        pse.d(this.d);
        while (pthVar.a() > 0) {
            int i = this.f;
            if (i == 0) {
                byte[] bArr = pthVar.a;
                int i2 = pthVar.b;
                int i3 = pthVar.c;
                while (true) {
                    if (i2 < i3) {
                        byte b = bArr[i2];
                        boolean z = (b & 255) == 255;
                        boolean z2 = this.i && (b & 224) == 224;
                        this.i = z;
                        if (z2) {
                            pthVar.G(i2 + 1);
                            this.i = false;
                            this.a.a[1] = bArr[i2];
                            this.g = 2;
                            this.f = 1;
                            break;
                        }
                        i2++;
                    } else {
                        pthVar.G(i3);
                        break;
                    }
                }
            } else if (i == 1) {
                int min = Math.min(pthVar.a(), 4 - this.g);
                pthVar.B(this.a.a, this.g, min);
                int i4 = this.g + min;
                this.g = i4;
                if (i4 >= 4) {
                    this.a.G(0);
                    if (this.b.a(this.a.d())) {
                        this.k = this.b.c;
                        if (!this.h) {
                            this.j = (r0.g * 1000000) / r0.d;
                            pmr pmrVar = new pmr();
                            pmrVar.a = this.e;
                            biv bivVar = this.b;
                            pmrVar.k = bivVar.b;
                            pmrVar.l = 4096;
                            pmrVar.x = bivVar.e;
                            pmrVar.y = bivVar.d;
                            pmrVar.c = this.c;
                            this.d.rp(pmrVar.a());
                            this.h = true;
                        }
                        this.a.G(0);
                        this.d.t(this.a, 4);
                        this.f = 2;
                    } else {
                        this.g = 0;
                        this.f = 1;
                    }
                }
            } else {
                int min2 = Math.min(pthVar.a(), this.k - this.g);
                this.d.t(pthVar, min2);
                int i5 = this.g + min2;
                this.g = i5;
                int i6 = this.k;
                if (i5 >= i6) {
                    long j = this.l;
                    if (j != -9223372036854775807L) {
                        this.d.v(j, 1, i6, 0, null);
                        this.l += this.j;
                    }
                    this.g = 0;
                    this.f = 0;
                }
            }
        }
    }

    @Override // defpackage.bly
    public final void b(bik bikVar, bmz bmzVar) {
        bmzVar.c();
        this.e = bmzVar.b();
        this.d = bikVar.n(bmzVar.a(), 1);
    }

    @Override // defpackage.bly
    public final void c() {
    }

    @Override // defpackage.bly
    public final void d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.l = j;
        }
    }

    @Override // defpackage.bly
    public final void e() {
        this.f = 0;
        this.g = 0;
        this.i = false;
        this.l = -9223372036854775807L;
    }

    public bmk(String str) {
        this.f = 0;
        pth pthVar = new pth(4);
        this.a = pthVar;
        pthVar.a[0] = -1;
        this.b = new biv();
        this.l = -9223372036854775807L;
        this.c = str;
    }
}

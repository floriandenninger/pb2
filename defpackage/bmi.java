package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bmi implements bly {
    private bjc b;
    private boolean c;
    private int e;
    private int f;
    private final pth a = new pth(10);
    private long d = -9223372036854775807L;

    @Override // defpackage.bly
    public final void a(pth pthVar) {
        pse.d(this.b);
        if (this.c) {
            int a = pthVar.a();
            int i = this.f;
            if (i < 10) {
                int min = Math.min(a, 10 - i);
                System.arraycopy(pthVar.a, pthVar.b, this.a.a, this.f, min);
                if (this.f + min == 10) {
                    this.a.G(0);
                    if (this.a.i() != 73 || this.a.i() != 68 || this.a.i() != 51) {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.c = false;
                        return;
                    } else {
                        this.a.H(3);
                        this.e = this.a.h() + 10;
                    }
                }
            }
            int min2 = Math.min(a, this.e - this.f);
            this.b.t(pthVar, min2);
            this.f += min2;
        }
    }

    @Override // defpackage.bly
    public final void b(bik bikVar, bmz bmzVar) {
        bmzVar.c();
        bjc n = bikVar.n(bmzVar.a(), 5);
        this.b = n;
        pmr pmrVar = new pmr();
        pmrVar.a = bmzVar.b();
        pmrVar.k = "application/id3";
        n.rp(pmrVar.a());
    }

    @Override // defpackage.bly
    public final void c() {
        int i;
        pse.d(this.b);
        if (this.c && (i = this.e) != 0 && this.f == i) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                this.b.v(j, 1, i, 0, null);
            }
            this.c = false;
        }
    }

    @Override // defpackage.bly
    public final void d(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        if (j != -9223372036854775807L) {
            this.d = j;
        }
        this.e = 0;
        this.f = 0;
    }

    @Override // defpackage.bly
    public final void e() {
        this.c = false;
        this.d = -9223372036854775807L;
    }
}

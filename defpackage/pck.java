package defpackage;

import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pck {
    public final int a;
    public final pci b;
    public final LinkedBlockingDeque c;
    public final pcj d;
    public final pgx e;
    public long f;
    public long g;
    public int h;
    public final pft i;
    public anrc j;

    public pck(pft pftVar) {
        this.i = pftVar;
        int i = pftVar.a;
        this.a = i;
        this.b = new pci();
        this.c = new LinkedBlockingDeque();
        this.d = new pcj();
        this.e = new pgx(32);
        this.h = i;
    }

    public final int a(int i) {
        if (this.h == this.a) {
            this.h = 0;
            anrc d = this.i.d();
            this.j = d;
            this.c.add(d);
        }
        return Math.min(i, this.a - this.h);
    }

    public final void b(long j) {
        int i = ((int) (j - this.f)) / this.a;
        for (int i2 = 0; i2 < i; i2++) {
            this.i.e((anrc) this.c.remove());
            this.f += this.a;
        }
    }

    public final void c(long j, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            b(j);
            int i3 = (int) (j - this.f);
            int min = Math.min(i - i2, this.a - i3);
            System.arraycopy(((anrc) this.c.peek()).a, i3, bArr, i2, min);
            j += min;
            i2 += min;
        }
    }

    public final void d() {
        b(this.b.b());
    }

    public final boolean e(oyp oypVar) {
        return this.b.e(oypVar, this.d);
    }
}

package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azok implements azpf {
    final int a;
    long b;
    final azoz[] c;

    public azok(int i, ThreadFactory threadFactory) {
        this.a = i;
        this.c = new azoz[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.c[i2] = new azoz(threadFactory);
        }
    }

    public final void a() {
        for (azoz azozVar : this.c) {
            azozVar.qc();
        }
    }

    @Override // defpackage.azpf
    public final void b(int i, azmc azmcVar) {
        int i2 = this.a;
        if (i2 == 0) {
            for (int i3 = 0; i3 < i; i3++) {
                azmcVar.a(i3, azol.g);
            }
            return;
        }
        int i4 = ((int) this.b) % i2;
        for (int i5 = 0; i5 < i; i5++) {
            azmcVar.a(i5, new azoj(this.c[i4]));
            i4++;
            if (i4 == i2) {
                i4 = 0;
            }
        }
        this.b = i4;
    }

    public final azoz c() {
        int i = this.a;
        if (i == 0) {
            return azol.g;
        }
        azoz[] azozVarArr = this.c;
        long j = this.b;
        this.b = 1 + j;
        return azozVarArr[(int) (j % i)];
    }
}

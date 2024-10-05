package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azff implements ayqx {
    final ayqd a;
    final AtomicInteger c = new AtomicInteger();
    final azfg[] b = new azfg[2];

    public azff(ayqd ayqdVar) {
        this.a = ayqdVar;
    }

    public final boolean a(int i) {
        int i2 = this.c.get();
        int i3 = 0;
        if (i2 != 0) {
            return i2 == i;
        }
        if (!this.c.compareAndSet(0, i)) {
            return false;
        }
        azfg[] azfgVarArr = this.b;
        while (i3 < 2) {
            int i4 = i3 + 1;
            if (i4 != i) {
                ayrz.c(azfgVarArr[i3]);
            }
            i3 = i4;
        }
        return true;
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.c.get() == -1;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        if (this.c.get() != -1) {
            this.c.lazySet(-1);
            azfg[] azfgVarArr = this.b;
            for (int i = 0; i < 2; i++) {
                ayrz.c(azfgVarArr[i]);
            }
        }
    }
}

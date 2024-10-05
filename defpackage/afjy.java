package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afjy implements att {
    private final shf a;
    private final afhz b;
    private final int c;
    private int d;
    private long e;
    private long f;
    private long g;

    public afjy(shf shfVar, afhz afhzVar, int i) {
        this.a = shfVar;
        this.b = afhzVar;
        this.c = i;
    }

    @Override // defpackage.att
    public final synchronized void a(ate ateVar, ath athVar, boolean z, int i) {
        if (z) {
            this.f += i;
        } else {
            this.g += i;
        }
    }

    @Override // defpackage.att
    public final synchronized void b(ate ateVar, ath athVar, boolean z) {
        boolean z2 = true;
        afki.d(this.d > 0);
        long d = this.a.d();
        int i = (int) (d - this.e);
        long j = this.g;
        long j2 = this.f;
        long j3 = j + j2;
        if (i > 0 && j3 >= 16384) {
            afhz afhzVar = this.b;
            int i2 = this.c;
            if (j >= j2) {
                z2 = false;
            }
            afio afioVar = new afio(i2, i, j3, z2);
            Iterator it = afhzVar.a.iterator();
            while (it.hasNext()) {
                ((afia) it.next()).a(afioVar);
            }
        }
        int i3 = this.d - 1;
        this.d = i3;
        if (i3 > 0) {
            this.e = d;
        }
        this.g = 0L;
        this.f = 0L;
    }

    @Override // defpackage.att
    public final void c(ate ateVar, ath athVar, boolean z) {
    }

    @Override // defpackage.att
    public final synchronized void d(ate ateVar, ath athVar, boolean z) {
        if (this.d == 0) {
            this.e = this.a.d();
        }
        this.d++;
    }
}

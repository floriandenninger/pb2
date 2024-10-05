package defpackage;

import com.google.android.libraries.lidar.VisibilityChangeEventData;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class tei {
    public static final void c(tey teyVar, VisibilityChangeEventData visibilityChangeEventData, tfa tfaVar) {
        int i;
        double d;
        long j;
        long j2;
        int i2;
        double d2;
        tdy tdyVar = visibilityChangeEventData.a;
        long currentTimeMillis = System.currentTimeMillis();
        tfd a = teyVar.h.a();
        boolean z = false;
        if (a != null) {
            int i3 = a.a;
            if (teyVar.p == 0) {
                teyVar.p = i3;
                ((tfc) teyVar.e).p = i3;
            }
            i = a.b;
            teyVar.n = a.c;
        } else {
            if (teyVar.r == 2) {
                teyVar.r = 1;
            }
            i = 0;
        }
        double d3 = visibilityChangeEventData.b;
        if (tfaVar != null && tfaVar.v) {
            z = true;
        }
        long j3 = teyVar.b;
        if (j3 <= 0 || teyVar.m) {
            return;
        }
        if (teyVar.c == -1) {
            teyVar.c = currentTimeMillis;
        }
        int i4 = teyVar.p;
        if (i > i4 && i4 > 0) {
            i = i4;
        }
        long j4 = currentTimeMillis - j3;
        int i5 = i - teyVar.q;
        boolean z2 = z;
        long j5 = teyVar.i;
        if (teyVar.l || i5 < 0) {
            d = d3;
            j = 0;
        } else {
            d = d3;
            j = Math.max(j4 - i5, 0L);
        }
        teyVar.i = j5 + j;
        teyVar.j += i5 < 0 ? Math.abs(i5) : 0L;
        if (teyVar.k == -1 && i > 0) {
            teyVar.k = currentTimeMillis - teyVar.c;
        }
        if (teyVar.r == 2) {
            j4 = i5;
        }
        if (teyVar.l) {
            j2 = currentTimeMillis;
            i2 = i5;
            d2 = d;
        } else {
            j2 = currentTimeMillis;
            i2 = i5;
            long j6 = j4;
            d2 = d;
            ((tfc) teyVar.e).g(j6, tdyVar.a, d2, teyVar.o, teyVar.n, teyVar.a, z2, tdyVar.b);
            teyVar.j().g(j6, tdyVar.a, d2, teyVar.o, teyVar.n, teyVar.a, z2, tdyVar.b);
        }
        if (i2 <= 0) {
            i = teyVar.q;
        }
        teyVar.q = i;
        teyVar.b = j2;
        teyVar.o = d2;
        teyVar.f = tdyVar;
    }

    public abstract void a(tey teyVar, tfa tfaVar);

    public abstract void b();
}

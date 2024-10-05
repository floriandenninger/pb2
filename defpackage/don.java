package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class don extends dop implements dom {
    private final dor e;
    private long f;

    public don() {
        this(null);
    }

    @Override // defpackage.dop
    public final float a(long j) {
        double d;
        boolean z;
        double d2;
        boolean z2;
        boolean z3;
        don donVar = this;
        long j2 = j;
        if (donVar.f == Long.MIN_VALUE) {
            donVar.f = j2;
            float f = donVar.f("initial").c;
            float f2 = donVar.f("end").c;
            dor dorVar = donVar.e;
            dorVar.b.a = f;
            Iterator it = dorVar.h.iterator();
            while (it.hasNext()) {
                ((dot) it.next()).d();
            }
            doq doqVar = dorVar.b;
            double d3 = doqVar.a;
            dorVar.e = d3;
            dorVar.d.a = d3;
            doqVar.b = 0.0d;
            donVar.e.b(f2);
            return f;
        }
        float f3 = donVar.f("end").c;
        donVar.e.b(f3);
        if (b()) {
            return f3;
        }
        double d4 = j2 - donVar.f;
        Double.isNaN(d4);
        double d5 = d4 / 1.0E9d;
        dor dorVar2 = donVar.e;
        boolean a = dorVar2.a();
        if (!a || !dorVar2.f) {
            if (d5 > 0.064d) {
                d5 = 0.064d;
            }
            dorVar2.g += d5;
            dos dosVar = dorVar2.a;
            double d6 = dosVar.d;
            double d7 = dosVar.c;
            doq doqVar2 = dorVar2.b;
            double d8 = doqVar2.a;
            double d9 = doqVar2.b;
            doq doqVar3 = dorVar2.d;
            double d10 = d9;
            double d11 = d8;
            double d12 = doqVar3.a;
            double d13 = doqVar3.b;
            while (true) {
                d = dorVar2.g;
                if (d < 0.001d) {
                    break;
                }
                double d14 = d - 0.001d;
                dorVar2.g = d14;
                if (d14 < 0.001d) {
                    doq doqVar4 = dorVar2.c;
                    doqVar4.a = d11;
                    doqVar4.b = d10;
                }
                double d15 = dorVar2.e;
                double d16 = ((d15 - d12) * d6) - (d7 * d10);
                double d17 = d10 + (d16 * 0.001d * 0.5d);
                double d18 = ((d15 - (d11 + ((d10 * 0.001d) * 0.5d))) * d6) - (d7 * d17);
                double d19 = d10 + (d18 * 0.001d * 0.5d);
                double d20 = ((d15 - (d11 + ((d17 * 0.001d) * 0.5d))) * d6) - (d7 * d19);
                double d21 = d11 + (d19 * 0.001d);
                double d22 = d10 + (d20 * 0.001d);
                double d23 = d17 + d19;
                double d24 = d18 + d20;
                d11 += (d10 + d23 + d23 + d22) * 0.16666666666666666d * 0.001d;
                d10 += (d16 + d24 + d24 + (((d15 - d21) * d6) - (d7 * d22))) * 0.16666666666666666d * 0.001d;
                d12 = d21;
                d13 = d22;
            }
            doq doqVar5 = dorVar2.d;
            doqVar5.a = d12;
            doqVar5.b = d13;
            doq doqVar6 = dorVar2.b;
            doqVar6.a = d11;
            doqVar6.b = d10;
            if (d > 0.0d) {
                double d25 = d / 0.001d;
                doq doqVar7 = dorVar2.c;
                double d26 = 1.0d - d25;
                z = a;
                d2 = d6;
                doqVar6.a = (d11 * d25) + (doqVar7.a * d26);
                doqVar6.b = (d10 * d25) + (doqVar7.b * d26);
            } else {
                z = a;
                d2 = d6;
            }
            boolean z4 = true;
            if (dorVar2.a()) {
                if (d2 > 0.0d) {
                    dorVar2.b.a = dorVar2.e;
                } else {
                    dorVar2.e = dorVar2.b.a;
                }
                doq doqVar8 = dorVar2.b;
                if (doqVar8.b != 0.0d) {
                    doqVar8.b = 0.0d;
                }
                z2 = true;
            } else {
                z2 = z;
            }
            if (dorVar2.f) {
                dorVar2.f = false;
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2) {
                dorVar2.f = true;
            } else {
                z4 = false;
            }
            Iterator it2 = dorVar2.h.iterator();
            while (it2.hasNext()) {
                dot dotVar = (dot) it2.next();
                if (z3) {
                    dotVar.a();
                }
                dotVar.d();
                if (z4) {
                    dotVar.b();
                }
            }
            donVar = this;
            j2 = j;
        }
        donVar.f = j2;
        return (float) donVar.e.b.a;
    }

    @Override // defpackage.dom
    public final boolean b() {
        return this.e.a();
    }

    public don(dos dosVar) {
        this.f = Long.MIN_VALUE;
        dor dorVar = new dor();
        this.e = dorVar;
        if (dosVar != null) {
            dorVar.a = dosVar;
        }
    }
}

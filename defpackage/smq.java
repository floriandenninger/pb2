package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class smq implements swv {
    public final slr a;
    private final /* synthetic */ int b;

    public smq(slr slrVar, int i) {
        this.b = i;
        this.a = slrVar;
    }

    @Override // defpackage.swv
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.swv
    public final aomu a() {
        return this.b != 0 ? awtq.b : awtz.b;
    }

    @Override // defpackage.swv
    public final /* synthetic */ ayph b(Object obj, final swu swuVar) {
        if (this.b == 0) {
            final awtz awtzVar = (awtz) obj;
            int i = awtzVar.c;
            if ((i & 1) != 0) {
                final int millis = (i & 8) != 0 ? (int) anet.a(awtzVar.f).toMillis() : 0;
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    slr slrVar = this.a;
                    awos awosVar = awtzVar.d;
                    if (awosVar == null) {
                        awosVar = awos.a;
                    }
                    awos awosVar2 = awosVar;
                    int s = awxr.s(awtzVar.e);
                    int i2 = s == 0 ? 1 : s;
                    int r = awxr.r(awtzVar.g);
                    slrVar.f(awosVar2, i2, millis, swuVar, r == 0 ? 1 : r, awtzVar.h, awtzVar.i);
                    return ayph.f();
                }
                return ayph.t(new ayrm() { // from class: smp
                    @Override // defpackage.ayrm
                    public final void a() {
                        smq smqVar = smq.this;
                        awtz awtzVar2 = awtzVar;
                        int i3 = millis;
                        swu swuVar2 = swuVar;
                        slr slrVar2 = smqVar.a;
                        awos awosVar3 = awtzVar2.d;
                        if (awosVar3 == null) {
                            awosVar3 = awos.a;
                        }
                        awos awosVar4 = awosVar3;
                        int s2 = awxr.s(awtzVar2.e);
                        if (s2 == 0) {
                            s2 = 1;
                        }
                        int r2 = awxr.r(awtzVar2.g);
                        if (r2 == 0) {
                            r2 = 1;
                        }
                        slrVar2.f(awosVar4, s2, i3, swuVar2, r2, awtzVar2.h, awtzVar2.i);
                    }
                }).E(ayqr.a());
            }
            return ayph.f();
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.a.a();
            return ayph.f();
        }
        final slr slrVar2 = this.a;
        slrVar2.getClass();
        return ayph.t(new ayrm() { // from class: smc
            @Override // defpackage.ayrm
            public final void a() {
                slr.this.a();
            }
        }).E(ayqr.a());
    }
}

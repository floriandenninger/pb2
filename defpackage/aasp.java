package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aasp {
    private final aarm a;
    private final ysl b;
    private final ykr c;
    private final ykq d;
    private final aooy e;

    public aasp(aarm aarmVar, ysl yslVar, aooy aooyVar, ykr ykrVar, ykq ykqVar) {
        aarmVar.getClass();
        this.a = aarmVar;
        yslVar.getClass();
        this.b = yslVar;
        aooyVar.getClass();
        this.e = aooyVar;
        ykrVar.getClass();
        this.c = ykrVar;
        ykqVar.getClass();
        this.d = ykqVar;
    }

    @Deprecated
    public final anhy a(aaru aaruVar) {
        return c(aaruVar, angq.a, null);
    }

    public final anhy b(aaru aaruVar, Executor executor) {
        return c(aaruVar, executor, null);
    }

    public final anhy c(aaru aaruVar, Executor executor, aart aartVar) {
        final aarn b;
        if (aartVar == null) {
            b = this.a.a(aaruVar, this.e, afwv.a, this.c, this.d);
        } else {
            b = this.a.b(aaruVar, this.e, afwv.a, this.c, this.d, aartVar);
        }
        anhy b2 = this.b.b(b);
        final Runnable runnable = new Runnable() { // from class: aaso
            @Override // java.lang.Runnable
            public final void run() {
                aarn.this.y();
            }
        };
        return anfq.i(b2, new anfz() { // from class: ytf
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                Runnable runnable2 = runnable;
                cnm cnmVar = (cnm) obj;
                if (cnmVar != null) {
                    cnq cnqVar = cnmVar.c;
                    if (cnqVar != null) {
                        return anaf.N(cnqVar);
                    }
                    if (cnmVar.a != null) {
                        runnable2.run();
                        return anaf.O(cnmVar.a);
                    }
                }
                return anaf.N(new IllegalStateException("Response was null. This should not have happened."));
            }
        }, executor);
    }

    public final aooy d(aaru aaruVar) {
        yjk.e();
        afww f = afww.f();
        e(aaruVar, f);
        return (aooy) ynm.d(f, aard.h);
    }

    @Deprecated
    public final void e(aaru aaruVar, afwx afwxVar) {
        this.b.a(this.a.a(aaruVar, this.e, afwxVar, this.c, this.d));
    }

    @Deprecated
    public final void f(aaru aaruVar, afwx afwxVar, aart aartVar) {
        if (aartVar == null) {
            this.b.a(this.a.a(aaruVar, this.e, afwxVar, this.c, this.d));
        } else {
            this.b.a(this.a.b(aaruVar, this.e, afwxVar, this.c, this.d, aartVar));
        }
    }
}

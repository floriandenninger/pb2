package defpackage;

import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class hlr implements Runnable {
    public final /* synthetic */ hmc a;
    private final /* synthetic */ int b;

    public /* synthetic */ hlr(hmc hmcVar, int i) {
        this.b = i;
        this.a = hmcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bue e;
        if (this.b == 0) {
            hmc hmcVar = this.a;
            if (!hmcVar.aP() || (e = hmcVar.mN().e(R.id.reel_container)) == null) {
                return;
            }
            acra mM = e instanceof acqz ? ((acqz) e).mM() : null;
            if (mM != null) {
                mM.n(new acqx(hmcVar.aq.n));
                apmh apmhVar = hmcVar.aq.h;
                if (apmhVar == null) {
                    apmhVar = apmh.a;
                }
                apmg apmgVar = apmhVar.c;
                if (apmgVar == null) {
                    apmgVar = apmg.a;
                }
                mM.n(new acqx(apmgVar.t));
                apmh apmhVar2 = hmcVar.aq.i;
                if (apmhVar2 == null) {
                    apmhVar2 = apmh.a;
                }
                apmg apmgVar2 = apmhVar2.c;
                if (apmgVar2 == null) {
                    apmgVar2 = apmg.a;
                }
                mM.n(new acqx(apmgVar2.t));
            }
            ajdf.o(hmcVar.av, hmcVar.aq, hmcVar.af, mM, false, new hma(hmcVar), null, null);
            return;
        }
        hmc hmcVar2 = this.a;
        hmcVar2.ai.d();
        hmcVar2.aL(true);
    }
}

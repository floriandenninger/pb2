package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public class lrl extends akkr {
    private boolean aK = false;
    private ContextWrapper ae;

    private final void aK() {
        if (this.ae == null) {
            this.ae = axqa.b(super.qR(), this);
        }
    }

    @Override // defpackage.akkb, defpackage.ce
    public final void U(Activity activity) {
        super.U(activity);
        ContextWrapper contextWrapper = this.ae;
        boolean z = true;
        if (contextWrapper != null && axqa.a(contextWrapper) != activity) {
            z = false;
        }
        ayaw.q(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        aK();
        aF();
    }

    @Override // defpackage.akkb
    public final void aF() {
        if (this.aK) {
            return;
        }
        this.aK = true;
        lrk lrkVar = (lrk) this;
        ehw ehwVar = (ehw) lM();
        lrkVar.ao = (akmj) ehwVar.b.a.cJ.get();
        lrkVar.ap = (akkz) ehwVar.b.a.cK.get();
        lrkVar.aq = axqq.a(ehwVar.c.nE);
        lrkVar.ar = axqq.a(ehwVar.c.nF);
        lrkVar.as = (Handler) ehwVar.b.an.get();
        lrkVar.at = (Executor) ehwVar.b.i.get();
        lrkVar.au = (ajdh) ehwVar.c.cG.get();
        lrkVar.av = ehwVar.b.cO();
        lrkVar.aw = (zaw) ehwVar.b.iN.get();
        lrkVar.ax = (ypa) ehwVar.b.B.get();
        lrkVar.ay = (ScheduledExecutorService) ehwVar.b.f.get();
        lrkVar.az = (anib) ehwVar.b.aA.get();
        lrkVar.aA = (ajjz) ehwVar.b.kp.get();
        lrkVar.aB = (aavj) ehwVar.b.a.l.get();
        lrkVar.aC = (cnd) ehwVar.b.dr.get();
        lrkVar.aD = (SharedPreferences) ehwVar.b.z.get();
        lrkVar.aE = ehwVar.c.jz();
        lrkVar.aJ = (aoae) ehwVar.c.ai.get();
        lrkVar.aF = (aahd) ehwVar.c.I.get();
        lrkVar.aG = (shf) ehwVar.b.g.get();
        lrkVar.aI = (aadw) ehwVar.b.D.get();
        lrkVar.aH = ehwVar.c.gZ();
        lrkVar.ae = (fma) ehwVar.b.wk.get();
    }

    @Override // defpackage.akkb, defpackage.bv, defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        aK();
        aF();
    }

    @Override // defpackage.akkb, defpackage.bv, defpackage.ce
    public final LayoutInflater lW(Bundle bundle) {
        return LayoutInflater.from(axqa.c(super.lW(bundle), this));
    }

    @Override // defpackage.akkb, defpackage.ce
    public final Context qR() {
        if (super.qR() == null && this.ae == null) {
            return null;
        }
        aK();
        return this.ae;
    }
}

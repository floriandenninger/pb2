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
/* loaded from: classes.dex */
public class akkb extends bv implements axql {
    private ContextWrapper ae;
    private volatile axqa af;
    private final Object ag = new Object();
    private boolean ah = false;

    private void aH() {
        if (this.ae == null) {
            this.ae = axqa.b(super.qR(), this);
        }
    }

    @Override // defpackage.ce
    public void U(Activity activity) {
        super.U(activity);
        ContextWrapper contextWrapper = this.ae;
        boolean z = true;
        if (contextWrapper != null && axqa.a(contextWrapper) != activity) {
            z = false;
        }
        ayaw.q(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        aH();
        aF();
    }

    public void aF() {
        if (this.ah) {
            return;
        }
        this.ah = true;
        akkr akkrVar = (akkr) this;
        ehw ehwVar = (ehw) lM();
        akkrVar.ao = (akmj) ehwVar.b.a.cJ.get();
        akkrVar.ap = (akkz) ehwVar.b.a.cK.get();
        akkrVar.aq = axqq.a(ehwVar.c.nE);
        akkrVar.ar = axqq.a(ehwVar.c.nF);
        akkrVar.as = (Handler) ehwVar.b.an.get();
        akkrVar.at = (Executor) ehwVar.b.i.get();
        akkrVar.au = (ajdh) ehwVar.c.cG.get();
        akkrVar.av = ehwVar.b.cO();
        akkrVar.aw = (zaw) ehwVar.b.iN.get();
        akkrVar.ax = (ypa) ehwVar.b.B.get();
        akkrVar.ay = (ScheduledExecutorService) ehwVar.b.f.get();
        akkrVar.az = (anib) ehwVar.b.aA.get();
        akkrVar.aA = (ajjz) ehwVar.b.kp.get();
        akkrVar.aB = (aavj) ehwVar.b.a.l.get();
        akkrVar.aC = (cnd) ehwVar.b.dr.get();
        akkrVar.aD = (SharedPreferences) ehwVar.b.z.get();
        akkrVar.aE = ehwVar.c.jz();
        akkrVar.aJ = (aoae) ehwVar.c.ai.get();
        akkrVar.aF = (aahd) ehwVar.c.I.get();
        akkrVar.aG = (shf) ehwVar.b.g.get();
        akkrVar.aI = (aadw) ehwVar.b.D.get();
        akkrVar.aH = ehwVar.c.gZ();
    }

    @Override // defpackage.axql
    /* renamed from: aG, reason: merged with bridge method [inline-methods] */
    public final axqa lL() {
        if (this.af == null) {
            synchronized (this.ag) {
                if (this.af == null) {
                    this.af = new axqa(this);
                }
            }
        }
        return this.af;
    }

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.v(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.bv, defpackage.ce
    public void ku(Context context) {
        super.ku(context);
        aH();
        aF();
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    @Override // defpackage.bv, defpackage.ce
    public LayoutInflater lW(Bundle bundle) {
        return LayoutInflater.from(axqa.c(super.lW(bundle), this));
    }

    @Override // defpackage.ce
    public Context qR() {
        if (super.qR() == null && this.ae == null) {
            return null;
        }
        aH();
        return this.ae;
    }
}

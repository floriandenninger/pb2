package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class achk extends akas {
    private ContextWrapper a;
    private boolean b = false;

    private final void a() {
        if (this.a == null) {
            this.a = axqa.b(super.qR(), this);
        }
    }

    @Override // defpackage.akab, defpackage.ce
    public final void U(Activity activity) {
        super.U(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && axqa.a(contextWrapper) != activity) {
            z = false;
        }
        ayaw.q(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        a();
        n();
    }

    @Override // defpackage.akab, defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        a();
        n();
    }

    @Override // defpackage.ce
    public final LayoutInflater lW(Bundle bundle) {
        return LayoutInflater.from(axqa.c(LayoutInflater.from(axqa.c(az(), this)), this));
    }

    @Override // defpackage.akab
    public final void n() {
        if (this.b) {
            return;
        }
        this.b = true;
        acjl acjlVar = (acjl) this;
        ehw ehwVar = (ehw) lM();
        acjlVar.aQ = (acra) ehwVar.c.jk.get();
        acjlVar.aR = (akai) ehwVar.b.xH.get();
        acjlVar.au = (Handler) ehwVar.b.an.get();
        acjlVar.av = (aahd) ehwVar.c.I.get();
        acjlVar.aw = (ajjz) ehwVar.b.kp.get();
        acjlVar.ax = (wdm) ehwVar.b.au.get();
        acjlVar.ay = (ajec) ehwVar.c.dR.get();
        acjlVar.az = (acfh) ehwVar.b.a.cP.get();
        acjlVar.aA = (abya) ehwVar.c.hM.get();
        SparseBooleanArray sparseBooleanArray = abvo.a;
        acjlVar.aB = (acjk) ehwVar.c.os.get();
        acjlVar.aC = (afot) ehwVar.c.hN.get();
        ehwVar.c.jq();
        ehwVar.c.jp();
        acjlVar.aD = (acfo) ehwVar.c.hO.get();
        acjlVar.aE = (shf) ehwVar.b.g.get();
        acjlVar.aO = ehwVar.c.mF();
        acjlVar.aP = ehwVar.c.mO();
        acjlVar.aF = (akch) ehwVar.c.aj.get();
        acjlVar.aG = ehwVar.c.is();
        efz efzVar = ehwVar.b;
        acjlVar.aM = new advq(efzVar.a.cS, efzVar.i, (byte[]) null);
        acjlVar.aH = (SharedPreferences) ehwVar.b.z.get();
        acjlVar.aI = ehwVar.c.jG();
        acjlVar.aL = (agcm) ehwVar.b.a.aO.get();
        acjlVar.aJ = (abxp) ehwVar.b.a.cS.get();
        acjlVar.aN = ehwVar.c.mu();
        acjlVar.aK = (acra) ehwVar.c.jk.get();
    }

    @Override // defpackage.akab, defpackage.ce
    public final Context qR() {
        if (super.qR() == null && this.a == null) {
            return null;
        }
        a();
        return this.a;
    }
}

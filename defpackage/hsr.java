package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.File;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class hsr extends zxz implements axql {
    private ContextWrapper a;
    private volatile axqa b;
    private final Object c = new Object();
    private boolean d = false;

    private final void a() {
        if (this.a == null) {
            this.a = axqa.b(super.qR(), this);
        }
    }

    @Override // defpackage.ce
    public final void U(Activity activity) {
        super.U(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && axqa.a(contextWrapper) != activity) {
            z = false;
        }
        ayaw.q(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        a();
        p();
    }

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.v(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        a();
        p();
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    @Override // defpackage.ce
    public final LayoutInflater lW(Bundle bundle) {
        return LayoutInflater.from(axqa.c(az(), this));
    }

    @Override // defpackage.axql
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final axqa lL() {
        if (this.b == null) {
            synchronized (this.c) {
                if (this.b == null) {
                    this.b = new axqa(this);
                }
            }
        }
        return this.b;
    }

    protected final void p() {
        if (this.d) {
            return;
        }
        this.d = true;
        hvc hvcVar = (hvc) this;
        ehw ehwVar = (ehw) lM();
        hvcVar.az = (File) ehwVar.b.cN.get();
        hvcVar.aA = (SharedPreferences) ehwVar.b.z.get();
        hvcVar.aW = ehwVar.c.mk();
        hvcVar.aB = (aaea) ehwVar.b.K.get();
        hvcVar.aC = (ajjs) ehwVar.b.km.get();
        hvcVar.aD = ehwVar.c.mK;
        hvcVar.aw = (aadw) ehwVar.b.D.get();
        hvcVar.e = (aksl) ehwVar.b.ha.get();
        hvcVar.ae = ehwVar.b.cO();
        hvcVar.af = ehwVar.p();
        hvcVar.ag = new hvs(ehwVar.c.a());
        hvcVar.ah = (hvq) ehwVar.y.get();
        hvcVar.ai = new hur((afsy) ehwVar.b.au.get(), (aahd) ehwVar.c.I.get(), (Handler) ehwVar.b.an.get(), ehwVar.b.gD(), new zua((acpl) ehwVar.b.aw.get()), (akvq) ehwVar.b.mM.get(), ehwVar.c.cr(), (axze) ehwVar.b.a.cg.get(), (wdm) ehwVar.b.au.get(), (ajjz) ehwVar.b.kp.get(), (gni) ehwVar.b.eA.get(), (vgz) ehwVar.b.a.aq.get(), null, null, null, null, null);
        hvcVar.aj = new hwg(ehwVar.c.a(), new hwf(ehwVar.c.a(), (ajjs) ehwVar.b.km.get(), (ajut) ehwVar.b.lE.get(), (aahd) ehwVar.c.I.get()));
        hvcVar.ak = new hub();
        hvcVar.al = new htz();
        hvcVar.am = new hvu();
        hvcVar.an = new hut();
        hvcVar.ao = new hwq((axze) ehwVar.b.a.cg.get(), (ajut) ehwVar.b.lE.get(), (Handler) ehwVar.b.an.get(), new iam((Handler) ehwVar.b.an.get(), (ida) ehwVar.p.get(), ehwVar.u(), ehwVar.s(), ehwVar.w(), ehwVar.y(), ehwVar.t(), ehwVar.z()), (ida) ehwVar.p.get(), ehwVar.v(), (hvq) ehwVar.y.get(), null, null, null, null, null);
        hvcVar.ap = ehwVar.v();
        hvcVar.ax = (axze) ehwVar.b.a.cg.get();
        hvcVar.aq = ehwVar.z;
        hvcVar.ar = ehwVar.A;
        hvcVar.as = ehwVar.B;
        hvcVar.at = ehwVar.C;
        hvcVar.au = ehwVar.c.mL;
    }

    @Override // defpackage.ce
    public final Context qR() {
        if (super.qR() == null && this.a == null) {
            return null;
        }
        a();
        return this.a;
    }
}

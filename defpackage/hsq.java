package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class hsq extends hxz implements axql {
    private ContextWrapper a;
    private volatile axqa b;
    private final Object c = new Object();
    private boolean d = false;

    private final void o() {
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
        o();
        n();
    }

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.v(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        o();
        n();
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
    /* renamed from: mt, reason: merged with bridge method [inline-methods] */
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

    protected final void n() {
        if (this.d) {
            return;
        }
        this.d = true;
        htu htuVar = (htu) this;
        ehw ehwVar = (ehw) lM();
        htuVar.aA = new efi(ehwVar.b, ehwVar.aS, ehwVar.c);
        htuVar.b = (Handler) ehwVar.b.an.get();
        htuVar.as = (aadw) ehwVar.b.D.get();
        htuVar.c = (aahd) ehwVar.c.I.get();
        abbm abbmVar = (abbm) ehwVar.b.wd.get();
        afsy afsyVar = (afsy) ehwVar.b.au.get();
        hwh hwhVar = (hwh) gfw.B(ehwVar.a, hwh.class);
        ayaw.k(hwhVar);
        htuVar.d = new hwk(abbmVar, afsyVar, hwhVar);
        htuVar.e = ehwVar.c.hc();
        htuVar.ae = ehwVar.c.hb();
        htuVar.af = ehwVar.c.hb();
        htuVar.ag = new zrt((shf) ehwVar.b.g.get());
        htuVar.av = (vgz) ehwVar.b.a.aq.get();
        htuVar.ah = ehwVar.r();
        htuVar.ai = ehwVar.x();
        htuVar.aj = (gni) ehwVar.b.eA.get();
        htuVar.at = new akap();
        htuVar.aw = ehwVar.aI();
        htuVar.ak = (hrv) ehwVar.b.a.S.get();
    }

    @Override // defpackage.ce
    public final Context qR() {
        if (super.qR() == null && this.a == null) {
            return null;
        }
        o();
        return this.a;
    }
}

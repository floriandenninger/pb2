package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class achg extends acri implements axql {
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
        aG();
    }

    @Override // defpackage.axql
    /* renamed from: aF, reason: merged with bridge method [inline-methods] */
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

    protected final void aG() {
        if (this.d) {
            return;
        }
        this.d = true;
        acif acifVar = (acif) this;
        ehw ehwVar = (ehw) lM();
        acifVar.b = (aahd) ehwVar.c.I.get();
        acifVar.c = (acra) ehwVar.c.jk.get();
        acifVar.d = (Handler) ehwVar.b.an.get();
        acifVar.e = (acih) ehwVar.c.oi.get();
        acifVar.ae = ehwVar.b.hf();
        acifVar.aK = ehwVar.c.mO();
        acifVar.af = (acfh) ehwVar.b.a.cP.get();
        acifVar.aI = ehwVar.c.mk();
        acifVar.ag = (aksl) ehwVar.b.ha.get();
        eed eedVar = ehwVar.c;
        azrw azrwVar = eedVar.f;
        efz efzVar = ehwVar.b;
        acifVar.ah = new abwz(azrwVar, efzVar.an, eedVar.oj, eedVar.ok, eedVar.ol, eedVar.om, eedVar.on, ehwVar.aN, ehwVar.aO, efzVar.g, eedVar.oo, eedVar.hM, eedVar.op, eedVar.jm, efzVar.yF);
        acifVar.ai = (akch) ehwVar.c.aj.get();
        acifVar.aj = (shf) ehwVar.b.g.get();
        ehwVar.c.jq();
        acifVar.ak = ehwVar.c.jp();
        acifVar.al = (afsy) ehwVar.b.au.get();
        acifVar.am = (aahv) ehwVar.b.dB.get();
    }

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.v(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.ce
    public void ku(Context context) {
        super.ku(context);
        a();
        aG();
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    @Override // defpackage.ce
    public final LayoutInflater lW(Bundle bundle) {
        return LayoutInflater.from(axqa.c(az(), this));
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

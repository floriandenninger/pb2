package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class achf extends ce implements axql {
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
    public void U(Activity activity) {
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

    @Override // defpackage.axql
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
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

    protected final void n() {
        if (this.d) {
            return;
        }
        this.d = true;
        acht achtVar = (acht) this;
        ehw ehwVar = (ehw) lM();
        achtVar.a = (abht) ehwVar.c.cp.get();
        achtVar.b = (abhh) ehwVar.c.cH.get();
        achtVar.c = ehwVar.b.cO();
        achtVar.d = ehwVar.c.jz();
        achtVar.e = (abjr) ehwVar.b.xl.get();
        achtVar.as = ehwVar.c.mO();
        achtVar.ar = ehwVar.c.lf();
        ehwVar.c.fD();
        achtVar.ae = (ajgq) ehwVar.b.dT.get();
        achtVar.af = (sxw) ehwVar.b.xp.get();
        eed eedVar = ehwVar.c;
        achtVar.ag = eedVar.aP;
        achtVar.ah = eedVar.ie();
        achtVar.ai = (ajvb) ehwVar.c.cD.get();
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

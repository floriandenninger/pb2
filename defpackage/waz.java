package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public class waz extends bv implements axql {
    private ContextWrapper ae;
    private volatile axqa af;
    private final Object ag = new Object();
    private boolean ah = false;

    private final void aF() {
        if (this.ae == null) {
            this.ae = axqa.b(super.qR(), this);
        }
    }

    @Override // defpackage.ce
    public final void U(Activity activity) {
        super.U(activity);
        ContextWrapper contextWrapper = this.ae;
        boolean z = true;
        if (contextWrapper != null && axqa.a(contextWrapper) != activity) {
            z = false;
        }
        ayaw.q(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        aF();
        aN();
    }

    @Override // defpackage.axql
    /* renamed from: aM, reason: merged with bridge method [inline-methods] */
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

    protected final void aN() {
        if (this.ah) {
            return;
        }
        this.ah = true;
        wam wamVar = (wam) this;
        ehw ehwVar = (ehw) lM();
        wamVar.ah = (aaea) ehwVar.b.K.get();
        wamVar.ai = ehwVar.c.jp();
        ehwVar.c.jq();
        wamVar.aj = (wan) ehwVar.c.gL.get();
        wamVar.ak = (aahd) ehwVar.c.I.get();
        wamVar.al = (zaw) ehwVar.b.iN.get();
        wamVar.am = (ajjs) ehwVar.b.km.get();
        wamVar.at = (abdl) ehwVar.b.a.m.get();
        wamVar.an = new wbc(ehwVar.c.a(), (aahd) ehwVar.c.I.get(), (wan) ehwVar.c.gL.get());
        wamVar.ao = (aarr) ehwVar.b.hV.get();
        wamVar.ap = (aahv) ehwVar.b.dB.get();
        wamVar.aq = (wdt) ehwVar.c.hi.get();
    }

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.v(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.bv, defpackage.ce
    public void ku(Context context) {
        super.ku(context);
        aF();
        aN();
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    @Override // defpackage.bv, defpackage.ce
    public final LayoutInflater lW(Bundle bundle) {
        return LayoutInflater.from(axqa.c(super.lW(bundle), this));
    }

    @Override // defpackage.ce
    public final Context qR() {
        if (super.qR() == null && this.ae == null) {
            return null;
        }
        aF();
        return this.ae;
    }
}

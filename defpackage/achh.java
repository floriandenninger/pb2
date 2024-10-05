package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;

/* compiled from: PG */
/* loaded from: classes.dex */
class achh extends ce implements axql {
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
        aciq aciqVar = (aciq) this;
        ehw ehwVar = (ehw) lM();
        aciqVar.a = (Handler) ehwVar.b.an.get();
        aciqVar.b = (acfh) ehwVar.b.a.cP.get();
        aciqVar.c = (abya) ehwVar.c.hM.get();
        aciqVar.d = (aahd) ehwVar.c.I.get();
        aciqVar.e = (acip) ehwVar.c.oq.get();
        ehwVar.c.jq();
        aciqVar.ae = ehwVar.c.jp();
        aciqVar.af = (aahv) ehwVar.b.dB.get();
        aciqVar.ag = (afsy) ehwVar.b.au.get();
        aciqVar.ah = (acfq) ehwVar.c.ih.get();
        aciqVar.ai = (acpz) ehwVar.b.gV.get();
        aciqVar.aj = (acra) ehwVar.c.jk.get();
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

package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public class vqd extends ce implements axql, axqh {
    private ContextWrapper b;
    private volatile axqa c;
    private final Object d = new Object();
    public boolean a = false;

    private final void o() {
        if (this.b == null) {
            this.b = axqa.b(super.qR(), this);
        }
    }

    @Override // defpackage.ce
    public final void U(Activity activity) {
        super.U(activity);
        ContextWrapper contextWrapper = this.b;
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
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new axqa(this);
                }
            }
        }
        return this.c;
    }

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.v(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.axqh
    public final boolean h() {
        return this.a;
    }

    @Override // defpackage.ce
    public void ku(Context context) {
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
        Object N = N();
        if (N instanceof axqk) {
            if ((!(N instanceof axqh) || ((axqh) N).h()) && !this.a) {
                this.a = true;
                vqf vqfVar = (vqf) this;
                ehw ehwVar = (ehw) lM();
                vqfVar.b = ehwVar.b();
                vqfVar.c = (vrp) ehwVar.c.lv.get();
                vqfVar.d = (tgn) ehwVar.b.a.aX.get();
                vqfVar.e = ehwVar.ax();
            }
        }
    }

    @Override // defpackage.ce
    public final Context qR() {
        if (super.qR() == null && this.b == null) {
            return null;
        }
        o();
        return this.b;
    }
}

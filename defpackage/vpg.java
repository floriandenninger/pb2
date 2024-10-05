package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public class vpg extends ce implements axql, axqh {
    private ContextWrapper a;
    private volatile axqa b;
    private final Object c = new Object();
    public boolean ah = false;

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

    @Override // defpackage.axqh
    public final boolean h() {
        return this.ah;
    }

    @Override // defpackage.ce
    public void ku(Context context) {
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
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
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
        Object N = N();
        if (N instanceof axqk) {
            if ((!(N instanceof axqh) || ((axqh) N).h()) && !this.ah) {
                this.ah = true;
                vpf vpfVar = (vpf) this;
                ehw ehwVar = (ehw) lM();
                vpfVar.a = ehwVar.b();
                vpfVar.b = (tgn) ehwVar.b.a.aX.get();
                vpfVar.c = (vlx) ehwVar.c.lj.get();
                vpfVar.d = ehwVar.b.a.bG;
                vpfVar.ag = ehwVar.c.mS();
            }
        }
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

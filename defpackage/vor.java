package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public class vor extends ce implements axql, axqh {
    private ContextWrapper a;
    private volatile axqa b;
    private final Object c = new Object();
    public boolean e = false;

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

    @Override // defpackage.axqh
    public final boolean h() {
        return this.e;
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
            if ((!(N instanceof axqh) || ((axqh) N).h()) && !this.e) {
                this.e = true;
                voq voqVar = (voq) this;
                ehw ehwVar = (ehw) lM();
                voqVar.a = ehwVar.b();
                voqVar.b = (vrp) ehwVar.c.lv.get();
                voqVar.c = (tgn) ehwVar.b.a.aX.get();
                azrw azrwVar = ehwVar.aH;
                eed eedVar = ehwVar.c;
                voqVar.d = new akht(azrwVar, eedVar.lv, eedVar.lj, eedVar.nK, ehwVar.aG, (byte[]) null, (char[]) null, (byte[]) null);
            }
        }
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

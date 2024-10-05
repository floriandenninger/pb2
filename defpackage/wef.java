package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public class wef extends wek implements axql {
    private ContextWrapper af;
    private volatile axqa ag;
    private final Object ah = new Object();
    private boolean ai = false;

    private final void r() {
        if (this.af == null) {
            this.af = axqa.b(super.qR(), this);
        }
    }

    @Override // defpackage.wek, defpackage.ce
    public final void U(Activity activity) {
        super.U(activity);
        ContextWrapper contextWrapper = this.af;
        boolean z = true;
        if (contextWrapper != null && axqa.a(contextWrapper) != activity) {
            z = false;
        }
        ayaw.q(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        r();
        n();
    }

    @Override // defpackage.axql
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final axqa lL() {
        if (this.ag == null) {
            synchronized (this.ah) {
                if (this.ag == null) {
                    this.ag = new axqa(this);
                }
            }
        }
        return this.ag;
    }

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.v(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.wek, defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        r();
        n();
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    @Override // defpackage.wek, defpackage.ce
    public final LayoutInflater lW(Bundle bundle) {
        return LayoutInflater.from(axqa.c(super.lW(bundle), this));
    }

    protected final void n() {
        if (this.ai) {
            return;
        }
        this.ai = true;
        wez wezVar = (wez) this;
        ehw ehwVar = (ehw) lM();
        wezVar.ag = ehwVar.T();
        wezVar.ak = ehwVar.aP();
        wezVar.aj = ehwVar.ay();
        wezVar.al = ehwVar.aU();
        wezVar.ah = (wfz) ehwVar.b.a.Q.get();
        wezVar.ai = (acqz) ehwVar.c.P.get();
    }

    @Override // defpackage.ce
    public final Context qR() {
        if (super.qR() == null && this.af == null) {
            return null;
        }
        r();
        return this.af;
    }
}

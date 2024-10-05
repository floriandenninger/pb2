package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* compiled from: PG */
/* loaded from: classes3.dex */
class jdt extends bog implements axql {
    private ContextWrapper ag;
    private volatile axqa ah;
    private final Object ai = new Object();
    private boolean aj = false;

    private final void aI() {
        if (this.ag == null) {
            this.ag = axqa.b(super.qR(), this);
        }
    }

    @Override // defpackage.ce
    public final void U(Activity activity) {
        super.U(activity);
        ContextWrapper contextWrapper = this.ag;
        boolean z = true;
        if (contextWrapper != null && axqa.a(contextWrapper) != activity) {
            z = false;
        }
        ayaw.q(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        aI();
        aH();
    }

    @Override // defpackage.axql
    /* renamed from: aG, reason: merged with bridge method [inline-methods] */
    public final axqa lL() {
        if (this.ah == null) {
            synchronized (this.ai) {
                if (this.ah == null) {
                    this.ah = new axqa(this);
                }
            }
        }
        return this.ah;
    }

    protected final void aH() {
        if (this.aj) {
            return;
        }
        this.aj = true;
        jeb jebVar = (jeb) this;
        ehw ehwVar = (ehw) lM();
        efz efzVar = ehwVar.b;
        jebVar.ag = efzVar.iu;
        jebVar.ah = efzVar.jD;
        jebVar.ai = efzVar.ja;
        jebVar.aj = efzVar.jy;
        jebVar.ak = (acqz) ehwVar.c.P.get();
        jebVar.al = (ypa) ehwVar.b.B.get();
        eed eedVar = ehwVar.c;
        jebVar.am = eedVar.jS;
        jebVar.an = eedVar.jR;
    }

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.v(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.bv, defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        aI();
        aH();
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
        if (super.qR() == null && this.ag == null) {
            return null;
        }
        aI();
        return this.ag;
    }
}

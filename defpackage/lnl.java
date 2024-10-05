package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public class lnl extends brt implements axql {
    private ContextWrapper af;
    private volatile axqa ag;
    private final Object ah = new Object();
    private boolean aj = false;

    private final void aM() {
        if (this.af == null) {
            this.af = axqa.b(super.qR(), this);
        }
    }

    @Override // defpackage.ce
    public final void U(Activity activity) {
        super.U(activity);
        ContextWrapper contextWrapper = this.af;
        boolean z = true;
        if (contextWrapper != null && axqa.a(contextWrapper) != activity) {
            z = false;
        }
        ayaw.q(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        aM();
        aO();
    }

    @Override // defpackage.axql
    /* renamed from: aN, reason: merged with bridge method [inline-methods] */
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

    protected final void aO() {
        if (this.aj) {
            return;
        }
        this.aj = true;
        ((lnh) this).af = ((ehw) lM()).c.gZ;
    }

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.v(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.bv, defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        aM();
        aO();
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
        if (super.qR() == null && this.af == null) {
            return null;
        }
        aM();
        return this.af;
    }
}

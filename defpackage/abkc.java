package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class abkc extends abke implements axql {
    private ContextWrapper b;
    private volatile axqa c;
    private final Object d = new Object();
    private boolean e = false;

    private final void p() {
        if (this.b == null) {
            this.b = axqa.b(super.qR(), this);
        }
    }

    @Override // defpackage.abke, defpackage.ce
    public final void U(Activity activity) {
        super.U(activity);
        ContextWrapper contextWrapper = this.b;
        boolean z = true;
        if (contextWrapper != null && axqa.a(contextWrapper) != activity) {
            z = false;
        }
        ayaw.q(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        p();
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

    @Override // defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        p();
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
        if (this.e) {
            return;
        }
        this.e = true;
        ((abkr) this).b = (ajvb) ((ehw) lM()).c.ob.get();
    }

    @Override // defpackage.ce
    public final Context qR() {
        if (super.qR() == null && this.b == null) {
            return null;
        }
        p();
        return this.b;
    }
}

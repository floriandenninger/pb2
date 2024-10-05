package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class bnq extends bv {
    private Dialog ae;
    private bph af;

    public bnq() {
        n(true);
    }

    private final void aH() {
        if (this.af == null) {
            Bundle bundle = this.m;
            if (bundle != null) {
                this.af = bph.a(bundle.getBundle("selector"));
            }
            if (this.af == null) {
                this.af = bph.a;
            }
        }
    }

    public bnp aG(Context context) {
        return new bnp(context);
    }

    @Override // defpackage.ce, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.ae;
        if (dialog == null) {
            return;
        }
        ((bnp) dialog).g();
    }

    @Override // defpackage.bv
    public final Dialog oq(Bundle bundle) {
        bnp aG = aG(qR());
        this.ae = aG;
        aH();
        aG.f(this.af);
        return this.ae;
    }

    public final void aF(bph bphVar) {
        if (bphVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        aH();
        if (this.af.equals(bphVar)) {
            return;
        }
        this.af = bphVar;
        Bundle bundle = this.m;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBundle("selector", bphVar.b);
        af(bundle);
        Dialog dialog = this.ae;
        if (dialog != null) {
            ((bnp) dialog).f(bphVar);
        }
    }
}

package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.livechat.innertube.SupportedPickerPanelWrapper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abkr extends abkc implements abqe {
    public ajvb b;
    private View c;

    @Override // defpackage.abqe
    public final void aF() {
        Activity activity = this.a;
        if (activity == null) {
            return;
        }
        activity.setRequestedOrientation(1);
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        this.b.a(asow.class);
        this.b.a(asqv.class);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [ajos, java.lang.Object] */
    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ajom r;
        Object obj = ((SupportedPickerPanelWrapper) this.m.getParcelable("picker_panel")).a;
        if (obj != null && (r = ahbw.r(this.b.get(), obj, viewGroup)) != null) {
            ajok ajokVar = new ajok();
            ajokVar.f("listenerKey", this);
            r.oB(ajokVar, obj);
            this.c = r.a();
        }
        return this.c;
    }

    @Override // defpackage.abqe
    public final void p() {
        o();
    }

    @Override // defpackage.abqe
    public final void r() {
    }

    @Override // defpackage.abqe
    public final void s() {
        ce ceVar = this.C;
        if (ceVar != null) {
            dd mN = ceVar.mN();
            if (mN.a() > 0) {
                mN.K();
            } else {
                o();
            }
        }
    }
}

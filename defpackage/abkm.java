package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abkm extends abka implements abjq {
    public abjr ae;
    public abji af;
    private Activity ag;
    private int ah;

    private final void aI(int i) {
        Window window;
        Dialog dialog = this.d;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(i);
    }

    private final void aJ() {
        Window window = this.d.getWindow();
        if (window != null) {
            window.setLayout(this.ae.a, -2);
            window.setGravity(this.ae.b);
        }
    }

    @Override // defpackage.abka, defpackage.ce
    public final void U(Activity activity) {
        super.U(activity);
        this.ag = activity;
    }

    public final void aH(Bundle bundle) {
        dd mN = mN();
        if (bundle.get("picker_panel") != null) {
            if (mN.f("purchase_menu_fragment") == null) {
                dn k = mN.k();
                abkr abkrVar = new abkr();
                abkrVar.af(bundle);
                k.u(R.id.content_container, abkrVar, "purchase_menu_fragment");
                k.a();
                mN.aa();
                return;
            }
            return;
        }
        if (bundle.get("navigation_endpoint") == null || mN.f("purchase_flow_fragment") != null) {
            return;
        }
        dn k2 = mN.k();
        abkq abkqVar = new abkq();
        abkqVar.af(bundle);
        k2.u(R.id.content_container, abkqVar, "purchase_flow_fragment");
        if (mN.f("purchase_menu_fragment") != null) {
            k2.s(null);
        }
        k2.a();
        mN.aa();
    }

    @Override // defpackage.abjq
    public final void d() {
        aJ();
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mD() {
        super.mD();
        this.ae.b(this);
        this.af.d();
        aI(this.ah);
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        o(1, 0);
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mS() {
        WindowManager.LayoutParams attributes;
        super.mS();
        aJ();
        this.ae.a(this);
        Window window = this.ag.getWindow();
        if (window != null && (attributes = window.getAttributes()) != null) {
            this.ah = attributes.softInputMode;
        }
        aI(32);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.live_chat_purchase_dialog, viewGroup);
        inflate.setOnClickListener(new abkl(this));
        aH(this.m);
        return inflate;
    }

    @Override // defpackage.bv
    public final Dialog oq(Bundle bundle) {
        Dialog oq = super.oq(bundle);
        oq.requestWindowFeature(1);
        if (oq.getWindow() != null) {
            oq.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        return oq;
    }
}

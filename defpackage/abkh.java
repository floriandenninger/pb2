package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abkh extends abjy implements abjq, abju {
    public aazg ae;
    public abjr af;
    public abjv ag;
    public ajut ah;
    public ajvb ai;
    public Activity aj;
    public abqb ak;
    public asps al;
    public View am;
    public LinearLayout an;
    public ViewGroup ao;
    public View ap;
    private apxf aq;

    private final void aH() {
        Dialog dialog = this.d;
        if (dialog == null || dialog.getWindow() == null) {
            return;
        }
        Window window = this.d.getWindow();
        window.setLayout(this.af.a, -2);
        window.setGravity(this.af.b);
    }

    @Override // defpackage.abjy, defpackage.ce
    public final void U(Activity activity) {
        super.U(activity);
        this.aj = activity;
    }

    @Override // defpackage.ce
    public final void V() {
        super.V();
        this.af.b(this);
    }

    @Override // defpackage.abju
    public final int b() {
        return 2;
    }

    @Override // defpackage.abju
    public final void c() {
        dismiss();
    }

    @Override // defpackage.abjq
    public final void d() {
        aH();
    }

    @Override // defpackage.abju
    public final void i() {
        this.O.setVisibility(0);
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mD() {
        super.mD();
        this.af.b(this);
        this.ao.setVisibility(8);
        this.ap.setVisibility(8);
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        Bundle bundle2 = this.m;
        if (bundle2 == null) {
            dismiss();
            return;
        }
        if (this.aq == null) {
            this.aq = aahg.c(bundle2.getByteArray("navigation_endpoint"));
        }
        ParcelableMessageLite parcelableMessageLite = (ParcelableMessageLite) this.m.getParcelable("live_chat_context_menu_included_renderer");
        if (parcelableMessageLite != null) {
            this.al = (asps) parcelableMessageLite.a(asps.a);
        }
        this.ai.a(asra.class);
        o(1, 0);
        this.af.a(this);
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mS() {
        super.mS();
        aH();
        this.ag.b(this);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.live_chat_context_menu_bottom_sheet_dialog, viewGroup);
        this.am = inflate.findViewById(R.id.progress_bar);
        this.an = (LinearLayout) inflate.findViewById(R.id.menu_container);
        this.ao = (ViewGroup) inflate.findViewById(R.id.header_item_container);
        this.ap = inflate.findViewById(R.id.separator);
        aazg aazgVar = this.ae;
        aazgVar.f(aazgVar.d(this.aq), new abkg(this));
        inflate.setVisibility(8);
        return inflate;
    }

    @Override // defpackage.ce, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (yjk.aa(this.aj) || configuration.orientation != 2) {
            return;
        }
        dismiss();
    }

    @Override // defpackage.bv, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.ag.a(this);
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

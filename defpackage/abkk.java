package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abkk extends abjz {
    public aazg ae;
    public Activity af;
    public abqb ag;
    public View ah;
    public LinearLayout ai;
    private apxf aj;

    @Override // defpackage.abjz, defpackage.ce
    public final void U(Activity activity) {
        super.U(activity);
        this.af = activity;
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        if (this.aj == null) {
            Bundle bundle2 = this.m;
            if (bundle2 == null) {
                dismiss();
            } else {
                this.aj = aahg.c(bundle2.getByteArray("navigation_endpoint"));
            }
        }
    }

    @Override // defpackage.ce, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (yjk.aa(this.af) || configuration.orientation != 2) {
            return;
        }
        dismiss();
    }

    @Override // defpackage.bv
    public final Dialog oq(Bundle bundle) {
        View inflate = LayoutInflater.from(this.af).inflate(R.layout.live_chat_item_context_menu_dialog, (ViewGroup) null);
        this.ah = inflate.findViewById(R.id.progress_bar);
        this.ai = (LinearLayout) inflate.findViewById(R.id.menu_container);
        aazg aazgVar = this.ae;
        aazgVar.f(aazgVar.d(this.aj), new abkj(this));
        mh mhVar = new mh(this.af);
        mhVar.n(R.string.live_chat_item_context_menu_title);
        mhVar.p(inflate);
        mhVar.c(true);
        return mhVar.b();
    }
}

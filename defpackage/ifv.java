package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ifv extends ifo {
    public ifu ae;
    public CoordinatorLayout af;
    public ili ag;
    public gni ah;
    private int ai = 0;

    public static ifv aH(int i) {
        ifv ifvVar = new ifv();
        Bundle bundle = new Bundle();
        bundle.putInt("COMMENT_HEIGHT_KEY", i);
        ifvVar.af(bundle);
        return ifvVar;
    }

    public final void aI(dn dnVar, CoordinatorLayout coordinatorLayout, String str) {
        coordinatorLayout.getClass();
        this.af = coordinatorLayout;
        dnVar.r(this, str);
        dnVar.d();
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        o(0, this.ah.a() == gng.LIGHT ? R.style.ReelBottomSheetDialogTheme_Light : R.style.ReelBottomSheetDialogTheme_Dark);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ai = this.ag.b();
        this.d.setOnShowListener(new DialogInterface.OnShowListener() { // from class: ift
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ifv ifvVar = ifv.this;
                Bundle bundle2 = ifvVar.m;
                if (bundle2 != null) {
                    CoordinatorLayout coordinatorLayout = ifvVar.af;
                    if (coordinatorLayout == null || coordinatorLayout.getParent() == null || !((View) ifvVar.af.getParent()).isAttachedToWindow()) {
                        ifvVar.onDismiss(dialogInterface);
                    } else {
                        BottomSheetBehavior.x((View) ifvVar.af.getParent()).F(bundle2.getInt("COMMENT_HEIGHT_KEY"));
                        ifvVar.af.getParent().requestLayout();
                    }
                }
            }
        });
        return this.af;
    }

    @Override // defpackage.bv, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        CoordinatorLayout coordinatorLayout = this.af;
        if (coordinatorLayout != null && coordinatorLayout.getParent() != null) {
            ((ViewGroup) this.af.getParent()).removeView(this.af);
            this.af = null;
        }
        this.ag.c(this.ai);
        this.ai = 0;
        ifu ifuVar = this.ae;
        if (ifuVar != null) {
            igf igfVar = (igf) ifuVar;
            igfVar.c();
            InteractionLoggingScreen interactionLoggingScreen = igfVar.g;
            if (interactionLoggingScreen != null) {
                igfVar.d.B(interactionLoggingScreen);
            }
        }
        super.onDismiss(dialogInterface);
    }
}

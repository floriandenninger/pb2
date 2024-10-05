package defpackage;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hnk extends nh {
    public View af;
    public hog ah;
    private FrameLayout ai;
    private boolean aj;
    public boolean ae = false;
    public boolean ag = true;

    private final void aG() {
        ci C = C();
        if (C != null) {
            C.getWindow().clearFlags(128);
        }
    }

    private final void aH() {
        ci C = C();
        if (C != null) {
            C.getWindow().addFlags(128);
        }
    }

    @Override // defpackage.ce
    public final void X() {
        super.X();
        hog hogVar = this.ah;
        if (hogVar != null) {
            hogVar.a.n();
        }
        aG();
    }

    @Override // defpackage.ce
    public final void Z() {
        super.Z();
        hog hogVar = this.ah;
        if (hogVar != null) {
            hogVar.a.o();
        }
        aH();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aF() {
        this.ai.removeAllViews();
        if (this.af.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.af.getParent()).removeView(this.af);
        }
        if (this.af.getParent() == null) {
            this.ai.addView(this.af);
        }
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        Bundle bundle2 = this.m;
        if (bundle2 != null) {
            this.aj = bundle2.getBoolean("OverlayDialogFragment.enableMusicToSoundRename", false);
        }
        o(1, R.style.Theme.Material.NoActionBar.Fullscreen);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final int i = 0;
        View inflate = layoutInflater.inflate(com.google.android.youtube.R.layout.overlay_dialog_fragment_container, viewGroup, false);
        this.ai = (FrameLayout) inflate.findViewById(com.google.android.youtube.R.id.overlay_dialog_fragment_contents);
        View findViewById = inflate.findViewById(com.google.android.youtube.R.id.overlay_dialog_fragment_delete_button);
        if (this.aj) {
            findViewById.setContentDescription(O(com.google.android.youtube.R.string.delete_sound_option));
        }
        final int i2 = 1;
        if (this.ag) {
            findViewById.setOnClickListener(new View.OnClickListener(this) { // from class: hnj
                public final /* synthetic */ hnk a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (i2 == 0) {
                        this.a.dismiss();
                        return;
                    }
                    hnk hnkVar = this.a;
                    hog hogVar = hnkVar.ah;
                    if (hogVar != null) {
                        hogVar.a.f.j();
                        hogVar.a.m();
                        hogVar.a.D.a(acsb.c(127993)).b();
                    }
                    hnkVar.dismiss();
                }
            });
        } else {
            findViewById.setVisibility(8);
        }
        inflate.findViewById(com.google.android.youtube.R.id.overlay_dialog_fragment_done).setOnClickListener(new View.OnClickListener(this) { // from class: hnj
            public final /* synthetic */ hnk a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i == 0) {
                    this.a.dismiss();
                    return;
                }
                hnk hnkVar = this.a;
                hog hogVar = hnkVar.ah;
                if (hogVar != null) {
                    hogVar.a.f.j();
                    hogVar.a.m();
                    hogVar.a.D.a(acsb.c(127993)).b();
                }
                hnkVar.dismiss();
            }
        });
        this.ae = true;
        if (this.af != null) {
            aF();
        }
        aH();
        return inflate;
    }

    @Override // defpackage.bv, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        hog hogVar = this.ah;
        if (hogVar != null) {
            hogVar.a.m();
        }
        aG();
    }

    @Override // defpackage.nh, defpackage.bv
    public final Dialog oq(Bundle bundle) {
        Dialog oq = super.oq(bundle);
        Window window = oq.getWindow();
        Context qR = qR();
        if (window != null && qR != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(aih.d(qR, com.google.android.youtube.R.color.yt_black_pure_opacity60));
            window.setBackgroundDrawable(gradientDrawable);
        }
        hog hogVar = this.ah;
        if (hogVar != null) {
            hogVar.a.p();
        }
        return oq;
    }
}

package defpackage;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class zza extends algk {
    private String aC;
    public View ae;
    public View af;
    public YouTubeTextView ag;
    View ah;
    public FrameLayout ai;
    public zyz ak;
    public Context al;
    public CharSequence am;
    public View an;
    public View ao;
    public Boolean ap;
    public boolean aq;
    algb av;
    private FrameLayout aw;
    public boolean aj = false;
    private boolean ax = true;
    private boolean ay = false;
    private boolean az = true;
    private boolean aA = false;
    private boolean aB = false;
    public float ar = 0.0f;
    public float as = 0.0f;
    public int at = 0;
    int au = 0;
    private boolean aD = true;

    @Override // defpackage.ce
    public final void S(Bundle bundle) {
        super.S(bundle);
        View view = this.O;
        if (view == null || view.getParent() == null) {
            return;
        }
        View view2 = (View) this.O.getParent();
        view2.setBackgroundResource(R.color.transparent);
        view2.setFitsSystemWindows(false);
        view2.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: zyu
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view3, WindowInsets windowInsets) {
                return windowInsets;
            }
        });
    }

    @Override // defpackage.ce
    public final void X() {
        super.X();
        Dialog dialog = this.d;
        if (dialog != null && dialog.getWindow() != null) {
            this.d.getWindow().setWindowAnimations(com.google.android.youtube.R.style.ReelsBottomSheetDialog_SlideOutOnly);
        }
        zyz zyzVar = this.ak;
        if (zyzVar != null) {
            zyzVar.j();
        }
    }

    @Override // defpackage.ce
    public final void Z() {
        super.Z();
        zyz zyzVar = this.ak;
        if (zyzVar != null) {
            zyzVar.k();
        }
    }

    public final void aF() {
        this.ai.removeAllViews();
        View view = this.an;
        if (view != null && (view.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.an.getParent()).removeView(this.an);
        }
        View view2 = this.an;
        if (view2 == null || view2.getParent() != null) {
            return;
        }
        this.ai.addView(this.an);
    }

    public final void aG(boolean z) {
        this.af.setVisibility(true != z ? 8 : 0);
    }

    protected void aH() {
        o(0, com.google.android.youtube.R.style.ReelsBottomSheetDialog_NonImmersive);
    }

    public final void aI() {
        this.ag.setText(this.am);
    }

    public final void aJ() {
        this.aw.removeAllViews();
        if (this.ao.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.ao.getParent()).removeView(this.ao);
        }
        if (this.ao.getParent() == null) {
            this.aw.addView(this.ao);
        }
    }

    public final boolean aK() {
        if (C() != null && !C().isDestroyed() && !C().isFinishing() && !this.H && !this.s && ar()) {
            if (at()) {
                return true;
            }
            if (Build.VERSION.SDK_INT >= 24 && C().isInMultiWindowMode()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        aH();
        Bundle bundle2 = this.m;
        if (bundle2 != null) {
            this.ax = bundle2.getBoolean("ReelsBottomSheetDialogRoundCorners", true);
            this.aC = this.m.getString("ReelsBottomSheetDialogTextureCloseButtonKey", null);
            this.az = this.m.getBoolean("ReelsBottomSheetDialogDimBackgroundKey", true);
            this.aA = this.m.getBoolean("ReelsBottomSheetDialoginitExpandedKey", false);
            this.aB = this.m.getBoolean("ReelsBottomSheetDialogDropShadowKey", false);
            this.ar = this.m.getFloat("ReelsBottomSheetDialogMinHeightKey", 0.0f);
            this.as = this.m.getFloat("ReelsBottomSheetDialogMaxDefaultHeightKey", 0.0f);
            this.aD = this.m.getBoolean("ReelsBottomSheetDialogDraggableKey", true);
            this.ay = this.m.getBoolean("ReelsBottomSheetDialogTopViewKey", false);
        }
        this.at = C().getResources().getDimensionPixelSize(com.google.android.youtube.R.dimen.reels_bottom_sheet_header_drop_shadow_elevation);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        this.ae = layoutInflater.inflate(true != this.ax ? com.google.android.youtube.R.layout.bottom_sheet_modal_container_square_corners : com.google.android.youtube.R.layout.bottom_sheet_modal_container_round_corners, viewGroup, false);
        if (this.ay) {
            view = layoutInflater.inflate(com.google.android.youtube.R.layout.bottom_sheet_with_top_view, viewGroup, false);
            this.aw = (FrameLayout) view.findViewById(com.google.android.youtube.R.id.top_view_container);
            ((RelativeLayout) view.findViewById(com.google.android.youtube.R.id.modal_view_container)).addView(this.ae);
        } else {
            view = null;
        }
        this.ag = (YouTubeTextView) this.ae.findViewById(com.google.android.youtube.R.id.bottom_sheet_title);
        this.ai = (FrameLayout) this.ae.findViewById(com.google.android.youtube.R.id.bottom_sheet_contents);
        this.af = this.ae.findViewById(com.google.android.youtube.R.id.header_container);
        Display defaultDisplay = ((WindowManager) qR().getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.au = point.y;
        if (this.aC == null) {
            this.ah = this.ae.findViewById(com.google.android.youtube.R.id.bottom_sheet_close_button);
        } else {
            View findViewById = this.ae.findViewById(com.google.android.youtube.R.id.bottom_sheet_done_text);
            this.ah = findViewById;
            ((Button) findViewById).setText(this.aC);
        }
        this.ah.setVisibility(0);
        this.ah.setOnClickListener(new View.OnClickListener() { // from class: zyv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                zza zzaVar = zza.this;
                zyz zyzVar = zzaVar.ak;
                if (zyzVar != null) {
                    zyzVar.A();
                }
                if (zzaVar.aK()) {
                    zzaVar.dismiss();
                } else {
                    zga.l("Invalid fragment state while attempting to dismiss (close button clicked)");
                }
            }
        });
        this.aj = true;
        if (this.am != null) {
            aI();
        }
        if (this.an != null) {
            aF();
        }
        Boolean bool = this.ap;
        if (bool != null) {
            aG(bool.booleanValue());
        }
        if (this.aA) {
            View view2 = this.ae;
            view2.getViewTreeObserver().addOnGlobalLayoutListener(new zyy(this, view2));
        }
        if (this.ao != null) {
            aJ();
        }
        return this.ay ? view : this.ae;
    }

    @Override // defpackage.bv, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        zyz zyzVar = this.ak;
        if (zyzVar != null) {
            zyzVar.d();
        }
        if (this.av != null) {
            algj algjVar = (algj) this.d;
            if (algjVar.a() != null) {
                algjVar.a().A(this.av);
            }
        }
    }

    @Override // defpackage.algk, defpackage.nh, defpackage.bv
    public Dialog oq(Bundle bundle) {
        Context context = this.al;
        if (context == null) {
            context = qR();
        }
        zyw zywVar = new zyw(this, context, this.b);
        if (!this.az) {
            zywVar.getWindow().clearFlags(2);
        }
        if (this.aA) {
            zywVar.a().G(3);
        }
        zywVar.a().s = this.aD;
        if (this.aB) {
            this.av = new zyx(this);
            zywVar.a().y(this.av);
        }
        zywVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: zyt
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                zza zzaVar = zza.this;
                if (zzaVar.ai.getChildCount() == 0 && zzaVar.ag.getText().length() == 0) {
                    if (zzaVar.aK()) {
                        zzaVar.dismiss();
                        return;
                    } else {
                        zga.l("Invalid fragment state while attempting to dismiss (empty contents)");
                        return;
                    }
                }
                zyz zyzVar = zzaVar.ak;
                if (zyzVar != null) {
                    zyzVar.e();
                }
            }
        });
        return zywVar;
    }
}

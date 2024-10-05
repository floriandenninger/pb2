package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class klr implements kig {
    private final ProgressBar a;
    private final boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;

    public klr(View view, aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        this.b = (asvuVar == null ? asvu.a : asvuVar).bC;
        Resources resources = view.getResources();
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.player_loading_view_thin);
        this.a = progressBar;
        tjr tjrVar = new tjr(-1.0f, resources.getDimensionPixelSize(R.dimen.buffering_progress_max_thickness), resources.getDimensionPixelSize(R.dimen.buffering_progress_inset), new int[]{resources.getColor(R.color.buffering_progress_color)});
        tjrVar.setAlpha(resources.getInteger(R.integer.buffering_progress_transparency));
        progressBar.setIndeterminateDrawable(tjrVar);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.buffering_progress_min_size);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.buffering_progress_max_size);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.buffering_progress_min_thickness);
        int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.buffering_progress_max_thickness);
        int dimensionPixelSize5 = resources.getDimensionPixelSize(R.dimen.buffering_progress_margin);
        progressBar.getClass();
        View view2 = (View) progressBar.getParent();
        view2.getClass();
        tjr tjrVar2 = (tjr) progressBar.getIndeterminateDrawable();
        tjrVar2.getClass();
        view2.addOnLayoutChangeListener(new fxq(progressBar, tjrVar2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize5 + dimensionPixelSize5));
    }

    private final void a() {
        this.a.setVisibility(true != (this.c && ((!this.d || this.e) && !this.f)) ? 4 : 0);
    }

    @Override // defpackage.kig
    public final /* synthetic */ void i(ControlsOverlayStyle controlsOverlayStyle) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void m(fhg fhgVar) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nA(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nB(zcp zcpVar) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nC(boolean z) {
    }

    @Override // defpackage.kig
    public final void nD(boolean z) {
        if (this.d == z) {
            return;
        }
        this.d = z;
        a();
    }

    @Override // defpackage.kig
    public final void nF(ControlsState controlsState) {
        boolean z = this.c;
        boolean z2 = true;
        if (!controlsState.b && controlsState.a != ahvo.NEW) {
            z2 = false;
        }
        this.c = z2;
        if (z != z2) {
            a();
        }
    }

    @Override // defpackage.kig
    public final void nX(boolean z) {
        this.e = z;
        a();
    }

    @Override // defpackage.kig
    public final void nY(boolean z) {
        if (!this.b || this.f == z) {
            return;
        }
        this.f = z;
        a();
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nz(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void p(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void q(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void r(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void s(boolean z) {
    }
}

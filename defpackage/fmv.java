package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class fmv extends fmf {
    public final fna e;
    public boolean f;
    public boolean g;
    private boolean h;
    private boolean i;
    private boolean j;

    public fmv(Context context, fna fnaVar, fng fngVar) {
        super(fnaVar, fngVar);
        this.e = fnaVar;
        Resources resources = context.getResources();
        this.b.h = resources.getColor(R.color.inline_time_bar_progress_color);
        this.b.f = resources.getColor(R.color.inline_time_bar_buffered_color);
        this.b.g = resources.getColor(R.color.inline_time_bar_buffered_highlighted_color);
        this.b.i = resources.getColor(R.color.inline_time_bar_played_not_highlighted_color);
        this.i = true;
    }

    private final void e(boolean z, boolean z2) {
        this.h = z;
        t(z2);
    }

    @Override // defpackage.fmf
    public final void b(boolean z) {
        super.b(z);
        e(false, z);
    }

    @Override // defpackage.fmf
    public void i(ControlsOverlayStyle controlsOverlayStyle) {
        super.i(controlsOverlayStyle);
        this.j = ControlsOverlayStyle.a(controlsOverlayStyle);
        this.i = controlsOverlayStyle.p;
        nR();
        t(false);
    }

    @Override // defpackage.fmf
    public final void k(boolean z) {
        super.k(z);
        e(true, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fmf
    public final void l() {
        long j;
        if (this.e.kO()) {
            j = this.e.c();
        } else {
            j = this.b.c;
        }
        this.c.g(ahbj.d(j, this.b.a));
    }

    public final void nN() {
        l();
        nS();
    }

    public final void nO() {
        this.e.p(!this.g);
    }

    public final void nP(float f) {
        this.e.setAlpha(f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void nQ(int i) {
        this.e.u(i);
    }

    public final void nR() {
        fna fnaVar = this.e;
        boolean z = true;
        if (!this.j && this.f) {
            z = false;
        }
        fnaVar.s(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fmf
    public final void nS() {
        long kQ;
        if (this.b.a > 0) {
            aidv aidvVar = this.d;
            if ((aidvVar == null || !aidvVar.i()) && this.e.kO()) {
                kQ = this.e.kQ();
            } else {
                kQ = this.e.kJ();
            }
            this.c.e(a(kQ), a(this.b.a - kQ), a(this.b.a));
        }
    }

    public final void t(boolean z) {
        boolean z2 = true;
        boolean z3 = this.i && this.h;
        if (this.f && !z3) {
            z2 = false;
        }
        this.e.x(z2, z);
        if (z2) {
            nO();
        }
    }
}

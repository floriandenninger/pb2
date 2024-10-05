package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alui extends vw {
    public View d;
    private final vw e;
    private final js f;

    public alui(vw vwVar) {
        aluh aluhVar = new aluh(this);
        this.f = aluhVar;
        this.e = vwVar;
        vwVar.u(aluhVar);
        q(vwVar.b);
    }

    @Override // defpackage.vw
    public final int b() {
        int b = this.e.b();
        return this.d != null ? b + 1 : b;
    }

    @Override // defpackage.vw
    public final int c(int i) {
        if (this.d != null) {
            i--;
        }
        if (i < 0) {
            return Integer.MAX_VALUE;
        }
        return this.e.c(i);
    }

    @Override // defpackage.vw
    public final wv f(ViewGroup viewGroup, int i) {
        if (i == Integer.MAX_VALUE) {
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            return new aluj(frameLayout);
        }
        return this.e.f(viewGroup, i);
    }

    @Override // defpackage.vw
    public final long mu(int i) {
        if (this.d != null) {
            i--;
        }
        if (i < 0) {
            return Long.MAX_VALUE;
        }
        return this.e.mu(i);
    }

    @Override // defpackage.vw
    public final void o(wv wvVar, int i) {
        View view = this.d;
        if (view != null) {
            i--;
        }
        if (!(wvVar instanceof aluj)) {
            this.e.o(wvVar, i);
        } else {
            if (view == null) {
                throw new IllegalStateException("HeaderViewHolder cannot find mHeader");
            }
            if (view.getParent() != null) {
                ((ViewGroup) this.d.getParent()).removeView(this.d);
            }
            ((FrameLayout) wvVar.a).addView(this.d);
        }
    }
}

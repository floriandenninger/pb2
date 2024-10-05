package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.common.widget.ActiveItemIndicatorView;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mlr implements mln {
    public final ActiveItemIndicatorView a;
    apoj b;
    private final Context c;

    public mlr(Context context, ActiveItemIndicatorView activeItemIndicatorView) {
        this.c = context;
        this.a = activeItemIndicatorView;
    }

    @Override // defpackage.mln
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.mln
    public final void b(apoj apojVar) {
        int i;
        int i2;
        this.b = apojVar;
        int size = apojVar.c.size();
        Iterator it = ((List) this.b.pX(apoh.d)).iterator();
        while (it.hasNext()) {
            if (!amkq.b((apok) it.next(), apok.a)) {
                size--;
            }
        }
        if (size > 0) {
            ActiveItemIndicatorView activeItemIndicatorView = this.a;
            activeItemIndicatorView.d = size;
            float[] fArr = activeItemIndicatorView.b;
            if (fArr == null || fArr.length != size + size) {
                activeItemIndicatorView.b = new float[size + size];
            }
            int aH = anaf.aH(this.b.e);
            if (aH == 0) {
                aH = 1;
            }
            if (aH - 1 == 1) {
                this.a.b(2);
                i = 81;
                i2 = 0;
            } else {
                i2 = this.c.getResources().getDimensionPixelSize(R.dimen.promo_panel_text_layout_start_end_margin);
                this.a.b(1);
                i = 8388693;
            }
            yny.z(this.a, yny.h(yny.m(i), yny.q(i2)), FrameLayout.LayoutParams.class);
            return;
        }
        d(false);
    }

    @Override // defpackage.mln
    public final void c(int i) {
        ActiveItemIndicatorView activeItemIndicatorView = this.a;
        if (i < 0 || i >= activeItemIndicatorView.d) {
            throw new IllegalStateException("Selections not within bounds");
        }
        activeItemIndicatorView.e = i;
        activeItemIndicatorView.c();
        activeItemIndicatorView.invalidate();
    }

    @Override // defpackage.mln
    public final void d(boolean z) {
        whu.I(this.a, z);
    }
}

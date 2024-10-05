package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xkv extends xkt {
    public boolean a;
    private final ajyf f;
    private final acra g;
    private int h;
    private int i;

    public xkv(ajyf ajyfVar, acra acraVar) {
        super(xju.b().a());
        this.f = ajyfVar;
        acraVar.getClass();
        this.g = acraVar;
    }

    @Override // defpackage.xkt
    public final /* synthetic */ void b(Object obj, boolean z) {
        int i;
        xju xjuVar = (xju) obj;
        if (xjuVar.b && !((xju) this.b).b) {
            this.f.b(xjuVar.a, this.g);
        }
        this.f.d(xjuVar.b);
        xju xjuVar2 = (xju) this.b;
        boolean z2 = xjuVar2.d;
        boolean z3 = xjuVar.d;
        boolean z4 = xjuVar2.c;
        boolean z5 = xjuVar.c;
        boolean z6 = z && xjuVar.b && !this.a;
        if (z6 && (z2 != z3 || z4 != z5)) {
            boolean z7 = xjuVar.e;
            if (z3 || (z7 && z5)) {
                i = this.i;
            } else {
                i = this.h;
            }
            yny.z((View) this.c, yny.k(i), ViewGroup.MarginLayoutParams.class);
        }
        ((TextView) this.c).setVisibility(true != z6 ? 8 : 0);
    }

    @Override // defpackage.xkt
    public final void d() {
        this.h = ((TextView) this.c).getResources().getDimensionPixelSize(R.dimen.ad_reengagement_default_bottom_margin);
        this.i = ((TextView) this.c).getResources().getDimensionPixelSize(R.dimen.ad_reengagement_cta_bottom_margin);
    }
}

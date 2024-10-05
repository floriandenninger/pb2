package defpackage;

import android.view.ViewGroup;
import android.widget.GridLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zhg implements zhh {
    private final GridLayout.Spec a;
    private final /* synthetic */ int b;

    public zhg(GridLayout.Spec spec, int i) {
        this.b = i;
        this.a = spec;
    }

    @Override // defpackage.zhh
    public final /* synthetic */ boolean a(ViewGroup.LayoutParams layoutParams) {
        if (this.b == 0) {
            GridLayout.LayoutParams layoutParams2 = (GridLayout.LayoutParams) layoutParams;
            if (amkq.b(this.a, layoutParams2.rowSpec)) {
                return false;
            }
            layoutParams2.rowSpec = this.a;
            return true;
        }
        GridLayout.LayoutParams layoutParams3 = (GridLayout.LayoutParams) layoutParams;
        if (amkq.b(this.a, layoutParams3.columnSpec)) {
            return false;
        }
        layoutParams3.columnSpec = this.a;
        return true;
    }
}

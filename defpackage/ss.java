package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ss extends PopupWindow {
    public ss(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        yk l = yk.l(context, attributeSet, nx.r, i, 0);
        if (l.q(2)) {
            jk.d(this, l.p(2, false));
        }
        setBackgroundDrawable(l.h(0));
        l.o();
    }
}

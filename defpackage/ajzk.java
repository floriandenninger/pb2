package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajzk extends drm {
    private final LinearLayoutManager b;
    private final ViewGroup.LayoutParams c;

    public ajzk(LinearLayoutManager linearLayoutManager, ViewGroup.LayoutParams layoutParams) {
        super(linearLayoutManager);
        this.b = linearLayoutManager;
        this.c = layoutParams;
    }

    @Override // defpackage.drm
    public final int f(int i, dte dteVar) {
        ViewGroup.LayoutParams layoutParams;
        if (this.b.i != 0 || (layoutParams = this.c) == null || layoutParams.height != -2) {
            return super.f(i, dteVar);
        }
        return View.MeasureSpec.makeMeasureSpec(0, 0);
    }
}

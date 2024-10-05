package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.ScrollToTopLinearLayoutManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fyk extends wr {
    final /* synthetic */ ScrollToTopLinearLayoutManager a;
    private final boolean n;
    private final int o;
    private float p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyk(ScrollToTopLinearLayoutManager scrollToTopLinearLayoutManager, Context context, boolean z, int i) {
        super(context);
        this.a = scrollToTopLinearLayoutManager;
        this.n = z;
        this.o = (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wr
    public final float a(DisplayMetrics displayMetrics) {
        int i;
        if (this.p == 0.0f && (i = this.a.b) != 0) {
            this.p = 300.0f / Math.abs(i);
        }
        float a = super.a(displayMetrics);
        float f = this.p;
        return (f == 0.0f || (!this.n && f > a)) ? a : f;
    }

    @Override // defpackage.wr
    public final PointF d(int i) {
        return this.a.O(i);
    }

    @Override // defpackage.wr
    public final int i(View view, int i) {
        return super.i(view, i) - this.o;
    }

    @Override // defpackage.wr
    protected final int l() {
        return -1;
    }
}

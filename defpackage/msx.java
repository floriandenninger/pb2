package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class msx extends FrameLayout {
    public double a;

    public msx(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        if (this.a == 0.0d) {
            return;
        }
        this.a = 0.0d;
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (this.a == 0.0d) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        double d = this.a;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        double d2 = size;
        Double.isNaN(d2);
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) (d2 / d), 1073741824));
    }
}

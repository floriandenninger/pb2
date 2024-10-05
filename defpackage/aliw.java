package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aliw extends alip {
    public final int g;
    public final int h;
    public final int i;

    public aliw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        TypedArray a = alig.a(context, attributeSet, aljp.b, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        int d = alkd.d(context, a, 2, dimensionPixelSize);
        int i = this.a;
        this.g = Math.max(d, i + i);
        this.h = alkd.d(context, a, 1, dimensionPixelSize2);
        this.i = a.getInt(0, 0);
        a.recycle();
    }

    @Override // defpackage.alip
    public final void a() {
    }
}

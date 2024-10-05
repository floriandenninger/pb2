package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aljo extends alip {
    public final int g;
    public final int h;
    public boolean i;

    public aljo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        TypedArray a = alig.a(context, attributeSet, aljp.c, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        this.g = a.getInt(0, 1);
        int i = a.getInt(1, 0);
        this.h = i;
        a.recycle();
        a();
        this.i = i == 1;
    }

    @Override // defpackage.alip
    public final void a() {
        if (this.g == 0) {
            if (this.b > 0) {
                throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
            }
            if (this.c.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }
}

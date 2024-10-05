package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aivh extends ViewGroup.LayoutParams {
    public final boolean a;

    public aivh(int i, int i2, boolean z) {
        super(i, i2);
        this.a = z;
    }

    public aivh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ahap.a);
        this.a = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    public aivh(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = true;
    }
}

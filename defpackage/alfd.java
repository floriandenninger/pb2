package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alfd extends LinearLayout.LayoutParams {
    public int a;
    public alfc b;
    public Interpolator c;

    public alfd() {
        super(-1, -2);
        this.a = 1;
    }

    public alfd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, alfo.b);
        this.a = obtainStyledAttributes.getInt(1, 0);
        this.b = obtainStyledAttributes.getInt(0, 0) == 1 ? new alfc(null) : null;
        if (obtainStyledAttributes.hasValue(2)) {
            this.c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
        }
        obtainStyledAttributes.recycle();
    }

    public alfd(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 1;
    }

    public alfd(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.a = 1;
    }

    public alfd(LinearLayout.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 1;
    }
}

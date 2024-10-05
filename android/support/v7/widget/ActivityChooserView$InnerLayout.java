package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import defpackage.yk;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {
    private static final int[] a = {R.attr.background};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        yk k = yk.k(context, attributeSet, a);
        setBackgroundDrawable(k.h(0));
        k.o();
    }
}

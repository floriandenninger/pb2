package com.google.android.apps.youtube.app.extensions.subscriptions.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MinWidthVisibleTextView extends YouTubeTextView {
    private int a;

    public MinWidthVisibleTextView(Context context) {
        super(context);
        this.a = getVisibility();
    }

    final void a(int i, boolean z) {
        if (z) {
            this.a = i;
        }
        super.setVisibility(i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (getVisibility() != 8 && (getVisibility() != 4 || this.a != 4)) {
            if ((View.MeasureSpec.getMode(i) == 0 ? Integer.MAX_VALUE : View.MeasureSpec.getSize(i)) >= getMinimumWidth()) {
                int visibility = getVisibility();
                int i3 = this.a;
                if (visibility != i3) {
                    a(i3, false);
                }
                super.onMeasure(i, i2);
                return;
            }
            if (getVisibility() != 4) {
                a(4, false);
            }
            setMeasuredDimension(0, 0);
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        a(i, true);
    }

    public MinWidthVisibleTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = getVisibility();
    }

    public MinWidthVisibleTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = getVisibility();
    }
}

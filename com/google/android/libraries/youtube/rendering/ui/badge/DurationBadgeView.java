package com.google.android.libraries.youtube.rendering.ui.badge;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class DurationBadgeView extends YouTubeTextView {
    public int[] c;
    private static final int[] d = {R.attr.state_live};
    public static final int[] a = {R.attr.state_premiere};
    public static final int[] b = {R.attr.state_shorts};

    public DurationBadgeView(Context context) {
        this(context, null);
    }

    private final void f() {
        setBackgroundResource(R.drawable.duration_background);
    }

    public final void a() {
        if (this.c != null) {
            this.c = null;
            refreshDrawableState();
        }
    }

    public final void e() {
        int[] iArr = this.c;
        int[] iArr2 = d;
        if (iArr != iArr2) {
            this.c = iArr2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        return this.c != null ? mergeDrawableStates(super.onCreateDrawableState(i + 1), this.c) : super.onCreateDrawableState(i);
    }

    public DurationBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DurationBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        f();
    }

    public DurationBadgeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        f();
    }
}

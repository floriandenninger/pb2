package com.google.android.apps.youtube.app.watch.panel.ui;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlaylistLoopButtonView extends AppCompatImageView {
    public static final int[] a = {R.attr.state_loop_one};
    public int[] b;

    public PlaylistLoopButtonView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArr = this.b;
        return iArr != null ? mergeDrawableStates(super.onCreateDrawableState(i + 1), iArr) : super.onCreateDrawableState(i);
    }

    public PlaylistLoopButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlaylistLoopButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

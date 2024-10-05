package com.google.android.apps.youtube.app.ui.actionbar;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ElevatedAppBarLayout extends AppBarLayout {
    public float a;

    public ElevatedAppBarLayout(Context context) {
        super(context);
    }

    public final void b(boolean z) {
        super.setElevation(z ? 0.0f : this.a);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = getResources().getDimensionPixelSize(R.dimen.appbar_layout_elevation);
    }

    @Override // com.google.android.material.appbar.AppBarLayout, android.view.View
    public final void setElevation(float f) {
        super.setElevation(this.a);
    }

    public ElevatedAppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

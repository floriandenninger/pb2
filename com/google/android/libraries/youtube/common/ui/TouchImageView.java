package com.google.android.libraries.youtube.common.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class TouchImageView extends ImageView {
    private boolean a;

    public TouchImageView(Context context) {
        super(context);
        this.a = false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.a = true;
            setPressed(true);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setPressed(boolean z) {
        if (!z || this.a) {
            this.a = false;
            super.setPressed(z);
        }
    }

    public TouchImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = false;
    }
}

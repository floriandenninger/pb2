package com.google.android.libraries.user.profile.photopicker.fragment.suggestiontabs.v2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import defpackage.axxp;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PhotoPickerViewPager extends ViewPager {
    public PhotoPickerViewPager(Context context) {
        super(context);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (axxp.i() || !axxp.c()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (axxp.i() || !axxp.c()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.viewpager.widget.ViewPager
    public final boolean s(View view, boolean z, int i, int i2, int i3) {
        if (!super.s(view, z, i, i2, i3)) {
            if (!z || !axxp.i()) {
                return false;
            }
            if (!view.canScrollHorizontally(-1) && !view.canScrollHorizontally(1)) {
                return false;
            }
        }
        return true;
    }

    public PhotoPickerViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

package com.google.android.libraries.youtube.edit.camera;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RotateLayout extends ViewGroup {
    public int a;
    private View b;

    public RotateLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundResource(R.color.transparent);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        View childAt = getChildAt(0);
        this.b = childAt;
        childAt.setPivotX(0.0f);
        this.b.setPivotY(0.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = this.a;
        if (i7 != 0) {
            if (i7 != 90) {
                if (i7 != 180) {
                    if (i7 != 270) {
                        return;
                    }
                }
            }
            this.b.layout(0, 0, i6, i5);
            return;
        }
        this.b.layout(0, 0, i5, i6);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.a
            r1 = 0
            r2 = 270(0x10e, float:3.78E-43)
            r3 = 180(0xb4, float:2.52E-43)
            r4 = 90
            if (r0 == 0) goto L25
            if (r0 == r4) goto L13
            if (r0 == r3) goto L25
            if (r0 == r2) goto L13
            r6 = 0
            goto L36
        L13:
            android.view.View r0 = r5.b
            r5.measureChild(r0, r7, r6)
            android.view.View r6 = r5.b
            int r1 = r6.getMeasuredHeight()
            android.view.View r6 = r5.b
            int r6 = r6.getMeasuredWidth()
            goto L36
        L25:
            android.view.View r0 = r5.b
            r5.measureChild(r0, r6, r7)
            android.view.View r6 = r5.b
            int r1 = r6.getMeasuredWidth()
            android.view.View r6 = r5.b
            int r6 = r6.getMeasuredHeight()
        L36:
            r5.setMeasuredDimension(r1, r6)
            int r7 = r5.a
            r0 = 0
            if (r7 == 0) goto L6a
            if (r7 == r4) goto L5e
            if (r7 == r3) goto L51
            if (r7 == r2) goto L45
            goto L74
        L45:
            android.view.View r6 = r5.b
            float r7 = (float) r1
            r6.setTranslationX(r7)
            android.view.View r6 = r5.b
            r6.setTranslationY(r0)
            goto L74
        L51:
            android.view.View r7 = r5.b
            float r0 = (float) r1
            r7.setTranslationX(r0)
            android.view.View r7 = r5.b
            float r6 = (float) r6
            r7.setTranslationY(r6)
            goto L74
        L5e:
            android.view.View r7 = r5.b
            r7.setTranslationX(r0)
            android.view.View r7 = r5.b
            float r6 = (float) r6
            r7.setTranslationY(r6)
            goto L74
        L6a:
            android.view.View r6 = r5.b
            r6.setTranslationX(r0)
            android.view.View r6 = r5.b
            r6.setTranslationY(r0)
        L74:
            android.view.View r6 = r5.b
            int r7 = r5.a
            int r7 = -r7
            float r7 = (float) r7
            r6.setRotation(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.edit.camera.RotateLayout.onMeasure(int, int):void");
    }
}

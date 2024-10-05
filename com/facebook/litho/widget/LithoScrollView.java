package com.facebook.litho.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import defpackage.ajbh;
import defpackage.diq;
import defpackage.djj;
import defpackage.dkp;
import defpackage.dqz;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LithoScrollView extends NestedScrollView implements djj {
    public final dkp d;
    public ViewTreeObserver.OnPreDrawListener e;
    public boolean f;
    public dqz g;
    public ajbh h;
    private diq i;

    public LithoScrollView(Context context) {
        this(context, null);
    }

    @Override // defpackage.djj
    public final void a(List list) {
        list.add(this.d);
    }

    @Override // defpackage.djh
    public final diq b() {
        return this.i;
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return super.dispatchNestedFling(f, f2, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        diq diqVar = this.i;
        if (diqVar != null) {
            diqVar.a(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        dqz dqzVar = this.g;
        if (dqzVar != null) {
            dqzVar.a(this);
        }
    }

    @Override // android.support.v4.widget.NestedScrollView
    public final void i(int i) {
        super.i(i);
        dqz dqzVar = this.g;
        if (dqzVar != null) {
            dqzVar.d();
        }
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.widget.NestedScrollView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f) {
            this.d.A();
        }
        ajbh ajbhVar = this.h;
        if (ajbhVar != null) {
            ajbhVar.i = getScrollY();
        }
        dqz dqzVar = this.g;
        if (dqzVar != null) {
            dqzVar.b(this);
        }
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        dqz dqzVar = this.g;
        if (dqzVar != null) {
            dqzVar.c(this, motionEvent);
        }
        return onTouchEvent;
    }

    @Override // defpackage.djh
    public final void r(diq diqVar) {
        this.i = diqVar;
    }

    public LithoScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LithoScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        dkp dkpVar = new dkp(context);
        this.d = dkpVar;
        addView(dkpVar);
    }
}

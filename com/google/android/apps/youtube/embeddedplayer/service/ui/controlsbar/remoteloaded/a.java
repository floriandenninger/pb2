package com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded;

import android.content.Context;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.ahvb;
import defpackage.amkq;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a extends ViewGroup implements View.OnClickListener {
    public int a;
    public int b;
    public int c;
    public c d;
    public View e;
    public f f;
    public ImageButton g;
    public ImageButton h;
    public ahvb i;
    public TextView j;

    public a(Context context) {
        super(context);
    }

    private final int d(View view, int i) {
        int height = (this.e.getHeight() - view.getMeasuredHeight()) / 2;
        view.layout(i, this.e.getTop() + height, view.getMeasuredWidth() + i, this.e.getBottom() - height);
        return view.getWidth();
    }

    public final int a() {
        return (this.a + this.b) - 2;
    }

    public final void b(boolean z) {
        this.h.setSelected(z);
        this.h.setContentDescription(getContext().getText(true != z ? R.string.accessibility_enter_fullscreen : R.string.accessibility_exit_fullscreen));
    }

    public final void c(long j, long j2, long j3) {
        this.f.b(j, j2, j3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], (getRight() + i) - getLeft(), (iArr[1] + getBottom()) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        amkq.O(this.i != null, "listener not set for ControlsOverlay");
        if (view == this.h) {
            b(!r0.isSelected());
            this.i.w(view.isSelected());
            return;
        }
        if (view == this.g) {
            c cVar = this.d;
            if (cVar.getVisibility() == 0) {
                cVar.d.cancel();
                cVar.e.reset();
                cVar.startAnimation(cVar.e);
            } else {
                cVar.e.cancel();
                cVar.d.reset();
                cVar.startAnimation(cVar.d);
                cVar.setVisibility(0);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        View view = this.e;
        view.layout(0, i6 - view.getMeasuredHeight(), i5, i6);
        int top = this.e.getTop() + 2;
        c cVar = this.d;
        cVar.layout(0, top - cVar.getMeasuredHeight(), i5, top);
        int i7 = this.c;
        if (this.f.getVisibility() != 8) {
            measuredWidth = d(this.f, i7);
        } else {
            d(this.j, i7);
            measuredWidth = this.f.getMeasuredWidth();
        }
        int i8 = i7 + measuredWidth + this.c;
        int d = i8 + d(this.g, i8);
        if (this.h.getVisibility() != 8) {
            d(this.h, d);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int defaultSize = getDefaultSize(0, i);
        setMeasuredDimension(defaultSize, resolveSize(a(), i2));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(defaultSize, 1073741824);
        this.d.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(this.b, 1073741824));
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.a, 1073741824);
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(this.a, CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        this.e.measure(makeMeasureSpec, makeMeasureSpec2);
        this.g.measure(makeMeasureSpec3, makeMeasureSpec3);
        int i3 = this.c;
        int measuredWidth = (defaultSize - (i3 + i3)) - this.g.getMeasuredWidth();
        if (this.h.getVisibility() != 8) {
            this.h.measure(makeMeasureSpec3, makeMeasureSpec3);
            measuredWidth -= this.h.getMeasuredWidth();
        }
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        this.f.measure(makeMeasureSpec4, makeMeasureSpec3);
        this.j.measure(makeMeasureSpec4, makeMeasureSpec3);
    }
}

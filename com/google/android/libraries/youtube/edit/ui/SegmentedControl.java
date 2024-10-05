package com.google.android.libraries.youtube.edit.ui;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.edit.ui.SegmentedControl;
import com.google.android.libraries.youtube.edit.ui.SegmentedControlSegment;
import com.google.android.youtube.R;
import defpackage.amkq;
import defpackage.anq;
import defpackage.jw;
import defpackage.zkm;
import defpackage.zzg;
import defpackage.zzh;
import defpackage.zzi;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SegmentedControl extends FrameLayout {
    LinearLayout a;
    public ImageView b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public zzi g;
    public List h;
    private ObjectAnimator i;

    public SegmentedControl(Context context) {
        this(context, null);
    }

    private final float g(float f) {
        return j() ? 1.0f - f : f;
    }

    private final int h(int i) {
        return j() ? -i : i;
    }

    private final int i(float f) {
        amkq.N(a() > 0);
        int min = Math.min(a() - 1, (int) ((f / getWidth()) * a()));
        amkq.N(min < a());
        return j() ? (a() - 1) - min : min;
    }

    private final boolean j() {
        return jw.e(this) == 1;
    }

    public final int a() {
        LinearLayout linearLayout = this.a;
        if (linearLayout == null) {
            return 0;
        }
        return linearLayout.getChildCount();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof SegmentedControlSegment) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.weight = 1.0f;
            this.a.addView(view, i, layoutParams2);
            final SegmentedControlSegment segmentedControlSegment = (SegmentedControlSegment) view;
            segmentedControlSegment.setSaveEnabled(false);
            if (segmentedControlSegment.isChecked()) {
                segmentedControlSegment.post(new zzg(this, segmentedControlSegment, 1));
            }
            segmentedControlSegment.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: zze
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    SegmentedControl segmentedControl = SegmentedControl.this;
                    SegmentedControlSegment segmentedControlSegment2 = segmentedControlSegment;
                    if (segmentedControl.e || segmentedControl.f || !z) {
                        return;
                    }
                    segmentedControlSegment2.post(new zzg(segmentedControl, segmentedControlSegment2, 0));
                }
            });
            if (a() == 1) {
                view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: zzd
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                        SegmentedControl segmentedControl = SegmentedControl.this;
                        ViewGroup.LayoutParams layoutParams3 = segmentedControl.b.getLayoutParams();
                        int i10 = segmentedControl.c;
                        layoutParams3.height = (i5 - i3) - (i10 + i10);
                        ViewGroup.LayoutParams layoutParams4 = segmentedControl.b.getLayoutParams();
                        int i11 = segmentedControl.c;
                        layoutParams4.width = (i4 - i2) - (i11 + i11);
                    }
                });
                return;
            }
            return;
        }
        if (view.getId() == R.id.segmented_control_internal_layout || view.getId() == R.id.segmented_control_internal_selected_item_image) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalArgumentException("SegmentControl only supports children of type SegmentedControlSegment");
    }

    public final SegmentedControlSegment b(int i) {
        return (SegmentedControlSegment) this.a.getChildAt(i);
    }

    public final SegmentedControlSegment c() {
        int i = this.d;
        if (i == -1) {
            return null;
        }
        return b(i);
    }

    public final void d(int i, boolean z, boolean z2) {
        if (i < 0 || i >= a()) {
            throw new IndexOutOfBoundsException("Invalid selection index");
        }
        this.f = true;
        int i2 = 0;
        while (i2 < a()) {
            SegmentedControlSegment b = b(i2);
            b.setChecked(i2 == i);
            b.setEnabled(i2 != i);
            i2++;
        }
        int i3 = this.d;
        this.d = i;
        this.b.setVisibility(0);
        if (!z || i3 == -1) {
            this.b.setTranslationX(h((this.d * c().getWidth()) + this.c));
            for (int i4 = 0; i4 < a(); i4++) {
                if (i4 == this.d) {
                    b(i4).a();
                } else {
                    b(i4).b();
                }
            }
        } else {
            ObjectAnimator objectAnimator = this.i;
            if (objectAnimator != null && objectAnimator.isRunning()) {
                this.i.cancel();
            }
            int width = c().getWidth();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.b, "translationX", h((i3 * width) + this.c), h((width * this.d) + this.c));
            this.i = ofFloat;
            ofFloat.setInterpolator(new anq());
            this.i.setDuration(300L);
            this.i.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: zzc
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SegmentedControl segmentedControl = SegmentedControl.this;
                    segmentedControl.f(segmentedControl.b.getX());
                }
            });
            this.i.addListener(new zzh(this));
            this.i.start();
        }
        zzi zziVar = this.g;
        if (zziVar != null && z2) {
            zziVar.lQ(i);
        }
        this.f = false;
    }

    public final void e(SegmentedControlSegment segmentedControlSegment, boolean z, boolean z2) {
        for (int i = 0; i < a(); i++) {
            if (b(i).equals(segmentedControlSegment)) {
                d(i, z, z2);
                return;
            }
        }
        String valueOf = String.valueOf(segmentedControlSegment);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55);
        sb.append("SegmentedControlSegment ");
        sb.append(valueOf);
        sb.append(" is not contained by this view.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void f(float f) {
        int min;
        int a = a();
        if (a == 0) {
            return;
        }
        float f2 = 1.0f / a;
        float g = g(f / getWidth());
        int i = i(f);
        SegmentedControlSegment b = b(i);
        if (j()) {
            min = Math.max(0, i - 1);
        } else {
            min = Math.min(a - 1, i + 1);
        }
        SegmentedControlSegment b2 = b(min);
        float g2 = g((g - (i * f2)) / f2);
        if (g2 < 0.05f) {
            b.a();
            if (i != min) {
                b2.b();
            }
        } else {
            b.c(g2, -1.0f);
            b2.c(-1.0f, g2);
        }
        for (int i2 = 0; i2 < a; i2++) {
            if (i2 != i && i2 != min) {
                b(i2).b();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0016, code lost:
    
        if (r0 != 3) goto L17;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            int r0 = r3.a()
            if (r0 != 0) goto Lb
            boolean r4 = super.onInterceptTouchEvent(r4)
            return r4
        Lb:
            int r0 = r4.getAction()
            r1 = 1
            if (r0 == r1) goto L2b
            r2 = 2
            if (r0 == r2) goto L19
            r1 = 3
            if (r0 == r1) goto L2b
            goto L2e
        L19:
            r3.e = r1
            float r0 = r4.getX()
            int r0 = r3.i(r0)
            int r2 = r3.d
            if (r2 == r0) goto L2e
            r3.d(r0, r1, r1)
            goto L2e
        L2b:
            r0 = 0
            r3.e = r0
        L2e:
            boolean r4 = super.onInterceptTouchEvent(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.edit.ui.SegmentedControl.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            final int i = bundle.getInt("SELECTED_SPEED_INDEX");
            final int i2 = bundle.getInt("VISIBILITY");
            post(new Runnable() { // from class: zzf
                @Override // java.lang.Runnable
                public final void run() {
                    SegmentedControl segmentedControl = SegmentedControl.this;
                    int i3 = i2;
                    int i4 = i;
                    segmentedControl.setVisibility(i3);
                    if (i4 != -1) {
                        segmentedControl.d(i4, false, false);
                        zzi zziVar = segmentedControl.g;
                        if (zziVar != null) {
                            zziVar.g();
                        }
                    }
                }
            });
            parcelable = bundle.getParcelable("SUPER_STATE");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("SUPER_STATE", super.onSaveInstanceState());
        bundle.putInt("SELECTED_SPEED_INDEX", this.d);
        bundle.putInt("VISIBILITY", getVisibility());
        return bundle;
    }

    public SegmentedControl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SegmentedControl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        int i3;
        this.d = -1;
        this.h = new ArrayList();
        ImageView imageView = new ImageView(getContext());
        this.b = imageView;
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, zkm.a, 0, 0);
            try {
                i2 = obtainStyledAttributes.getResourceId(0, 0);
                this.c = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            i2 = 0;
        }
        if (this.c == 0) {
            this.c = getResources().getDimensionPixelSize(R.dimen.segmented_control_selection_drawable_default_inset);
        }
        ImageView imageView2 = this.b;
        if (i2 != 0) {
            i3 = i2;
        } else {
            i2 = R.drawable.segmented_control_toggle_button_on;
            i3 = 0;
        }
        imageView2.setImageResource(i2);
        this.b.setTag(Integer.valueOf(i3));
        this.b.setVisibility(8);
        this.b.setId(R.id.segmented_control_internal_selected_item_image);
        this.b.setTranslationY(this.c);
        addView(this.b);
        LinearLayout linearLayout = new LinearLayout(new ContextThemeWrapper(getContext(), R.style.SegmentedControlButtonsLayoutStyle));
        this.a = linearLayout;
        linearLayout.setOrientation(0);
        this.a.setId(R.id.segmented_control_internal_layout);
        addView(this.a);
    }
}

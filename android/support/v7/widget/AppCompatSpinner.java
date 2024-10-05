package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import defpackage.bg;
import defpackage.nz;
import defpackage.sj;
import defpackage.sz;
import defpackage.tb;
import defpackage.tg;
import defpackage.un;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {
    private static final int[] e = {R.attr.spinnerMode};
    public final Context a;
    public tg b;
    public int c;
    public final Rect d;
    private final sj f;
    private un g;
    private SpinnerAdapter h;
    private final boolean i;

    public AppCompatSpinner(Context context) {
        this(context, (AttributeSet) null);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        int max2 = Math.max(0, max - (15 - (min - max)));
        View view = null;
        int i2 = 0;
        while (max2 < min) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            int i3 = itemViewType != i ? itemViewType : i;
            if (itemViewType != i) {
                view = null;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
            max2++;
            i = i3;
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.d);
        return i2 + this.d.left + this.d.right;
    }

    public final void b() {
        this.b.l(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        sj sjVar = this.f;
        if (sjVar != null) {
            sjVar.a();
        }
    }

    @Override // android.widget.Spinner
    public final int getDropDownHorizontalOffset() {
        tg tgVar = this.b;
        return tgVar != null ? tgVar.a() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public final int getDropDownVerticalOffset() {
        tg tgVar = this.b;
        return tgVar != null ? tgVar.b() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public final int getDropDownWidth() {
        return this.b != null ? this.c : super.getDropDownWidth();
    }

    @Override // android.widget.Spinner
    public final Drawable getPopupBackground() {
        tg tgVar = this.b;
        return tgVar != null ? tgVar.c() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public final Context getPopupContext() {
        return this.a;
    }

    @Override // android.widget.Spinner
    public final CharSequence getPrompt() {
        tg tgVar = this.b;
        return tgVar != null ? tgVar.d() : super.getPrompt();
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tg tgVar = this.b;
        if (tgVar == null || !tgVar.u()) {
            return;
        }
        this.b.k();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.b == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new sz(this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        tg tgVar = this.b;
        boolean z = false;
        if (tgVar != null && tgVar.u()) {
            z = true;
        }
        savedState.a = z;
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        un unVar = this.g;
        if (unVar == null || !unVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        tg tgVar = this.b;
        if (tgVar == null) {
            return super.performClick();
        }
        if (tgVar.u()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        sj sjVar = this.f;
        if (sjVar != null) {
            sjVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        sj sjVar = this.f;
        if (sjVar != null) {
            sjVar.c(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownHorizontalOffset(int i) {
        tg tgVar = this.b;
        if (tgVar != null) {
            tgVar.h(i);
            this.b.g(i);
        } else {
            super.setDropDownHorizontalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownVerticalOffset(int i) {
        tg tgVar = this.b;
        if (tgVar != null) {
            tgVar.j(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownWidth(int i) {
        if (this.b != null) {
            this.c = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundDrawable(Drawable drawable) {
        tg tgVar = this.b;
        if (tgVar != null) {
            tgVar.f(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(nz.b(this.a, i));
    }

    @Override // android.widget.Spinner
    public final void setPrompt(CharSequence charSequence) {
        tg tgVar = this.b;
        if (tgVar != null) {
            tgVar.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new bg(17);
        boolean a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readByte() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public AppCompatSpinner(Context context, int i) {
        this(context, null, com.google.android.youtube.R.attr.spinnerStyle, i);
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.i) {
            this.h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.b != null) {
            Context context = this.a;
            if (context == null) {
                context = getContext();
            }
            this.b.e(new tb(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.youtube.R.attr.spinnerStyle);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AppCompatSpinner(android.content.Context r8, android.util.AttributeSet r9, int r10, int r11, android.content.res.Resources.Theme r12) {
        /*
            r7 = this;
            r7.<init>(r8, r9, r10)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.d = r0
            android.content.Context r0 = r7.getContext()
            defpackage.yf.d(r7, r0)
            int[] r0 = defpackage.nx.u
            r1 = 0
            yk r0 = defpackage.yk.l(r8, r9, r0, r10, r1)
            sj r2 = new sj
            r2.<init>(r7)
            r7.f = r2
            if (r12 == 0) goto L29
            aaq r2 = new aaq
            r2.<init>(r8, r12)
            r7.a = r2
            goto L3a
        L29:
            r12 = 4
            int r12 = r0.f(r12, r1)
            if (r12 == 0) goto L38
            aaq r2 = new aaq
            r2.<init>(r8, r12)
            r7.a = r2
            goto L3a
        L38:
            r7.a = r8
        L3a:
            r12 = -1
            r2 = 0
            r3 = 1
            if (r11 != r12) goto L69
            int[] r11 = android.support.v7.widget.AppCompatSpinner.e     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L62
            android.content.res.TypedArray r11 = r8.obtainStyledAttributes(r9, r11, r10, r1)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L62
            boolean r4 = r11.hasValue(r1)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            if (r4 == 0) goto L4f
            int r12 = r11.getInt(r1, r1)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
        L4f:
            if (r11 == 0) goto L54
            r11.recycle()
        L54:
            r11 = r12
            goto L69
        L56:
            r8 = move-exception
            r2 = r11
            goto L5c
        L59:
            goto L63
        L5b:
            r8 = move-exception
        L5c:
            if (r2 == 0) goto L61
            r2.recycle()
        L61:
            throw r8
        L62:
            r11 = r2
        L63:
            if (r11 == 0) goto Lae
            r11.recycle()
            goto Lae
        L69:
            r12 = 2
            if (r11 == 0) goto La0
            if (r11 == r3) goto L6f
            goto Lae
        L6f:
            tf r11 = new tf
            android.content.Context r4 = r7.a
            r11.<init>(r7, r4, r9, r10)
            android.content.Context r4 = r7.a
            int[] r5 = defpackage.nx.u
            yk r4 = defpackage.yk.l(r4, r9, r5, r10, r1)
            r5 = 3
            r6 = -2
            int r5 = r4.e(r5, r6)
            r7.c = r5
            android.graphics.drawable.Drawable r5 = r4.h(r3)
            r11.f(r5)
            java.lang.String r12 = r0.n(r12)
            r11.a = r12
            r4.o()
            r7.b = r11
            sy r12 = new sy
            r12.<init>(r7, r7, r11)
            r7.g = r12
            goto Lae
        La0:
            ta r11 = new ta
            r11.<init>(r7)
            r7.b = r11
            java.lang.String r12 = r0.n(r12)
            r11.i(r12)
        Lae:
            android.content.res.TypedArray r11 = r0.b
            java.lang.CharSequence[] r11 = r11.getTextArray(r1)
            if (r11 == 0) goto Lc7
            android.widget.ArrayAdapter r12 = new android.widget.ArrayAdapter
            r1 = 17367048(0x1090008, float:2.5162948E-38)
            r12.<init>(r8, r1, r11)
            r8 = 2131625507(0x7f0e0623, float:1.8878224E38)
            r12.setDropDownViewResource(r8)
            r7.setAdapter(r12)
        Lc7:
            r0.o()
            r7.i = r3
            android.widget.SpinnerAdapter r8 = r7.h
            if (r8 == 0) goto Ld5
            r7.setAdapter(r8)
            r7.h = r2
        Ld5:
            sj r8 = r7.f
            r8.b(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}

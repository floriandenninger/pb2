package com.google.android.libraries.youtube.player.subtitles.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSnapshot;
import com.google.android.youtube.R;
import defpackage.aiuq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SubtitleWindowView extends ViewGroup {
    public final List a;
    public final aiuq b;
    public int c;
    public float d;
    public Typeface e;
    public int f;
    public int g;
    public int h;
    private final Resources i;
    private final List j;
    private final List k;
    private final List l;
    private final List m;
    private SubtitleWindowSnapshot n;

    public SubtitleWindowView(Context context) {
        super(context);
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.a = new ArrayList();
        this.l = new ArrayList();
        this.m = new ArrayList();
        Resources resources = context.getResources();
        this.i = resources;
        this.b = b(context, resources);
    }

    private static aiuq b(Context context, Resources resources) {
        int dimension = (int) resources.getDimension(R.dimen.subtitle_window_padding);
        aiuq aiuqVar = new aiuq(context);
        aiuqVar.setPadding(dimension, dimension, dimension, dimension);
        return aiuqVar;
    }

    private static final void c(List list, CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        int i = 0;
        while (i < spannableStringBuilder.length()) {
            int indexOf = charSequence2.substring(i).indexOf("\n");
            int length = indexOf == -1 ? spannableStringBuilder.length() : indexOf + i;
            list.add(spannableStringBuilder.subSequence(i, length));
            i = length + 1;
        }
    }

    public final void a(SubtitleWindowSnapshot subtitleWindowSnapshot) {
        this.n = subtitleWindowSnapshot;
        this.k.clear();
        this.j.clear();
        this.l.clear();
        this.m.clear();
        boolean z = subtitleWindowSnapshot.f;
        c(this.k, subtitleWindowSnapshot.d);
        c(this.j, subtitleWindowSnapshot.e);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        if (this.m.isEmpty() || this.l.isEmpty()) {
            return;
        }
        int i6 = i3 - i;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i6 - getPaddingRight();
        int paddingTop = getPaddingTop();
        int i7 = this.n.c.b;
        for (int i8 = 0; i8 < this.j.size(); i8++) {
            aiuq aiuqVar = (aiuq) this.a.get(i8);
            int intValue = ((Integer) this.l.get(i8)).intValue();
            int intValue2 = ((Integer) this.m.get(i8)).intValue();
            if ((i7 & 4) != 0) {
                i5 = paddingRight - intValue;
            } else if ((i7 & 2) != 0) {
                double d = i6 - intValue;
                Double.isNaN(d);
                i5 = (int) (d / 2.0d);
            } else {
                i5 = paddingLeft;
            }
            if (true == this.n.c.f) {
                i5 = paddingLeft;
            }
            aiuqVar.layout(i5, paddingTop, aiuqVar.getMeasuredWidth() + i5, aiuqVar.getMeasuredHeight() + paddingTop);
            paddingTop += intValue2;
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        aiuq aiuqVar;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - (paddingLeft + paddingRight), CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        int i3 = size2 - (paddingTop + paddingBottom);
        int i4 = 0;
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 0);
        for (int i5 = 0; i5 < this.j.size(); i5++) {
            if (i5 < this.a.size()) {
                aiuqVar = (aiuq) this.a.get(i5);
            } else {
                aiuqVar = new aiuq(getContext());
                aiuqVar.e(this.c);
                aiuqVar.f(this.d);
                aiuqVar.g(this.e);
                aiuqVar.b(this.f);
                aiuqVar.c(this.g);
                aiuqVar.setBackgroundColor(this.h);
                aiuqVar.b = null;
                aiuqVar.a = null;
                aiuqVar.requestLayout();
                int dimension = (int) this.i.getDimension(R.dimen.subtitle_window_padding);
                aiuqVar.setPadding(dimension, dimension, dimension, dimension);
                addView(aiuqVar);
                this.a.add(aiuqVar);
            }
            int i6 = this.n.c.b;
            if (i5 < this.k.size()) {
                aiuqVar.setVisibility(0);
                aiuqVar.d((CharSequence) this.k.get(i5));
                aiuqVar.measure(makeMeasureSpec, makeMeasureSpec2);
            } else {
                aiuqVar.a();
            }
        }
        for (int size3 = this.j.size(); size3 < this.a.size(); size3++) {
            ((aiuq) this.a.get(size3)).a();
        }
        this.l.clear();
        this.m.clear();
        Iterator it = this.j.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            this.b.d((CharSequence) it.next());
            this.b.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = this.b.getMeasuredWidth();
            int measuredHeight = this.b.getMeasuredHeight();
            this.l.add(Integer.valueOf(measuredWidth));
            this.m.add(Integer.valueOf(measuredHeight));
            i7 += measuredHeight;
            i4 = Math.max(measuredWidth, i4);
        }
        int paddingLeft2 = i4 + getPaddingLeft() + getPaddingRight();
        int paddingTop2 = i7 + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, paddingLeft2);
        } else if (mode == 1073741824) {
            mode = 1073741824;
        } else {
            size = paddingLeft2;
        }
        if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            size2 = Math.min(size2, paddingTop2);
        } else if (mode != 1073741824) {
            size2 = paddingTop2;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        if (i == 0) {
            super.setBackgroundColor(0);
            return;
        }
        GradientDrawable gradientDrawable = (GradientDrawable) this.i.getDrawable(R.drawable.subtitle_window).mutate();
        gradientDrawable.setColor(i);
        setBackground(gradientDrawable);
    }

    public SubtitleWindowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.a = new ArrayList();
        this.l = new ArrayList();
        this.m = new ArrayList();
        Resources resources = context.getResources();
        this.i = resources;
        this.b = b(context, resources);
    }

    public SubtitleWindowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.a = new ArrayList();
        this.l = new ArrayList();
        this.m = new ArrayList();
        Resources resources = context.getResources();
        this.i = resources;
        this.b = b(context, resources);
    }
}

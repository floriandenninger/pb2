package com.google.android.apps.youtube.app.common.player.overlay;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.azrw;
import defpackage.fmt;
import defpackage.fmu;
import defpackage.fnf;
import defpackage.zby;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class InlineTimeBarWrapper extends ViewGroup implements azrw {
    public final fmt a;

    public InlineTimeBarWrapper(Context context) {
        this(context, null);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        return this.a;
    }

    @Override // android.view.View
    public final boolean isImportantForAccessibility() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.HashSet, java.util.Set] */
    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = i3 - i;
        int i7 = i4 - i2;
        if (i6 == 0 || i7 == 0) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, i6 - getPaddingRight());
        int b = this.a.b();
        int i8 = i7 - b;
        if (this.a.D()) {
            i5 = i8;
        } else {
            fmt fmtVar = this.a;
            if (fmtVar.k == null) {
                fmtVar.k = new zby();
            }
            ?? r6 = fmtVar.j;
            fmt fmtVar2 = null;
            if (r6 != 0) {
                if (fmtVar != r6) {
                    ?? hashSet = new HashSet();
                    for (View view = fmtVar; view != null; view = fmt.f(view)) {
                        hashSet.add(view);
                    }
                    while (true) {
                        if (r6 == 0) {
                            break;
                        }
                        if (hashSet.contains(r6)) {
                            fmtVar2 = r6;
                            break;
                        }
                        r6 = fmt.f((View) r6);
                    }
                } else {
                    fmtVar2 = fmtVar;
                }
            }
            zby.c(fmtVar.k, fmtVar.j, fmtVar2);
            Rect rect = fmtVar.k.a;
            if (rect.width() > 0) {
                paddingLeft = rect.left - i;
                max = rect.right - i;
            }
            i5 = (rect.top - i2) + ((rect.height() - b) / 2);
        }
        fmt fmtVar3 = this.a;
        int i9 = max - paddingLeft;
        fmu fmuVar = fmtVar3.c;
        if (fmuVar.y) {
            b = (b / 2) + fmuVar.x;
        }
        fmtVar3.f.set(0, 0, i9, b);
        if (this.a.D()) {
            this.a.layout(0, Math.max(0, i8), i6, i7);
        } else {
            this.a.layout(paddingLeft, i5 <= i4 ? Math.max(0, i5) : 0, max, i4);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.a.D()) {
            size2 += Math.round((this.a.b() - this.a.h) / 2.0f);
        }
        this.a.measure(i, View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        setMeasuredDimension(size, size2);
    }

    public InlineTimeBarWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        fmt fmtVar = new fmt(context, attributeSet);
        this.a = fmtVar;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, fnf.b, 0, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            int i = obtainStyledAttributes.getInt(0, -1);
            if (i != -1) {
                fmtVar.u(i);
            }
        } else {
            fmtVar.u(2);
        }
        obtainStyledAttributes.recycle();
        addView(fmtVar);
    }
}

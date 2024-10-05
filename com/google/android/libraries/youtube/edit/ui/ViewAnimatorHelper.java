package com.google.android.libraries.youtube.edit.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewStub;
import android.widget.ViewAnimator;
import defpackage.zfi;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ViewAnimatorHelper extends ViewAnimator {
    private final SparseArray a;

    public ViewAnimatorHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new SparseArray();
    }

    public final int a() {
        return getChildAt(getDisplayedChild()).getId();
    }

    public final void b(int i) {
        View view = null;
        int i2 = 0;
        while (i2 < getChildCount()) {
            view = getChildAt(i2);
            if (view.getId() == i) {
                break;
            } else {
                i2++;
            }
        }
        if (view == null) {
            throw new IllegalArgumentException(String.format("No such child with id: %s", Integer.valueOf(i)));
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
            if (view.getId() == -1) {
                view.setId(i);
            }
        }
        setDisplayedChild(i2);
        zfi zfiVar = (zfi) this.a.get(i);
        if (zfiVar != null) {
            zfiVar.a(view);
        }
    }

    public final void c(int i, zfi zfiVar) {
        this.a.put(i, zfiVar);
    }
}

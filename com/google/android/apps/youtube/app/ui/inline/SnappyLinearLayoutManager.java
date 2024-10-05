package com.google.android.apps.youtube.app.ui.inline;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewConfiguration;
import defpackage.fom;
import defpackage.mig;
import defpackage.we;
import defpackage.wr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SnappyLinearLayoutManager extends LinearLayoutManager implements fom {
    private static final float a = (float) (Math.log(0.78d) / Math.log(0.9d));
    private double b;
    private final Context c;
    private final wr d = c();

    public SnappyLinearLayoutManager(Context context) {
        this.c = context;
        double d = context.getResources().getDisplayMetrics().density * 386.0878f * 160.0f;
        Double.isNaN(d);
        this.b = d * 0.84d;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final int I() {
        return J();
    }

    @Override // defpackage.fom
    public final int a() {
        int left;
        int measuredWidth;
        if (aq() == 0) {
            return 0;
        }
        View az = az(0);
        int bm = bm(az);
        if (this.i == 1) {
            left = az.getTop();
            measuredWidth = az.getMeasuredHeight();
        } else {
            left = az.getLeft();
            measuredWidth = az.getMeasuredWidth();
        }
        return Math.abs(left) > measuredWidth / 2 ? bm + 1 : bm;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.wd
    public final void ao(RecyclerView recyclerView, int i) {
        wr wrVar = this.d;
        wrVar.b = i;
        bd(wrVar);
    }

    @Override // defpackage.fom
    public final int b(int i, int i2) {
        int width;
        int i3;
        int i4;
        if (aq() == 0) {
            return 0;
        }
        View az = az(0);
        if (this.i == 1) {
            int top = az.getTop();
            width = az.getHeight();
            i3 = top;
            i4 = i2;
        } else {
            int left = az.getLeft();
            width = az.getWidth();
            i3 = left;
            i4 = i;
        }
        int bm = bm(az);
        double abs = Math.abs(Math.abs(i4));
        float scrollFriction = ViewConfiguration.getScrollFriction();
        double d = this.b;
        double d2 = scrollFriction;
        Double.isNaN(d2);
        double log = Math.log((abs * 0.3499999940395355d) / (d2 * d));
        float f = a;
        double scrollFriction2 = ViewConfiguration.getScrollFriction();
        double d3 = this.b;
        Double.isNaN(scrollFriction2);
        double d4 = scrollFriction2 * d3;
        double d5 = f;
        double d6 = f;
        Double.isNaN(d6);
        Double.isNaN(d5);
        double exp = d4 * Math.exp((d5 / (d6 - 1.0d)) * log);
        double d7 = i3;
        if (i4 > 0) {
            exp = -exp;
        }
        Double.isNaN(d7);
        double d8 = d7 + exp;
        return (this.i == 0 && ag()) ? d8 < ((double) (width / 2)) ? bm : bm + 1 : d8 <= ((double) ((-width) / 2)) ? bm + 1 : bm;
    }

    @Override // defpackage.wd
    public final void br(View view) {
        int ar;
        int makeMeasureSpec;
        we weVar = (we) view.getLayoutParams();
        if (this.i != 1) {
            ar = ar(this.I, getPaddingTop() + getPaddingBottom() + weVar.topMargin + weVar.bottomMargin, weVar.height, ae());
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.H, 1073741824);
        } else {
            makeMeasureSpec = ar(this.H, getPaddingLeft() + getPaddingRight() + weVar.leftMargin + weVar.rightMargin, weVar.width, ad());
            ar = View.MeasureSpec.makeMeasureSpec(this.I, 1073741824);
        }
        view.measure(makeMeasureSpec, ar);
    }

    protected wr c() {
        return new mig(this.c, this);
    }
}

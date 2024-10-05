package defpackage;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajne extends ajmv {
    private ConstraintLayout a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int[] g;
    private View h;
    private View i;

    public ajne(Context context, ajop ajopVar, ajos ajosVar) {
        super(context, ajopVar, ajosVar);
    }

    @Override // defpackage.ajmv
    protected final ViewGroup d(Context context) {
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        this.a = constraintLayout;
        constraintLayout.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
        return this.a;
    }

    @Override // defpackage.ajmv
    protected final ajnc e(Context context, ajos ajosVar) {
        return new ajnd(context, ajosVar);
    }

    @Override // defpackage.ajmv
    protected final void f(int i, ajok ajokVar, ajni ajniVar) {
        this.g = new int[i];
        this.b = ajokVar.b("grid_row_presenter_horizontal_row_padding", ajniVar.e);
        this.d = ajokVar.b("grid_row_presenter_top_padding", ajniVar.c);
        this.c = ajokVar.b("grid_row_presenter_horizontal_row_padding", ajniVar.f);
        this.e = ajokVar.b("grid_row_presenter_bottom_padding", ajniVar.d);
        this.f = ajniVar.g;
    }

    @Override // defpackage.ajmv
    protected final void g(ajok ajokVar, ajni ajniVar) {
        int length;
        ah ahVar = new ah();
        ahVar.d(this.a);
        ahVar.e(this.h.getId(), 6, 0, 6);
        ahVar.h(this.h.getId(), 6, this.b);
        ahVar.e(this.i.getId(), 7, 0, 7);
        ahVar.h(this.i.getId(), 7, this.c);
        int[] iArr = this.g;
        int i = 1;
        if (iArr.length == 1) {
            ahVar.e(iArr[0], 6, this.h.getId(), 6);
            ahVar.e(this.g[0], 7, this.i.getId(), 7);
        } else {
            int id = this.h.getId();
            int id2 = this.i.getId();
            int[] iArr2 = this.g;
            if (iArr2.length < 2) {
                throw new IllegalArgumentException("must have 2 or more widgets in a chain");
            }
            ahVar.a(iArr2[0]).P = 0;
            ahVar.f(iArr2[0], 6, id, 6, -1);
            while (true) {
                length = iArr2.length;
                if (i >= length) {
                    break;
                }
                int i2 = i - 1;
                ahVar.f(iArr2[i], 6, iArr2[i2], 7, -1);
                ahVar.f(iArr2[i2], 7, iArr2[i], 6, -1);
                i++;
            }
            ahVar.f(iArr2[length - 1], 7, id2, 7, -1);
        }
        int i3 = 0;
        while (true) {
            int[] iArr3 = this.g;
            if (i3 >= iArr3.length) {
                this.a.c = ahVar;
                return;
            }
            ahVar.e(iArr3[i3], 3, 0, 3);
            ahVar.e(this.g[i3], 4, 0, 4);
            ahVar.a(this.g[i3]).v = 0.0f;
            int[] iArr4 = this.g;
            int length2 = iArr4.length;
            float f = length2;
            float f2 = this.f;
            int i4 = (int) ((i3 / f) * f2);
            int i5 = i3 == length2 + (-1) ? 0 : (int) ((((length2 - i3) - 1) / f) * f2);
            int i6 = this.d;
            int i7 = this.e;
            ahVar.h(iArr4[i3], 6, i4);
            ahVar.h(this.g[i3], 7, i5);
            ahVar.h(this.g[i3], 3, i6);
            ahVar.h(this.g[i3], 4, i7);
            i3++;
        }
    }

    @Override // defpackage.ajmv
    protected final void i(View view, ajni ajniVar, int i) {
        this.g[i] = view.getId();
        if (i == 0) {
            View view2 = new View(view.getContext());
            this.h = view2;
            view2.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
            this.h.setId(View.generateViewId());
            this.h.setVisibility(4);
            this.a.addView(this.h);
            i = 0;
        }
        this.a.addView(view);
        if (i == ajniVar.a - 1) {
            View view3 = new View(view.getContext());
            this.i = view3;
            view3.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
            this.i.setId(View.generateViewId());
            this.i.setVisibility(4);
            this.a.addView(this.i);
        }
    }
}

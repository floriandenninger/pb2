package com.google.android.apps.youtube.app.common.ui.inline;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import defpackage.any;
import defpackage.aok;
import defpackage.flp;
import defpackage.ggm;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class InlinePlayerLayoutDelegate implements any, flp {
    private final Rect a = new Rect();
    private final ggm b;

    public InlinePlayerLayoutDelegate(ggm ggmVar) {
        this.b = ggmVar;
    }

    @Override // defpackage.flp
    public final void g(View view) {
        ggm ggmVar = this.b;
        Rect rect = this.a;
        Rect a = ggmVar.a(ggmVar.b);
        Rect rect2 = ggmVar.b;
        rect.set(a);
        rect.offset(-rect2.left, -rect2.top);
        view.layout(this.a.left, this.a.top, this.a.right, this.a.bottom);
    }

    @Override // defpackage.flp
    public final void h(View view) {
        ggm ggmVar = this.b;
        Rect a = ggmVar.a(ggmVar.b);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(a.width(), 1073741824), 0, layoutParams.width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(a.height(), 1073741824), 0, layoutParams.height));
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }
}

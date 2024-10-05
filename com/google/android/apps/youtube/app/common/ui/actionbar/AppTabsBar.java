package com.google.android.apps.youtube.app.common.ui.actionbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.DefaultTabsBar;
import defpackage.zau;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AppTabsBar extends DefaultTabsBar {
    private int c;
    private int d;

    public AppTabsBar(Context context) {
        super(context);
    }

    public final void d(zau zauVar) {
        if (((DefaultTabsBar) this).b != zauVar) {
            ((DefaultTabsBar) this).b = zauVar;
            invalidate();
        }
        e(this.c, this.d);
    }

    public final void e(int i, int i2) {
        zau zauVar = this.b;
        zauVar.getClass();
        this.c = i;
        this.d = i2;
        o(zauVar.a(i, i, i, i, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.youtube.common.ui.DefaultTabsBar
    public final void f(View view, ColorStateList colorStateList) {
        zau zauVar;
        super.f(view, colorStateList);
        if (!(view instanceof ImageView) || (zauVar = this.b) == null) {
            return;
        }
        ImageView imageView = (ImageView) view;
        imageView.setImageDrawable(zauVar.c(imageView.getDrawable(), colorStateList));
    }

    public AppTabsBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AppTabsBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

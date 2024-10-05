package defpackage;

import android.R;
import android.app.ActionBar;
import android.content.res.TypedArray;
import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zbg extends zao {
    public final ActionBar m;
    public final int n;
    private final zbf o;

    public zbg(Window window, ActionBar actionBar, View view) {
        super(window);
        zbf zbfVar = new zbf(this);
        this.o = zbfVar;
        this.m = actionBar;
        h(view, 1);
        this.l = zbfVar;
        if (actionBar == null) {
            this.n = 0;
            return;
        }
        TypedArray obtainStyledAttributes = window.getContext().obtainStyledAttributes(new int[]{R.attr.actionBarSize});
        this.n = Math.round(obtainStyledAttributes.getDimension(0, 0.0f));
        obtainStyledAttributes.recycle();
    }

    public final void p(boolean z) {
        zba zbaVar = this.g;
        if (zbaVar.f != z) {
            zbaVar.f = z;
            zbaVar.a();
        }
    }
}

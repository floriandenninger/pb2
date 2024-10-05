package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yp extends ls {
    public int b;

    public yp() {
        super(-2, -2);
        this.b = 0;
        this.a = 8388627;
    }

    public yp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
    }

    public yp(ls lsVar) {
        super(lsVar);
        this.b = 0;
    }

    public yp(yp ypVar) {
        super((ls) ypVar);
        this.b = 0;
        this.b = ypVar.b;
    }

    public yp(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = 0;
    }

    public yp(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = 0;
        this.leftMargin = marginLayoutParams.leftMargin;
        this.topMargin = marginLayoutParams.topMargin;
        this.rightMargin = marginLayoutParams.rightMargin;
        this.bottomMargin = marginLayoutParams.bottomMargin;
    }
}

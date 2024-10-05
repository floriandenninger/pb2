package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class we extends ViewGroup.MarginLayoutParams {
    public wv c;
    public final Rect d;
    public boolean e;
    boolean f;

    public we(int i, int i2) {
        super(i, i2);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public final int pL() {
        return this.c.c();
    }

    public final boolean pM() {
        return this.c.y();
    }

    public final boolean pN() {
        return this.c.v();
    }

    public we(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public we(we weVar) {
        super((ViewGroup.LayoutParams) weVar);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public we(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public we(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }
}

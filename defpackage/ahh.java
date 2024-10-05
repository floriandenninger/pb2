package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahh extends ViewGroup.MarginLayoutParams {
    public ahe a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public View k;
    public View l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final Rect p;
    private boolean q;

    public ahh() {
        super(-2, -2);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
    }

    public final void a() {
        this.o = false;
    }

    public final void b(ahe aheVar) {
        ahe aheVar2 = this.a;
        if (aheVar2 != aheVar) {
            if (aheVar2 != null) {
                aheVar2.b();
            }
            this.a = aheVar;
            this.b = true;
            if (aheVar != null) {
                aheVar.a(this);
            }
        }
    }

    public final void c(int i, boolean z) {
        if (i != 0) {
            this.q = z;
        } else {
            this.n = z;
        }
    }

    public final boolean d(int i) {
        return i != 0 ? this.q : this.n;
    }

    public ahh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ahb.b);
        this.c = obtainStyledAttributes.getInteger(0, 0);
        this.f = obtainStyledAttributes.getResourceId(1, -1);
        this.d = obtainStyledAttributes.getInteger(2, 0);
        this.e = obtainStyledAttributes.getInteger(6, -1);
        this.g = obtainStyledAttributes.getInt(5, 0);
        this.h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.b = hasValue;
        if (hasValue) {
            this.a = CoordinatorLayout.g(context, attributeSet, obtainStyledAttributes.getString(3));
        }
        obtainStyledAttributes.recycle();
        ahe aheVar = this.a;
        if (aheVar != null) {
            aheVar.a(this);
        }
    }

    public ahh(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
    }

    public ahh(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
    }

    public ahh(ahh ahhVar) {
        super((ViewGroup.MarginLayoutParams) ahhVar);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
    }
}

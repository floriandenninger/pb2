package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sj {
    public yi a;
    private final View b;
    private yi e;
    private yi f;
    private int d = -1;
    private final so c = so.d();

    public sj(View view) {
        this.b = view;
    }

    public final void a() {
        Drawable background = this.b.getBackground();
        if (background != null) {
            if (Build.VERSION.SDK_INT <= 21 || this.e != null) {
                if (this.f == null) {
                    this.f = new yi();
                }
                yi yiVar = this.f;
                yiVar.a();
                ColorStateList k = jw.k(this.b);
                if (k != null) {
                    yiVar.d = true;
                    yiVar.a = k;
                }
                PorterDuff.Mode l = jw.l(this.b);
                if (l != null) {
                    yiVar.c = true;
                    yiVar.b = l;
                }
                if (yiVar.d || yiVar.c) {
                    xc.h(background, yiVar, this.b.getDrawableState());
                    return;
                }
            }
            yi yiVar2 = this.a;
            if (yiVar2 != null) {
                xc.h(background, yiVar2, this.b.getDrawableState());
                return;
            }
            yi yiVar3 = this.e;
            if (yiVar3 != null) {
                xc.h(background, yiVar3, this.b.getDrawableState());
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i) {
        yk l = yk.l(this.b.getContext(), attributeSet, nx.z, i, 0);
        View view = this.b;
        jw.L(view, view.getContext(), nx.z, attributeSet, l.b, i, 0);
        try {
            if (l.q(0)) {
                this.d = l.f(0, -1);
                ColorStateList a = this.c.a(this.b.getContext(), this.d);
                if (a != null) {
                    d(a);
                }
            }
            if (l.q(1)) {
                jw.P(this.b, l.g(1));
            }
            if (l.q(2)) {
                jw.Q(this.b, ud.a(l.c(2, -1), null));
            }
        } finally {
            l.o();
        }
    }

    public final void c(int i) {
        this.d = i;
        so soVar = this.c;
        d(soVar != null ? soVar.a(this.b.getContext(), i) : null);
        a();
    }

    final void d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.e == null) {
                this.e = new yi();
            }
            yi yiVar = this.e;
            yiVar.a = colorStateList;
            yiVar.d = true;
        } else {
            this.e = null;
        }
        a();
    }

    public final void e() {
        this.d = -1;
        d(null);
        a();
    }
}

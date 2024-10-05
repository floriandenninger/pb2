package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatSpinner;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tf extends vh implements tg {
    public CharSequence a;
    ListAdapter b;
    public final Rect c;
    final /* synthetic */ AppCompatSpinner d;
    private int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf(AppCompatSpinner appCompatSpinner, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = appCompatSpinner;
        this.c = new Rect();
        this.l = appCompatSpinner;
        z();
        this.m = new tc(this);
    }

    @Override // defpackage.tg
    public final CharSequence d() {
        return this.a;
    }

    @Override // defpackage.vh, defpackage.tg
    public final void e(ListAdapter listAdapter) {
        super.e(listAdapter);
        this.b = listAdapter;
    }

    @Override // defpackage.tg
    public final void h(int i) {
        this.r = i;
    }

    @Override // defpackage.tg
    public final void i(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // defpackage.tg
    public final void l(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        boolean u = u();
        n();
        y();
        super.s();
        ug ugVar = this.e;
        ugVar.setChoiceMode(1);
        ugVar.setTextDirection(i);
        ugVar.setTextAlignment(i2);
        w(this.d.getSelectedItemPosition());
        if (u || (viewTreeObserver = this.d.getViewTreeObserver()) == null) {
            return;
        }
        td tdVar = new td(this);
        viewTreeObserver.addOnGlobalLayoutListener(tdVar);
        v(new te(this, tdVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.widget.SpinnerAdapter, android.widget.ListAdapter] */
    public final void n() {
        Drawable c = c();
        int i = 0;
        if (c != null) {
            c.getPadding(this.d.d);
            i = zb.b(this.d) ? this.d.d.right : -this.d.d.left;
        } else {
            Rect rect = this.d.d;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = this.d.getPaddingLeft();
        int paddingRight = this.d.getPaddingRight();
        int width = this.d.getWidth();
        AppCompatSpinner appCompatSpinner = this.d;
        int i2 = appCompatSpinner.c;
        if (i2 == -2) {
            int a = appCompatSpinner.a(this.b, c());
            int i3 = (this.d.getContext().getResources().getDisplayMetrics().widthPixels - this.d.d.left) - this.d.d.right;
            if (a > i3) {
                a = i3;
            }
            r(Math.max(a, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        this.g = zb.b(this.d) ? i + (((width - paddingRight) - this.f) - this.r) : i + paddingLeft + this.r;
    }
}

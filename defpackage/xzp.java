package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xzp implements xta {
    public final ImageView a;
    public final TextView b;
    public final xtb c;
    public final aahd d;
    public xuh e;
    public apmg f;
    public int g;
    public int h;
    public final RectF i;
    public int j;
    private final ImageView k;
    private final ProgressBar l;
    private final View m;
    private final View n;
    private final int o;
    private final Matrix p;
    private final RectF q;

    public xzp(ImageView imageView, ImageView imageView2, TextView textView, ProgressBar progressBar, View view, View view2, int i, xtb xtbVar, aahd aahdVar) {
        imageView.getClass();
        this.a = imageView;
        imageView2.getClass();
        this.k = imageView2;
        textView.getClass();
        this.b = textView;
        progressBar.getClass();
        this.l = progressBar;
        view.getClass();
        this.m = view;
        view2.getClass();
        this.n = view2;
        this.o = i;
        xtbVar.getClass();
        this.c = xtbVar;
        aahdVar.getClass();
        this.d = aahdVar;
        this.p = new Matrix();
        this.q = new RectF();
        this.i = new RectF();
        this.g = 1;
        xtbVar.c(this);
    }

    public final void a(Drawable drawable, argf argfVar) {
        if (drawable == null || argfVar == null) {
            return;
        }
        this.p.reset();
        RectF rectF = this.q;
        double d = argfVar.c;
        double intrinsicWidth = drawable.getIntrinsicWidth();
        Double.isNaN(intrinsicWidth);
        double d2 = argfVar.d;
        double intrinsicHeight = drawable.getIntrinsicHeight();
        Double.isNaN(intrinsicHeight);
        double d3 = argfVar.e;
        double intrinsicWidth2 = drawable.getIntrinsicWidth();
        Double.isNaN(intrinsicWidth2);
        double d4 = argfVar.f;
        double intrinsicHeight2 = drawable.getIntrinsicHeight();
        Double.isNaN(intrinsicHeight2);
        rectF.set((float) (d * intrinsicWidth), (float) (d2 * intrinsicHeight), (float) (d3 * intrinsicWidth2), (float) (d4 * intrinsicHeight2));
        this.p.setRectToRect(this.q, this.i, Matrix.ScaleToFit.FILL);
        this.a.setImageMatrix(this.p);
    }

    public final void b(int i) {
        this.g = i;
        if (i == 2 || i == 3) {
            this.a.setColorFilter(this.o);
        } else {
            this.a.setColorFilter((ColorFilter) null);
        }
        whu.I(this.a, i != 1);
        whu.I(this.n, (this.f == null || i == 1) ? false : true);
        whu.I(this.b, this.f != null && i == 4);
        whu.I(this.k, i == 4 || i == 3);
        whu.I(this.l, i == 2);
        whu.I(this.m, i == 3);
    }

    public final boolean c() {
        return this.g != 1;
    }

    public final boolean d() {
        return this.l.getVisibility() == 0;
    }

    @Override // defpackage.xta
    public final void g(xuh xuhVar, apmg apmgVar) {
        this.j++;
        this.e = xuhVar;
        this.f = apmgVar;
        if (xuhVar != null) {
            a(xuhVar.c, xuhVar.d);
        }
    }

    @Override // defpackage.xta
    public final void qI(xuh xuhVar) {
    }
}

package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class wr {
    private final wp a;
    public int b;
    public RecyclerView c;
    public wd d;
    public boolean e;
    public boolean f;
    public View g;
    public boolean h;
    protected final LinearInterpolator i;
    protected final DecelerateInterpolator j;
    protected PointF k;
    protected int l;
    protected int m;
    private final DisplayMetrics n;
    private boolean o;
    private float p;

    public wr(Context context) {
        this.b = -1;
        this.a = new wp();
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.o = false;
        this.l = 0;
        this.m = 0;
        this.n = context.getResources().getDisplayMetrics();
    }

    public static final int m(View view) {
        wv l = RecyclerView.l(view);
        if (l != null) {
            return l.c();
        }
        return -1;
    }

    private static int n(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float a(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int b(int i) {
        float abs = Math.abs(i);
        if (!this.o) {
            this.p = a(this.n);
            this.o = true;
        }
        return (int) Math.ceil(abs * this.p);
    }

    protected void c(View view, wp wpVar) {
        int h = h(view, k());
        int i = i(view, l());
        int j = j((int) Math.sqrt((h * h) + (i * i)));
        if (j > 0) {
            wpVar.b(-h, -i, j, this.j);
        }
    }

    public PointF d(int i) {
        Object obj = this.d;
        if (obj instanceof wq) {
            return ((wq) obj).O(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + wq.class.getCanonicalName());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(int i, int i2) {
        PointF d;
        RecyclerView recyclerView = this.c;
        if (this.b == -1 || recyclerView == null) {
            f();
        }
        if (this.e && this.g == null && this.d != null && (d = d(this.b)) != null && (d.x != 0.0f || d.y != 0.0f)) {
            recyclerView.Z((int) Math.signum(d.x), (int) Math.signum(d.y), null);
        }
        this.e = false;
        View view = this.g;
        if (view != null) {
            if (m(view) == this.b) {
                View view2 = this.g;
                ws wsVar = recyclerView.M;
                c(view2, this.a);
                this.a.a(recyclerView);
                f();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.g = null;
            }
        }
        if (this.f) {
            ws wsVar2 = recyclerView.M;
            wp wpVar = this.a;
            if (this.c.n.aq() == 0) {
                f();
            } else {
                this.l = n(this.l, i);
                int n = n(this.m, i2);
                this.m = n;
                if (this.l == 0 && n == 0) {
                    PointF d2 = d(this.b);
                    if (d2 == null || (d2.x == 0.0f && d2.y == 0.0f)) {
                        wpVar.a = this.b;
                        f();
                    } else {
                        float sqrt = (float) Math.sqrt((d2.x * d2.x) + (d2.y * d2.y));
                        d2.x /= sqrt;
                        d2.y /= sqrt;
                        this.k = d2;
                        this.l = (int) (d2.x * 10000.0f);
                        this.m = (int) (d2.y * 10000.0f);
                        wpVar.b((int) (this.l * 1.2f), (int) (this.m * 1.2f), (int) (b(10000) * 1.2f), this.i);
                    }
                }
            }
            wp wpVar2 = this.a;
            int i3 = wpVar2.a;
            wpVar2.a(recyclerView);
            if (i3 < 0 || !this.f) {
                return;
            }
            this.e = true;
            recyclerView.f72J.a();
        }
    }

    public final void f() {
        if (this.f) {
            this.f = false;
            this.m = 0;
            this.l = 0;
            this.k = null;
            this.c.M.a = -1;
            this.g = null;
            this.b = -1;
            this.e = false;
            wd wdVar = this.d;
            if (wdVar.x == this) {
                wdVar.x = null;
            }
            this.d = null;
            this.c = null;
        }
    }

    public int g(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            return i4 - i2;
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    public final int h(View view, int i) {
        wd wdVar = this.d;
        if (wdVar == null || !wdVar.ad()) {
            return 0;
        }
        we weVar = (we) view.getLayoutParams();
        return g(wd.bx(view) - weVar.leftMargin, wd.by(view) + weVar.rightMargin, wdVar.getPaddingLeft(), wdVar.H - wdVar.getPaddingRight(), i);
    }

    public int i(View view, int i) {
        wd wdVar = this.d;
        if (wdVar == null || !wdVar.ae()) {
            return 0;
        }
        we weVar = (we) view.getLayoutParams();
        return g(wd.bz(view) - weVar.topMargin, wd.bw(view) + weVar.bottomMargin, wdVar.getPaddingTop(), wdVar.I - wdVar.getPaddingBottom(), i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int j(int i) {
        double b = b(i);
        Double.isNaN(b);
        return (int) Math.ceil(b / 0.3356d);
    }

    protected int k() {
        PointF pointF = this.k;
        if (pointF == null || pointF.x == 0.0f) {
            return 0;
        }
        return this.k.x <= 0.0f ? -1 : 1;
    }

    protected int l() {
        PointF pointF = this.k;
        if (pointF == null || pointF.y == 0.0f) {
            return 0;
        }
        return this.k.y <= 0.0f ? -1 : 1;
    }

    public wr() {
        this.b = -1;
        this.a = new wp();
    }
}

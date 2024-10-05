package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sae extends View implements rwi, rzj, rwa {
    public final Paint a;
    public float b;
    public int c;
    private final boolean d;
    private final boolean e;
    private final Paint f;
    private final float[] g;
    private final rzd h;
    private boolean i;
    private float j;
    private float k;
    private float l;
    private final List m;
    private final List n;
    private final List o;
    private float p;
    private final rwh q;

    public sae(Context context) {
        super(context);
        this.q = new sad(this);
        this.d = true;
        this.e = true;
        Paint paint = new Paint();
        this.a = paint;
        Paint paint2 = new Paint();
        this.f = paint2;
        this.b = rwq.b(null, 4.0f);
        this.c = 2;
        this.h = rzd.a;
        this.i = false;
        this.m = rwh.x();
        this.n = rwh.x();
        this.o = rwh.x();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.parseColor("#C0C0C0"));
        paint.setAntiAlias(true);
        paint.setDither(true);
        float b = rwq.b(context, 4.0f);
        this.g = new float[]{b, b};
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint2.setDither(true);
    }

    @Override // defpackage.rzj
    public final void a(ruv ruvVar) {
    }

    @Override // defpackage.rwi
    public final void b(ruv ruvVar) {
        ruvVar.m(this);
        ruvVar.z(this.q);
        ruvVar.v(this);
    }

    @Override // defpackage.rwi
    public final void c(ruv ruvVar) {
        ruvVar.removeView(this);
        ruvVar.A(this.q);
        ruvVar.o(this);
    }

    @Override // defpackage.rzj
    public final void d(ruv ruvVar) {
        e(ruvVar.l(), ruvVar.x);
        requestLayout();
        invalidate();
    }

    public final void e(List list, rzk rzkVar) {
        Iterator it;
        saw sawVar;
        this.i = false;
        this.j = 0.0f;
        this.n.clear();
        this.m.clear();
        this.o.clear();
        if (!rzkVar.e() || list.isEmpty()) {
            return;
        }
        this.a.setStrokeWidth(rwq.b(null, 2.0f));
        if (rwh.f(this, rwg.PATH_EFFECT)) {
            this.a.setPathEffect(new DashPathEffect(this.g, 0.0f));
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            rvg rvgVar = (rvg) it2.next();
            sba sbaVar = rvgVar.a;
            rza rzaVar = rvgVar.d;
            rza rzaVar2 = rvgVar.c;
            saw c = sbaVar.c(sax.a);
            saw d = sbaVar.d(sax.b, Double.valueOf(0.0d));
            saw c2 = rvgVar.c();
            sax saxVar = saf.d;
            sax saxVar2 = sax.e;
            ajun ajunVar = sbaVar.d;
            saw A = ajunVar.A(saxVar);
            if (A == null) {
                A = ajunVar.A(saxVar2);
            }
            saw c3 = sbaVar.c(saf.e);
            int i = -1;
            for (Object obj : sbaVar.a) {
                int i2 = i + 1;
                Object a = c2.a(obj, i2, sbaVar);
                Double d2 = (Double) c.a(obj, i2, sbaVar);
                Double d3 = (Double) d.a(obj, i2, sbaVar);
                Double valueOf = Double.valueOf(d3 == null ? 0.0d : d3.doubleValue());
                if (d2 == null || Double.isNaN(d2.doubleValue())) {
                    it = it2;
                    sawVar = c2;
                } else {
                    it = it2;
                    sawVar = c2;
                    if (rzkVar.f(sbaVar, a) == 1) {
                        this.i = rzaVar.n(a);
                        this.j = Math.round(this.h.a(rzaVar, a));
                        this.n.add(Integer.valueOf(Math.round(rzaVar2.b(d2, valueOf))));
                        this.m.add((Integer) A.a(obj, i2, sbaVar));
                        this.o.add(Integer.valueOf(c3 == null ? (int) this.b : ((Integer) c3.a(obj, i2, sbaVar)).intValue()));
                    }
                }
                it2 = it;
                i = i2;
                c2 = sawVar;
            }
        }
        this.k = getHeight() - getPaddingBottom();
        this.l = 0.0f;
        int i3 = this.c;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        if (i4 != 0) {
            if (i4 == 1) {
                this.l = getPaddingTop();
                return;
            } else {
                this.l = getPaddingTop();
                return;
            }
        }
        if (this.n.isEmpty()) {
            return;
        }
        this.l = this.k;
        Iterator it3 = this.n.iterator();
        while (it3.hasNext()) {
            float intValue = ((Integer) it3.next()).intValue();
            if (intValue < this.l) {
                this.l = intValue;
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.p < 1.0d || !this.i || this.j < getPaddingLeft() || this.j > getWidth() - getPaddingRight()) {
            return;
        }
        if (this.e) {
            if (rwh.f(this, rwg.PATH_EFFECT)) {
                float f = this.j;
                canvas.drawLine(f, this.k, f, this.l, this.a);
            } else {
                float f2 = this.j;
                float f3 = this.k;
                float f4 = this.l;
                Paint paint = this.a;
                float[] fArr = this.g;
                int length = fArr.length;
                sbt.a(true, "dashPattern must have some elements");
                sbt.a(true, "dashPattern length must be even");
                float f5 = 0.0f;
                float sqrt = (float) Math.sqrt((r5 * r5) + 0.0f);
                float f6 = 0.0f / sqrt;
                float f7 = (f4 - f3) / sqrt;
                while (f5 < sqrt) {
                    float min = f5 + Math.min(fArr[0], sqrt - f5);
                    canvas.drawLine(f2 + (f5 * f6), f3 + (f5 * f7), f2 + (min * f6), f3 + (min * f7), paint);
                    f5 = min + fArr[1];
                    int length2 = fArr.length;
                }
            }
        }
        if (this.d) {
            for (int i = 0; i < this.n.size(); i++) {
                this.f.setColor(((Integer) this.m.get(i)).intValue());
                canvas.drawCircle(this.j, ((Integer) this.n.get(i)).intValue(), ((Integer) this.o.get(i)).intValue(), this.f);
            }
        }
    }

    @Override // defpackage.rwa
    public final void setAnimationPercent(float f) {
        this.p = f;
        if (f == 1.0d) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof rwk) {
            rwk rwkVar = (rwk) layoutParams;
            rwkVar.d();
            if (rwkVar.b == 0) {
                rwkVar.b = 25;
            }
        }
    }
}

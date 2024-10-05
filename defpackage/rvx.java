package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.Log;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rvx extends rwf implements rwa {
    public static final sax a = new sax("aplos.bar_fill_style");
    private static final String c = "rvx";
    private final HashMap d;
    private final Paint e;
    private final Paint f;
    private rvy g;
    private boolean h;
    private final LinkedHashSet i;
    private final LinkedHashSet j;
    private boolean k;
    private final rvs l;
    private final HashSet m;
    private final RectF n;
    private final RectF o;
    private final ryv p;
    private boolean q;
    private int r;
    private final saq s;

    public rvx(Context context, rvy rvyVar) {
        super(context);
        this.d = rwh.t();
        Paint paint = new Paint();
        this.e = paint;
        Paint paint2 = new Paint();
        this.f = paint2;
        this.s = new saq();
        this.r = 1;
        this.i = rwh.r();
        this.j = new LinkedHashSet();
        this.k = false;
        this.l = new rvs();
        this.m = rwh.o();
        this.n = new RectF();
        this.o = new RectF();
        Float valueOf = Float.valueOf(0.0f);
        this.p = new ryv(valueOf, valueOf);
        this.q = false;
        this.g = rvyVar;
        this.h = true;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setDither(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(-1);
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        rwh.e(this, rwg.CLIP_PATH, rwg.CLIP_RECT);
    }

    private static final float h(float f, float f2) {
        float f3 = f - f2;
        return (f3 == 0.0f || Math.abs(f3) > 0.0f) ? f : f2 + Math.copySign(0.0f, f3);
    }

    private final void i() {
        boolean z = this.g.a;
    }

    @Override // defpackage.rwf, defpackage.rwo
    public final CharSequence a() {
        int size = this.i.size();
        if (this.h) {
            this.g = new rvy(this.g);
            this.h = false;
        }
        if (this.g.a) {
            return MessageFormat.format(getContext().getString(R.string.aplosA11yChartTypeStackedBar), Integer.valueOf(size));
        }
        return MessageFormat.format(getContext().getString(R.string.aplosA11yChartTypeGroupBar), Integer.valueOf(size));
    }

    @Override // defpackage.rwf, defpackage.rwo
    public final List b(int i, int i2, boolean z) {
        int i3;
        int i4;
        float f;
        if (this.r == 2) {
            this.o.set(this.n.top, this.n.left, this.n.bottom, this.n.right);
            i4 = i;
            i3 = i2;
        } else {
            this.o.set(this.n);
            i3 = i;
            i4 = i2;
        }
        Collection<rvt> values = this.d.values();
        RectF rectF = this.o;
        ArrayList x = rwh.x();
        for (rvt rvtVar : values) {
            synchronized (rvtVar) {
                int e = rvtVar.e();
                int i5 = -1;
                float f2 = Float.MAX_VALUE;
                int i6 = 0;
                while (true) {
                    f = 0.0f;
                    if (i6 >= e) {
                        break;
                    }
                    float a2 = rvtVar.a(i6) + rvtVar.i();
                    float j = rvtVar.j() + a2;
                    if (rectF.intersects(a2, rectF.top, j, rectF.bottom)) {
                        float f3 = i3;
                        float min = rwq.d(f3, a2, j) ? 0.0f : Math.min(Math.abs(a2 - f3), Math.abs(j - f3));
                        if (min >= f2) {
                            if (min > f2) {
                                break;
                            }
                        } else {
                            f2 = (int) min;
                            i5 = i6;
                        }
                    }
                    i6++;
                }
                if (i5 >= 0) {
                    float b = rvtVar.b(i5);
                    float c2 = rvtVar.c(i5);
                    float f4 = i4;
                    if (!rwq.d(f4, b, c2)) {
                        f = Math.min(Math.abs(b - f4), Math.abs(c2 - f4));
                    }
                    if (z || (f2 <= 10.0f && f <= 10.0f)) {
                        say sayVar = new say();
                        sayVar.c = rvtVar.b;
                        sayVar.d = rvtVar.g(i5);
                        sayVar.e = rvtVar.a.t(i5);
                        rvtVar.a(i5);
                        rvtVar.a.r(i5);
                        rvtVar.c(i5);
                        sayVar.f = f2;
                        sayVar.g = f;
                        x.add(sayVar);
                    }
                }
            }
        }
        return x;
    }

    @Override // defpackage.rwo
    public final void c(List list, rzk rzkVar) {
        HashMap hashMap;
        this.n.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        int i = this.r;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            this.p.b(Float.valueOf(this.n.left), Float.valueOf(this.n.right));
        } else if (i2 == 1) {
            this.p.b(Float.valueOf(this.n.top), Float.valueOf(this.n.bottom));
        } else {
            throw new AssertionError();
        }
        HashMap t = rwh.t();
        HashSet<String> p = rwh.p(this.d.keySet());
        i();
        int size = this.g.a ? 1 : list.size();
        rvz rvzVar = new rvz(size);
        if (list.isEmpty()) {
            hashMap = t;
        } else {
            float c2 = ((rvg) list.get(0)).d.c();
            boolean z = this.g.c;
            rvw[] rvwVarArr = new rvw[size];
            if (rvzVar.c < size) {
                Log.w(c, "There are more series than weights, extra series are drawn with zero weight");
            }
            float round = Math.round(rwq.b(null, 1.0f));
            float f = (rvzVar.c - 1) * round;
            float f2 = c2 - f;
            float f3 = 0.0f;
            int i3 = 0;
            while (i3 < size) {
                float floor = (float) Math.floor(((i3 < rvzVar.c ? rvzVar.a[i3] : 0) / rvzVar.b) * f2);
                rvw rvwVar = new rvw();
                rvwVarArr[i3] = rvwVar;
                rvwVar.a = floor;
                rvwVar.b = f3 + (i3 * round);
                i3++;
                f3 += floor;
                t = t;
            }
            HashMap hashMap2 = t;
            float round2 = Math.round((c2 - (f3 + f)) / 2.0f);
            for (int i4 = 0; i4 < size; i4++) {
                rvw rvwVar2 = rvwVarArr[i4];
                float f4 = rvwVar2.b + round2;
                rvwVar2.b = f4;
                double d = f4;
                double d2 = c2;
                Double.isNaN(d2);
                Double.isNaN(d);
                rvwVar2.b = (float) Math.round(d - (d2 / 2.0d));
            }
            int i5 = 0;
            while (i5 < list.size()) {
                rvg rvgVar = (rvg) list.get(i5);
                sba sbaVar = rvgVar.a;
                String str = sbaVar.b;
                p.remove(str);
                rvt rvtVar = (rvt) this.d.get(str);
                if (rvtVar == null) {
                    rvtVar = new rvt(new rwt());
                }
                HashMap hashMap3 = hashMap2;
                hashMap3.put(str, rvtVar);
                rvtVar.a.C();
                int i6 = true != this.g.a ? i5 : 0;
                rza rzaVar = rvgVar.d;
                rza rzaVar2 = rvgVar.c;
                saw c3 = rvgVar.c();
                boolean z2 = this.b;
                rvw rvwVar3 = rvwVarArr[i6];
                rvtVar.h(rzaVar, rzaVar2, c3, sbaVar, z2, rvwVar3.a, rvwVar3.b, this.p);
                i5++;
                hashMap2 = hashMap3;
            }
            hashMap = hashMap2;
        }
        i();
        for (String str2 : p) {
            ((rvt) this.d.get(str2)).h(null, null, null, rwh.E(str2), this.b, 0.0f, 0.0f, this.p);
        }
        this.d.putAll(hashMap);
        this.m.clear();
        for (rvt rvtVar2 : this.d.values()) {
            this.m.addAll(rvtVar2.a.u(rvtVar2.c));
        }
    }

    @Override // defpackage.rwf, defpackage.rwo
    public final void d(ruv ruvVar, List list, rzk rzkVar) {
        String str;
        super.d(ruvVar, list, rzkVar);
        int size = list.size();
        ArrayList y = rwh.y(list);
        LinkedHashSet linkedHashSet = this.i;
        sba sbaVar = null;
        int i = 0;
        if ((rzkVar instanceof rzl) && rzkVar.e()) {
            for (int i2 = 0; i2 < y.size(); i2++) {
                sba sbaVar2 = ((rvg) y.get(i2)).a;
                if (rzkVar.f(sbaVar2, null) == 1) {
                    str = sbaVar2.b;
                    break;
                }
            }
        }
        str = null;
        boolean z = this.g.a;
        for (String str2 : rwh.A(y, new rvv(0))) {
            if (!str2.equals(str)) {
                linkedHashSet.remove(str2);
                linkedHashSet.add(str2);
            }
        }
        if (str != null) {
            linkedHashSet.remove(str);
            linkedHashSet.add(str);
        }
        if (this.g.a) {
            int size2 = y.size();
            saw sawVar = null;
            int i3 = 0;
            while (i3 < size2) {
                rvg rvgVar = (rvg) y.get(i3);
                sba sbaVar3 = rvgVar.a;
                saw c2 = rvgVar.c();
                rwh.B(sbaVar3, c2, sbaVar, sawVar);
                rzc rzcVar = rvgVar.e.a;
                if (rzcVar.b == 5 && rzcVar.a != rzm.e(1)) {
                    rvgVar.e.d(rzc.c(1));
                }
                i3++;
                sbaVar = sbaVar3;
                sawVar = c2;
            }
            ArrayList x = rwh.x();
            for (int i4 = 0; i4 < y.size(); i4++) {
                x.add(((rvg) y.get(i4)).a.b);
            }
            this.k = false;
            if (x.size() == this.j.size() && this.j.containsAll(x)) {
                Iterator it = this.j.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!((String) x.get(i)).equals((String) it.next())) {
                        this.k = true;
                        break;
                    }
                    i++;
                }
            }
            this.j.clear();
            this.j.addAll(x);
            i();
        } else {
            int size3 = y.size();
            while (i < size3) {
                rvg rvgVar2 = (rvg) y.get(i);
                rzc rzcVar2 = rvgVar2.e.a;
                if (rzcVar2.b == 5 && rzcVar2.a != rzm.e(size)) {
                    rvgVar2.e.d(rzc.c(size));
                }
                i++;
            }
        }
        this.r = true != ((ruo) ruvVar).c ? 2 : 1;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = 1;
        boolean f = rwh.f(this, rwg.CLIP_PATH);
        if (f) {
            canvas.save();
            canvas.clipRect(this.n);
        }
        if (!this.g.a) {
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                rvt rvtVar = (rvt) this.d.get((String) it.next());
                Iterator it2 = this.m.iterator();
                while (it2.hasNext()) {
                    int f2 = rvtVar.f(it2.next());
                    if (f2 != -1) {
                        this.l.b();
                        this.l.a = rvtVar.a(f2) + rvtVar.i();
                        this.l.b = rvtVar.j();
                        this.l.d = this.g.e == null ? 0.0f : rwh.g(rvtVar.j());
                        float c2 = rvtVar.c(f2);
                        float b = rvtVar.b(f2);
                        this.l.a(h(c2, b), b, rvtVar.d(f2), (String) rvtVar.b.d(a, "aplos.SOLID").a(rvtVar.g(f2), 0, rvtVar.b));
                        this.s.a(canvas, this.l, this.r, this.n, this.e, this.f);
                    }
                }
            }
        } else {
            Iterator it3 = this.m.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                this.l.b();
                rvs rvsVar = this.l;
                rvsVar.e = (this.q && this.k) ? false : true;
                rvsVar.c = this.g.d;
                Iterator it4 = this.i.iterator();
                while (it4.hasNext()) {
                    String str = (String) it4.next();
                    rvt rvtVar2 = (rvt) this.d.get(str);
                    if (rvtVar2 == null) {
                        String str2 = c;
                        Object[] objArr = new Object[i];
                        objArr[0] = str;
                        Log.e(str2, String.format("No barAnimator found for series %s", objArr));
                    } else {
                        int f3 = rvtVar2.f(next);
                        if (f3 != -1) {
                            float j = rvtVar2.j();
                            rvs rvsVar2 = this.l;
                            if (j > rvsVar2.b) {
                                rvsVar2.b = j;
                                rvsVar2.a = rvtVar2.a(f3) + rvtVar2.i();
                            }
                            float c3 = rvtVar2.c(f3);
                            float b2 = rvtVar2.b(f3);
                            this.l.a(h(c3, b2), b2, rvtVar2.d(f3), (String) rvtVar2.b.d(a, "aplos.SOLID").a(rvtVar2.g(f3), 0, rvtVar2.b));
                            i = 1;
                        }
                    }
                }
                float g = this.g.e == null ? 0.0f : rwh.g(this.l.b);
                rvs rvsVar3 = this.l;
                rvsVar3.d = g;
                this.s.a(canvas, rvsVar3, this.r, this.n, this.e, this.f);
                i = 1;
            }
        }
        if (f) {
            canvas.restore();
        }
    }

    @Override // defpackage.rwa
    public final void setAnimationPercent(float f) {
        this.q = f < 1.0f;
        ArrayList y = rwh.y(this.d.keySet());
        int size = y.size();
        for (int i = 0; i < size; i++) {
            String str = (String) y.get(i);
            rvt rvtVar = (rvt) this.d.get(str);
            rvtVar.setAnimationPercent(f);
            if (rvtVar.e() == 0) {
                this.d.remove(str);
                this.i.remove(str);
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof rwk) {
            ((rwk) layoutParams).d();
        }
    }
}

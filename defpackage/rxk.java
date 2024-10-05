package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class rxk extends View implements rwa {
    public rza a;
    public rxw b;
    public rxu c;
    public rxr d;
    public int e;
    private boolean f;
    private int g;
    private int h;
    private rxj i;
    private final List j;
    private final Rect k;
    private final Rect l;
    private final ryv m;
    private final rwl n;
    private final ryv o;

    public rxk(Context context, rzc rzcVar) {
        super(context);
        this.e = 3;
        this.f = true;
        this.g = 0;
        this.h = 0;
        this.j = rwh.x();
        this.k = new Rect();
        this.l = new Rect();
        this.m = new ryv(0, 0);
        this.n = new rwl();
        this.o = new ryv(0, 0);
        rxr rxrVar = new rxr(context);
        rxrVar.d(rzcVar);
        this.d = rxrVar;
        k(new ryd());
    }

    protected abstract ryv a();

    final List b() {
        List b = this.b.b(this.j, a(), this.e, this.n, this.c, this.i, this.a, h());
        sbt.e(b, "%s returned null ticks.", this.b.getClass().getName());
        return b;
    }

    public final void c(Object obj) {
        this.j.add(obj);
        this.a.i(obj);
    }

    protected void d(List list) {
    }

    public final void e() {
        this.j.clear();
        this.a.k();
        this.a.m(this.d.a);
        this.a.p(this.d.k);
    }

    public final void f() {
        List b = b();
        d(b);
        this.k.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        this.l.set(0, 0, getWidth(), getHeight());
        this.i.d(this.e, this.a, b, this.k, this.l);
    }

    protected final boolean g() {
        int i = this.e;
        return i == 4 || i == 2;
    }

    protected boolean h() {
        return false;
    }

    public final void i(int i) {
        this.g = i;
        this.h = i;
    }

    public final void j() {
        this.f = false;
    }

    public final void k(rxj rxjVar) {
        rxr a = rxjVar.a();
        if (a != null) {
            a.d(this.d.a);
            dsm dsmVar = this.d.k;
            sbt.g(dsmVar, "stepSizeConfig");
            a.k = dsmVar;
            this.d = a;
        }
        rxjVar.c(this.d);
        this.i = rxjVar;
    }

    public final void l(rza rzaVar) {
        rza rzaVar2;
        if (rzaVar.f() == null && (rzaVar2 = this.a) != null && rzaVar2.f() != null) {
            rzaVar.l(this.a.f());
        }
        rzaVar.m(this.d.a);
        rzaVar.p(this.d.k);
        this.a = rzaVar;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.i.b(canvas, this.f);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int width;
        if (g()) {
            paddingLeft = (getHeight() - getPaddingBottom()) - this.g;
            width = getPaddingTop() + this.h;
        } else {
            paddingLeft = getPaddingLeft() + this.g;
            width = (getWidth() - getPaddingRight()) - this.h;
        }
        rza rzaVar = this.a;
        ryv ryvVar = this.o;
        ryvVar.b(Integer.valueOf(paddingLeft), Integer.valueOf(width));
        rzaVar.l(ryvVar);
        this.n.a((getWidth() - getPaddingRight()) - getPaddingLeft(), (getHeight() - getPaddingBottom()) - getPaddingTop());
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int size;
        int size2;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        this.n.a(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        if (g()) {
            size = View.MeasureSpec.getSize(i2);
        } else {
            size = View.MeasureSpec.getSize(i);
        }
        int i3 = size - (this.h + this.g);
        if (g()) {
            size2 = View.MeasureSpec.getSize(i);
        } else {
            size2 = View.MeasureSpec.getSize(i2);
        }
        ryv f = this.a.f();
        rza rzaVar = this.a;
        ryv ryvVar = this.m;
        ryvVar.b(0, Integer.valueOf(i3));
        rzaVar.l(ryvVar);
        List<rxt> b = b();
        int i4 = g() ? marginLayoutParams.width : marginLayoutParams.height;
        if (i4 != -1) {
            if (i4 == -2) {
                size2 = 0;
                for (rxt rxtVar : b) {
                    size2 = Math.max(size2, g() ? rxtVar.c.a : rxtVar.c.b);
                }
            } else {
                size2 = i4;
            }
        }
        if (f != null) {
            this.a.l(f);
        }
        int size3 = g() ? View.MeasureSpec.getSize(i2) : size2;
        if (!g()) {
            size2 = View.MeasureSpec.getSize(i);
        }
        this.n.a(size2, size3);
        setMeasuredDimension(size2, size3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [rxj, rwa] */
    @Override // defpackage.rwa
    public final void setAnimationPercent(float f) {
        ?? r0 = this.i;
        if (r0 instanceof rwa) {
            r0.setAnimationPercent(f);
        }
        invalidate();
    }
}

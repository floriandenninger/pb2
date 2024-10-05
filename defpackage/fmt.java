package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import com.google.android.youtube.R;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fmt extends fmg implements View.OnLayoutChangeListener, fna {
    private final fmn A;
    private final fms B;
    private final ValueAnimator C;
    private final IdentityHashMap D;
    private boolean E;
    private boolean F;
    private int G;
    private Point H;
    private final amvh I;

    /* renamed from: J, reason: collision with root package name */
    private amvf f215J;
    private TimelineMarker[] K;
    private ammv L;
    public aaea a;
    public Set b;
    public fmu c;
    public fmw d;
    public ahtk e;
    public final Rect f;
    final Rect g;
    public final int h;
    public final ValueAnimator i;
    public View j;
    public zby k;
    int l;
    final List m;
    public boolean n;
    public ammv o;
    public fmy p;
    public axzg q;
    private final Rect v;
    private final Rect w;
    private final Rect x;
    private final Rect y;
    private final fmh z;

    public fmt(Context context, AttributeSet attributeSet) {
        super(new ahyg(), context, attributeSet);
        int i;
        Resources resources = context.getResources();
        this.j = null;
        this.k = null;
        this.v = new Rect();
        this.f = new Rect();
        this.w = new Rect();
        this.x = new Rect();
        this.g = new Rect();
        this.y = new Rect();
        this.m = new ArrayList();
        this.I = amxc.d();
        this.o = amlr.a;
        this.L = amlr.a;
        this.D = new IdentityHashMap(4);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fnf.a);
            i = (int) obtainStyledAttributes.getDimension(0, 0.0f);
            obtainStyledAttributes.recycle();
        } else {
            i = 0;
        }
        this.h = i == 0 ? getResources().getDimensionPixelSize(R.dimen.inline_time_bar_size) : i;
        this.z = new fmh(this);
        this.B = new fmk(this);
        this.A = new fmn(this, new fmo(this), resources.getDimensionPixelSize(R.dimen.inline_time_bar_scrubber_default_size), resources.getDimensionPixelSize(R.dimen.inline_time_bar_scrubber_drag_size));
        this.C = new fmr(this, 0).a();
        this.i = new fmr(this, 1).a();
        fmw fmwVar = this.d;
        fmwVar.getClass();
        fmwVar.c.add(new fmj(this));
    }

    private final int Q() {
        if (kO()) {
            return this.c.w;
        }
        return this.c.v;
    }

    private final void R(TimelineMarker timelineMarker) {
        amvf amvfVar;
        if (timelineMarker != null) {
            long j = timelineMarker.a;
            long j2 = timelineMarker.b;
            long kL = kL();
            int i = this.w.left;
            int width = this.w.width();
            long z = yjk.z(j, 0L, kL);
            amvfVar = amvf.d(Integer.valueOf(evr.o(z, kL, i, width)), Integer.valueOf(evr.o(yjk.z(j2, z, kL), kL, i, width)));
        } else {
            amvfVar = null;
        }
        this.f215J = amvfVar;
        if (amvfVar == null || ((ampe) this.I).c().isEmpty()) {
            return;
        }
        for (amvf amvfVar2 : this.I.c()) {
            if (amvfVar2.l(this.f215J)) {
                this.f215J = amvfVar2;
                return;
            }
        }
    }

    private final boolean S() {
        return kL() > 0;
    }

    public static View f(View view) {
        if (view.getParent() instanceof View) {
            return (View) view.getParent();
        }
        return null;
    }

    @Override // defpackage.fna
    public final void A(int i) {
        fmh fmhVar = this.z;
        int i2 = fmh.d;
        fmhVar.b = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ahyf
    public final void B() {
        if (kO() && !isEnabled()) {
            kP();
        }
        if (kO()) {
            fmn fmnVar = this.A;
            int i = fmn.g;
            fmnVar.a();
            this.C.cancel();
            this.C.start();
            return;
        }
        if (this.G != 1) {
            fmn fmnVar2 = this.A;
            int i2 = fmn.g;
            fmnVar2.f.removeCallbacks(fmnVar2.e);
            if (fmnVar2.b() == 0.0f) {
                fmnVar2.g();
            } else {
                fmnVar2.f.postDelayed(fmnVar2.e, fmnVar2.d);
            }
        }
    }

    @Override // defpackage.ahyf
    protected final boolean C(float f, float f2) {
        return this.f.contains((int) f, (int) f2);
    }

    public final boolean D() {
        return this.E || this.j == null;
    }

    public final int b() {
        return getResources().getDimensionPixelSize(R.dimen.inline_controls_bottom_bar_height);
    }

    @Override // defpackage.ahyf
    public final long c() {
        long j = ((ahyg) this.r).d;
        if (this.w.width() <= 0) {
            return j;
        }
        return j + (((this.l - this.w.left) * kL()) / this.w.width());
    }

    @Override // defpackage.fna
    public final void g(View view) {
        if (this.D.containsKey(view)) {
            return;
        }
        this.D.put(view, new fml(this, view));
    }

    @Override // defpackage.fna
    public final void h() {
        if (isEnabled()) {
            P(E());
            kM();
        }
    }

    @Override // defpackage.fna
    public final void i(Rect rect) {
        getGlobalVisibleRect(rect);
    }

    @Override // android.view.View
    public final boolean isEnabled() {
        boolean z = false;
        if (super.isEnabled() && S()) {
            z = true;
        }
        setFocusable(z);
        return z;
    }

    @Override // defpackage.fna
    public final void j(Point point) {
        if (point != null) {
            point.set(this.l + getLeft(), this.w.top + getTop());
        }
    }

    public final void k() {
        if (kO()) {
            kP();
            this.C.cancel();
            if (this.G != 1) {
                fmn fmnVar = this.A;
                int i = fmn.g;
                fmnVar.f.removeCallbacks(fmnVar.e);
                fmnVar.g();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ahyf
    public final void kM() {
        TimelineMarker timelineMarker;
        kN();
        long kL = kL();
        ahtk ahtkVar = this.e;
        long j = this.s;
        TimelineMarker timelineMarker2 = ahtkVar.d;
        if (timelineMarker2 == null || ahtkVar.c == null) {
            timelineMarker = ahtkVar.c;
        } else {
            timelineMarker = Math.abs(j - timelineMarker2.a) < Math.abs(j - ahtkVar.c.a) ? ahtkVar.d : ahtkVar.c;
        }
        if (timelineMarker != null) {
            long abs = Math.abs(timelineMarker.a - j);
            long d = ahtkVar.a.d() - ahtkVar.b;
            if (((float) abs) / ((float) kL) <= 0.1f && d <= 500) {
                j = timelineMarker.a;
            }
        }
        J(j);
        if (j != this.s) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((ahyd) it.next()).a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ahyf
    public final void kN() {
        this.x.set(this.w);
        this.g.set(this.w);
        ahyk ahykVar = this.r;
        long kL = kL();
        long E = E();
        long F = F();
        if (true != kO()) {
            F = E;
        }
        if (kL > 0) {
            this.x.right = this.w.left + ((int) ((this.w.width() * kK()) / kL));
            this.l = this.w.left + ((int) ((this.w.width() * F) / kL));
            this.g.right = this.w.left + ((int) ((this.w.width() * E) / kL));
        } else {
            this.x.right = this.w.left;
            this.g.right = this.w.left;
            this.l = this.w.left;
        }
        this.c.d.setColor(ahykVar.d() | (-16777216));
        this.c.e.setColor(ahykVar.e());
        this.c.b.setColor(ahykVar.a());
        this.c.c.setColor(ahykVar.b());
        this.c.a.setColor(ahykVar.c());
        setEnabled(ahykVar.p());
        fmw fmwVar = this.d;
        if (fmwVar.d != kL) {
            fmwVar.d = kL;
            fmwVar.b.clear();
        }
        invalidate(this.f);
    }

    @Override // defpackage.fna
    public final void l() {
        if (isEnabled() && kO()) {
            kM();
        }
    }

    @Override // defpackage.fna
    public final void m(int i) {
        if (isEnabled()) {
            N(i);
        }
    }

    @Override // defpackage.fna
    public final void n(int i) {
        if (isEnabled()) {
            O(i);
        }
    }

    @Override // defpackage.ahyf
    protected final void o(float f) {
        if (D()) {
            int scaledEdgeSlop = ViewConfiguration.get(getContext()).getScaledEdgeSlop();
            int i = this.f.left + scaledEdgeSlop;
            int i2 = this.f.right - scaledEdgeSlop;
            this.l = this.w.left + ((this.w.width() * (Math.max(i, Math.min(i2, (int) f)) - i)) / (i2 - i));
            return;
        }
        this.l = Math.max(this.w.left, Math.min(this.w.right, (int) f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0102, code lost:
    
        if ((((java.lang.Integer) r2.h()).intValue() - ((java.lang.Integer) r2.g()).intValue()) != Q()) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0543 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0571 A[LOOP:3: B:135:0x056f->B:136:0x0571, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x080c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0416  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r42) {
        /*
            Method dump skipped, instructions count: 2293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fmt.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.F = z;
        int b = b();
        int i5 = this.h;
        this.w.set(this.f);
        int i6 = this.f.top + ((b - i5) / 2);
        this.w.top = i6;
        this.w.bottom = i6 + i5;
        kN();
        R(this.d.a.a(ahyo.CHAPTER));
        this.d.b.clear();
        if (Build.VERSION.SDK_INT >= 29) {
            this.v.set(this.f);
            setSystemGestureExclusionRects(amru.r(this.v));
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (view != this.j) {
            view.removeOnLayoutChangeListener(this);
        } else {
            if (D()) {
                return;
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), b());
    }

    @Override // defpackage.ahyf, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (!isEnabled()) {
            return false;
        }
        Point G = G(motionEvent);
        int i = G.x;
        int i2 = G.y;
        if (this.L.h() && (!this.c.y || C(i, i2))) {
            ((fmz) this.L.c()).a(motionEvent);
        }
        if (this.G == 0 || this.z.b() <= 0.0f) {
            if (kO()) {
                kM();
            }
            if (D() && C(i, i2) && i2 > this.w.centerY()) {
                z = true;
            }
            if (!z || motionEvent.getAction() != 0 || !this.o.h()) {
                return z;
            }
            ((fmx) this.o.c()).a();
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            float f = i;
            if (C(f, i2)) {
                fmy fmyVar = this.p;
                if (fmyVar != null) {
                    long c = c();
                    int i3 = this.l + (this.A.c / 2);
                    if (r8 - r9 <= f && f <= i3) {
                        z = true;
                    }
                    fmyVar.b(c, z);
                }
                this.H = new Point(i, i2);
                if (this.c.s) {
                    L();
                }
                return true;
            }
        } else if (action != 1) {
            if (action != 2) {
                if (action == 3) {
                    this.H = null;
                    if (kO()) {
                        M();
                        return true;
                    }
                }
            } else {
                if (kO()) {
                    N(i);
                    return true;
                }
                Point point = this.H;
                if (point != null && Math.abs(i - point.x) > this.c.r) {
                    O(i);
                    return true;
                }
            }
        } else {
            if (kO()) {
                fmy fmyVar2 = this.p;
                if (fmyVar2 != null) {
                    fmyVar2.a(c());
                }
                this.H = null;
                kM();
                return true;
            }
            if (this.H != null) {
                Iterator it = this.D.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    fml fmlVar = (fml) it.next();
                    if (fmlVar.a.isClickable() && fmlVar.a(this.H.x, this.H.y) && fmlVar.a(i, i2)) {
                        fmlVar.a.performClick();
                        break;
                    }
                }
                this.H = null;
                if (this.c.s) {
                    M();
                }
            }
        }
        return false;
    }

    @Override // defpackage.fna
    public final void p(boolean z) {
        int i;
        if (kO() || (i = this.G) == 0 || i == 3) {
            return;
        }
        if (!z || i == 1) {
            fmn fmnVar = this.A;
            int i2 = fmn.g;
            fmnVar.a();
        } else {
            fmn fmnVar2 = this.A;
            int i3 = fmn.g;
            fmnVar2.a();
            fmnVar2.f.postDelayed(fmnVar2.e, fmnVar2.d);
        }
    }

    @Override // defpackage.fna
    public final void r(fmz fmzVar) {
        this.L = ammv.j(fmzVar);
    }

    @Override // defpackage.fna
    public final void s(boolean z) {
        if (this.E == z) {
            return;
        }
        boolean D = D();
        this.E = z;
        if (D != D()) {
            requestLayout();
        }
    }

    @Override // defpackage.fna
    public final void t(View view) {
        View view2 = this.j;
        if (view == view2) {
            return;
        }
        boolean D = D();
        if (view2 != null) {
            view2.removeOnLayoutChangeListener(this);
        }
        if (view != null) {
            view.addOnLayoutChangeListener(this);
        }
        this.j = view;
        if (D != D()) {
            requestLayout();
        }
    }

    @Override // defpackage.fna
    public final void u(int i) {
        if (this.G == i) {
            return;
        }
        this.G = i;
        if (i != 1) {
            if (!kO()) {
                fmn fmnVar = this.A;
                int i2 = fmn.g;
                fmnVar.f.removeCallbacks(fmnVar.e);
                if (fmnVar.b() == 0.0f) {
                    fmnVar.g();
                } else {
                    fmnVar.c();
                    fmnVar.f.postInvalidate();
                }
            }
            if (i == 0) {
                k();
            }
        }
    }

    @Override // defpackage.fna
    public final void v(fmy fmyVar) {
        this.p = fmyVar;
    }

    @Override // defpackage.fna
    public final void w(int i) {
        this.z.e(i);
        this.A.e(i);
        this.C.setDuration(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fna
    public final void x(boolean z, boolean z2) {
        Boolean bool;
        if (z) {
            fmh fmhVar = this.z;
            int i = fmh.d;
            fmhVar.e(fmhVar.a);
            if (fmhVar.b() == 1.0f) {
                fmhVar.f();
            } else {
                if (z2) {
                    fmhVar.d();
                } else {
                    fmhVar.f();
                }
                fmhVar.c.postInvalidate();
            }
        } else {
            fmh fmhVar2 = this.z;
            int i2 = fmh.d;
            fmhVar2.e(fmhVar2.b);
            if (fmhVar2.b() == 0.0f) {
                fmhVar2.g();
            } else {
                if (z2) {
                    fmhVar2.c();
                } else {
                    fmhVar2.g();
                    fmhVar2.c.k();
                }
                fmhVar2.c.postInvalidate();
            }
        }
        aqvj aqvjVar = this.q.b.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45354872L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45354872L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45354872L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        if (bool.booleanValue()) {
            setFocusable(z);
            setClickable(z);
            setImportantForAccessibility(true != z ? 2 : 1);
        }
    }

    public final void z(TimelineMarker timelineMarker) {
        amvf amvfVar = this.f215J;
        R(timelineMarker);
        if (Objects.equals(amvfVar, this.f215J)) {
            return;
        }
        this.B.d();
        invalidate();
    }
}

package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zn extends ll implements wf {
    float c;
    float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public final zi j;
    int k;
    public RecyclerView m;
    VelocityTracker o;
    in q;
    public Rect r;
    public long s;
    private float u;
    private float v;
    private List x;
    private List y;
    private zj z;
    final List a = new ArrayList();
    private final float[] t = new float[2];
    wv b = null;
    int i = -1;
    private int w = 0;
    final List l = new ArrayList();
    final Runnable n = new zd(this);
    View p = null;
    private final wh A = new ze(this);

    public zn(zi ziVar) {
        this.j = ziVar;
    }

    private final void q(float[] fArr) {
        if ((this.k & 12) != 0) {
            fArr[0] = (this.g + this.e) - this.b.a.getLeft();
        } else {
            fArr[0] = this.b.a.getTranslationX();
        }
        if ((this.k & 3) != 0) {
            fArr[1] = (this.h + this.f) - this.b.a.getTop();
        } else {
            fArr[1] = this.b.a.getTranslationY();
        }
    }

    private final void r() {
        VelocityTracker velocityTracker = this.o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.o = null;
        }
    }

    private static boolean s(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    private final int t(int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.e > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.o;
        if (velocityTracker != null && this.i >= 0) {
            velocityTracker.computeCurrentVelocity(1000, this.v);
            float xVelocity = this.o.getXVelocity(this.i);
            float yVelocity = this.o.getYVelocity(this.i);
            int i3 = xVelocity <= 0.0f ? 4 : 8;
            float abs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && abs >= this.u && abs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = this.m.getWidth() * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.e) <= width) {
            return 0;
        }
        return i2;
    }

    private final int u(int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.f > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.o;
        if (velocityTracker != null && this.i >= 0) {
            velocityTracker.computeCurrentVelocity(1000, this.v);
            float xVelocity = this.o.getXVelocity(this.i);
            float yVelocity = this.o.getYVelocity(this.i);
            int i3 = yVelocity <= 0.0f ? 1 : 2;
            float abs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && abs >= this.u && abs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = this.m.getHeight() * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.f) <= height) {
            return 0;
        }
        return i2;
    }

    @Override // defpackage.wf
    public final void a(View view) {
        m(view);
        wv k = this.m.k(view);
        if (k == null) {
            return;
        }
        wv wvVar = this.b;
        if (wvVar == null || k != wvVar) {
            j(k, false);
            if (this.a.remove(k.a)) {
                this.j.f(this.m, k);
                return;
            }
            return;
        }
        n(null, 0);
    }

    @Override // defpackage.wf
    public final void b() {
    }

    @Override // defpackage.ll
    public final void d(Rect rect, View view, RecyclerView recyclerView, ws wsVar) {
        rect.setEmpty();
    }

    @Override // defpackage.ll
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        float f;
        float f2;
        if (this.b != null) {
            q(this.t);
            float[] fArr = this.t;
            float f3 = fArr[0];
            f2 = fArr[1];
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        zi ziVar = this.j;
        wv wvVar = this.b;
        List list = this.l;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            zl zlVar = (zl) list.get(i);
            float f4 = zlVar.d;
            float f5 = zlVar.f;
            if (f4 == f5) {
                zlVar.l = zlVar.h.a.getTranslationX();
            } else {
                zlVar.l = f4 + (zlVar.p * (f5 - f4));
            }
            float f6 = zlVar.e;
            float f7 = zlVar.g;
            if (f6 == f7) {
                zlVar.m = zlVar.h.a.getTranslationY();
            } else {
                zlVar.m = f6 + (zlVar.p * (f7 - f6));
            }
            int save = canvas.save();
            wv wvVar2 = zlVar.h;
            float f8 = zlVar.l;
            float f9 = zlVar.m;
            int i2 = zlVar.i;
            ziVar.o(recyclerView, wvVar2, f8, f9, false);
            canvas.restoreToCount(save);
        }
        if (wvVar != null) {
            int save2 = canvas.save();
            ziVar.o(recyclerView, wvVar, f, f2, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override // defpackage.ll
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        if (this.b != null) {
            q(this.t);
        }
        wv wvVar = this.b;
        List list = this.l;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            zl zlVar = (zl) list.get(i);
            int save = canvas.save();
            wv wvVar2 = zlVar.h;
            float f = zlVar.l;
            float f2 = zlVar.m;
            int i2 = zlVar.i;
            canvas.restoreToCount(save);
        }
        if (wvVar != null) {
            canvas.restoreToCount(canvas.save());
        }
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            zl zlVar2 = (zl) list.get(size);
            if (!zlVar2.o) {
                z = true;
            } else if (!zlVar2.k) {
                list.remove(size);
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final View h(MotionEvent motionEvent) {
        zl zlVar;
        View view;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        wv wvVar = this.b;
        if (wvVar != null) {
            View view2 = wvVar.a;
            if (s(view2, x, y, this.g + this.e, this.h + this.f)) {
                return view2;
            }
        }
        int size = this.l.size();
        do {
            size--;
            if (size >= 0) {
                zlVar = (zl) this.l.get(size);
                view = zlVar.h.a;
            } else {
                return this.m.n(x, y);
            }
        } while (!s(view, x, y, zlVar.l, zlVar.m));
        return view;
    }

    public final void i(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.m;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.aE(this);
            this.m.Y(this.A);
            this.m.X(this);
            int size = this.l.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                zl zlVar = (zl) this.l.get(0);
                zlVar.a();
                this.j.f(this.m, zlVar.h);
            }
            this.l.clear();
            this.p = null;
            r();
            zj zjVar = this.z;
            if (zjVar != null) {
                zjVar.a = false;
                this.z = null;
            }
            if (this.q != null) {
                this.q = null;
            }
        }
        this.m = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.u = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            this.v = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            ViewConfiguration.get(this.m.getContext()).getScaledTouchSlop();
            this.m.aB(this);
            this.m.v(this.A);
            this.m.u(this);
            this.z = new zj(this);
            this.q = new in(this.m.getContext(), this.z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(wv wvVar, boolean z) {
        zl zlVar;
        int size = this.l.size();
        do {
            size--;
            if (size < 0) {
                return;
            } else {
                zlVar = (zl) this.l.get(size);
            }
        } while (zlVar.h != wvVar);
        zlVar.n |= z;
        if (!zlVar.o) {
            zlVar.a();
        }
        this.l.remove(size);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void k(wv wvVar) {
        List list;
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int right;
        int abs4;
        int i;
        int i2;
        if (!this.m.isLayoutRequested() && this.w == 2) {
            int i3 = (int) (this.g + this.e);
            int i4 = (int) (this.h + this.f);
            if (Math.abs(i4 - wvVar.a.getTop()) >= wvVar.a.getHeight() * 0.5f || Math.abs(i3 - wvVar.a.getLeft()) >= wvVar.a.getWidth() * 0.5f) {
                List list2 = this.x;
                if (list2 == null) {
                    this.x = new ArrayList();
                    this.y = new ArrayList();
                } else {
                    list2.clear();
                    this.y.clear();
                }
                int round = Math.round(this.g + this.e);
                int round2 = Math.round(this.h + this.f);
                int width = wvVar.a.getWidth() + round;
                int height = wvVar.a.getHeight() + round2;
                int i5 = (round + width) / 2;
                int i6 = (round2 + height) / 2;
                wd wdVar = this.m.n;
                int aq = wdVar.aq();
                int i7 = 0;
                while (i7 < aq) {
                    View az = wdVar.az(i7);
                    if (az != wvVar.a && az.getBottom() >= round2 && az.getTop() <= height && az.getRight() >= round && az.getLeft() <= width) {
                        wv k = this.m.k(az);
                        i = round;
                        i2 = round2;
                        if (this.j.h(this.m, this.b, k)) {
                            int abs5 = Math.abs(i5 - ((az.getLeft() + az.getRight()) / 2));
                            int abs6 = Math.abs(i6 - ((az.getTop() + az.getBottom()) / 2));
                            int i8 = (abs5 * abs5) + (abs6 * abs6);
                            int size = this.x.size();
                            int i9 = 0;
                            int i10 = 0;
                            while (i10 < size) {
                                int i11 = size;
                                if (i8 <= ((Integer) this.y.get(i10)).intValue()) {
                                    break;
                                }
                                i9++;
                                i10++;
                                size = i11;
                            }
                            this.x.add(i9, k);
                            this.y.add(i9, Integer.valueOf(i8));
                        }
                    } else {
                        i = round;
                        i2 = round2;
                    }
                    i7++;
                    round = i;
                    round2 = i2;
                }
                List list3 = this.x;
                if (list3.size() != 0) {
                    int width2 = wvVar.a.getWidth() + i3;
                    int height2 = wvVar.a.getHeight() + i4;
                    int left2 = i3 - wvVar.a.getLeft();
                    int top2 = i4 - wvVar.a.getTop();
                    int size2 = list3.size();
                    wv wvVar2 = null;
                    int i12 = -1;
                    int i13 = 0;
                    while (i13 < size2) {
                        wv wvVar3 = (wv) list3.get(i13);
                        if (left2 <= 0 || (right = wvVar3.a.getRight() - width2) >= 0) {
                            list = list3;
                        } else {
                            list = list3;
                            if (wvVar3.a.getRight() > wvVar.a.getRight() && (abs4 = Math.abs(right)) > i12) {
                                i12 = abs4;
                                wvVar2 = wvVar3;
                            }
                        }
                        if (left2 < 0 && (left = wvVar3.a.getLeft() - i3) > 0 && wvVar3.a.getLeft() < wvVar.a.getLeft() && (abs3 = Math.abs(left)) > i12) {
                            i12 = abs3;
                            wvVar2 = wvVar3;
                        }
                        if (top2 < 0 && (top = wvVar3.a.getTop() - i4) > 0 && wvVar3.a.getTop() < wvVar.a.getTop() && (abs2 = Math.abs(top)) > i12) {
                            i12 = abs2;
                            wvVar2 = wvVar3;
                        }
                        if (top2 > 0 && (bottom = wvVar3.a.getBottom() - height2) < 0 && wvVar3.a.getBottom() > wvVar.a.getBottom() && (abs = Math.abs(bottom)) > i12) {
                            i12 = abs;
                            wvVar2 = wvVar3;
                        }
                        i13++;
                        list3 = list;
                    }
                    if (wvVar2 == null) {
                        this.x.clear();
                        this.y.clear();
                        return;
                    }
                    int a = wvVar2.a();
                    wvVar.a();
                    if (this.j.k(this.m, wvVar, wvVar2)) {
                        RecyclerView recyclerView = this.m;
                        wd wdVar2 = recyclerView.n;
                        if (wdVar2 instanceof zm) {
                            ((zm) wdVar2).an(wvVar.a, wvVar2.a);
                            return;
                        }
                        if (wdVar2.ad()) {
                            if (wd.bx(wvVar2.a) <= recyclerView.getPaddingLeft()) {
                                recyclerView.aa(a);
                            }
                            if (wd.by(wvVar2.a) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                                recyclerView.aa(a);
                            }
                        }
                        if (wdVar2.ae()) {
                            if (wd.bz(wvVar2.a) <= recyclerView.getPaddingTop()) {
                                recyclerView.aa(a);
                            }
                            if (wd.bw(wvVar2.a) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                                recyclerView.aa(a);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void l() {
        VelocityTracker velocityTracker = this.o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.o = VelocityTracker.obtain();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(View view) {
        if (view == this.p) {
            this.p = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0093, code lost:
    
        if (r0 <= 0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(defpackage.wv r20, int r21) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zn.n(wv, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.c;
        this.e = f;
        this.f = y - this.d;
        if ((i & 4) == 0) {
            f = Math.max(0.0f, f);
            this.e = f;
        }
        if ((i & 8) == 0) {
            this.e = Math.min(0.0f, f);
        }
        if ((i & 1) == 0) {
            this.f = Math.max(0.0f, this.f);
        }
        if ((i & 2) == 0) {
            this.f = Math.min(0.0f, this.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(int i) {
        if (this.b == null && i == 2 && this.w != 2) {
            this.j.m();
        }
    }
}

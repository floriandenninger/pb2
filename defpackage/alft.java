package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alft extends akm {
    final /* synthetic */ SwipeDismissBehavior a;
    private int b;
    private int c = -1;

    public alft(SwipeDismissBehavior swipeDismissBehavior) {
        this.a = swipeDismissBehavior;
    }

    @Override // defpackage.akm
    public final int a(View view) {
        return view.getWidth();
    }

    @Override // defpackage.akm
    public final void c(View view, int i) {
        this.c = i;
        this.b = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // defpackage.akm
    public final void d(int i) {
        allg allgVar = this.a.j;
        if (allgVar != null) {
            if (i != 0) {
                allr.a().e(allgVar.a.o);
            } else {
                allr.a().f(allgVar.a.o);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004d, code lost:
    
        if (java.lang.Math.abs(r6.getLeft() - r5.b) >= java.lang.Math.round(r6.getWidth() * r5.a.g)) goto L24;
     */
    @Override // defpackage.akm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.view.View r6, float r7, float r8) {
        /*
            r5 = this;
            r8 = -1
            r5.c = r8
            int r8 = r6.getWidth()
            r0 = 1
            r1 = 0
            int r2 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r2 == 0) goto L33
            int r2 = defpackage.jw.e(r6)
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r5.a
            int r3 = r3.f
            r4 = 2
            if (r3 != r4) goto L19
            goto L4f
        L19:
            if (r3 != 0) goto L27
            if (r2 != r0) goto L22
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 < 0) goto L4f
            goto L5b
        L22:
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 <= 0) goto L5b
            goto L4f
        L27:
            if (r2 != r0) goto L2e
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 <= 0) goto L5b
            goto L4f
        L2e:
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 >= 0) goto L5b
            goto L4f
        L33:
            int r7 = r6.getLeft()
            int r1 = r5.b
            int r2 = r6.getWidth()
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r5.a
            float r3 = r3.g
            float r2 = (float) r2
            float r2 = r2 * r3
            int r2 = java.lang.Math.round(r2)
            int r7 = r7 - r1
            int r7 = java.lang.Math.abs(r7)
            if (r7 < r2) goto L5b
        L4f:
            int r7 = r6.getLeft()
            int r1 = r5.b
            if (r7 >= r1) goto L59
            int r1 = r1 - r8
            goto L5e
        L59:
            int r1 = r1 + r8
            goto L5e
        L5b:
            int r1 = r5.b
            r0 = 0
        L5e:
            com.google.android.material.behavior.SwipeDismissBehavior r7 = r5.a
            akn r7 = r7.e
            int r8 = r6.getTop()
            boolean r7 = r7.j(r1, r8)
            if (r7 == 0) goto L77
            alfv r7 = new alfv
            com.google.android.material.behavior.SwipeDismissBehavior r8 = r5.a
            r7.<init>(r8, r6, r0)
            defpackage.jw.H(r6, r7)
            return
        L77:
            if (r0 == 0) goto L82
            com.google.android.material.behavior.SwipeDismissBehavior r7 = r5.a
            allg r7 = r7.j
            if (r7 == 0) goto L82
            r7.a(r6)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alft.e(android.view.View, float, float):void");
    }

    @Override // defpackage.akm
    public final boolean f(View view, int i) {
        int i2 = this.c;
        return (i2 == -1 || i2 == i) && this.a.v(view);
    }

    @Override // defpackage.akm
    public final int g(View view, int i) {
        int width;
        int width2;
        int width3;
        int e = jw.e(view);
        int i2 = this.a.f;
        if (i2 == 0) {
            if (e == 1) {
                width = this.b - view.getWidth();
                width2 = this.b;
            } else {
                width = this.b;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.b - view.getWidth();
            width2 = view.getWidth() + this.b;
        } else if (e == 1) {
            width = this.b;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.b - view.getWidth();
            width2 = this.b;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // defpackage.akm
    public final int h(View view, int i) {
        return view.getTop();
    }

    @Override // defpackage.akm
    public final void i(View view, int i, int i2, int i3) {
        float width = this.b + (view.getWidth() * this.a.h);
        float width2 = this.b + (view.getWidth() * this.a.i);
        float f = i;
        if (f <= width) {
            view.setAlpha(1.0f);
        } else if (f >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(SwipeDismissBehavior.z(1.0f - ((f - width) / (width2 - width))));
        }
    }
}

package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zby {
    public final Rect a = new Rect();
    public final Rect b = new Rect();

    public zby() {
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(defpackage.zby r8, android.view.View r9, android.view.View r10) {
        /*
            r8.getClass()
            r8.d()
            if (r9 == 0) goto Le5
            if (r10 == 0) goto Le5
            boolean r0 = defpackage.whu.M(r10, r9)
            if (r0 != 0) goto L12
            goto Le5
        L12:
            android.graphics.Rect r0 = r8.a
            int r1 = r9.getWidth()
            int r2 = r9.getHeight()
            r3 = 0
            r0.set(r3, r3, r1, r2)
            r0 = 1
            r1 = 0
        L22:
            if (r9 == r10) goto Le5
            if (r9 == 0) goto Le5
            android.view.ViewParent r2 = r9.getParent()
            android.view.View r2 = (android.view.View) r2
            int r4 = r9.getLeft()
            float r5 = r9.getTranslationX()
            int r5 = (int) r5
            int r4 = r4 + r5
            int r5 = r9.getTop()
            float r9 = r9.getTranslationY()
            int r9 = (int) r9
            int r5 = r5 + r9
            boolean r9 = r2 instanceof androidx.viewpager.widget.ViewPager
            if (r9 == 0) goto L52
            r9 = r2
            androidx.viewpager.widget.ViewPager r9 = (androidx.viewpager.widget.ViewPager) r9
            int r6 = r9.getScrollX()
            int r4 = r4 - r6
            int r9 = r9.getScrollY()
        L50:
            int r5 = r5 - r9
            goto L63
        L52:
            boolean r9 = r2 instanceof android.widget.HorizontalScrollView
            if (r9 == 0) goto L63
            r9 = r2
            android.widget.HorizontalScrollView r9 = (android.widget.HorizontalScrollView) r9
            int r6 = r9.getScrollX()
            int r4 = r4 - r6
            int r9 = r9.getScrollY()
            goto L50
        L63:
            android.graphics.Rect r9 = r8.a
            r9.offset(r4, r5)
            if (r1 != 0) goto L6d
        L6a:
            r9 = r2
            r1 = 1
            goto L22
        L6d:
            int r9 = r2.getWidth()
            int r1 = r2.getHeight()
            android.graphics.Rect r6 = r8.b
            int r7 = r6.left
            int r7 = r7 + r4
            int r7 = java.lang.Math.max(r7, r3)
            r6.left = r7
            android.graphics.Rect r6 = r8.b
            int r7 = r6.top
            int r7 = r7 + r5
            int r7 = java.lang.Math.max(r7, r3)
            r6.top = r7
            android.graphics.Rect r6 = r8.b
            int r7 = r6.right
            int r7 = r7 + r4
            int r9 = java.lang.Math.min(r7, r9)
            r6.right = r9
            android.graphics.Rect r9 = r8.b
            int r4 = r9.bottom
            int r4 = r4 + r5
            int r1 = java.lang.Math.min(r4, r1)
            r9.bottom = r1
            r9 = 2131432030(0x7f0b125e, float:1.8485806E38)
            java.lang.Object r9 = r2.getTag(r9)
            boolean r1 = r9 instanceof defpackage.ojp
            if (r1 == 0) goto L6a
            ojp r9 = (defpackage.ojp) r9
            java.lang.Object r9 = r9.get()
            android.graphics.Rect r1 = r8.b
            int r4 = r1.left
            android.graphics.Rect r9 = (android.graphics.Rect) r9
            int r5 = r9.left
            int r4 = java.lang.Math.max(r4, r5)
            r1.left = r4
            android.graphics.Rect r1 = r8.b
            int r4 = r1.top
            int r5 = r9.top
            int r4 = java.lang.Math.max(r4, r5)
            r1.top = r4
            android.graphics.Rect r1 = r8.b
            int r4 = r1.right
            int r5 = r9.right
            int r4 = java.lang.Math.min(r4, r5)
            r1.right = r4
            android.graphics.Rect r1 = r8.b
            int r4 = r1.bottom
            int r9 = r9.bottom
            int r9 = java.lang.Math.min(r4, r9)
            r1.bottom = r9
            goto L6a
        Le5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zby.c(zby, android.view.View, android.view.View):void");
    }

    public final int a() {
        return Math.max(Math.min(this.a.bottom, this.b.bottom) - Math.max(this.a.top, this.b.top), 0);
    }

    public final int b() {
        return Math.max(Math.min(this.a.right, this.b.right) - Math.max(this.a.left, this.b.left), 0);
    }

    public final void d() {
        this.a.set(0, 0, 0, 0);
        this.b.set(0, 0, 1073741823, 1073741823);
    }

    public final boolean e() {
        return b() > 0 && a() > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zby)) {
            return false;
        }
        zby zbyVar = (zby) obj;
        return this.a.equals(zbyVar.a) && this.b.equals(zbyVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}

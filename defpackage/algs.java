package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class algs extends mh {
    private final Drawable b;
    private final Rect c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public algs(android.content.Context r13) {
        /*
            r12 = this;
            r0 = 2130969744(0x7f040490, float:1.7548179E38)
            android.util.TypedValue r0 = defpackage.alkd.l(r13, r0)
            r1 = 0
            if (r0 != 0) goto Lc
            r0 = 0
            goto Le
        Lc:
            int r0 = r0.data
        Le:
            r2 = 0
            r3 = 2130968652(0x7f04004c, float:1.7545964E38)
            r4 = 2132083235(0x7f150223, float:1.9806607E38)
            android.content.Context r13 = defpackage.aloa.a(r13, r2, r3, r4)
            if (r0 == 0) goto L21
            aaq r5 = new aaq
            r5.<init>(r13, r0)
            r13 = r5
        L21:
            r0 = 2132084167(0x7f1505c7, float:1.9808497E38)
            r12.<init>(r13, r0)
            android.content.Context r13 = r12.a()
            android.content.res.Resources$Theme r0 = r13.getTheme()
            r6 = 0
            int[] r7 = defpackage.algt.a
            r8 = 2130968652(0x7f04004c, float:1.7545964E38)
            r9 = 2132083235(0x7f150223, float:1.9806607E38)
            int[] r10 = new int[r1]
            r5 = r13
            android.content.res.TypedArray r5 = defpackage.alig.a(r5, r6, r7, r8, r9, r10)
            r6 = 2
            android.content.res.Resources r7 = r13.getResources()
            r8 = 2131167679(0x7f0709bf, float:1.7949638E38)
            int r7 = r7.getDimensionPixelSize(r8)
            int r6 = r5.getDimensionPixelSize(r6, r7)
            r7 = 3
            android.content.res.Resources r8 = r13.getResources()
            r9 = 2131167680(0x7f0709c0, float:1.794964E38)
            int r8 = r8.getDimensionPixelSize(r9)
            int r7 = r5.getDimensionPixelSize(r7, r8)
            android.content.res.Resources r8 = r13.getResources()
            r9 = 2131167678(0x7f0709be, float:1.7949636E38)
            int r8 = r8.getDimensionPixelSize(r9)
            r9 = 1
            int r8 = r5.getDimensionPixelSize(r9, r8)
            android.content.res.Resources r10 = r13.getResources()
            r11 = 2131167677(0x7f0709bd, float:1.7949634E38)
            int r10 = r10.getDimensionPixelSize(r11)
            int r1 = r5.getDimensionPixelSize(r1, r10)
            r5.recycle()
            android.content.res.Resources r5 = r13.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            int r5 = r5.getLayoutDirection()
            if (r5 != r9) goto L91
            r10 = r6
            goto L92
        L91:
            r10 = r8
        L92:
            if (r5 != r9) goto L95
            r6 = r8
        L95:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r6, r7, r10, r1)
            r12.c = r5
            java.lang.Class r1 = r12.getClass()
            java.lang.String r1 = r1.getCanonicalName()
            int r1 = defpackage.akwg.u(r13, r1)
            alkg r5 = new alkg
            alkk r2 = defpackage.alkl.b(r13, r2, r3, r4)
            alkl r2 = r2.a()
            r5.<init>(r2)
            r5.j(r13)
            android.content.res.ColorStateList r13 = android.content.res.ColorStateList.valueOf(r1)
            r5.l(r13)
            int r13 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r13 < r1) goto Lf5
            android.util.TypedValue r13 = new android.util.TypedValue
            r13.<init>()
            r1 = 16844145(0x1010571, float:2.3697462E-38)
            r0.resolveAttribute(r1, r13, r9)
            android.content.Context r0 = r12.a()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r13.getDimension(r0)
            int r13 = r13.type
            r1 = 5
            if (r13 != r1) goto Lf5
            r13 = 0
            int r13 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r13 < 0) goto Lf5
            alkf r13 = r5.a
            alkl r13 = r13.a
            alkl r13 = r13.e(r0)
            r5.c(r13)
        Lf5:
            r12.b = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.algs.<init>(android.content.Context):void");
    }

    @Override // defpackage.mh
    public final mi b() {
        mi b = super.b();
        Window window = b.getWindow();
        View decorView = window.getDecorView();
        ((alkg) this.b).k(jw.a(decorView));
        Drawable drawable = this.b;
        Rect rect = this.c;
        window.setBackgroundDrawable(new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new algr(b, this.c));
        return b;
    }

    public final void r(int i) {
        super.f(i);
    }

    public final void s(int i) {
        super.k(i, null);
    }
}

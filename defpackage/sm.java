package defpackage;

import android.widget.CompoundButton;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class sm {
    private final CompoundButton a;
    private boolean b;

    public sm(CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0058 A[Catch: all -> 0x007b, TryCatch #1 {all -> 0x007b, blocks: (B:3:0x001e, B:5:0x0024, B:8:0x002a, B:9:0x0051, B:11:0x0058, B:12:0x0061, B:14:0x0068, B:21:0x0038, B:23:0x003e, B:25:0x0044), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[Catch: all -> 0x007b, TRY_LEAVE, TryCatch #1 {all -> 0x007b, blocks: (B:3:0x001e, B:5:0x0024, B:8:0x002a, B:9:0x0051, B:11:0x0058, B:12:0x0061, B:14:0x0068, B:21:0x0038, B:23:0x003e, B:25:0x0044), top: B:2:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.widget.CompoundButton r0 = r10.a
            android.content.Context r0 = r0.getContext()
            int[] r1 = defpackage.nx.l
            r2 = 0
            yk r0 = defpackage.yk.l(r0, r11, r1, r12, r2)
            android.widget.CompoundButton r3 = r10.a
            android.content.Context r4 = r3.getContext()
            int[] r5 = defpackage.nx.l
            android.content.res.TypedArray r7 = r0.b
            r9 = 0
            r6 = r11
            r8 = r12
            defpackage.jw.L(r3, r4, r5, r6, r7, r8, r9)
            r11 = 1
            boolean r12 = r0.q(r11)     // Catch: java.lang.Throwable -> L7b
            if (r12 == 0) goto L38
            int r11 = r0.f(r11, r2)     // Catch: java.lang.Throwable -> L7b
            if (r11 == 0) goto L38
            android.widget.CompoundButton r12 = r10.a     // Catch: android.content.res.Resources.NotFoundException -> L38 java.lang.Throwable -> L7b
            android.content.Context r1 = r12.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L38 java.lang.Throwable -> L7b
            android.graphics.drawable.Drawable r11 = defpackage.nz.b(r1, r11)     // Catch: android.content.res.Resources.NotFoundException -> L38 java.lang.Throwable -> L7b
            r12.setButtonDrawable(r11)     // Catch: android.content.res.Resources.NotFoundException -> L38 java.lang.Throwable -> L7b
            goto L51
        L38:
            boolean r11 = r0.q(r2)     // Catch: java.lang.Throwable -> L7b
            if (r11 == 0) goto L51
            int r11 = r0.f(r2, r2)     // Catch: java.lang.Throwable -> L7b
            if (r11 == 0) goto L51
            android.widget.CompoundButton r12 = r10.a     // Catch: java.lang.Throwable -> L7b
            android.content.Context r1 = r12.getContext()     // Catch: java.lang.Throwable -> L7b
            android.graphics.drawable.Drawable r11 = defpackage.nz.b(r1, r11)     // Catch: java.lang.Throwable -> L7b
            r12.setButtonDrawable(r11)     // Catch: java.lang.Throwable -> L7b
        L51:
            r11 = 2
            boolean r12 = r0.q(r11)     // Catch: java.lang.Throwable -> L7b
            if (r12 == 0) goto L61
            android.widget.CompoundButton r12 = r10.a     // Catch: java.lang.Throwable -> L7b
            android.content.res.ColorStateList r11 = r0.g(r11)     // Catch: java.lang.Throwable -> L7b
            r12.setButtonTintList(r11)     // Catch: java.lang.Throwable -> L7b
        L61:
            r11 = 3
            boolean r12 = r0.q(r11)     // Catch: java.lang.Throwable -> L7b
            if (r12 == 0) goto L77
            android.widget.CompoundButton r12 = r10.a     // Catch: java.lang.Throwable -> L7b
            r1 = -1
            int r11 = r0.c(r11, r1)     // Catch: java.lang.Throwable -> L7b
            r1 = 0
            android.graphics.PorterDuff$Mode r11 = defpackage.ud.a(r11, r1)     // Catch: java.lang.Throwable -> L7b
            r12.setButtonTintMode(r11)     // Catch: java.lang.Throwable -> L7b
        L77:
            r0.o()
            return
        L7b:
            r11 = move-exception
            r0.o()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sm.a(android.util.AttributeSet, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        if (this.b) {
            this.b = false;
        } else {
            this.b = true;
            jh.h(this.a);
        }
    }
}

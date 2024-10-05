package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xvm implements ViewTreeObserver.OnGlobalLayoutListener {
    boolean a;
    final /* synthetic */ xvs b;
    final /* synthetic */ boolean c;
    final /* synthetic */ View d;
    final /* synthetic */ xvt e;

    public xvm(xvt xvtVar, xvs xvsVar, boolean z, View view) {
        this.e = xvtVar;
        this.b = xvsVar;
        this.c = z;
        this.d = view;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onGlobalLayout() {
        /*
            r13 = this;
            boolean r0 = r13.a
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Lad
            xvt r0 = r13.e
            xvs r3 = r13.b
            boolean r4 = r13.c
            android.view.ViewGroup r5 = r3.j
            if (r5 == 0) goto Lae
            int r5 = r5.getVisibility()
            if (r5 == 0) goto L18
            goto Lae
        L18:
            android.content.Context r1 = r0.a
            android.content.res.Resources r1 = r1.getResources()
            if (r4 == 0) goto L28
            r5 = 2131165822(0x7f07027e, float:1.7945872E38)
            int r5 = r1.getDimensionPixelSize(r5)
            goto L2a
        L28:
            int r5 = r0.g
        L2a:
            if (r2 == r4) goto L30
            r6 = 2131165935(0x7f0702ef, float:1.7946101E38)
            goto L33
        L30:
            r6 = 2131165936(0x7f0702f0, float:1.7946103E38)
        L33:
            int r6 = r1.getDimensionPixelSize(r6)
            if (r2 == r4) goto L3d
            r7 = 2131165937(0x7f0702f1, float:1.7946105E38)
            goto L40
        L3d:
            r7 = 2131165938(0x7f0702f2, float:1.7946107E38)
        L40:
            int r7 = r1.getDimensionPixelSize(r7)
            if (r2 == r4) goto L4a
            r8 = 2131165844(0x7f070294, float:1.7945917E38)
            goto L4d
        L4a:
            r8 = 2131165846(0x7f070296, float:1.794592E38)
        L4d:
            int r8 = r1.getDimensionPixelSize(r8)
            if (r2 == r4) goto L57
            r9 = 2131165847(0x7f070297, float:1.7945923E38)
            goto L5a
        L57:
            r9 = 2131165849(0x7f070299, float:1.7945927E38)
        L5a:
            int r9 = r1.getDimensionPixelSize(r9)
            r10 = 2131165862(0x7f0702a6, float:1.7945953E38)
            int r10 = r1.getDimensionPixelSize(r10)
            r11 = 2131165863(0x7f0702a7, float:1.7945955E38)
            int r11 = r1.getDimensionPixelSize(r11)
            xvr r12 = r3.f
            android.view.View r12 = r12.b
            defpackage.wcy.q(r12, r6, r5, r7, r5)
            xvr r6 = r3.f
            android.view.View r6 = r6.d
            if (r4 == 0) goto L7c
            int r7 = r0.j
            goto L7e
        L7c:
            int r7 = r0.h
        L7e:
            if (r4 == 0) goto L83
            int r4 = r0.k
            goto L85
        L83:
            int r4 = r0.i
        L85:
            defpackage.wcy.q(r6, r7, r5, r4, r5)
            xvr r4 = r3.f
            android.view.View r4 = r4.i
            defpackage.wcy.q(r4, r8, r5, r9, r5)
            xvr r4 = r3.f
            android.view.ViewGroup r4 = r4.e
            int r0 = r0.g
            defpackage.wcy.q(r4, r10, r0, r11, r0)
            xvr r0 = r3.f
            android.view.View r0 = r0.k
            r3 = 2131169394(0x7f071072, float:1.7953117E38)
            int r3 = r1.getDimensionPixelSize(r3)
            r4 = 2131169395(0x7f071073, float:1.7953119E38)
            int r1 = r1.getDimensionPixelSize(r4)
            defpackage.wcy.q(r0, r3, r5, r1, r5)
        Lad:
            r1 = 1
        Lae:
            r13.a = r1
            if (r1 == 0) goto Lbb
            android.view.View r0 = r13.d
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r0.removeOnGlobalLayoutListener(r13)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xvm.onGlobalLayout():void");
    }
}

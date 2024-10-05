package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nxp implements nyj, nxv {
    public final zay a;
    public int b;
    private final azqv c;
    private final aypn d;
    private final azqw e;
    private final aypn f;
    private final azqw g;
    private final aypn h;

    public nxp(Context context) {
        int scaledMinimumFlingVelocity = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        zax zaxVar = new zax(context);
        zaxVar.c = 2;
        zaxVar.a = scaledMinimumFlingVelocity * 32;
        zaxVar.b = 0;
        this.a = zaxVar.a();
        azqv aq = azqv.aq(false);
        this.c = aq;
        this.d = aq.y().h(ntu.h);
        azqw av = azqy.ap().av();
        this.e = av;
        this.f = av.h(oba.f(aq)).y();
        azqw av2 = azqy.ap().av();
        this.g = av2;
        this.h = av2.y().J();
    }

    public static boolean a(zay zayVar, MotionEvent motionEvent) {
        int c = zayVar.c(motionEvent, 1);
        return c == 2 || c == 4;
    }

    private final void b(zay zayVar, MotionEvent motionEvent) {
        if (!a(zayVar, motionEvent) || c()) {
            this.e.c(Integer.valueOf(-zayVar.b(motionEvent)));
        } else {
            zayVar.g(motionEvent);
            this.c.c(true);
        }
    }

    private final boolean c() {
        Boolean bool = (Boolean) this.c.ar();
        return bool != null && bool.booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        if (r8 != 0) goto L25;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r8)
            int r1 = r6.b
            float r1 = (float) r1
            r2 = 0
            r0.offsetLocation(r2, r1)
            zay r1 = r6.a
            r1.d(r0)
            int r1 = r8.getActionMasked()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L65
            r4 = 2
            if (r1 == r3) goto L30
            if (r1 == r4) goto L2a
            r5 = 3
            if (r1 == r5) goto L30
            r7 = 6
            if (r1 == r7) goto L24
            goto L66
        L24:
            zay r7 = r6.a
            r7.e(r8)
            goto L66
        L2a:
            zay r7 = r6.a
            r6.b(r7, r8)
            goto L66
        L30:
            zay r1 = r6.a
            r6.b(r1, r8)
            zay r8 = r6.a
            int r8 = r8.i(r0, r3)
            if (r8 != r4) goto L40
            nxu r1 = defpackage.nxu.FLING_UP
            goto L47
        L40:
            if (r8 != r3) goto L45
            nxu r1 = defpackage.nxu.FLING_DOWN
            goto L47
        L45:
            nxu r1 = defpackage.nxu.NO_FLING
        L47:
            azqw r4 = r6.g
            r4.c(r1)
            zay r1 = r6.a
            r1.f()
            boolean r1 = r6.c()
            if (r1 != 0) goto L5a
            r7.performClick()
        L5a:
            azqv r7 = r6.c
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r7.c(r1)
            if (r8 == 0) goto L66
        L65:
            r2 = 1
        L66:
            r0.recycle()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nxp.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // defpackage.nxv
    public final nxt v() {
        return nxt.NONE;
    }

    @Override // defpackage.nxv
    public final aypn w() {
        return this.d;
    }

    @Override // defpackage.nxv
    public final aypn x() {
        return this.h;
    }

    @Override // defpackage.nxv
    public final aypn y() {
        return this.f;
    }
}

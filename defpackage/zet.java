package defpackage;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zet extends TouchDelegate {
    private final int[] a;
    private final Rect b;
    private final View c;
    private final View d;
    private boolean e;

    public zet(Rect rect, View view, View view2) {
        super(rect, view);
        this.a = new int[2];
        this.b = rect;
        view.getClass();
        this.c = view;
        view2.getClass();
        this.d = view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r2 != 3) goto L16;
     */
    @Override // android.view.TouchDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            float r0 = r9.getX()
            float r1 = r9.getY()
            int r2 = r9.getActionMasked()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L21
            if (r2 == r3) goto L1c
            r5 = 2
            if (r2 == r5) goto L19
            r5 = 3
            if (r2 == r5) goto L1c
            goto L64
        L19:
            boolean r2 = r8.e
            goto L31
        L1c:
            boolean r2 = r8.e
            r8.e = r4
            goto L31
        L21:
            android.graphics.Rect r2 = r8.b
            int r5 = java.lang.Math.round(r0)
            int r6 = java.lang.Math.round(r1)
            boolean r2 = r2.contains(r5, r6)
            r8.e = r2
        L31:
            if (r2 == 0) goto L64
            android.view.View r2 = r8.c
            int[] r5 = r8.a
            r2.getLocationOnScreen(r5)
            int[] r2 = r8.a
            r5 = r2[r4]
            r6 = r2[r3]
            android.view.View r7 = r8.d
            r7.getLocationOnScreen(r2)
            int[] r2 = r8.a
            r4 = r2[r4]
            r2 = r2[r3]
            android.view.MotionEvent r9 = android.view.MotionEvent.obtain(r9)
            float r3 = (float) r5
            float r0 = r0 - r3
            float r3 = (float) r4
            float r0 = r0 + r3
            float r3 = (float) r6
            float r1 = r1 - r3
            float r2 = (float) r2
            float r1 = r1 + r2
            r9.setLocation(r0, r1)
            android.view.View r0 = r8.c
            boolean r0 = r0.dispatchTouchEvent(r9)
            r9.recycle()
            return r0
        L64:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zet.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

package defpackage;

import android.graphics.Rect;
import android.view.TouchDelegate;
import com.facebook.litho.ComponentHost;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dly extends TouchDelegate {
    public final aeh b;
    public aeh c;
    private static final Rect d = new Rect();
    public static final hz a = new hz(4);

    public dly(ComponentHost componentHost) {
        super(d, componentHost);
        this.b = new aeh();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0006 A[SYNTHETIC] */
    @Override // android.view.TouchDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            aeh r0 = r9.b
            int r0 = r0.c()
        L6:
            int r0 = r0 + (-1)
            r1 = 0
            if (r0 < 0) goto L7f
            aeh r2 = r9.b
            java.lang.Object r2 = r2.g(r0)
            dlx r2 = (defpackage.dlx) r2
            float r3 = r10.getX()
            int r3 = (int) r3
            float r4 = r10.getY()
            int r4 = (int) r4
            int r5 = r10.getAction()
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L4c
            if (r5 == r7) goto L33
            if (r5 == r6) goto L33
            r3 = 3
            if (r5 == r3) goto L2d
            goto L54
        L2d:
            boolean r3 = r2.c
            r2.c = r1
            r1 = r3
            goto L54
        L33:
            boolean r5 = r2.c
            if (r5 == 0) goto L41
            android.graphics.Rect r8 = r2.f
            boolean r3 = r8.contains(r3, r4)
            if (r3 != 0) goto L41
            r3 = 0
            goto L42
        L41:
            r3 = 1
        L42:
            int r4 = r10.getAction()
            if (r4 != r7) goto L4a
            r2.c = r1
        L4a:
            r1 = r5
            goto L55
        L4c:
            android.graphics.Rect r1 = r2.e
            boolean r1 = r1.contains(r3, r4)
            r2.c = r1
        L54:
            r3 = 1
        L55:
            if (r1 == 0) goto L6
            if (r3 == 0) goto L6d
            android.view.View r1 = r2.b
            int r1 = r1.getWidth()
            int r1 = r1 / r6
            float r1 = (float) r1
            android.view.View r3 = r2.b
            int r3 = r3.getHeight()
            int r3 = r3 / r6
            float r3 = (float) r3
            r10.setLocation(r1, r3)
            goto L75
        L6d:
            int r1 = r2.d
            int r1 = r1 + r1
            int r1 = -r1
            float r1 = (float) r1
            r10.setLocation(r1, r1)
        L75:
            android.view.View r1 = r2.b
            boolean r1 = r1.dispatchTouchEvent(r10)
            if (r1 != 0) goto L7e
            goto L6
        L7e:
            return r7
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dly.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

package defpackage;

import android.view.View;
import android.view.ViewConfiguration;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kgm extends zdb {
    private final int b;
    private boolean c;
    private float e;
    private float g;
    private final Set a = Collections.newSetFromMap(new WeakHashMap());
    private boolean d = true;

    public kgm(ViewConfiguration viewConfiguration) {
        this.b = viewConfiguration.getScaledTouchSlop();
    }

    private final void e(View view, float f) {
        if (this.c) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((aidc) it.next()).N(f);
            }
        }
        f(view, false);
        this.d = true;
    }

    private final void f(View view, boolean z) {
        if (this.c == z) {
            return;
        }
        this.c = z;
        if (view == null || view.getParent() == null) {
            return;
        }
        view.getParent().requestDisallowInterceptTouchEvent(this.c);
    }

    @Override // defpackage.zdb
    public final void a(boolean z) {
        this.f = z;
        if (z) {
            return;
        }
        c();
    }

    public final void b(aidc aidcVar) {
        this.a.add(aidcVar);
    }

    @Override // defpackage.zdg
    public final void c() {
        f(null, false);
        this.d = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r3 != 3) goto L36;
     */
    @Override // defpackage.zdg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(android.view.View r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            float r0 = r8.getX()
            float r1 = r6.e
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            float r1 = r8.getY()
            float r2 = r6.g
            float r1 = r1 - r2
            float r2 = java.lang.Math.abs(r1)
            int r3 = r8.getPointerCount()
            r4 = 0
            r5 = 1
            if (r3 <= r5) goto L22
            r6.e(r7, r1)
            return r4
        L22:
            int r3 = r8.getAction()
            if (r3 == 0) goto L7e
            if (r3 == r5) goto L7a
            r8 = 2
            if (r3 == r8) goto L31
            r8 = 3
            if (r3 == r8) goto L7a
            goto L8a
        L31:
            boolean r8 = r6.c
            if (r8 != 0) goto L43
            int r8 = r6.b
            float r8 = (float) r8
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 > 0) goto L43
            int r8 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r8 < 0) goto L43
            r6.f(r7, r5)
        L43:
            boolean r7 = r6.c
            if (r7 == 0) goto L8a
            boolean r7 = r6.d
            if (r7 == 0) goto L61
            java.util.Set r7 = r6.a
            java.util.Iterator r7 = r7.iterator()
        L51:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L77
            java.lang.Object r8 = r7.next()
            aidc r8 = (defpackage.aidc) r8
            r8.M(r1)
            goto L51
        L61:
            java.util.Set r7 = r6.a
            java.util.Iterator r7 = r7.iterator()
        L67:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L77
            java.lang.Object r8 = r7.next()
            aidc r8 = (defpackage.aidc) r8
            r8.L(r1)
            goto L67
        L77:
            r6.d = r4
            goto L8a
        L7a:
            r6.e(r7, r1)
            goto L8a
        L7e:
            float r7 = r8.getX()
            r6.e = r7
            float r7 = r8.getY()
            r6.g = r7
        L8a:
            boolean r7 = r6.c
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kgm.d(android.view.View, android.view.MotionEvent):boolean");
    }
}

package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zmk extends GestureDetector {
    public MotionEvent a;
    private final zod b;
    private final Handler c;
    private final Runnable d;
    private final int e;
    private float f;
    private float g;

    public zmk(Context context, final zod zodVar) {
        super(context, zodVar);
        this.c = new Handler();
        setIsLongpressEnabled(false);
        this.b = zodVar;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        int i = scaledTouchSlop + scaledTouchSlop;
        this.e = i * i;
        this.d = new Runnable() { // from class: zmj
            @Override // java.lang.Runnable
            public final void run() {
                zmk zmkVar = zmk.this;
                zod zodVar2 = zodVar;
                zodVar2.a = true;
                zodVar2.onLongPress(zmkVar.a);
            }
        };
    }

    private final void a() {
        this.c.removeCallbacks(this.d);
        this.b.a = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r3 != 3) goto L19;
     */
    @Override // android.view.GestureDetector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            boolean r0 = super.onTouchEvent(r5)
            float r1 = r5.getX()
            float r2 = r5.getY()
            int r3 = r5.getAction()
            r3 = r3 & 255(0xff, float:3.57E-43)
            if (r3 == 0) goto L3b
            r5 = 1
            if (r3 == r5) goto L37
            r5 = 2
            if (r3 == r5) goto L1e
            r5 = 3
            if (r3 == r5) goto L37
            goto L65
        L1e:
            float r5 = r4.f
            float r1 = r1 - r5
            int r5 = (int) r1
            float r1 = r4.g
            float r2 = r2 - r1
            int r1 = (int) r2
            int r5 = r5 * r5
            int r1 = r1 * r1
            int r5 = r5 + r1
            int r1 = r4.e
            if (r5 <= r1) goto L65
            android.os.Handler r5 = r4.c
            java.lang.Runnable r1 = r4.d
            r5.removeCallbacks(r1)
            goto L65
        L37:
            r4.a()
            goto L65
        L3b:
            android.view.MotionEvent r1 = r4.a
            if (r1 == 0) goto L42
            r1.recycle()
        L42:
            android.view.MotionEvent r5 = android.view.MotionEvent.obtain(r5)
            r4.a = r5
            float r5 = r5.getX()
            r4.f = r5
            android.view.MotionEvent r5 = r4.a
            float r5 = r5.getY()
            r4.g = r5
            r4.a()
            android.os.Handler r5 = r4.c
            java.lang.Runnable r1 = r4.d
            int r2 = android.view.ViewConfiguration.getLongPressTimeout()
            long r2 = (long) r2
            r5.postDelayed(r1, r2)
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zmk.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

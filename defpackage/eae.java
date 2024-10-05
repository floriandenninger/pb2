package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class eae implements ead {
    protected static volatile ebe a;
    protected MotionEvent b;
    protected double k;
    protected float l;
    protected float m;
    protected float n;
    protected float o;
    protected DisplayMetrics q;
    private double r;
    private double s;
    protected final LinkedList c = new LinkedList();
    protected long d = 0;
    protected long e = 0;
    protected long f = 0;
    protected long g = 0;
    protected long h = 0;
    protected long i = 0;
    protected long j = 0;
    private boolean t = false;
    protected boolean p = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public eae(Context context) {
        try {
            if (((Boolean) pyi.r.e()).booleanValue()) {
                dzi.b();
            } else {
                esv.k(a);
            }
            this.q = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    private final void p() {
        this.h = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.g = 0L;
        this.i = 0L;
        this.j = 0L;
        if (this.c.size() > 0) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.c.clear();
        } else {
            MotionEvent motionEvent = this.b;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.b = null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:1|(14:5|6|7|(4:9|(1:11)(1:69)|12|(1:14)(1:68))(1:70)|15|16|(1:18)(1:(1:55)(1:56))|(1:21)|23|24|(3:41|42|(1:44)(4:45|(2:(1:49)(1:(1:52)(1:53))|50)|27|28))|26|27|28)|75|7|(0)(0)|15|16|(0)(0)|(1:21)|23|24|(0)|26|27|28|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0065, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x008c, code lost:
    
        if (r10 != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0090, code lost:
    
        if (r2 == 3) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0092, code lost:
    
        r0 = 1003;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x009d, code lost:
    
        r3 = 2;
        r12.a(r0, -1, java.lang.System.currentTimeMillis() - r8, r13, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0095, code lost:
    
        if (r2 == 2) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0097, code lost:
    
        r0 = 1009;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x009a, code lost:
    
        r0 = 1001;
        r2 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[Catch: Exception -> 0x0065, TRY_ENTER, TryCatch #2 {Exception -> 0x0065, blocks: (B:18:0x005c, B:21:0x0080, B:55:0x0069, B:56:0x0073), top: B:16:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String q(android.content.Context r22, java.lang.String r23, int r24, android.view.View r25, android.app.Activity r26, byte[] r27) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eae.q(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity, byte[]):java.lang.String");
    }

    protected abstract long a(StackTraceElement[] stackTraceElementArr);

    protected abstract ebf b(MotionEvent motionEvent);

    @Override // defpackage.ead
    public final String c(Context context, String str) {
        return d(context, str, null, null);
    }

    @Override // defpackage.ead
    public final String d(Context context, String str, View view, Activity activity) {
        return q(context, str, 3, view, activity, null);
    }

    @Override // defpackage.ead
    public final String e(Context context) {
        if (ebg.f()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return q(context, null, 1, null, null, null);
    }

    @Override // defpackage.ead
    public final String f(Context context, byte[] bArr) {
        if (ebg.f()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return q(context, null, 1, null, null, bArr);
    }

    @Override // defpackage.ead
    public final String g(Context context, View view, Activity activity) {
        return q(context, null, 2, view, activity, null);
    }

    @Override // defpackage.ead
    public final synchronized void h(MotionEvent motionEvent) {
        Long l;
        if (this.t) {
            p();
            this.t = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.k = 0.0d;
            this.r = motionEvent.getRawX();
            this.s = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d = this.r;
            Double.isNaN(rawX);
            double d2 = rawX - d;
            double d3 = this.s;
            Double.isNaN(rawY);
            double d4 = rawY - d3;
            this.k += Math.sqrt((d2 * d2) + (d4 * d4));
            this.r = rawX;
            this.s = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    this.b = obtain;
                    this.c.add(obtain);
                    if (this.c.size() > 6) {
                        ((MotionEvent) this.c.remove()).recycle();
                    }
                    this.f++;
                    this.h = a(new Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.e += motionEvent.getHistorySize() + 1;
                    ebf b = b(motionEvent);
                    Long l2 = b.d;
                    if (l2 != null && b.g != null) {
                        this.i += l2.longValue() + b.g.longValue();
                    }
                    if (this.q != null && (l = b.e) != null && b.h != null) {
                        this.j += l.longValue() + b.h.longValue();
                    }
                } else if (action2 == 3) {
                    this.g++;
                }
            } catch (eaw unused) {
            }
        } else {
            this.l = motionEvent.getX();
            this.m = motionEvent.getY();
            this.n = motionEvent.getRawX();
            this.o = motionEvent.getRawY();
            this.d++;
        }
        this.p = true;
    }

    @Override // defpackage.ead
    public final synchronized void i(int i, int i2, int i3) {
        if (this.b != null) {
            if (((Boolean) pyi.h.e()).booleanValue()) {
                p();
            } else {
                this.b.recycle();
            }
        }
        DisplayMetrics displayMetrics = this.q;
        if (displayMetrics != null) {
            this.b = MotionEvent.obtain(0L, i3, 1, i * displayMetrics.density, this.q.density * i2, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.b = null;
        }
        this.p = false;
    }

    protected abstract aone j(Context context, View view, Activity activity);

    @Override // defpackage.ead
    public void k(View view) {
    }

    protected abstract aone l(Context context, dvj dvjVar);

    @Override // defpackage.ead
    public final boolean m() {
        return true;
    }

    protected abstract aone n(Context context, View view, Activity activity);

    @Override // defpackage.ead
    public final boolean o() {
        return true;
    }
}

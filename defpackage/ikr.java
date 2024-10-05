package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ikr {
    public final int a;
    public final int d;
    public ikq e;
    public ilr f;
    public float g;
    public float h;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public final Context p;
    public final Handler q;
    public final ili r;
    public final ijz s;
    public final aaea t;
    public ily u;
    private final int v;
    public long i = -1;
    public int o = 0;
    public final int b = Math.max(199, ViewConfiguration.getTapTimeout());
    public final int c = ViewConfiguration.getDoubleTapTimeout();

    public ikr(Context context, Handler handler, ili iliVar, ijz ijzVar, aaea aaeaVar) {
        this.p = context;
        this.q = handler;
        this.r = iliVar;
        this.s = ijzVar;
        this.t = aaeaVar;
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        this.v = point.x;
        this.d = point.y;
    }

    public final void a(boolean z) {
        if (this.j) {
            if (z && !this.m) {
                this.r.c(this.o);
                this.o = 0;
                this.j = false;
            }
            this.i = -1L;
            this.s.e();
        }
        ((ily) this.e).i(false);
        this.f.a(true);
        this.i = -1L;
        this.s.e();
    }

    public final void b(MotionEvent motionEvent) {
        this.s.f(motionEvent.getRawX(), motionEvent.getRawY());
    }

    public final void c(boolean z, boolean z2, ijw ijwVar) {
        if (!z) {
            if (this.g > (this.v * 3) / 10) {
                if (ijwVar != null) {
                    ijwVar.a(91958);
                }
                this.e.e();
                return;
            } else {
                if (ijwVar != null) {
                    ijwVar.a(91957);
                }
                this.e.f();
                return;
            }
        }
        if (z2) {
            return;
        }
        if (!this.j) {
            this.j = true;
            this.o = this.r.a();
            this.f.a(false);
            ikt.a(this.u.k.b);
        } else {
            this.j = false;
            this.r.c(this.o);
            this.f.a(true);
            this.o = 0;
            ikt.a(this.u.k.a);
        }
        if (ijwVar != null) {
            ijwVar.a(114670);
        }
    }
}

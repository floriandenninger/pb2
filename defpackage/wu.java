package defpackage;

import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wu implements Runnable {
    public int a;
    public int b;
    public OverScroller c;
    public final /* synthetic */ RecyclerView e;
    public Interpolator d = RecyclerView.b;
    private boolean f = false;
    private boolean g = false;

    public wu(RecyclerView recyclerView) {
        this.e = recyclerView;
        this.c = new OverScroller(recyclerView.getContext(), RecyclerView.b);
    }

    private final void d() {
        this.e.removeCallbacks(this);
        jw.H(this.e, this);
    }

    public final void a() {
        if (this.f) {
            this.g = true;
        } else {
            d();
        }
    }

    public final void b(int i, int i2, int i3, Interpolator interpolator) {
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            int width = abs > abs2 ? this.e.getWidth() : this.e.getHeight();
            if (abs <= abs2) {
                abs = abs2;
            }
            i3 = Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.b;
        }
        if (this.d != interpolator) {
            this.d = interpolator;
            this.c = new OverScroller(this.e.getContext(), interpolator);
        }
        this.b = 0;
        this.a = 0;
        this.e.ah(2);
        this.c.startScroll(0, 0, i, i2, i4);
        if (Build.VERSION.SDK_INT < 23) {
            this.c.computeScrollOffset();
        }
        a();
    }

    public final void c() {
        this.e.removeCallbacks(this);
        this.c.abortAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0127  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wu.run():void");
    }
}

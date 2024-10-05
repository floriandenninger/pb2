package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lh implements Runnable {
    final /* synthetic */ li a;

    public lh(li liVar) {
        this.a = liVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        li liVar = this.a;
        if (liVar.e) {
            if (liVar.c) {
                liVar.c = false;
                lg lgVar = liVar.a;
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                lgVar.e = currentAnimationTimeMillis;
                lgVar.g = -1L;
                lgVar.f = currentAnimationTimeMillis;
                lgVar.h = 0.5f;
            }
            lg lgVar2 = this.a.a;
            if ((lgVar2.g > 0 && AnimationUtils.currentAnimationTimeMillis() > lgVar2.g + lgVar2.i) || !this.a.b()) {
                this.a.e = false;
                return;
            }
            li liVar2 = this.a;
            if (liVar2.d) {
                liVar2.d = false;
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                liVar2.b.onTouchEvent(obtain);
                obtain.recycle();
            }
            if (lgVar2.f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
            float a = lgVar2.a(currentAnimationTimeMillis2);
            long j = lgVar2.f;
            lgVar2.f = currentAnimationTimeMillis2;
            this.a.f.scrollListBy((int) (((float) (currentAnimationTimeMillis2 - j)) * (((-4.0f) * a * a) + (a * 4.0f)) * lgVar2.d));
            jw.H(this.a.b, this);
        }
    }
}

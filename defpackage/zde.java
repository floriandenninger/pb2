package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zde extends zdi {
    public MotionEvent a;
    public zdd b;
    private final Handler e;
    private Runnable g;

    public zde(ViewConfiguration viewConfiguration) {
        super(viewConfiguration);
        this.e = new Handler(Looper.getMainLooper());
    }

    @Override // defpackage.zdi, defpackage.zdg
    public final void c() {
        super.c();
        this.e.removeCallbacks(this.g);
        this.a = null;
    }

    @Override // defpackage.zdi, defpackage.zdg
    public final boolean d(View view, MotionEvent motionEvent) {
        zdd zddVar = this.b;
        if (zddVar == null || !zddVar.nL(motionEvent, this.d)) {
            return super.d(view, motionEvent);
        }
        if (!e(motionEvent)) {
            return false;
        }
        if (this.g == null) {
            this.g = new zdc(this);
        }
        if (this.a == null) {
            this.a = motionEvent;
            this.e.postDelayed(this.g, ViewConfiguration.getDoubleTapTimeout());
            return true;
        }
        this.b.nG(motionEvent, this.d);
        c();
        return true;
    }
}

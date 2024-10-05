package defpackage;

import android.os.Handler;
import android.os.Message;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim.ShortsVideoTrimView2;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hqf extends Handler {
    private float a = Float.NaN;
    private final ShortsVideoTrimView2 b;

    public hqf(ShortsVideoTrimView2 shortsVideoTrimView2) {
        this.b = shortsVideoTrimView2;
    }

    public final void a() {
        removeMessages(0);
        this.a = Float.NaN;
    }

    public final void b(long j, float f) {
        boolean isNaN = Float.isNaN(this.a);
        float abs = Math.abs(f - this.a);
        float f2 = this.b.d / 2;
        if (isNaN || abs > f2) {
            removeMessages(0);
            sendEmptyMessageDelayed(0, j);
            this.a = f;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 0) {
            return;
        }
        ShortsVideoTrimView2 shortsVideoTrimView2 = this.b;
        if (shortsVideoTrimView2.l && shortsVideoTrimView2.B() && !this.b.E()) {
            ShortsVideoTrimView2 shortsVideoTrimView22 = this.b;
            if (!shortsVideoTrimView22.y) {
                shortsVideoTrimView22.m();
            }
            ShortsVideoTrimView2 shortsVideoTrimView23 = this.b;
            if (shortsVideoTrimView23.k) {
                amkq.N(!shortsVideoTrimView23.E());
                amkq.N(shortsVideoTrimView23.B());
                vsm vsmVar = shortsVideoTrimView23.s;
                if (vsmVar == null || vsmVar.b <= shortsVideoTrimView23.p) {
                    return;
                }
                long k = shortsVideoTrimView23.x == hrm.BEGIN ? shortsVideoTrimView23.k() : shortsVideoTrimView23.j();
                double b = shortsVideoTrimView23.s == null ? 0.0d : r2.b(k);
                double d = k;
                double d2 = shortsVideoTrimView23.p;
                Double.isNaN(d2);
                Double.isNaN(d);
                long j = (long) (d - (b * d2));
                Double.isNaN(d2);
                Double.isNaN(d);
                long j2 = (long) (d + ((1.0d - b) * d2));
                vsm vsmVar2 = shortsVideoTrimView23.s;
                shortsVideoTrimView23.m = vsmVar2 == null ? 0L : vsmVar2.e(0.0f);
                vsm vsmVar3 = shortsVideoTrimView23.s;
                shortsVideoTrimView23.n = vsmVar3 != null ? vsmVar3.e(1.0f) : 0L;
                vyf vyfVar = shortsVideoTrimView23.u;
                if (vyfVar != null) {
                    shortsVideoTrimView23.w = new vyn(vyfVar);
                    shortsVideoTrimView23.w.a(j, j2);
                    shortsVideoTrimView23.w.k(shortsVideoTrimView23);
                }
                vsm vsmVar4 = shortsVideoTrimView23.s;
                if (vsmVar4 != null) {
                    vsmVar4.l(j, j2);
                }
                shortsVideoTrimView23.s();
                shortsVideoTrimView23.x();
                shortsVideoTrimView23.n(shortsVideoTrimView23.c);
                shortsVideoTrimView23.requestLayout();
            }
        }
    }
}

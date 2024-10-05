package defpackage;

import android.view.animation.AnimationUtils;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim.ShortsVideoTrimView2;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hrg implements Runnable {
    public float a;
    public long b;
    public long c;
    public final /* synthetic */ ShortsVideoTrimView2 d;
    public int e;

    public hrg(ShortsVideoTrimView2 shortsVideoTrimView2) {
        this.d = shortsVideoTrimView2;
        amkq.E(true);
        amkq.E(true);
        this.e = 1;
    }

    public final void a() {
        this.e = 1;
        this.d.removeCallbacks(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        hrm hrmVar = hrm.BEGIN;
        int i = this.e;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            a();
            return;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float f = (float) (currentAnimationTimeMillis - this.b);
            this.c = this.c + (this.d.s == null ? 0L : Math.signum((float) r7.e(0.0f)) * 10000.0f * f);
            vsy vsyVar = this.d.t;
            if (vsyVar != null) {
                vsyVar.r(hrm.BOTH.e);
            }
            this.d.d(this.c, true);
            vsy vsyVar2 = this.d.t;
            if (vsyVar2 != null) {
                vsyVar2.s(hrm.BOTH.e);
            }
            if (this.d.D() || this.d.C()) {
                this.e = 3;
            } else {
                this.e = 1;
            }
            this.b = currentAnimationTimeMillis;
            this.d.postOnAnimation(this);
            return;
        }
        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
        float f2 = (float) (currentAnimationTimeMillis2 - this.b);
        float f3 = (-Math.signum(this.a)) * 80.0f * f2;
        this.c += (this.a * f2) + (f3 * f2 * 0.5f);
        vsy vsyVar3 = this.d.t;
        if (vsyVar3 != null) {
            vsyVar3.r(hrm.BOTH.e);
        }
        long d = this.d.d(this.c, true);
        vsy vsyVar4 = this.d.t;
        if (vsyVar4 != null) {
            vsyVar4.s(hrm.BOTH.e);
        }
        if (Math.abs(this.a) <= f2 * 80.0f || Math.abs(d) < Math.abs(this.c)) {
            this.e = 1;
            if (this.d.D() || this.d.C()) {
                this.e = 3;
            }
        } else {
            this.e = 2;
            this.a += f3;
        }
        this.b = currentAnimationTimeMillis2;
        this.d.postOnAnimation(this);
    }
}

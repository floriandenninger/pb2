package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.LinearInterpolator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gyc extends dha {

    @dnt(a = 3)
    boolean a;

    @dnt(a = 13)
    aiee b;

    @dnt(a = 3)
    long c;

    @dnt(a = 3)
    long d;

    @dnt(a = 13)
    lo e;

    public gyc() {
        super("ClipStoryboard");
    }

    @Override // defpackage.dhk
    protected final int F() {
        return 3;
    }

    @Override // defpackage.dhk
    protected final Object L(Context context) {
        return new gzd(context);
    }

    @Override // defpackage.dhk
    protected final void S(dhe dheVar, Object obj) {
        final gzd gzdVar = (gzd) obj;
        aiee aieeVar = this.b;
        long j = this.d;
        lo loVar = this.e;
        long j2 = this.c;
        boolean z = this.a;
        gzdVar.aa = j2;
        gzdVar.ad = z;
        if (j < j2) {
            j2 = j;
        }
        if (gzdVar.W == null) {
            gzdVar.getContext();
            gzdVar.W = new gyx(gzdVar);
            gzdVar.W.ab(0);
            gzdVar.af(gzdVar.W);
        }
        if (gzdVar.m == null) {
            gzdVar.ac(new gzb(gzdVar, aieeVar, j, gzd.a(j, j2), z));
        }
        gzb gzbVar = (gzb) gzdVar.m;
        aiee aieeVar2 = gzbVar.d;
        if (aieeVar2 != aieeVar) {
            if (aieeVar2 != null) {
                aieeVar2.h(gzbVar);
            }
            gzbVar.d = aieeVar;
            aieeVar.h(gzbVar);
            aieeVar.b(gzbVar);
        }
        gzbVar.n = gzdVar.ae;
        lo loVar2 = gzdVar.af;
        if (loVar2 == null) {
            gzdVar.af = loVar;
        } else if (loVar2 != loVar) {
            gzdVar.aF(loVar2);
            gzdVar.af = loVar;
        }
        if (gzdVar.ag == null) {
            gzdVar.ag = new gyy(gzdVar);
        }
        if (gzdVar.ah == null) {
            gzdVar.ah = new gyz(gzdVar);
        }
        if (gzdVar.ac == null) {
            gzdVar.ac = new gyi();
            gzdVar.ac.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: gyv
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    gzd gzdVar2 = gzd.this;
                    gzdVar2.scrollBy(((Integer) valueAnimator.getAnimatedValue()).intValue() - gzdVar2.ac.a, 0);
                    gzdVar2.ac.a = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                }
            });
            gyi gyiVar = gzdVar.ac;
            gyiVar.setDuration(100L);
            gyiVar.setInterpolator(new LinearInterpolator());
            gyiVar.addListener(new gyh(gyiVar));
        }
        loVar.b(gzdVar, 100);
    }

    @Override // defpackage.dhk
    public final int aj() {
        return 3;
    }

    @Override // defpackage.dha
    /* renamed from: e */
    public final boolean f(dha dhaVar) {
        if (this == dhaVar) {
            return true;
        }
        if (dhaVar == null || getClass() != dhaVar.getClass()) {
            return false;
        }
        gyc gycVar = (gyc) dhaVar;
        if (this.k == gycVar.k) {
            return true;
        }
        if (this.a != gycVar.a) {
            return false;
        }
        lo loVar = this.e;
        if (loVar == null ? gycVar.e != null : !loVar.equals(gycVar.e)) {
            return false;
        }
        aiee aieeVar = this.b;
        if (aieeVar == null ? gycVar.b == null : aieeVar.equals(gycVar.b)) {
            return this.c == gycVar.c && this.d == gycVar.d;
        }
        return false;
    }

    @Override // defpackage.dha, defpackage.div
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((dha) obj);
    }
}

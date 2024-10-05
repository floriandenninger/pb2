package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nwr {
    public static final zcf a = new zcf() { // from class: nwj
        @Override // defpackage.zcf
        public final void a() {
        }
    };
    public final nwy b;
    public final nxl c;
    public final nxm d;
    public final int e;
    public final azqv f;
    public final aypn g;
    public int h;

    public nwr(Context context, nwy nwyVar, nxl nxlVar, nxm nxmVar) {
        this.e = context.getResources().getInteger(R.integer.config_shortAnimTime);
        this.b = nwyVar;
        this.c = nxlVar;
        this.d = nxmVar;
        azqv aq = azqv.aq(false);
        this.f = aq;
        this.g = aq.y().n().J();
    }

    public final aypn a() {
        return this.b.d().A(new fih(this.b.a(), 4));
    }

    public final zcg b(nqg nqgVar) {
        return new nwq(this, false, nqgVar);
    }

    public final aypn c(int i, int i2, long j, aypn aypnVar, zcf zcfVar) {
        if (i == i2) {
            return aypn.r();
        }
        final azqv ap = azqv.ap();
        final ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: nwi
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                azqv.this.c(Integer.valueOf(((Integer) valueAnimator.getAnimatedValue()).intValue()));
            }
        });
        ofInt.addListener(new nwn(ap, zcfVar));
        return ap.S(aypnVar, new ayro() { // from class: nwk
            @Override // defpackage.ayro
            public final Object a(Object obj, Object obj2) {
                return Integer.valueOf(Math.min(((Integer) obj).intValue() + ((Integer) obj2).intValue(), nwr.this.b.b().bottom));
            }
        }).an(new ayrs() { // from class: nwl
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                ofInt.start();
            }
        }, aysu.c);
    }
}

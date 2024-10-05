package defpackage;

import android.view.View;
import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kio implements zcg {
    private final Interpolator a;

    public kio(Interpolator interpolator) {
        this.a = interpolator;
    }

    @Override // defpackage.zcg
    public final void a(View view, long j, zcf zcfVar) {
        view.setAlpha(1.0f);
        ka q = jw.q(view);
        q.c(0.0f);
        q.e(this.a);
        q.d(j);
        q.f(whu.q(zcfVar));
    }

    @Override // defpackage.zcg
    public final void b(View view, long j, zcf zcfVar) {
        view.setAlpha(0.0f);
        ka q = jw.q(view);
        q.c(1.0f);
        q.e(this.a);
        q.d(j);
        q.f(whu.q(zcfVar));
    }

    @Override // defpackage.zcg
    public final void c(View view) {
        jw.q(view).a();
        view.setAlpha(1.0f);
    }
}

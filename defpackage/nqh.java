package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nqh implements zcg {
    private final /* synthetic */ int a;

    public nqh(int i) {
        this.a = i;
    }

    private static int d(View view) {
        return ((View) view.getParent()).getWidth();
    }

    private static float e(View view, float f) {
        return jw.e(view) == 1 ? -f : f;
    }

    private static int f(View view) {
        return ((View) view.getParent()).getWidth();
    }

    @Override // defpackage.zcg
    public final void c(View view) {
        int i = this.a;
        if (i == 0) {
            view.setX(0.0f);
            jw.q(view).a();
        } else if (i == 1) {
            view.setX(0.0f);
            jw.q(view).a();
        } else {
            jw.q(view).a();
            jw.N(view, 1.0f);
        }
    }

    @Override // defpackage.zcg
    public final void a(View view, long j, zcf zcfVar) {
        int i = this.a;
        if (i == 0) {
            ka q = jw.q(view);
            q.l();
            q.i(nql.b(view, d(view)));
            q.d(j);
            q.f(whu.q(zcfVar));
            q.b();
            return;
        }
        if (i == 1) {
            ka q2 = jw.q(view);
            q2.l();
            q2.i(-e(view, f(view)));
            q2.d(j);
            q2.f(whu.q(zcfVar));
            q2.b();
            return;
        }
        jw.N(view, 1.0f);
        ka q3 = jw.q(view);
        q3.c(0.0f);
        q3.d(j);
        q3.f(whu.q(zcfVar));
    }

    @Override // defpackage.zcg
    public final void b(View view, long j, zcf zcfVar) {
        int i = this.a;
        if (i == 0) {
            view.setX(nql.b(view, d(view)));
            ka q = jw.q(view);
            q.l();
            q.i(0.0f);
            q.d(j);
            q.f(whu.q(zcfVar));
            q.b();
            return;
        }
        if (i == 1) {
            view.setX(e(view, f(view)));
            ka q2 = jw.q(view);
            q2.l();
            q2.i(0.0f);
            q2.d(j);
            q2.f(whu.q(zcfVar));
            q2.b();
            return;
        }
        jw.N(view, 0.0f);
        ka q3 = jw.q(view);
        q3.c(1.0f);
        q3.d(j);
        q3.f(whu.q(zcfVar));
    }
}

package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class nqk implements zcg {
    private final View a;
    private final boolean b;

    public nqk(View view, boolean z) {
        this.a = view;
        this.b = z;
    }

    private final float d() {
        return this.b ? -this.a.getHeight() : this.a.getHeight();
    }

    @Override // defpackage.zcg
    public final void a(View view, long j, zcf zcfVar) {
        ka q = jw.q(view);
        q.l();
        q.j(d());
        q.d(j);
        q.f(whu.q(zcfVar));
        q.b();
    }

    @Override // defpackage.zcg
    public final void b(View view, long j, zcf zcfVar) {
        view.setY(d());
        ka q = jw.q(view);
        q.l();
        q.j(0.0f);
        q.d(j);
        q.f(whu.q(zcfVar));
        q.b();
    }

    @Override // defpackage.zcg
    public final void c(View view) {
        view.setY(0.0f);
        jw.q(view).a();
    }
}

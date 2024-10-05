package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nti implements zcg {
    public static final nti a = new nti(1);
    public static final nti b = new nti(2);
    private final int c;

    public nti(int i) {
        this.c = i;
    }

    private final int d(View view) {
        int height = ((View) view.getParent()).getHeight();
        return this.c == 1 ? -height : height;
    }

    @Override // defpackage.zcg
    public final void a(View view, long j, zcf zcfVar) {
        view.setTranslationY(0.0f);
        ka q = jw.q(view);
        q.j(d(view));
        q.d(j);
        q.f(whu.q(zcfVar));
        q.b();
    }

    @Override // defpackage.zcg
    public final void b(View view, long j, zcf zcfVar) {
        view.setTranslationY(d(view));
        ka q = jw.q(view);
        q.j(0.0f);
        q.d(j);
        q.f(whu.q(zcfVar));
        q.b();
    }

    @Override // defpackage.zcg
    public final void c(View view) {
        view.setTranslationY(0.0f);
        jw.q(view).a();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof nti) && ((nti) obj).c == this.c;
    }

    public final int hashCode() {
        return this.c;
    }
}

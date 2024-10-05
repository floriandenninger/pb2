package defpackage;

import android.view.View;
import com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class uhy implements View.OnAttachStateChangeListener {
    final /* synthetic */ uik a;
    final /* synthetic */ uec b;
    final /* synthetic */ ExpressSignInLayout c;

    public uhy(ExpressSignInLayout expressSignInLayout, uik uikVar, uec uecVar) {
        this.c = expressSignInLayout;
        this.a = uikVar;
        this.b = uecVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.b.b(this.c.r);
        if (this.a.b.d) {
            this.c.g(false);
            this.c.r.af(this.a.b.a());
        }
        this.c.h.i.c(this.b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.b.c(this.c.r);
        this.c.h.i.d(this.b);
    }
}

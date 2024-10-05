package defpackage;

import android.view.View;
import com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class uhz implements View.OnAttachStateChangeListener {
    final /* synthetic */ ExpressSignInLayout a;

    public uhz(ExpressSignInLayout expressSignInLayout) {
        this.a = expressSignInLayout;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.h(aost.PRESENTED_COMPONENT_EVENT);
        this.a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}

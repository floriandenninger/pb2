package defpackage;

import android.view.View;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ufr implements View.OnAttachStateChangeListener {
    final /* synthetic */ AccountParticleDisc a;
    final /* synthetic */ uec b;
    final /* synthetic */ ufs c;

    public ufr(ufs ufsVar, AccountParticleDisc accountParticleDisc, uec uecVar) {
        this.c = ufsVar;
        this.a = accountParticleDisc;
        this.b = uecVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.c(this.b);
        this.c.E();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.d(this.b);
    }
}

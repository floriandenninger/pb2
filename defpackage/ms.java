package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ms extends kc {
    final /* synthetic */ ne a;

    public ms(ne neVar) {
        this.a = neVar;
    }

    @Override // defpackage.kc, defpackage.kb
    public final void a(View view) {
        this.a.k.setAlpha(1.0f);
        this.a.n.f(null);
        this.a.n = null;
    }

    @Override // defpackage.kc, defpackage.kb
    public final void c() {
        this.a.k.setVisibility(0);
        this.a.k.sendAccessibilityEvent(32);
        if (this.a.k.getParent() instanceof View) {
            jw.K((View) this.a.k.getParent());
        }
    }
}

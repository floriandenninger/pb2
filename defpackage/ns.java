package defpackage;

import android.support.v7.widget.ActionBarOverlayLayout;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ns extends kc {
    final /* synthetic */ nw a;

    public ns(nw nwVar) {
        this.a = nwVar;
    }

    @Override // defpackage.kc, defpackage.kb
    public final void a(View view) {
        View view2;
        nw nwVar = this.a;
        if (nwVar.k && (view2 = nwVar.f) != null) {
            view2.setTranslationY(0.0f);
            this.a.c.setTranslationY(0.0f);
        }
        this.a.c.setVisibility(8);
        this.a.c.a(false);
        nw nwVar2 = this.a;
        nwVar2.n = null;
        po poVar = nwVar2.i;
        if (poVar != null) {
            poVar.a(nwVar2.h);
            nwVar2.h = null;
            nwVar2.i = null;
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.a.b;
        if (actionBarOverlayLayout != null) {
            jw.K(actionBarOverlayLayout);
        }
    }
}

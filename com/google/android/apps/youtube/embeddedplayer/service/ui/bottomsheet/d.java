package com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet;

import android.os.Bundle;
import android.view.View;
import defpackage.ic;
import defpackage.ks;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class d extends ic {
    final /* synthetic */ e b;

    public d(e eVar) {
        this.b = eVar;
    }

    @Override // defpackage.ic
    public final void d(View view, ks ksVar) {
        super.d(view, ksVar);
        ksVar.h(1048576);
        ksVar.w(true);
    }

    @Override // defpackage.ic
    public final boolean j(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            this.b.cancel();
            return true;
        }
        return super.j(view, i, bundle);
    }
}

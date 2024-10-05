package defpackage;

import android.os.Bundle;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bsv extends ic {
    final /* synthetic */ bsw b;

    public bsv(bsw bswVar) {
        this.b = bswVar;
    }

    @Override // defpackage.ic
    public final void d(View view, ks ksVar) {
        this.b.e.d(view, ksVar);
        int c = this.b.d.c(view);
        vw vwVar = this.b.d.m;
        if (vwVar instanceof bsp) {
            ((bsp) vwVar).w(c);
        }
    }

    @Override // defpackage.ic
    public final boolean j(View view, int i, Bundle bundle) {
        return this.b.e.j(view, i, bundle);
    }
}

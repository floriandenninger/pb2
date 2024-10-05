package defpackage;

import android.os.Bundle;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class alle extends ic {
    final /* synthetic */ allk b;

    public alle(allk allkVar) {
        this.b = allkVar;
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
            this.b.d();
            return true;
        }
        return super.j(view, i, bundle);
    }
}

package defpackage;

import android.os.Bundle;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class uhe extends ic {
    final /* synthetic */ uhf b;

    public uhe(uhf uhfVar) {
        this.b = uhfVar;
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
            this.b.aF();
            return true;
        }
        return super.j(view, i, bundle);
    }
}

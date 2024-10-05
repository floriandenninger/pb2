package defpackage;

import android.os.Bundle;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class algg extends ic {
    final /* synthetic */ algj b;

    public algg(algj algjVar) {
        this.b = algjVar;
    }

    @Override // defpackage.ic
    public final void d(View view, ks ksVar) {
        super.d(view, ksVar);
        if (this.b.d) {
            ksVar.h(1048576);
            ksVar.w(true);
        } else {
            ksVar.w(false);
        }
    }

    @Override // defpackage.ic
    public final boolean j(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            algj algjVar = this.b;
            if (algjVar.d) {
                algjVar.cancel();
                return true;
            }
            i = 1048576;
        }
        return super.j(view, i, bundle);
    }
}

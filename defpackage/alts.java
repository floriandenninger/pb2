package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.setupdesign.items.ExpandableSwitchItem;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alts extends ic {
    final /* synthetic */ ExpandableSwitchItem b;

    public alts(ExpandableSwitchItem expandableSwitchItem) {
        this.b = expandableSwitchItem;
    }

    @Override // defpackage.ic
    public final void d(View view, ks ksVar) {
        kr krVar;
        super.d(view, ksVar);
        if (this.b.a) {
            krVar = kr.f;
        } else {
            krVar = kr.e;
        }
        ksVar.i(krVar);
    }

    @Override // defpackage.ic
    public final boolean j(View view, int i, Bundle bundle) {
        if (i == 262144 || i == 524288) {
            this.b.c(!r3.a);
            return true;
        }
        return super.j(view, i, bundle);
    }
}

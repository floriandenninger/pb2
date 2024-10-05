package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aktt implements ylb {
    private final axpg a;
    private final /* synthetic */ int b;

    public aktt(axpg axpgVar, int i) {
        this.b = i;
        this.a = axpgVar;
    }

    @Override // defpackage.ylb
    public final int a(Bundle bundle) {
        if (this.b == 0) {
            ((akvc) this.a.get()).a();
            return 0;
        }
        ((afrw) this.a.get()).e(aqjm.b(((Integer) bundle.get("tier_type")).intValue()));
        return 0;
    }
}

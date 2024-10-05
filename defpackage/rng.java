package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rng extends rnc {
    private final qpc a;

    public rng(qpc qpcVar) {
        this.a = qpcVar;
    }

    @Override // defpackage.rnc
    public final void a(int i, Bundle bundle, DataHolder dataHolder) {
        this.a.d(new rni(rnk.n(i, bundle), dataHolder == null ? null : new qrj(dataHolder)));
    }
}

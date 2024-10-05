package defpackage;

import android.os.Bundle;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rnf extends rnc {
    public final qql a;

    public rnf(qql qqlVar) {
        this.a = qqlVar;
    }

    @Override // defpackage.rnc
    public final void c(int i, Bundle bundle) {
        if (i != 0) {
            String k = rqr.k();
            if (Log.isLoggable(k, 5)) {
                Log.w(k, "Non-success data changed callback received.");
                return;
            }
            return;
        }
        qql qqlVar = this.a;
        bundle.getString("account");
        bundle.getString("pagegaiaid");
        bundle.getInt("scope");
        qqlVar.b(new rne());
    }
}

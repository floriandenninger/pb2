package defpackage;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rkg implements rkl {
    final /* synthetic */ rki a;

    public rkg(rki rkiVar) {
        this.a = rkiVar;
    }

    @Override // defpackage.rkl
    public final void a(String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.a.aG().g(new rkf(this, str, bundle));
            return;
        }
        rgt rgtVar = this.a.i;
        if (rgtVar != null) {
            rgtVar.aF().c.b("AppId not known when logging event", "_err");
        }
    }
}

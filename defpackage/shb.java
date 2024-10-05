package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class shb implements amnv {
    final /* synthetic */ shd a;

    public shb(shd shdVar) {
        this.a = shdVar;
    }

    @Override // defpackage.amnv
    public final /* bridge */ /* synthetic */ Object get() {
        shd shdVar = this.a;
        Bundle bundle = new Bundle();
        bundle.putString("methodName", "getAccountName");
        Bundle a = shdVar.b.a("getSignature", bundle);
        return a == null ? amlr.a : ammv.j(Integer.valueOf(a.getInt("version")));
    }
}

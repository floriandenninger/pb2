package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ubf extends ubd {
    private final uah b;

    public ubf(uah uahVar) {
        this.b = uahVar;
    }

    @Override // defpackage.ubd
    public final uag a(Bundle bundle, aoko aokoVar) {
        return this.b.h(bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME"), aokm.a(bundle.getInt("com.google.android.libraries.notifications.REGISTRATION_REASON", aokm.REGISTRATION_REASON_UNSPECIFIED.l)), aokoVar);
    }

    @Override // defpackage.ubd
    protected final String b() {
        return "StoreTargetCallback";
    }

    @Override // defpackage.udr
    public final String f() {
        return "RPC_STORE_TARGET";
    }
}

package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ubc extends ubd {
    private final uah b;

    public ubc(uah uahVar) {
        this.b = uahVar;
    }

    @Override // defpackage.ubd
    public final uag a(Bundle bundle, aoko aokoVar) {
        return this.b.f(bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME"), aokoVar);
    }

    @Override // defpackage.ubd
    protected final String b() {
        return "RemoveTargetCallback";
    }

    @Override // defpackage.udr
    public final String f() {
        return "RPC_REMOVE_TARGET";
    }
}

package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uba extends ubd {
    private final uah b;

    public uba(uah uahVar) {
        this.b = uahVar;
    }

    @Override // defpackage.ubd
    public final uag a(Bundle bundle, aoko aokoVar) {
        String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME");
        long j = bundle.getLong("com.google.android.libraries.notifications.INTENT_EXTRA_PAGE_VERSION");
        return this.b.d(string, Long.valueOf(j), aokf.a(bundle.getInt("com.google.android.libraries.notifications.NOTIFICATIONS_FETCH_REASON", aokf.FETCH_REASON_UNSPECIFIED.j)), aokoVar);
    }

    @Override // defpackage.ubd
    protected final String b() {
        return "FetchLatestThreadsCallback";
    }

    @Override // defpackage.udr
    public final String f() {
        return "RPC_FETCH_LATEST_THREADS";
    }
}

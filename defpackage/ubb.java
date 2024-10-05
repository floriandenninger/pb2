package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ubb extends ubd {
    private final uah b;
    private final txo c;

    public ubb(uah uahVar, txo txoVar) {
        this.b = uahVar;
        this.c = txoVar;
    }

    @Override // defpackage.ubd
    public final uag a(Bundle bundle, aoko aokoVar) {
        String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME");
        long j = bundle.getLong("com.google.android.libraries.notifications.INTENT_EXTRA_SYNC_VERSION");
        aokf a = aokf.a(bundle.getInt("com.google.android.libraries.notifications.NOTIFICATIONS_FETCH_REASON", aokf.FETCH_REASON_UNSPECIFIED.j));
        txo txoVar = this.c;
        uzi b = uzi.b();
        b.c("last_updated__version");
        b.d(">?", Long.valueOf(j));
        return this.b.e(string, j, txb.a(txoVar.a.a(string, amru.r(b.a()))), a, aokoVar);
    }

    @Override // defpackage.ubd
    protected final String b() {
        return "FetchUpdatedThreadsCallback";
    }

    @Override // defpackage.udr
    public final String f() {
        return "RPC_FETCH_UPDATED_THREADS";
    }
}

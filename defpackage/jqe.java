package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jqe implements akrj {
    private final jup a;

    public jqe(jup jupVar) {
        this.a = jupVar;
    }

    @Override // defpackage.akrj
    public final void a(String str, Bundle bundle) {
        bundle.putString(aghv.WIFI_POLICY, String.valueOf(this.a.l()));
        bundle.putString("offline_use_sd_card", String.valueOf(this.a.P()));
        bundle.putString(aghv.DOWNLOAD_NETWORK_PREFERENCE, this.a.w().name());
    }

    @Override // defpackage.akrj
    public final void b(Bundle bundle) {
    }
}

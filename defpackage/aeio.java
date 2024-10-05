package defpackage;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeio implements Runnable {
    private final afhf a;
    private final Uri b;
    private final aaoz c;

    public aeio(afhf afhfVar, Uri uri, aaoz aaozVar) {
        afki.a(afhfVar);
        this.a = afhfVar;
        afki.a(uri);
        this.b = uri;
        this.c = aaozVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String authority;
        Uri.Builder appendQueryParameter = this.b.buildUpon().appendQueryParameter("owc", "yes").appendQueryParameter("pvi", "0").appendQueryParameter("pai", "0");
        if (this.c.get().aT() && (authority = this.b.getAuthority()) != null) {
            appendQueryParameter = appendQueryParameter.authority(aelz.e(authority));
        }
        ath athVar = new ath(appendQueryParameter.build());
        ate a = this.a.a();
        try {
            a.h(athVar);
        } catch (IOException unused) {
        } finally {
            pts.N(a);
        }
    }
}

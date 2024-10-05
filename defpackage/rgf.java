package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rgf {
    final rgt a;

    public rgf(rgt rgtVar) {
        this.a = rgtVar;
    }

    public rgf(rki rkiVar) {
        this.a = rkiVar.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        try {
            trp b = qtu.b(this.a.a);
            if (b != null) {
                return b.d("com.android.vending", 128).versionCode >= 80837300;
            }
            this.a.aF().k.a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            this.a.aF().k.b("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(String str, Bundle bundle) {
        String uri;
        this.a.q();
        if (this.a.v()) {
            return;
        }
        if (bundle.isEmpty()) {
            uri = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            uri = builder.build().toString();
        }
        if (TextUtils.isEmpty(uri)) {
            return;
        }
        this.a.g().t.b(uri);
        this.a.g().u.b(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        return this.a.g().u.a() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d() {
        return c() && System.currentTimeMillis() - this.a.g().u.a() > this.a.f.h(null, rfd.R);
    }
}

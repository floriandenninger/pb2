package defpackage;

import android.content.ContentProviderClient;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axhf {
    public final ContentProviderClient a;
    public final String b;

    public axhf(ContentProviderClient contentProviderClient, String str) {
        this.a = contentProviderClient;
        this.b = str;
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.a.close();
        } else {
            this.a.release();
        }
    }
}

package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acv {
    public final Intent a;
    public final Bundle b;

    public acv(Intent intent, Bundle bundle) {
        this.a = intent;
        this.b = bundle;
    }

    public final void a(Context context, Uri uri) {
        this.a.setData(uri);
        aig.b(context, this.a, this.b);
    }
}

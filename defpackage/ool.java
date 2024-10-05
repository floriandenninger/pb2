package defpackage;

import android.app.Activity;
import android.content.res.Configuration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ool {
    public boolean a;
    private final Activity b;

    public ool(Activity activity) {
        this.b = activity;
        this.a = yjk.aa(activity);
    }

    public final void a(Configuration configuration) {
        if (configuration != null) {
            this.a = yjk.aa(this.b.createConfigurationContext(configuration));
        }
    }
}

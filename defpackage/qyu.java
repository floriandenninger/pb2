package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.gmscompliance.ui.UncertifiedDeviceActivity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qyu {
    private final Context a;
    private String b;
    private Intent c;

    public qyu(Context context) {
        this.a = context;
    }

    public final Intent a() {
        Context context = this.a;
        String str = this.b;
        Intent intent = this.c;
        Intent intent2 = new Intent(context, (Class<?>) UncertifiedDeviceActivity.class);
        if (!TextUtils.isEmpty(str) && intent != null) {
            intent2 = intent2.putExtra("customCtaText", str).putExtra("ctaIntent", intent);
        }
        if (!TextUtils.isEmpty(null)) {
            intent2 = intent2.putExtra("customBodyText", (String) null);
        }
        intent2.putExtra("overrideNavBarColor", false);
        return intent2;
    }

    public final void b(String str, Intent intent) {
        this.b = str;
        this.c = intent;
    }
}

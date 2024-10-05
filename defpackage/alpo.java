package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alpo {
    public static final ammr c = new ammr("ReviewService", (char[]) null);
    public alqa a;
    public final String b;

    public alpo(Context context) {
        this.b = context.getPackageName();
        if (alsi.a(context)) {
            this.a = new alqa(context, c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), alpf.c, null);
        }
    }
}

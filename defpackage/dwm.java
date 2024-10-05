package defpackage;

import android.content.Intent;
import android.net.Uri;

/* loaded from: classes3.dex */
public final class dwm {
    private static final Uri a;

    static {
        Uri parse = Uri.parse("http://plus.google.com/");
        a = parse;
        parse.buildUpon().appendPath("circles").appendPath("find").build();
    }

    public static Intent a() {
        return new Intent("android.settings.DATE_SETTINGS");
    }

    public static Intent b() {
        Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        return intent;
    }

    public static Intent c() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms").build());
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }
}

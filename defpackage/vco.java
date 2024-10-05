package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vco {
    public static final String[] a = {"_data"};

    public static boolean a(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }
}

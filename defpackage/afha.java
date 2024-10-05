package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afha {
    public static final amsx a = amsx.s("docid", "referrer");

    public static Uri a(Uri uri) {
        zhy b = zhy.b(uri);
        amxd listIterator = a.listIterator();
        while (listIterator.hasNext()) {
            String str = (String) listIterator.next();
            if (b.d(str) != null) {
                b.g(str, "(scrubbed)");
            }
        }
        return b.a();
    }
}

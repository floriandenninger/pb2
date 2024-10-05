package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uvg {
    private static final adz a = new adz();

    public static synchronized Uri a(String str) {
        Uri uri;
        synchronized (uvg.class) {
            adz adzVar = a;
            uri = (Uri) adzVar.get(str);
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode(str));
                uri = Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
                adzVar.put(str, uri);
            }
        }
        return uri;
    }
}

package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eal {
    public final ead d;
    public String a = "googleads.g.doubleclick.net";
    public String b = "/pagead/ads";
    private final String e = "ad.doubleclick.net";
    public String[] c = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    @Deprecated
    public eal(ead eadVar) {
        this.d = eadVar;
    }

    public final Uri a(Uri uri, String str) {
        uri.getClass();
        try {
            try {
                if (uri.getHost().equals(this.e)) {
                    if (!uri.toString().contains("dc_ms=")) {
                        String uri2 = uri.toString();
                        int indexOf = uri2.indexOf(";adurl");
                        if (indexOf != -1) {
                            int i = indexOf + 1;
                            return Uri.parse(uri2.substring(0, i) + "dc_ms=" + str + ";" + uri2.substring(i));
                        }
                        String encodedPath = uri.getEncodedPath();
                        int indexOf2 = uri2.indexOf(encodedPath);
                        return Uri.parse(uri2.substring(0, encodedPath.length() + indexOf2) + ";dc_ms=" + str + ";" + uri2.substring(indexOf2 + encodedPath.length()));
                    }
                    throw new eam("Parameter already exists: dc_ms");
                }
            } catch (UnsupportedOperationException unused) {
                throw new eam("Provided Uri is not in a valid state");
            }
        } catch (NullPointerException unused2) {
        }
        if (uri.getQueryParameter("ms") == null) {
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            if (indexOf3 != -1) {
                int i2 = indexOf3 + 1;
                return Uri.parse(uri3.substring(0, i2) + "ms=" + str + "&" + uri3.substring(i2));
            }
            return uri.buildUpon().appendQueryParameter("ms", str).build();
        }
        throw new eam("Query parameter already exists: ms");
    }

    @Deprecated
    public final Uri b(Uri uri, Context context) {
        try {
            return a(uri, this.d.d(context, uri.getQueryParameter("ai"), null, null));
        } catch (UnsupportedOperationException unused) {
            throw new eam("Provided Uri is not in a valid state");
        }
    }
}

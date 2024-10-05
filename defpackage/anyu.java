package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anyu implements Closeable {
    public final URL a;
    public rpt b;
    public volatile InputStream c;

    private anyu(URL url) {
        this.a = url;
    }

    public static anyu a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new anyu(new URL(str));
        } catch (MalformedURLException unused) {
            String valueOf = String.valueOf(str);
            Log.w("FirebaseMessaging", valueOf.length() != 0 ? "Not downloading image, bad URL: ".concat(valueOf) : new String("Not downloading image, bad URL: "));
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            anbu.a(this.c);
        } catch (NullPointerException e) {
            Log.e("FirebaseMessaging", "Failed to close the image download stream.", e);
        }
    }
}

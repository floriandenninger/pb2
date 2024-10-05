package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajka extends Exception {
    public final String a;
    private final String b;

    public ajka(Throwable th, Uri uri, String str) {
        this.b = uri == null ? "NONE" : uri.toString();
        this.a = str;
        initCause(th);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String valueOf = String.valueOf(this.b);
        return valueOf.length() != 0 ? "Error loading url: ".concat(valueOf) : new String("Error loading url: ");
    }
}

package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tcv {
    public final Uri a;

    public tcv(Uri uri) {
        this.a = uri;
    }

    public final String a() {
        return this.a.getPath();
    }

    public final tcv b(String str) {
        return new tcv(this.a.buildUpon().encodedPath(str).build());
    }

    public final String toString() {
        return this.a.toString();
    }
}

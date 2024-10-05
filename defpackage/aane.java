package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aane {
    public final zhy a;

    private aane(Uri uri) {
        this.a = zhy.b(uri);
    }

    public static aane b(Uri uri) {
        return new aane(uri);
    }

    public final Uri a() {
        return this.a.a();
    }

    public final void c(String str) {
        if (str == null) {
            this.a.j("cpn");
        } else {
            this.a.g("cpn", str);
        }
    }

    public final void d(int i) {
        this.a.g("headm", Integer.toString(i));
    }

    public final void e(long j) {
        if (j > 0) {
            this.a.g("mpr", Long.toString(j));
        } else {
            this.a.j("mpr");
        }
    }

    public final void f(long j) {
        this.a.g("sq", Long.toString(j));
    }
}
